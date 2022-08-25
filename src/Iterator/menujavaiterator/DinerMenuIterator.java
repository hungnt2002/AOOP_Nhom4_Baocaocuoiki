package Iterator.menujavaiterator;
import java.util.Iterator; //thu vien co san cua java

public class DinerMenuIterator implements Iterator<MenuItem>{

    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } 
        else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
    
    public void remove() {
            throw new UnsupportedOperationException
            ("You shouldn't be trying to remove menu items.");
        }
}
