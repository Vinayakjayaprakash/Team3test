package ist242;

import java.util.Date;

public class CreditCard extends Payment{
    private String cardName;
    private String cardNumber;
    private Date cardExpDate;
    private Integer cardCvc;

    public CreditCard(double payCharge){
        super(payCharge);
    }

    public double handlePayment(double pay){
        return pay * super.getpaymentCharge();
    }

    public void setCreditCardName(String ccName){
        cardName = ccName;
    }

    public String getCreditCardName(){
        return cardName;
    }

    public void setCreditCardNumber(String ccNumber){
        cardNumber = ccNumber;
    }

    public String getCreditCardNumber(){
        return cardNumber;
    }

    public void setCreditCardExpDate(){
        cardExpDate = new Date();
    }

    public Date getCreditCardExpDate(){
        return cardExpDate;
    }

    public void setCreditCardCvc(int ccCvc){
       cardCvc = ccCvc;
    }

    public int getCreditCardCvc(){
        return cardCvc;
    }

}
