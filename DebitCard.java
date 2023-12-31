public class DebitCard extends BankCard  //indicates that DebitCard class is inherited from BankCard class */
 {
     //attributes of debitcard
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
   // parameters declaration for constructor
   // constructor to initialize balance amount, card id, bank account, issuer bank, client name and pin number

    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber) {
        super(balanceAmount, cardId, bankAccount, issuerBank);  //calling parameters from parent class
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
        setClientName(clientName);
    }
   /**setter 
   //setting the value of attributes**/
    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount; //This method accepts parameter and set the value for withdrawalAmount. 
    }
    //getter
    public int getPinNumber() {
        return this.pinNumber;  //This method returns the value of pinNumber.
    }

    public int getWithdrawalAmount() {
        return this.withdrawalAmount; //This method returns the value of withdrawalAmount.
    }

    public String getDateOfWithdrawal() {
        return this.dateOfWithdrawal;  //This method returns the value of dateOfWithdrawn.
    }

    public boolean getHasWithdrawn() {
        return this.hasWithdrawn; //This method returns the value of hasWithdrawn.
    }
 // method to withdraw money from the account
 
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber) {
        if (pinNumber == this.pinNumber) {
            if (withdrawalAmount <= getBalanceAmount()) {
                setWithdrawalAmount(withdrawalAmount);
                setBalanceAmount(getBalanceAmount() -  withdrawalAmount);
                this.dateOfWithdrawal = dateOfWithdrawal;
                hasWithdrawn = true;
                System.out.println("Transaction Successful!");
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Invalid Pin Number!");
        }
    }
      //overriding the method
    
    //display method
    
    public void display()
    { 
        //calling display method from parent class
        super.display();
        System.out.println("Pin number: " + pinNumber);
        if (hasWithdrawn) {
            //printing the details is the amount has withdrawn
            System.out.println("Last Withdrawal amount: " + withdrawalAmount);
            System.out.println("Date of the last withdrawal: " + dateOfWithdrawal);
        }
        else {
            //if the amount has not withdrawn print the statement
        System.out.println("No transactions have been made yet.");
       }
    }
}
    
