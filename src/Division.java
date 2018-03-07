/**
 * Created by AC15 on 07/03/2018
 * <p>
 * Division of two expressions
 */
public class Division extends Expression {

    /**
     * The expressions to be divided.
     */
    private Expression left, right;

    /**
     * Initialise left and right sides
     */
    Division(Expression l, Expression r) {
        left = l;
        right = r;
    }

    /**
     * The value
     */
    public int getValue() {
        int firstValue = Integer.parseInt(String.valueOf(left.getValue()));
        int secondValue = Integer.parseInt(String.valueOf(right.getValue()));

        if (firstValue == 0 || secondValue == 0) {
            return 0;
        }

        return firstValue / secondValue;
    }

    /**
     * String representation in in-order notation
     */
    public String toString() {
        return "(" + left.toString() + " / " +
                right.toString() + ")";
    }
}