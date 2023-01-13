
public class User {
	String username;
	long id;
	ShoppingCart sc;
	
	public User (String username, long id) {
		this.username = username;
		this.id = id;
		this.sc = new ShoppingCart(this);
	}
}
