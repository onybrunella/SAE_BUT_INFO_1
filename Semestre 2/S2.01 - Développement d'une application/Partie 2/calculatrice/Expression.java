package calculatrice;

public abstract class Expression {

    public Expression getOperande1() {
        return null;
    }

    public Expression getOperande2() {
        return null;
    }

    public String toString() {
        return "";
    }
//On peut egalement ne mettre que la methode valeur dans la classe Expression
    public abstract double valeur();
    
}