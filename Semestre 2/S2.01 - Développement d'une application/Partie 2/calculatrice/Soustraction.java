package calculatrice;
public class Soustraction extends Operation {

    // Constructeur champ à champ
    public Soustraction(Expression operande1, Expression operande2) {
        super(operande1,operande2);
    }

    // Retourne un int representant le resultat de loperation
    public double valeur() {
        return this.getOperande1().valeur() - this.getOperande2().valeur();
    }

    // Retourne un String representant loperation
    public String toString() {
        return "Soustraction = [" + this.getOperande1().valeur() + "-" + this.getOperande2().valeur() + "] = " + valeur();
    }   

}
