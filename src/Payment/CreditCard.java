package Payment;

public class CreditCard implements Payment {

	public double getCharges()
	{
		return 0.02;
	}
	
	public double processPayment(double amount)
	{
		return amount + (amount * getCharges());
	}
}
