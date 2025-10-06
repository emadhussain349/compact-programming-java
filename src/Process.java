import java.util.*;

public abstract class Process {
    protected String ID;
    protected List<IOperation> operations;

    public Process(String ID) {
        this.ID = ID;
        this.operations = new ArrayList<>();
    }

    public void addOperation(IOperation op) {
        operations.add(op);
    }

    public List<IOperation> getOperations() {
        return operations;
    }

    public abstract double calculateCost();
}
