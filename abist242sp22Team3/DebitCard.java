package ist242;

import java.util.Date;

public class DebitCard extends Payment{

    private String CardName;
    private Integer CardNumber;
    private Date CardExpDate;
    private Integer PinNumber;

    public DebitCard(double payCharge){
        super(payCharge);
    }

    public double handlePayment(double pay){
        return pay * super.getpaymentCharge();
    }

    public void setDebitCardName(String ccName){
        CardName = ccName;
    }

    public String getDebitCardName(){
        return CardName;
    }

    public void setDebitCardNumber (int dbNumber){
        CardNumber = dbNumber;
    }

    public int getDebitCardNumber ( ){
        return CardNumber;
    }

    public void setDebitCardExpDate(){
        CardExpDate = new Date();
    }

    public Date getDebitCardExpDate(){
        return CardExpDate;
    }

    public void setDebitCardPin (int dbPin){
        PinNumber = dbPin;
    }
    public int getDebitCardPin ( ){
        return PinNumber;
    }


}
