/**
 * Created by AC15 on 07/03/2018
 * <p>
 * Subtraction of two expressions
 */
public class Subtraction extends Expression {

    /**
     * The expressions to be subtracted.
     */
    private Expression left, right;

    /**
     * Initialise left and right sides
     */
    Subtraction(Expression l, Expression r) {
        left = l;
        right = r;
    }

    /**
     * The value
     */
    public int getValue() {
        return Integer.parseInt(String.valueOf(left.getValue())) -
                Integer.parseInt(String.valueOf(right.getValue()));
    }

    /**
     * String representation in in-order notation
     */
    public String toString() {
        return "(" + left.toString() + " - "
                + right.toString() + ")";
    }
}
