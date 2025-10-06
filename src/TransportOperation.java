public class TransportOperation extends IOperation {
    public TransportOperation(String type) {
        super(type);
    }

    @Override
    public double getCost() {
        return 200.0;
    }
}
