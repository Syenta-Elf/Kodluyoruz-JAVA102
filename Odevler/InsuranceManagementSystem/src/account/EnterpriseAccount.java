package src.account;

public class EnterpriseAccount extends Account {
    

    public EnterpriseAccount(User user) {
        super(user);
        
    }

    @Override
    public int compareTo(Account o) {
        // TODO Auto-generated method stub
        return this.getUser().getAge() - o.getUser().getAge();
    }
    
}
