import java.util.*;

public class ShoppingCart {
	List<Item> userCart = new ArrayList<>();
	User user;
	long shoppingCartId;
	
	public ShoppingCart(User user) {
		this.user = user;
		this.shoppingCartId = user.id;
	}

	public void addItemToCart(Item item) {
		if (item != null)
			this.userCart.add(item);
	}
	
	public boolean deleteItem(Item item) {
		return userCart.removeIf(i -> (i.itemId == item.itemId));
	}
	
	public String toString() {
		String output = this.user.username+" cart:\n";
		for (Item i : this.userCart) 
			output += i.toString()+"\n";
		return output;
	}
}
