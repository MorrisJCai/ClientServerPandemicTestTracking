public class Test{
    private String testID;
    private String testPatientName;
    private String testPatientPhoneNumber;
    private TestLocation testLocation;
    private LabLocation labLocation;
    private boolean testResult;

    public Test(String testNumber, String patientName, String patientPhonenNumber){
        testID = testNumber;
        testLocation = testLocation;
        testPatientName = patientName;
        testPatientPhoneNumber = patientPhonenNumber;
    }

    public void setLabLocation(LabLocation location){
        labLocation = location;
    }

    

    public LabLocation getLabLocation(){
        return labLocation;
    }

    public String getPatientName(){
        return testPatientName;
    }


    public String getPatientPhoneNumber(){
        return testPatientPhoneNumber;
    }

    public void setResult(boolean result){
        testResult = result;
    }
    
    public boolean getResult(){
        return testResult;
    }

    public String toString(){
        try{
            return "[TestID: " +testID + " : " + testResult + " for "  + testPatientName + "/" + testPatientPhoneNumber+ "]";
        }
        catch(Exception Ex){
            return "[TestID: " +testID + " for "  + testPatientName + "/" + testPatientPhoneNumber + "]";
        }
    }
}