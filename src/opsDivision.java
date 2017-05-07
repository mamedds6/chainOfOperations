/**
 * Created by Darek on 07.05.2017.
 */
public class opsDivision extends AbstractOperation {
    @Override
    public void makeOperation(Operation operation) {
        if (operation.operator=='/')
            operation.result = operation.operand1/operation.operand2;
        else
            nextOperation.makeOperation(operation);

    }
}
