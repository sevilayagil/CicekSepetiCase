package scenarios.base;

public class User {
    public String getUserName(){
        return userName; }

    public void setUserName(String userName){
        this.userName =userName;
    }
    public String getUserPassword(){
        return userPassword;
    }
    public void setUserPassword(String userPassword){
        this.userPassword=userPassword;
    }
    String userName;
    String userPassword;
    public User(){
        setUserName("sevotest10@gmail.com");
        setUserPassword("Ciceksepeti2019!");
    }
}
