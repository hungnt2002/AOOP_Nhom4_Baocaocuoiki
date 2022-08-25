package composite.menuiterator;

import java.util.Iterator;
public class Menu extends MenuComponent {
 
	private String name;
	private String description;
 
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}


	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator<MenuComponent> iterator = createIterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = 
				(MenuComponent)iterator.next();
			menuComponent.print();
		}
	}

	@Override
	public Iterator createComposiIterator(Iterator iterator) {
		return new CompositeIterator(iterator);
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		throw new UnsupportedOperationException();
	}

}
