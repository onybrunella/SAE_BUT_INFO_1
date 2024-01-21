// package calculatrice;

// public class Calculatrice {
    
//     public static void main(String[] args){

//         System.out.println("Debut du programme.\n") ;

//         //Tests de la premiere partie de la SAE
//         System.out.println("Tests de la premiere partie de la SAE\n");
//         Nombre six = new Nombre(6) ;
//         System.out.println(six.toString()) ; 

//         Nombre dix = new Nombre(10) ;
//         System.out.println(dix.toString()) ; 

//         Nombre zero = new Nombre(0);
//         System.out.println(zero.toString()) ; 

//         Operation s = new Soustraction(dix,six); 
//         System.out.println(s.toString()); 

//         Operation m = new Multiplication(zero,dix);
//         System.out.println(m.toString()) ; 

//         Operation a = new Addition(six,dix);
//         System.out.println(a.toString()) ; 

//         // Bloc sous surveillance
//         try {
//             Operation d = new Division(six,zero) ;
//             System.out.println(d.toString()) ; 
//         }
//         // Instruction a executer si une ArithmeticException survient
//         catch (ArithmeticException e) {
//             System.out.println("Erreur ! Impossible de diviser par 0 !") ;
//         }

//         //Tests de la seconde partie de la SAE
//         System.out.println("\nTests de la seconde partie de la SAE\n");
//         Expression deux = new Nombre(2) ;
//         System.out.println(deux.toString()) ; 

//         Expression trois = new Nombre(3) ;
//         System.out.println(trois.toString()) ; 

//         Expression dixSept = new Nombre(17) ;
//         System.out.println(dixSept.toString()) ; 

//         Expression sous = new Soustraction(dixSept, deux) ;
//         System.out.println(sous.toString()) ; 

//         Expression add = new Addition(deux, trois) ;
//         System.out.println(add.toString()) ; 

//         Expression div = new Division(sous, add) ;
//         System.out.println(div.toString()) ; // affiche ((17 - 2) / (2 + 3)) = 3 ou (15/5) + 3

//         System.out.println("\nFin du programme.") ;

//     }


// }