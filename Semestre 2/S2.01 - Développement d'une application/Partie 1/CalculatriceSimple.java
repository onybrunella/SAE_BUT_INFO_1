public class CalculatriceSimple {
    public static void main(String[] args) {
        
        System.out.println("Debut du programme.\n") ;

        Nombre six = new Nombre(6) ;
        System.out.println(six.toString()) ; 

        Nombre dix = new Nombre(10) ;
        System.out.println(dix.toString()) ; 

        Nombre zero = new Nombre(0);
        System.out.println(zero.toString()) ; 

        Operation s = new Soustraction(dix,six); 
        System.out.println(s + " = " + s.valeur()) ; 

        Operation m = new Multiplication(zero,dix);
        System.out.println(m + " = " + m.valeur()) ; 

        Operation a = new Addition(six,dix);
        System.out.println(a + " = " + a.valeur()) ; 

        // Bloc sous surveillance
        try {
            Operation d = new Division(six,zero) ;
            System.out.println(d + " = " + d.valeur()) ; 
        }
        // Instruction a executer si une ArithmeticException survient
        catch (ArithmeticException e) {
            System.out.println("Erreur ! Impossible de diviser par 0 !") ;
        }

        // Reprise du deroulement normal du programme
        System.out.println("\nFin du programme.") ;
    }

}
