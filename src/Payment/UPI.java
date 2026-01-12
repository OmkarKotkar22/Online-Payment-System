package Payment;

public class UPI implements Payment {

	public double getCharges()
	{
		return 0;
	}
	
	public double processPayment(double amount)
	{
		return amount + getCharges();
	}
}
