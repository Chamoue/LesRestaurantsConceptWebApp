package universconception.conception.cegepstefoy.restaurantconcept.Model;

public class Password {


    private int passwordId;


    private String password;

    public Password(String password) {
        this.password = password;
    }


    public int getPasswordId() {

        return passwordId;
    }

    public void setPasswordId(int passwordId) {
        this.passwordId = passwordId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
