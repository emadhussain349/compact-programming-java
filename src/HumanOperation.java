public class HumanOperation extends IOperation {
    public HumanOperation(String type) {
        super(type);
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
