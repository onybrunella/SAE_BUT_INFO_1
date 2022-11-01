public abstract class Operation {

    // Variables d'instance
    Nombre operande1;
    Nombre operande2;

    // Constructeur champ à champ
    public Operation(Nombre operande1, Nombre operande2) {
        this.operande1 = operande1;
        this.operande2 = operande2;
    }   

    // Retourne la premiere operande de loperation
    public Nombre getOperande1() {
        return this.operande1;
    }

    // Retourne la seconde operande de loperation
    public Nombre getOperande2() {
        return this.operande2;
    }

   public abstract int valeur();
    
}
