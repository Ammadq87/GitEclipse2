
public class Test {

	public static void main(String[] args) {
		
		new Test();

	}
	
	public Test() {
		Item items[] = {new Item ("Banana", 1), new Item ("Chair", 2), new Item ("Sofa", 3)};
		User users[] = {new User("UnknownUser", 2769)};
		for (Item i : items) {
			users[0].sc.addItemToCart(i);
		}
		System.out.println(users[0].sc.toString());
		boolean deleted = users[0].sc.deleteItem(items[0]);
		
		deleted = users[0].sc.deleteItem(items[0]);
		
		if (!deleted)
			System.out.println("Product was not found or was already removed from cart");
		System.out.println(users[0].sc.toString());
		
	}

}
