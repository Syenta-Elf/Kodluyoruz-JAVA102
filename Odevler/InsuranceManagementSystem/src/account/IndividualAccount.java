package src.account;

public class IndividualAccount extends Account {

    public IndividualAccount(User user) {
        super(user);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int compareTo(Account o) {
     
        return this.getUser().getAge() - o.getUser().getAge();
    }
    
}
