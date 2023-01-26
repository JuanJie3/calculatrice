public class Division extends Operation{

  public Division(Nombre operande1, Nombre operande2){
    super(operande1,operande2);
  }

  public int valeur(){
    try{
      return this.getOperande1().valeur() / this.getOperande2().valeur();
    }catch(ArithmeticException e){
      System.out.println("Impossible de diviser par 0 !!!");
    }
    return 0;
  }

  public String toString(){
    return "(" + this.getOperande1() + " / " + this.getOperande2() + ")";
  }
}
