package universconception.conception.cegepstefoy.restaurantconcept.Model;

import android.arch.persistence.room.ColumnInfo;

public class Personne {

    @ColumnInfo(name = "prenom")
    private String prenom;

    @ColumnInfo(name = "nom")
    private String nom;

    @ColumnInfo(name = "courriel")
    private Courriel courriel;

    @ColumnInfo(name = "password")
    private Password password;

    protected Personne(String prenom, String nom, Courriel courriel, Password password) {
        this.prenom = prenom;
        this.nom = nom;
        this.courriel = courriel;
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Courriel getCourriel() {
        return courriel;
    }

    public void setCourriel(Courriel courriel) {
        this.courriel = courriel;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
