package Iterator.menujavaiteratorbetter;

import java.util.ArrayList;

public class WaitressTestDrive {
    public static void main(String[] args) {

        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        ArrayList menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);
        System.out.println("\n--ALL Menu");
        waitress.printMenu();

        System.out.println("\n--Menu mon chay");
        waitress.printVegetarianMenu();

    }
}
