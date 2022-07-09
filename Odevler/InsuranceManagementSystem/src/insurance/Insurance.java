package src.insurance;
import java.time.LocalDate;

import src.account.Account;



public abstract class Insurance {
    private String insuranceName;
    protected double costOfInsurance;
    private LocalDate startEndDate;

    public Insurance(String insuranceName, LocalDate startEndDate) {
        this.insuranceName = insuranceName;
        this.startEndDate = startEndDate;
    }

    public String getInsuranceName() {
        return insuranceName;
    }
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public LocalDate getStartEndDate() {
        return startEndDate;
    }
    public void setStartEndDate(LocalDate startEndDate) {
        this.startEndDate = startEndDate;
    }

    public abstract void calculateCost(Account account);

}
