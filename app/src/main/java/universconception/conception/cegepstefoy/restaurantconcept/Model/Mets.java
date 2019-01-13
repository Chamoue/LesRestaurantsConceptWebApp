package universconception.conception.cegepstefoy.restaurantconcept.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


public class Mets {

    private int metsId;

    private String nomMet;


    private int Quantity;


    private float price;


    private int numeroDeCommande;

    public Mets(int metsId, String nomMet, int quantity, float price) {
        this.metsId = metsId;
        this.nomMet = nomMet;
        Quantity = quantity;
        this.price = price;
    }

    public int getMetsId() {
        return metsId;
    }

    public void setMetsId(int metsId) {
        this.metsId = metsId;
    }

    public String getNomMet() {
        return nomMet;
    }

    public void setNomMet(String nomMet) {
        this.nomMet = nomMet;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
