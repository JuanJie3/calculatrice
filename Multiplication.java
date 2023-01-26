public class Multiplication extends Operation{

  public Multiplication(Nombre operande1, Nombre operande2){
    super(operande1,operande2);
  }

  public int valeur(){
    return this.getOperande1().valeur() * this.getOperande2().valeur();
  }

  public String toString(){
    return "(" + this.getOperande1() + " x " + this.getOperande2() + ")";
  }
}
