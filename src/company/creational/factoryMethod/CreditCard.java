package company.creational.factoryMethod;

public class CreditCard implements Payment {
	@Override
	public void doPayment() {
		System.out.println("Pagando con credit Card");
	}
}
