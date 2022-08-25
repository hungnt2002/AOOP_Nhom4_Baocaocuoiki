package Iterator.menujavaiteratorbetter;
import java.util.Iterator;

public interface Menu {
    public String getNameMenu();
    public Iterator<MenuItem> createIterator();
}
