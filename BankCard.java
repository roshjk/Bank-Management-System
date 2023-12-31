public class BankCard
 {
     //attributes of bankcard
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
     //parameters declaration for constructor
    public BankCard(int balanceAmount, int cardId, String bankAccount, String issuerBank) {
        /*attributes=parameters*/
        this.cardId = cardId;
        this.clientName = "";
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
    }
     //setter
     //setting the value of attributes
    public void setClientName(String clientName) {
        this.clientName = clientName;  //this method accepts the parameter and sets the value for clientName.
    }

    public void setBalanceAmount(int BalanceAmount) {
        this.balanceAmount = BalanceAmount; //this method accepts the parameter and sets the value for BalanceAmount.
    }
    //getter
    public int getCardId() {
        return this.cardId;  //This method returns the value of  CardId. 
    }

    public String getClientName() {
        return this.clientName;  //This method returns the value of  ClientName. 
    }
    public String getIssuerBank() {
        return this.issuerBank;  //This method returns the value of issuerBank. 
    }

    public String getBankAccount() {
        return this.bankAccount;  //This method returns the value of bankAccount. 
    }

    public int getBalanceAmount() {
        return this.balanceAmount;  //This method returns the value of  balanceAmount. 
    }
     //display method
    public void display() {
        if (clientName.equals("")) {
            System.out.println("Client name is not assigned.");
            //if clientname is empty then this statement will be printed.
        } else {
             //printing the details
            System.out.println("Card ID: " + cardId);
            System.out.println("Client name: " + clientName);
            System.out.println("Issuer bank: " + issuerBank);
            System.out.println("Bank account: " + bankAccount);
            System.out.println("Balance amount: " + balanceAmount);
        }
    }
}
