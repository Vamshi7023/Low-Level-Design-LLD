interface PaymentProcessor {
    void processPayment(int amount);
}
class CreditCardProcessor implements PaymentProcessor {
    public void processPayment(int amount){
        System.out.println("amount payed credit "+amount);
    }
}
class UpiProcessor implements PaymentProcessor {
    public void processPayment(int amount){
        System.out.println("amount payed upi "+amount);
    }
}
class NetBankingProcessor implements PaymentProcessor {
    public void processPayment(int amount){
        System.out.println("amount payed net "+amount);
    }
}

class PaymentProcessorFactory {

    public static PaymentProcessor getProcessor(String type) {

        if (type.equals("creditcard")) {
            return new CreditCardProcessor();
        }

        if (type.equals("upi")) {
            return new UpiProcessor();
        }

        if (type.equals("netbanking")) {
            return new NetBankingProcessor();
        }

        return null;
    }
}


class FactoryDesignPattern{
    public static void main(String[] args) {
        PaymentProcessor processor = PaymentProcessorFactory.getProcessor("upi");
        processor.processPayment(6000);
        
    }
}