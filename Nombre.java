public class Nombre{
  private int valeur_nombre;

  public Nombre(int nombre){
    this.valeur_nombre = nombre;
  }

  public int valeur(){
    return this.valeur_nombre;
  }

  public String toString(){
    return ""+this.valeur_nombre;
  }

  public int getValeur_Nombre(){
    return this.valeur_nombre;
  }

  public void setValeur_Nombre(int newValeur_Nombre){
    this.valeur_nombre = newValeur_Nombre;
  }
}
