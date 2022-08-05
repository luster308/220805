import java.util.Date;

public class Car {
	private String name;
	private int price;
	private String maker;
	private Date today;
	private final double PI;
	public Car(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
		System.out.println("방금 객체가 생성되었습니다.");
	}
	
	{   // Initialization Block
		System.out.println("Hello, World");
		this.today = new Date();
		this.PI = 3.141596;
	}
	
	@Override
	public String toString() {
		return "오늘은 " + this.today+"입니다.";
	}
}
