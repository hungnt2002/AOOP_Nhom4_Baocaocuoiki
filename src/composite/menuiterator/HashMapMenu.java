package composite.menuiterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMenu extends Menu {

    private Map<String, MenuComponent> menuComponents = new HashMap<String, MenuComponent>();

    public HashMapMenu(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        // TODO Auto-generated method stub
        menuComponents.put(menuComponent.getName(), menuComponent);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(menuComponents.values().iterator());
    }

}
