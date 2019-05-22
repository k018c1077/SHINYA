package sample2;
import java.time.LocalDate;

public final class Product {
	private final String number;
	private final String name;
	private final int price;
	private final LocalDate date;
	private final boolean stock;

	public Product(String number, String name, int price, LocalDate date, boolean stock) {
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = date;
		this.stock = stock;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public LocalDate getDate() {
		return date;
	}

	public boolean isStock() {
		return stock;
	}


	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date + ", stock="
				+ stock + "]";
	}

//	public int totalPrice(int quantity) {
//		int total = price * quantity;
//		return total;
//	}
//
//	public boolean isHighPrice(int p) {
//		return price > p;
//	}
}
