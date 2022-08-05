
public class Lion extends Mammal{
	private int age;

	public Lion(String name, int age) {
		super(name);
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름은 " + getName() + ", 나이는 " + this.age;
	}
}