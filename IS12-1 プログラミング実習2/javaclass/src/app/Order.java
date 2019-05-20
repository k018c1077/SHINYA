import java.time.LocalDate;

public class Order {
	private String code;
	private LocalDate date;
	private int price;
	private int quantity;
	private boolean delivery;

	public Order(String code, LocalDate date, int price, int quantity, boolean delivery) {
		this.code = code;
		this.date = date;
		this.price = price;
		this.quantity = quantity;
		this.delivery = delivery;
	}

	public String getCode() {
		return code;
	}

	public LocalDate getDate() {
		return date;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
}
