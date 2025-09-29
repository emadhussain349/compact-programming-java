// ========================
// Class: IndustrialProcess
// ========================
import java.util.List;

class IndustrialProcess {
    private String id;
    private List<IOperation> operations;

    public IndustrialProcess(String id, List<IOperation> operations) {
        this.id = id;
        this.operations = operations;
    }

    public int processDuration() {
        int total = 0;
        for (IOperation op : operations) {
            total += op.getDuration();
        }
        return total;
    }

    public int processResources() {
        int total = 0;
        for (IOperation op : operations) {
            total += op.getResources().size();
        }
        return total;
    }

    public double energyConsumption() {
        double total = 0.0;
        for (IOperation op : operations) {
            for (AGV agv : op.getResources()) {
                total += agv.getConsumption();
            }
        }
        return total;
    }

    public void printSummary() {
        System.out.println("\nIndustrialProcess[ID=" + id + "]");
        System.out.println("---------------------------------------------------");
        System.out.println("Total Duration: " + processDuration() + " mins");
        System.out.println("Total Resources (AGVs used): " + processResources());
        System.out.println("Energy Consumption: " + energyConsumption() + " kWh");
        System.out.println("---------------------------------------------------");
    }
}
