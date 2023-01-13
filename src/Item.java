
public class Item {
	String name;
	long itemId;
	public Item (String name, long itemId) {
		this.name = name;
		this.itemId = itemId;
	}
	
	@Override
	public String toString() {
		return this.itemId + " - " + this.name;
	}
}
