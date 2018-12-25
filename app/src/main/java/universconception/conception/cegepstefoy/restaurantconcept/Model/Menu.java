package universconception.conception.cegepstefoy.restaurantconcept.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

public class Menu {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "menu_Id")
    private int menuId;

    @ColumnInfo(name = "details_menu")
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
