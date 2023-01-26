public class CalculatriceSimple{

  public static void main(String[] arg){
    Nombre six = new Nombre(6) ;
    Nombre dix = new Nombre(10) ;
    Operation s1 = new Soustraction(dix,six) ;
    System.out.println(s1 + " = " + s1.valeur()) ; // doit afficher : (10 - 6) = 4

    Nombre quatre = new Nombre(4) ;
    Nombre zero = new Nombre(0) ;
    Operation s2 = new Division(quatre,zero) ;
    System.out.println(s2 + " = " + s2.valeur()) ; // doit afficher : (4 / 0) = "Impossible de diviser par 0 !!!"

    Nombre cent = new Nombre(100) ;
    Nombre deux = new Nombre(2) ;
    Operation s3 = new Division(cent,deux) ;
    System.out.println(s3 + " = " + s3.valeur()) ; // doit afficher : (100 / 2) = 50

    Nombre trois = new Nombre(3) ;
    Nombre neuf = new Nombre(9) ;
    Operation s4 = new Addition(trois,neuf) ;
    System.out.println(s4 + " = " + s4.valeur()) ; // doit afficher : (3 + 9) = 12

    Nombre un = new Nombre(1) ;
    Nombre trois_cent_trois = new Nombre(303) ;
    Operation s5 = new Multiplication(un,trois_cent_trois) ;
    System.out.println(s5 + " = " + s5.valeur()) ; // doit afficher : (1 x 303) = 303
  }
}
