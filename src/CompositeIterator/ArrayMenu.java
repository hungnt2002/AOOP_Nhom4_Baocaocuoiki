package CompositeIterator;

import java.util.Iterator;

public class ArrayMenu extends Menu {
    static final int MAX_ITEMS = 100;
    int numberOfItems = 0;
    MenuComponent[] menuItems = new MenuComponent[MAX_ITEMS];

    public ArrayMenu(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        // TODO Auto-generated method stub
        // super.add(menuComponent);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuComponent;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(new ArrayMenuIterator(menuItems));
    }

}
