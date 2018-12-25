package universconception.conception.cegepstefoy.restaurantconcept.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

public class Commande {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "commande")
    private int commandeId;

    @ColumnInfo(name = "details_commande")
    private List<Mets> metsCommande;

    public Commande(int commandeId, List<Mets> metsCommande) {
        this.commandeId = commandeId;
        this.metsCommande = metsCommande;
    }

    public int getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(int commandeId) {
        this.commandeId = commandeId;
    }

    public List<Mets> getMetsCommande() {
        return metsCommande;
    }

    public void setMetsCommande(List<Mets> metsCommande) {
        this.metsCommande = metsCommande;
    }
}
