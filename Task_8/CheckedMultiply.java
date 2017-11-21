package expression;

import expression.exceptions.*;


/**
 * Created by Anver on 01.04.2017.
 */
public class CheckedMultiply<T> extends AbstractBinaryOperation<T> {
    public CheckedMultiply(TripleExpression<T> operand1, TripleExpression<T> operand2, Operator<T> operator) {
        super(operand1, operand2, operator);
    }

    public T makeOperation(T x, T y) throws OverflowException {
        return operator.multiply(x, y);
    }
}
