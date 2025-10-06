public abstract class IOperation {
    protected String type;

    public IOperation(String type) {
        this.type = type;
    }

    public abstract double getCost();
}
