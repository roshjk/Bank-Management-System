public class CreditCard extends BankCard  //indicates that CreditCard class is inherited from BankCard class */
{
    //attributes of creditcard
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    // constructor to initialize balance amount, card id, bank account, issuer bank, client name,cvc number,interestrate,expirationdate
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        super(balanceAmount, cardId, bankAccount, issuerBank); //calling parameters from parent class
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
        setClientName(clientName);
    }
     //getter method starts here
    public int getCvcNumber() {
        return this.cvcNumber; //This method returns the value of cvcnumber
    }

    public double getCreditLimit() {
        return this.creditLimit; //This method returns the value of creditlimit
    }

    public double getInterestRate() {
        return this.interestRate;  //This method returns the value of interestRate
    }

    public String getExpirationDate() {
        return this.expirationDate;  //This method returns the value of expirationDate
    }

    public int getGracePeriod() {
        return this.gracePeriod;  //This method returns the value of gracePeriod 
    }

    public boolean getIsGranted() {
        return this.isGranted;  //This method returns the value of isGranted
    }
     //setter method starts here
    public void setCreditLimit(double CreditLimit, int GracePeriod) //This method sets the value of creditlimit
    {
        if (CreditLimit <= getBalanceAmount() * 2.5) {
            this.creditLimit = CreditLimit;
            this.gracePeriod = GracePeriod;
            this.isGranted = true;
            System.out.println("Credit granted!");
        } else {
            System.out.println("Credit cannot be issued!");
        }
    }
      // method to cancel creditcard 
 
    public void cancelCreditCard() {
        
            this.cvcNumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
            
    }
    //display method
    
    public void display() {
          //calling display method from parent class
        super.display();
          if (isGranted) {
              //printing the details of the credit card.
        System.out.println("CVC number: " + cvcNumber);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Expiration date: " + expirationDate);
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Grace period: " + gracePeriod);
        } else {
            //print the statement if the credit card is not grantet.
            System.out.println("Credit has not granted yet.");
        }
    }
}