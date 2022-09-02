
public class JavaSingletonPattern {

	public static void main(String[] args) {

	}

}

class Singleton {
	private Singleton() {
	}
	public String str;

	public static Singleton getSingleInstance() {
		return new Singleton();
	}

}