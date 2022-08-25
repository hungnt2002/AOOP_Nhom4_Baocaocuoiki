package Iterator.menujavaiteratorbetter;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }

    }

    private void printMenu(Iterator<MenuItem> iterator) {
        String nameMenu = "";
        System.out.println("");
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if(menuItem.getNameMenu() != nameMenu){
                nameMenu = menuItem.getNameMenu();
                System.out.println(nameMenu);
            }
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
    // other methods here
}
