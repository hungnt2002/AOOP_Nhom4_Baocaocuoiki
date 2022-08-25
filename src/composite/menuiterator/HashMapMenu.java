package composite.menuiterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMenu extends Menu {

    private Map<Integer, MenuComponent> menuComponents = new HashMap<Integer, MenuComponent>();
    private int key = 0;

    public HashMapMenu(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.put(key, menuComponent);
        key++;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return menuComponents.values().iterator();
    }

}
