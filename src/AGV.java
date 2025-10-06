public class AGV extends HardwareResources {
    private String ID;
    private double batteryLoad;
    private double consumption;
    private double chargingTime;
    private String position;
    private float maxSpeed;
    private float actSpeed;

    public AGV(String ID, String field, double batteryLoad, double consumption,
               double chargingTime, String position, float maxSpeed, float actSpeed) {
        super(field);
        this.ID = ID;
        this.batteryLoad = batteryLoad;
        this.consumption = consumption;
        this.chargingTime = chargingTime;
        this.position = position;
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    }

    public void setdata(double consumption, float actSpeed) {
        this.consumption = consumption;
        this.actSpeed = actSpeed;
    }

    public void getdata() {
        System.out.printf("AGV %s @%s | Battery: %.1f%% | Speed: %.1f m/s%n",
                ID, position, batteryLoad, actSpeed);
    }

    @Override
    public double getCost() { return 1000.0; }
}
