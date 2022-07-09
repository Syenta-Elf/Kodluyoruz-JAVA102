package src.account;

import java.util.List;

import src.address.Address;
import src.insurance.Insurance;

public abstract class Account implements Comparable<Account>{

    private User user;
    private List<Insurance> listInsurance;

    protected Account(User user){
        this.user = user;
    }


    public final void showUserInfo(){
        System.out.println(this.user.getName());
        System.out.println(this.user.getSurName());
        System.out.println(this.user.getEmail());
        System.out.println(this.user.getJob());
        for (Address address : this.user.getAddressList() ) {
            System.out.println(address.getAddress());
        }
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public List<Insurance> getListInsurance() {
        return listInsurance;
    }


    public void setListInsurance(List<Insurance> listInsurance) {
        this.listInsurance = listInsurance;
    }
}
