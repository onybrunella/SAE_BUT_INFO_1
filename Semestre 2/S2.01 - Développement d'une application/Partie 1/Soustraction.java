public class Soustraction extends Operation {

    // Constructeur champ à champ
    public Soustraction(Nombre operande1, Nombre operande2) {
        super(operande1,operande2);
    }

    // Retourne un int representant le resultat de loperation
    public int valeur() {
        return this.getOperande1().valeur() - this.getOperande2().valeur();
    }

    // Retourne un String representant loperation
    public String toString() {
        return "[" + this.getOperande1() + "-" + this.getOperande2() + "]";
    }   

}
