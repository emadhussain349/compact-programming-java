public class IndustrialProcess extends Process {

    public IndustrialProcess(String ID) {
        super(ID);
    }

    public void IndustrialProcess() {
        System.out.println("Running industrial process: " + ID);
    }

    public void ProcessDuration() {
        System.out.println("Duration: 8 hours average");
    }

    public void ProcessResources() {
        System.out.println("Using 2 Human + 1 AGV + Material resources");
    }

    @Override
    public double calculateCost() {
        double total = 0;
        for (IOperation op : operations) total += op.getCost();
        return total * 1.1; // 10 % overhead
    }
}
