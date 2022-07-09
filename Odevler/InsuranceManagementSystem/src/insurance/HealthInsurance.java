package src.insurance;
import java.time.LocalDate;

import src.account.Account;
import src.account.EnterpriseAccount;



public class HealthInsurance extends Insurance {

    public HealthInsurance(String insuranceName,  LocalDate startEndDate) {
        super(insuranceName, startEndDate);
    }

    @Override
    public void calculateCost(Account account) {
        if(account instanceof EnterpriseAccount){
            this.costOfInsurance = 500.99;
        }else{
            this.costOfInsurance = 1000.99;
        }
    }
    
}
