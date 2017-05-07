/**
 * Created by Darek on 07.05.2017.
 */
public class opsCustomZ extends AbstractOperation {
    @Override
    public void makeOperation(Operation operation) {
        if (operation.operator=='z'||operation.operator=='Z')
            operation.result = (operation.operand1-operation.operand2)*(operation.operand1+operation.operand2);
        else
            nextOperation.makeOperation(operation);

    }
}
