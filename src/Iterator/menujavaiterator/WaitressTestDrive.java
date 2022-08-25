package Iterator.menujavaiterator;

public class WaitressTestDrive {
    public static void main(String[] args) {
        //Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        // waitress.printMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
