public class Main {
    public static void main(String[] args) {

        // Create processes
        ManagementProcess mng = new ManagementProcess("MNG-01");
        IndustrialProcess ind = new IndustrialProcess("IND-01");

        // Add operations
        mng.addOperation(new HumanOperation("Meeting"));
        ind.addOperation(new TransportOperation("Forklift"));
        ind.addOperation(new HumanOperation("Assembly"));

        // Resources
        HumanResources hr = new HumanResources("Worker");
        AGV agv = new AGV("AGV-01", "Robot", 80, 10, 2.5, "Zone A", 5.5f, 4.2f);
        MaterialResources mat = new MaterialResources("Boxes");

        // Simulate
        ind.IndustrialProcess();
        ind.ProcessDuration();
        ind.ProcessResources();

        // Cost calculations
        double costMng = mng.calculateCost();
        double costInd = ind.calculateCost();
        double costRes = hr.getCost() + agv.getCost() + mat.getCost();

        double total = costMng + costInd + costRes;

        System.out.println("\n--- Warehouse Summary ---");
        System.out.printf("Management Process Cost: %.2f%n", costMng);
        System.out.printf("Industrial Process Cost: %.2f%n", costInd);
        System.out.printf("Resources Cost: %.2f%n", costRes);
        System.out.printf("Total Cost: %.2f%n", total);

        agv.getdata();
    }
}
