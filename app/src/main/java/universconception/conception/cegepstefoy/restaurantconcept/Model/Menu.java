package universconception.conception.cegepstefoy.restaurantconcept.Model;
import java.util.List;

public class Menu {


    private int menuId;


    private List<Mets> menu;

    public Menu(int menuId, List<Mets> menu) {
        this.menuId = menuId;
        this.menu = menu;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public List<Mets> getMenu() {
        return menu;
    }

    public void setMenu(List<Mets> menu) {
        this.menu = menu;
    }

    public void addToMenu(Mets mets) {
        this.menu.add(mets);
    }

    public void removeFromMenu(Mets mets){
        this.menu.remove(mets);
    }
}
