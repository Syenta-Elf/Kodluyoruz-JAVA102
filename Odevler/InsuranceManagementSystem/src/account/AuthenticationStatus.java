package src.account;
public enum AuthenticationStatus {
    FAIL,
    SUCCESS;

    public static AuthenticationStatus login(User user,String email,String password){
        if(user.getEmail().equals(email) && user.getPassword().equals(password)){
            return SUCCESS;
        } else 
            {
                System.out.println("Hatalı şifre");
                return FAIL;
            }        
    }
}
