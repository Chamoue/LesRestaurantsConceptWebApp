package universconception.conception.cegepstefoy.restaurantconcept.Model;

public class Gerant extends Personne{
    private int gerantId;


    public Gerant(int gerantId) {
        this.gerantId = gerantId;
    }

    public int getGerantId() {
        return gerantId;
    }

    public void setGerantId(int gerantId) {
        this.gerantId = gerantId;
    }
}
