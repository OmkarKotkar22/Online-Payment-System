package Payment;

public class DebitCard implements Payment {

	public double getCharges()
	{
		return 0.01;
	}
	
	public double processPayment(double amount)
	{
		return amount + (amount * getCharges());
	}
}
