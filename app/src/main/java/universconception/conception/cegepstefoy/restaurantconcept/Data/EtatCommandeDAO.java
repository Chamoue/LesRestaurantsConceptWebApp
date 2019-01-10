package universconception.conception.cegepstefoy.restaurantconcept.Data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import universconception.conception.cegepstefoy.restaurantconcept.Model.EtatCommande;

@Dao
public interface EtatCommandeDAO {
    @Insert
    void insertEtatCommnade(EtatCommande etatCommande);
}
