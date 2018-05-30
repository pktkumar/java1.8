package comparable;

public class LaptopsForComparaple implements Comparable<LaptopsForComparaple> {
	
	private String Brand;
	private int Price;
	private int memory;
	
	
	public LaptopsForComparaple(String brand, int price, int memory) {
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
	/*@Override
	public int compareTo(LaptopsForComparaple o) {
		
		//this>laps=+
		//this<laps=-
		//this=laps=0
		
			if(this.getPrice()>o.getPrice())	
				return 1;
			else
				return -1;
	}*/
	@Override
	public int compareTo(LaptopsForComparaple o) {
		// TODO Auto-generated method stub
		return this.Brand.compareTo(o.Brand);
	}
	
	
	

}
