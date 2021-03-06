/**
 * Products of two expressions
 */
public class Multiplication extends Expression {

    /**
     * The expressions to be added.
     */
    private Expression left, right;

    /**
     * Initialise left and right sides
     */
    public Multiplication(Expression l, Expression r) {
        left = l;
        right = r;
    }

    /**
     * The value
     */
    public int getValue() {
        return Integer.parseInt(String.valueOf(left.getValue())) *
                Integer.parseInt(String.valueOf(right.getValue()));
    }

    /**
     * String representation in in-order notation
     */
    public String toString() {
        return "(" + left.toString() + " * " +
                right.toString() + ")";
    }
}
