package universconception.conception.cegepstefoy.restaurantconcept.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

public class Courriel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="courriel_Id")
    private int courrielId;

    @ColumnInfo(name="courriel")
    private String courriel;
}
