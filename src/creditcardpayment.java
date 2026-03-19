
interface paymentmethod{
	void pay (double amount);
}
class mpesapayment implements paymentmethod{
	public void pay (double amount) {
		System.out.println("pay"   + amount +  " via mpesa");
	}
}


class creditcardpayment implements paymentmethod{
	public void pay(double amount) {
		System.out.println("paying"   + amount +   "using creditcard");
	}
	 public static void main(String[] args) {
		 paymentmethod payment= new mpesapayment();
		 paymentmethod payment1= new creditcardpayment();
		 payment.pay(500.0);
		 payment1.pay(1500.0);
	 }
}
