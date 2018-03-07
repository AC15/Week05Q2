/**
 * Arithmetic integer expressions
 */
public abstract class Expression {

    /**
     * The value of this expression
     */
    public abstract int getValue();

    /**
     * String representation in in-order notation
     */
    public abstract String toString();

    static final int NONE = 0;
    static final int ADDITION = 1;
    static final int SUBTRACTION = 2;
    static final int MULTIPLICATION = 3;
    static final int DIVISION = 4;
}
