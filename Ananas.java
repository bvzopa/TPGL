/**
 *
 * @author roudet
 */
public class Ananas {
    private double prix;
    private String origine;

    public Ananas()
    {
        this.prix = 2;  //prix en euros
        this.origine="Brésil";
    }

    public Ananas(double prix, String origine)
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Brésil";  //Espagne par défaut
	else
            this.origine = origine;
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }

    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Ananas de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 ananass sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Ananas or = (Ananas) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une ananas a des pepins
        return true;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
          Ananas ananas = new Ananas();
          System.out.println(ananas.toString());

	System.out.println("premier test Ananas");
   }
}
