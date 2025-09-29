// ========================
// Class: IOperation
// ========================
import java.util.List;

class IOperation {
    private String id;
    private String description;
    private int nominalTime;       // in minutes
    private List<AGV> resources;   // AGVs required

    public IOperation(String id, String description, int nominalTime, List<AGV> resources) {
        this.id = id;
        this.description = description;
        this.nominalTime = nominalTime;
        this.resources = resources;
    }

    public void setData(String description, int nominalTime) {
        this.description = description;
        this.nominalTime = nominalTime;
    }

    public String getData() {
        return "Operation[ID=" + id + ", Desc=" + description +
                ", Time=" + nominalTime + " mins, AGVs=" + resources.size() + "]";
    }

    public int getDuration() {
        return nominalTime;
    }

    public List<AGV> getResources() {
        return resources;
    }
}
