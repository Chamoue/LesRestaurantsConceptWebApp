package universconception.conception.cegepstefoy.restaurantconcept.Data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import universconception.conception.cegepstefoy.restaurantconcept.Model.Gerant;

@Dao
public interface GerantDAO {
    @Insert
    void insertGerant(Gerant gerant);
}
