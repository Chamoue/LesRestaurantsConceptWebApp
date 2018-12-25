package universconception.conception.cegepstefoy.restaurantconcept.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

public class Password {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "password_Id")
    private int passwordId;

    @ColumnInfo(name = "password")
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
