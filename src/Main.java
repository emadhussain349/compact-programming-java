// ========================
// Main Simulation
// ========================
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create AGVs
        AGV agv1 = new AGV("AGV1", 100, 5.0, 30, "Dock", 10.0f, 8.0f);
        AGV agv2 = new AGV("AGV2", 90, 4.5, 25, "ZoneA", 9.0f, 7.5f);
        AGV agv3 = new AGV("AGV3", 80, 6.0, 40, "ZoneB", 11.0f, 9.0f);

        // Create Operations
        IOperation op1 = new IOperation("OP1", "Pick items from Zone A", 20, Arrays.asList(agv1));
        IOperation op2 = new IOperation("OP2", "Transport to Dock", 15, Arrays.asList(agv1, agv2));
        IOperation op3 = new IOperation("OP3", "Load onto Truck", 10, Arrays.asList(agv2));
        IOperation op4 = new IOperation("OP4", "Move stock to Zone B", 25, Arrays.asList(agv3));

        // Create Industrial Processes
        IndustrialProcess process1 = new IndustrialProcess("P1", Arrays.asList(op1, op2, op3));
        IndustrialProcess process2 = new IndustrialProcess("P2", Arrays.asList(op2, op4));

        // Print Simulation Results
        process1.printSummary();
        System.out.println("Operations for P1:");
        System.out.println(op1.getData());
        System.out.println(op2.getData());
        System.out.println(op3.getData());

        process2.printSummary();
        System.out.println("Operations for P2:");
        System.out.println(op2.getData());
        System.out.println(op4.getData());
    }
}
