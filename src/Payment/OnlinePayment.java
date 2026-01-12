/*Q1. Online Payment System – Using Interface
Interface: Payment
Methods:
processPayment(double amount)
getCharges()
Classes Implementing Interface:
UPI – No extra charges
CreditCard – 2% processing fee
DebitCard – 1% processing fee
Task:
Take 5 payments (mix of UPI, credit, debit).
Print final amount after adding charges.
Count how many payments used CreditCard.
Explanation:
This question checks:
How class implements an interface
Polymorphism using interface reference
Logic to add percentage charges
Filtering and counting items
*/

package Payment;
import java.util.*;
public class OnlinePayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		Payment payments[] = new Payment[size];
		int amounts[] = new  int[size];
		int creditCount = 0;
		
		for(int i = 0; i < amounts.length; i++)
		{
			System.out.print("Enter the type(1-UPI, 2-Credit Card, 3-Debit Card): ");
			int type = sc.nextInt();
			
			System.out.print("Enter the Amount: ");
			int amt = sc.nextInt();
			
			if(type == 1)
				payments[i] = new UPI();
			else if(type == 2)
			{
				payments[i] = new CreditCard();
				creditCount++;
			}
			else
				payments[i] = new DebitCard();
			
			amounts[i] = amt;
		}
		
		System.out.println("\n--- Payment Results ---");
		
		for(int i = 0; i < amounts.length; i++)
		{
			double finalAmount = payments[i].processPayment(amounts[i]);
			
			System.out.printf(
	                "Payment %d: Original = %d, Charge%% = %.2f%%, Final = %.2f%n",
	                i+1,                                      // Payment number
	                amounts[i],                               // Original amount
	                payments[i].getCharges() * 100,     // Charges in percentage form
	                finalAmount                               // Final calculated amount
	            );
		}
		
        System.out.println("Total Credit Card Payments: " + creditCount);
	}
}
