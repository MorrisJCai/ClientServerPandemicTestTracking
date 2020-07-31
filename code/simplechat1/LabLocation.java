

public class LabLocation implements Tes lab{
    private String labName;
    private String labAddress;
    private String labPostal;
    private int labCapacity;
    private int labUsage = 0;
    

    public LabLocation(String name, String address, String postal, int capacity){
        labName = name;
        labAddress = address;
        labPostal = postal;
        labCapacity = capacity;    
    }

    public String getLabName(){
        return labName;
    }

    public String getLabAddress(){
        return labAddress;
    }

    public String getLabPostal(){
        return labPostal
    }

    public int getLabCapacity(){
        return labCapacity;
    }

    public int getLabUsage(){
        return labUsage;
    }

    public double getLabUtilization(){
        double percent = labUsage/labCapacity;
        return percent;
    }

    public void increment(){
        labUsage++;
    }

    public boolean canTestMore{
        return labUsage < labCapacity;
    }

    public String toString(){
        return "[Tes lab: " + tes labName + " at "+ labAddress + ", " labPostal"]";
    }

}