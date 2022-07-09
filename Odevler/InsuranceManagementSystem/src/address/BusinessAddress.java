package src.address;
public class BusinessAddress implements Address {
    private final String name = "Business Address";
    private String address;

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    
}
