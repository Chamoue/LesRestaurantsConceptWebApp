package universconception.conception.cegepstefoy.restaurantconcept.Data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import universconception.conception.cegepstefoy.restaurantconcept.Model.Client;

@Dao
public interface ClientDAO {
    @Insert
    void insertClient (Client client);
}
