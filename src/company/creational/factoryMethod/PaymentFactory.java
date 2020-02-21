package company.creational.factoryMethod;

public class PaymentFactory {
	public static Payment buildPayment(TypePayment typePayment) {
		switch(typePayment) {
		case GOOGLEPAY:
			return new GooglePayment();
		case CREDITCARD:
			return new CreditCard();
		default:
			return new CreditCard();
		}
	}

}
