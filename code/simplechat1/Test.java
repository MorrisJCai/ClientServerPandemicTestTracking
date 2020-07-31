public class Test{
    private int testID;
    private TestLocation testLocation;
    private LabLocation labLocation;

    public Test(int testNumber, TestLocation location){
        testID = testNumber;
        testLocation = testLocation;
        
    }

    public void setLabLocation(LabLocation location){
        labLocation = location;
    }

    public TestLocation getTestLocation(){
        return testLocation;
    }

    public LabLocation getLabLocation(){
        return labLocation;
    }

    public void setResult(boolean result){
        testResult = result;
    }
    
    public boolean getResult(){
        return result;
    }

    public String toString(){
        return "[TestID: " + testID.toString() + "| TestLocation: " + testLocationName + " at "+ testLocationAddress + ", "+testLocationPostal+"| Result: "+testResult.toString()+"]";
    }
}