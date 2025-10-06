public class ManagementProcess extends Process {
    public ManagementProcess(String ID) {
        super(ID);
    }

    @Override
    public double calculateCost() {
        double total = 0;
        for (IOperation op : operations) total += op.getCost();
        return total;
    }
}
