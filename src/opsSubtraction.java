/**
 * Created by inf112225 on 05.05.2017.
 */
public class opsSubtraction extends AbstractOperation{
    @Override
    public void makeOperation(Operation operation) {
        if (operation.operator=='-')
            operation.result = operation.operand1-operation.operand2;
        else
            nextOperation.makeOperation(operation);
    }
}
