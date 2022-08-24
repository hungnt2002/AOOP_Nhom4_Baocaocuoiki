package CompositeIterator;

import java.util.Iterator;

public class ArrayMenuIterator implements Iterator<MenuComponent> {

    MenuComponent[] items;
    int position = 0;

    public ArrayMenuIterator(MenuComponent[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuComponent next() {
        MenuComponent menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public void remove() {
        throw new UnsupportedOperationException("You shouldn't be trying to remove menu items.");
    }
}
