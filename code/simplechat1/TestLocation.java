public class TestLocation{
    private String locationName;
    private String locationAddress;
    private String locationPostal;

    public TestLocation(String name, String address, String postal){
        locationName = name;
        locationAddress = address;
        locationPostal = postal;

    }

    public String getTestLocationName(){
        return locationName;
    }

    public String getTestLocationAddress(){
        return locationAddress;
    }

    public String getTestlocationnPostal(){
        return locationPostal;
    }

    public String toString(){
        return "[TestLocation: " + locationName + " at "+ locationAddress + ", "+ locationPostal + "]";
    }

}