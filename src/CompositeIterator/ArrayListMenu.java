package CompositeIterator;

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListMenu extends Menu {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();

    public ArrayListMenu(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public ArrayList<MenuComponent> getMenuItems() {
        return menuComponents;
    }

    public Iterator<MenuComponent> createIterator() {
        // return menuComponents.iterator(); // trước khi thay đổi
        return new CompositeIterator(menuComponents.iterator()); // Sau khi áp dụng CompositeIterator
    }

    // other menu methods here
}
