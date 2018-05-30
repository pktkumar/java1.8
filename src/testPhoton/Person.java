package testPhoton;

public class Person {

	//firstName, LastName, age, address
	
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	
	public Person(String firstName, String lastname, int age, String address) {
		this.firstName=firstName;
		this.lastName=lastname;
		this.age=age;
		this.address=address;
		
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]";
	}
	
	
	
	
}
