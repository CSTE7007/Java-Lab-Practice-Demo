import java.util.Scanner;


public class InvoiceTest {

	public static void main(String[] args) {

		// If you want to go with user input

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Invoice no: ");
		String number = scanner.nextLine();
		System.out.println("Enter Item description: ");
		String description = scanner.nextLine();
		System.out.println("Enter Item quantity: ");
		int quantity = scanner.nextInt();
		System.out.println("Enter Price per Item: ");
		double pricePerItem = scanner.nextDouble();

		scanner.close();

		Invoice sell0 = new Invoice();
		//the constructor will initialize the variables

		//set method with set the values that is sent
		sell0.setNumber(number);
		sell0.setDescription(description);
		sell0.setQuantity(quantity);
		sell0.setPrice(pricePerItem);

		//get method will retun the value for us to print on console
		System.out.print("\nNo : "+sell0.getNumber()+
				"\nDescription: " + sell0.getDescription()+
				"\nQuantity: " +  sell0.getQuantity()+
				"\nPrice(per item): "+ sell0.getPrice()+
				"\nAmount to be paid: "+ sell0.getInvoiceAmount());

				
		 /* If you want to do with 
		 * giving value as parameterized constructor
		 * uncomment this section and comment upper codes
		 */
		
		/*Invoice sell1 = new Invoice("1", "BOOK", 5, 300);

		System.out.print("\nNo : "+sell1.getNumber()+
				"\nDescription: " + sell1.getDescription()+
				"\nQuantity: " +  sell1.getQuantity()+
				"\nPrice(per item): "+ sell1.getPrice()+
				"\nAmount to be paid: "+ sell1.getInvoiceAmount());

		Invoice sell2 = new Invoice("2", "PC", 7, -200);

		System.out.print("\nNo : "+sell2.getNumber()+
				"\nDescription: " + sell2.getDescription()+
				"\nQuantity: " +  sell2.getQuantity()+
				"\nPrice(per item): "+ sell2.getPrice()+
				"\nAmount to be paid: "+ sell2.getInvoiceAmount());

		Invoice sell3 = new Invoice("2", "PC", -7, 200);

		System.out.print("\nNo : "+sell3.getNumber()+
				"\nDescription: " + sell3.getDescription()+
				"\nQuantity: " +  sell3.getQuantity()+
				"\nPrice(per item): "+ sell3.getPrice()+
				"\nAmount to be paid: "+ sell3.getInvoiceAmount());*/
		 


	}

}
