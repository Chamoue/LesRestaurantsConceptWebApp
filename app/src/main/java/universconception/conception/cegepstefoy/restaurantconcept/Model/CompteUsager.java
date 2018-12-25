package universconception.conception.cegepstefoy.restaurantconcept.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

public class CompteUsager {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "compteUsager_Id")
    private int compteUsagerId;

    @ColumnInfo(name = "personne")
    private Personne personne;
}
