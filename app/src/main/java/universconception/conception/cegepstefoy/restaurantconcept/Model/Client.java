package universconception.conception.cegepstefoy.restaurantconcept.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "table_client")
public class Client extends Personne {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "client_Id")
    private Integer clientId;
    @ColumnInfo(name = "commande")
    private Commande commandeEnCours;

    public Client(String prenom, String nom, Courriel courriel, Password password, Commande commandeEnCours) {
        super(prenom, nom, courriel, password);
        this.commandeEnCours = commandeEnCours;
    }

    public Client(String prenom, String nom, Courriel courriel, Password password, Integer clientId, Commande commandeEnCours) {
        super(prenom, nom, courriel, password);
        this.clientId = clientId;
        this.commandeEnCours = commandeEnCours;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Commande getCommandeEnCours() {
        return commandeEnCours;
    }

    public void setCommandeEnCours(Commande commandeEnCours) {
        this.commandeEnCours = commandeEnCours;
    }
}
