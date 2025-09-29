// ========================
// Class: AGV
// ========================
class AGV {
    private String id;
    private double batteryLoad;    // current battery level (%)
    private double consumption;    // energy consumption per operation (kWh)
    private int chargingTime;      // minutes required to recharge
    private String position;       // current position in warehouse
    private float maxSpeed;
    private float actSpeed;

    public AGV(String id, double batteryLoad, double consumption, int chargingTime,
               String position, float maxSpeed, float actSpeed) {
        this.id = id;
        this.batteryLoad = batteryLoad;
        this.consumption = consumption;
        this.chargingTime = chargingTime;
        this.position = position;
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    }

    public void setData(String key, Object value) {
        switch (key.toLowerCase()) {
            case "batteryload": this.batteryLoad = (double) value; break;
            case "consumption": this.consumption = (double) value; break;
            case "position": this.position = (String) value; break;
            case "actspeed": this.actSpeed = (float) value; break;
            default: System.out.println("Unknown property: " + key);
        }
    }

    public String getData() {
        return "AGV[ID=" + id + ", Battery=" + batteryLoad + "%, Consumption=" + consumption +
                " kWh, Pos=" + position + ", Speed=" + actSpeed + "/" + maxSpeed + "]";
    }

    public double getConsumption() {
        return consumption;
    }
}
