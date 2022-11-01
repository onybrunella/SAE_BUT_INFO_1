public class Nombre extends Expression{

    // Variable d'instance
    private int valeurNombre ;

    // Constructeur champ à champ
    public Nombre(int valeurNombre) {
        super();
        this.valeurNombre = valeurNombre;
    }

    // Retourne un int represenant la valeur du Nombre
    public int valeur() {
        return this.valeurNombre;
    }

    // Retourne un String representant la valeur
    public String toString() {
        return "Le nombre est = " + this.valeurNombre;
    }
    
}
