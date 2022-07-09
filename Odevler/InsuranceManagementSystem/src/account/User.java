package src.account;
import java.time.LocalDate;
import java.util.List;

import src.address.Address;

/**
 * User
 */
public class User {

    private String name;
    private String surName;
    private String email;
    private String password;
    private String job;
    private int age;
    private List<Address> addressList;
    private LocalDate lastLoginDate;
    
    public User() {
    }

    public User(String name, String surName, String email, String password, String job, int age,
            List<Address> addressList, LocalDate lastLoginDate) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addressList = addressList;
        this.lastLoginDate = lastLoginDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<Address> getAddressList() {
        return this.addressList;
    }
    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }
    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    } 
    
}