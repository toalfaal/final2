package Logic;

public class Entrance {
    private boolean status;
    private String username;
    private String password;

    public Entrance(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean login(){
        System.out.println("Entrance.login");
        System.out.println("try to login with username: "+this.username+" password: "+this.password);
        status = true;
        System.out.println("status = " + status);
        return status;
    }
    public boolean isClient(){
        return !username.equals("admin");
    }
}
