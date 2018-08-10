
public class Invoice {

	private String number;
	private String description;
	private int quantity;
	private double price;

	public Invoice() //initialize four variables
	{
		this.number = "null";
		this.description = "null";
		this.quantity = 0;
		this.price = 0.0;
	}

	//initialize four variables with parameterized constructor
	//and if you use parameterized constructor no need to use set and get method
	public Invoice(String number,String description,int quantity,double price) {

		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	/*setting values inside private variables of Class with set method 
	for the the Class's object get method call. 
	and returning them with get method for the the Class's object get method call. 
	 */	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {

		if(quantity < 0)
			return 0;
		else {
			return quantity;
		}
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {

		if(price < 0)
			return 0.0;
		else{
			return price;
		}
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getInvoiceAmount()
	{
		return quantity*price;
	}
	
	//please use this if you use parameterized constructor
	
	/*public double getInvoiceAmount()
	{
		if(price < 0)
			price = 0.0;
		
		if(quantity <0)
			quantity = 0;
		
		return quantity*price;
	}
	*/

}

