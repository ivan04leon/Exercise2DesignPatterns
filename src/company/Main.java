package company;

import company.creational.factoryMethod.Payment;
import company.creational.factoryMethod.PaymentFactory;
import company.creational.factoryMethod.TypePayment;

public class Main {

	public static void main(String[] args) {
		probarFactoryMethod();
	}
	private static void probarFactoryMethod() {
		Payment payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY);
		payment.doPayment();
	}
	
	private static void probarSingletonMethod() {
		 company.creational.singleton.Card.getINSTANCE().setCardNumber("1234-1234-1234-1234");
	}

}
