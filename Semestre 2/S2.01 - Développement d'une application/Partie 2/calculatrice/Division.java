package calculatrice;

public class Division extends Operation {

    // Constructeur champ à champ
    public Division(Expression operande1, Expression operande2) {
        super(operande1,operande2);
    }
    
    // Retourne un int representant le resultat de loperation avec une Exception afin de prevenir une division par 0
    public double valeur() throws ArithmeticException {
        if (this.getOperande2().valeur() == 0) {
            throw new ArithmeticException("Erreur ! Impossible de diviser par 0 !");
        }
        else {
        return this.getOperande1().valeur() / this.getOperande2().valeur();
        }
    }
    
    // Retourne un String representant loperation
    public String toString() {
        return "Division = [" + this.getOperande1().valeur() + "/" + this.getOperande2().valeur() + "] = " + valeur();
    }   

}
