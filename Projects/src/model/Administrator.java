package Projects.src.model;

public class Administrator {
    private String username;
    private String password;

    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(String inputUsername, String inputPassword) {
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            System.out.println("Access Approved");
            while(true){
                System.out.println("What do want to do \n\r1.Create customer account\n\r2.Freeze an account\n\r3.View all transactions\n\r4.View report");
            }
        } else {
            System.out.println("Access Denied");
        }
    }
}
