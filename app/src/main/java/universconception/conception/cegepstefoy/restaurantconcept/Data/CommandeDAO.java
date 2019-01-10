package universconception.conception.cegepstefoy.restaurantconcept.Data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import universconception.conception.cegepstefoy.restaurantconcept.Model.Commande;

@Dao
public interface CommandeDAO {
    @Insert
    void insertCommande (Commande commande);
}
