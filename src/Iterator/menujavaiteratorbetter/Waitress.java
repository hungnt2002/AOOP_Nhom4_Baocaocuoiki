package Iterator.menujavaiteratorbetter;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    private ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            System.out.println(menu.getNameMenu());
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {

        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            System.out.println(menu.getNameMenu());
            printVegetarianMenu(menu.createIterator());
        }
    }

    private void printVegetarianMenu(Iterator<MenuItem> iterator) {
        
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if(menuItem.isVegetarian()){
                System.out.print(menuItem.getName() + ", ");
                System.out.print(menuItem.getPrice() + " -- ");
                System.out.println(menuItem.getDescription());
            }
        }
    }

    // other methods here
}
