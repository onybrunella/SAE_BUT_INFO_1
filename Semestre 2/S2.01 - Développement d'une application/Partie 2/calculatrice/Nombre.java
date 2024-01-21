package calculatrice;

public class Nombre extends Expression{

    // Variable d'instance
    private double valeurNombre ;

    // Constructeur champ à champ
    public Nombre(double valeurNombre) {
        super();
        this.valeurNombre = valeurNombre;
    }

    // Retourne un double represenant la valeur du Nombre
    public double valeur() {
        return this.valeurNombre;
    }

    // Retourne un String representant la valeur
    public String toString() {
        return "Le nombre est = " + this.valeurNombre;
    }
    
}
