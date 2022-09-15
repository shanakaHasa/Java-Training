package equality.com;

public class Application {

	public static void main(String[] args) {
        Items item1 = new Items(1,5512,"books","veyangoda");
        Items item2 = new Items(5,5321,"pencil","gampaha");
        Items item3 = new Items(1,5512,"pen","colombo");

        System.out.println(item1.equals(item2));
        System.out.println(item1.equals(item3));

	}

}
