package universconception.conception.cegepstefoy.restaurantconcept.Data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import universconception.conception.cegepstefoy.restaurantconcept.Model.CompteUsager;

@Dao
public interface CompteUsagerDAO {
    @Insert
    void insertCompteUsager(CompteUsager compteUsager);
}
