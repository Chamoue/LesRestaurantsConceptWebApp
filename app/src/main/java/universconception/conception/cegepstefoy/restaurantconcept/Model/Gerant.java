package universconception.conception.cegepstefoy.restaurantconcept.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

public class Gerant extends Personne{

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="gerant_Id")
    private int gerantId;

    public Gerant(String prenom, String nom, Courriel courriel, Password password, int gerantId) {
        super(prenom, nom, courriel, password);
        this.gerantId = gerantId;
    }

    public int getGerantId() {
        return gerantId;
    }

    public void setGerantId(int gerantId) {
        this.gerantId = gerantId;
    }
}
