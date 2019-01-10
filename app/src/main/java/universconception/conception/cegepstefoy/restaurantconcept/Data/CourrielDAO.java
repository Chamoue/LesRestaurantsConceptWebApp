package universconception.conception.cegepstefoy.restaurantconcept.Data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import universconception.conception.cegepstefoy.restaurantconcept.Model.Courriel;

@Dao
public interface CourrielDAO {
    @Insert
    void insertCourriel(Courriel courriel);
}
