package universconception.conception.cegepstefoy.restaurantconcept.Data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.content.Context;

import universconception.conception.cegepstefoy.restaurantconcept.Model.Client;
import universconception.conception.cegepstefoy.restaurantconcept.Model.Commande;
import universconception.conception.cegepstefoy.restaurantconcept.Model.CompteUsager;
import universconception.conception.cegepstefoy.restaurantconcept.Model.Courriel;
import universconception.conception.cegepstefoy.restaurantconcept.Model.EtatCommande;
import universconception.conception.cegepstefoy.restaurantconcept.Model.Gerant;
import universconception.conception.cegepstefoy.restaurantconcept.Model.Menu;
import universconception.conception.cegepstefoy.restaurantconcept.Model.Mets;
import universconception.conception.cegepstefoy.restaurantconcept.Model.Password;

@Database(entities = {Client.class, Commande.class, CompteUsager.class, Courriel.class, EtatCommande.class,
        Gerant.class,Menu.class, Mets.class, Password.class}, version = 1)
public abstract class RoomDatabase extends android.arch.persistence.room.RoomDatabase {
    public abstract ClientDAO restoDAO();

    private static volatile RoomDatabase INSTANCE;

    static RoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (RoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            RoomDatabase.class, "restoDB")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
