package comparable;

public class LaptopsForCompartor {
	
	private String Brand;
	private int Price;
	private int memory;
	
	
	public LaptopsForCompartor(String brand, int price, int memory) {
		super();
		Brand = brand;
		Price = price;
		this.memory = memory;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		return "Laptops [Brand=" + Brand + ", Price=" + Price + ", memory=" + memory + "]";
	}
	

}
