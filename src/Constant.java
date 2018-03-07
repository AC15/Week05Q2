/**
 * Constant expressions
 */
public class Constant extends Expression {

    /**
     * Initialise value
     */
    public Constant(int v) {
        value = v;
    }

    /**
     * The value
     */
    private int value;

    /**
     * The value
     */
    public int getValue() {
        return Integer.parseInt(String.valueOf(value));
    }

    /**
     * String representation in in-order notation
     */
    public String toString() {
        return String.valueOf(value);
    }
}
