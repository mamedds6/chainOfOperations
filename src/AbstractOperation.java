/**
 * Created by inf112225 on 05.05.2017.
 */
public abstract class AbstractOperation {
    AbstractOperation nextOperation;

    public void setNextOperation(AbstractOperation nextOperation) {
        this.nextOperation = nextOperation;
    }

    abstract public void makeOperation(Operation operation);
}
