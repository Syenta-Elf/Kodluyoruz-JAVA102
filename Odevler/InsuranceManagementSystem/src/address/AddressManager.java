package src.address;
import java.util.List;

public class AddressManager {

    public static List<Address> addAddress(List<Address> addressList,Address address){
        addressList.add(address);
        return addressList;
    }
    public static List<Address> removeAddress(List<Address> addressList,Address address){
        addressList.remove(address);
        return addressList;
    }
}
