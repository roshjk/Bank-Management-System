import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList; 


public class BankGUI implements ActionListener 
{
  //Declaring and Initilizing arrayList
private ArrayList<BankCard> Card = new ArrayList<BankCard>();

private JFrame frame;
private JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;
private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19;
private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
private JComboBox<String> c1,c2,c3,c4,c5,c6;
private JTabbedPane Z1,Z2;
public BankGUI()
{
    frame = new JFrame("Bank System");
    frame.setBounds(260,30,800,600);
    Z1= new JTabbedPane();
    
    frame.add(Z1);
   
    Z1.setBounds(0,0,1234,845);
    JPanel DebitPanel= new JPanel ();
    DebitPanel.setLayout(null);
    // Title of the given GUI is assigned as Debit Card Details.
    l0 = new JLabel("Debit Card Details");
    l0.setBounds(230,15,300,42);
    l0.setFont(new Font("SANS-SERIF", Font.BOLD, 30));
           
    // Given details are labelled as per the request and text field is added to fill the appropriate results as per the request from the user.
    l1 = new JLabel("Card ID");
    l1.setBounds(34,82,48,20);
    t1 = new JTextField();
    t1.setBounds(181,76,130,32);
   
    l2 = new JLabel("Client Name");
    l2.setBounds(367,82,77,20);
    t2 = new JTextField();
    t2.setBounds(503,76,130,32);
   
    l3 = new JLabel("Bank Account");
    l3.setBounds(34,128,86,20);
    t3 = new JTextField();
    t3.setBounds(181,122,130,32);
   
    l4 = new JLabel("Balance Amount");
    l4.setBounds(367,130,102,20);
    t4 = new JTextField();
    t4.setBounds(503,124,130,32);
   
    l5 = new JLabel("Issuer Bank");
    l5.setBounds(34,174,74,20);
    t5 = new JTextField();
    t5.setBounds(181,174,130,32);
   
    l6 = new JLabel("PIN Number");
    l6.setBounds(367,180,77,20);
    t6 = new JTextField();
    t6.setBounds(503,174,130,32);
   
    l7 = new JLabel("Withdrawl Amount");
    l7.setBounds(34,298,130,20);
    t7 = new JTextField();
    t7.setBounds(181,292,130,32);
   
    l8 = new JLabel("Card ID");
    l8.setBounds(367,298,102,20);
    t8 = new JTextField();
    t8.setBounds(503,292,130,32);
    
    l22 = new JLabel("Pin Number");
    l22.setBounds(405,360,102,20);
    t19 = new JTextField();
    t19.setBounds(503,360,130,32);
   
    // Combo box is set for date of withdrawal.
    l9 = new JLabel("Date of Withdrawal");
    l9.setBounds(34,360,118,20);
   
    String[] Day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    c1 = new JComboBox<String>(Day);
    c1.setBounds(181,360,60,32);
   
    String[] Month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    c2 = new JComboBox<String>(Month);
    c2.setBounds(250,360,72,32);
   
    String[] Year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
    c3 = new JComboBox<String>(Year);
    c3.setBounds(330,360,60,32);
   
    // Buttons to Add a Debit Card, Withdraw from Debit Card, Display and Clear the details.
    b1 = new JButton("Add a Debit Card");
    b1.setBounds(130,230,430,32);
    b1.addActionListener(this);

   
    b2 = new JButton("Withdraw from Debit Card");
    b2.setBounds(30,440,200,32);
    b2.addActionListener(this);

   
    b3 = new JButton("Display");
    b3.setBounds(270,440,150,32);
    b3.addActionListener(this);

   
    b4 = new JButton("Clear");
    b4.setBounds(460,440,150,32);
    b4.addActionListener(this);

   
    // Given components from the GUI is added on the frame. 
    frame.add(l0);
    DebitPanel.add(l0);
   
    frame.add(l1);
    frame.add(t1);
    DebitPanel.add(l1);
    DebitPanel.add(t1);
    
    frame.add(l2);
    frame.add(t2);
    DebitPanel.add(l2);
    DebitPanel.add(t2);
   
    frame.add(l3);
    frame.add(t3);
    DebitPanel.add(l3);
    DebitPanel.add(t3);
    
    frame.add(l4);
    frame.add(t4);
    DebitPanel.add(l4);
    DebitPanel.add(t4);
   
    frame.add(l5);
    frame.add(t5);
    DebitPanel.add(l5);
    DebitPanel.add(t5);
    
    frame.add(l6);
    frame.add(t6);
    DebitPanel.add(l6);
    DebitPanel.add(t6);
   
    frame.add(l7);
    frame.add(t7);
    DebitPanel.add(l7);
    DebitPanel.add(t7);
   
    frame.add(l8);
    frame.add(t8);
    DebitPanel.add(l8);
    DebitPanel.add(t8);
    
    frame.add(l22);
    frame.add(t19);
    DebitPanel.add(l22);
    DebitPanel.add(t19);
   
    frame.add(l9);
    DebitPanel.add(l9);
    

   
    frame.add(b1);
    frame.add(b2);
    frame.add(b3);
    frame.add(b4);
    DebitPanel.add(b1);
    DebitPanel.add(b2);
    DebitPanel.add(b3);
    DebitPanel.add(b4);
   
    frame.add(c1);
    frame.add(c2);
    frame.add(c3);
    DebitPanel.add(c1);
    DebitPanel.add(c2);
    DebitPanel.add(c3);
    
    
    
    
    
    
    
    
    
    l10 = new JLabel("Credit Card Details");
    l10.setBounds(230,15,300,52);
    l10.setFont(new Font("SANS-SERIF", Font.BOLD, 30));
    
    
    
    JPanel CreditPanel= new JPanel ();
    CreditPanel.setLayout(null);
   
    l11 = new JLabel("Card ID");
    l11.setBounds(34,82,48,20);
    t9= new JTextField();
    t9.setBounds(181,76,130,32);
   
    l12 = new JLabel("Client Name");
    l12.setBounds(367,82,77,20);
    t10 = new JTextField();
    t10.setBounds(503,76,130,32);
   
    l13 = new JLabel("Bank Account");
    l13.setBounds(34,128,86,20);
    t11 = new JTextField();
    t11.setBounds(181,122,130,32);
   
    l14 = new JLabel("Balance Amount");
    l14.setBounds(367,130,102,20);
    t12 = new JTextField();
    t12.setBounds(503,124,130,32);
   
    l15 = new JLabel("Issuer Bank");
    l15.setBounds(34,180,77,20);
    t13 = new JTextField();
    t13.setBounds(181,174,130,32);

    l16 = new JLabel("CVC Number");
    l16.setBounds(367,180,77,20);
    t14 = new JTextField();
    t14.setBounds(503,174,130,32);
   
    l17 = new JLabel("Interest Rate");
    l17.setBounds(367,235,77,20);
    t15 = new JTextField();
    t15.setBounds(503,230,130,32);
   
    l18 = new JLabel("Expiration Date");
    l18.setBounds(34,230,118,20);
   
    String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    c4 = new JComboBox<String>(day);
    c4.setBounds(145,230,60,32);
   
    String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    c5 = new JComboBox<String>(month);
    c5.setBounds(215,230,72,32);
   
    String[] year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
    c6 = new JComboBox<String>(year);
    c6.setBounds(295,230,60,32);

    l19 = new JLabel("Card ID");
    l19.setBounds(34,340,48,20);
    t16 = new JTextField();
    t16.setBounds(181,340,130,32);
   
    l20 = new JLabel("Credit Limit");
    l20.setBounds(367,340,77,20);
    t17 = new JTextField();
    t17.setBounds(503,340,130,32);

    l21 = new JLabel("Grace Period");
    l21.setBounds(34,390,86,20);
    t18 = new JTextField();
    t18.setBounds(181,390,130,32);
   
    b5 = new JButton("Add a Credit Card");
    b5.setBounds(130,290,430,32);
    b5.addActionListener(this);

   
    b6 = new JButton("Set the Credit Limit");
    b6.setBounds(367,395,200,35);
    b6.addActionListener(this);

   
    b7 = new JButton("Cancel Credit Card");
    b7.setBounds(36,460,170,32);
    b7.addActionListener(this);

   
    b8 = new JButton("Display");
    b8.setBounds(288,460,140,32);
    b8.addActionListener(this);


    b9= new JButton("Clear");
    b9.setBounds(508,460,140,32);
    b9.addActionListener(this);

   
    frame.add(l10);
    CreditPanel.add(l10);
    
    frame.add(l11);
    frame.add(t9);
    CreditPanel.add(l11);
    CreditPanel.add(t9);
   
    frame.add(l12);
    frame.add(t10);
    CreditPanel.add(l12);
    CreditPanel.add(t10);
   
    frame.add(l13);
    frame.add(t11);
    CreditPanel.add(l13);
    CreditPanel.add(t11);
   
    frame.add(l14);
    frame.add(t12);
    CreditPanel.add(l14);
    CreditPanel.add(t12);
   
    frame.add(l15);
    frame.add(t13);
    CreditPanel.add(l15);
    CreditPanel.add(t13);
   
    frame.add(l16);
    frame.add(t14);
    CreditPanel.add(l16);
    CreditPanel.add(t14);

    frame.add(l17);
    frame.add(t15);
    CreditPanel.add(l17);
    CreditPanel.add(t15);
    
    frame.add(l18);
    frame.add(c4);
    frame.add(c5);
    frame.add(c6);
    CreditPanel.add(l18);
    CreditPanel.add(c4);
    CreditPanel.add(c5);
    CreditPanel.add(c6);
   
    frame.add(l19);
    frame.add(t16);
    CreditPanel.add(l19);
    CreditPanel.add(t16);
    
    frame.add(l20);
    frame.add(t17);
    CreditPanel.add(l20);
    CreditPanel.add(t17);
    
    frame.add(l21);
    frame.add(t18);
    CreditPanel.add(l21);
    CreditPanel.add(t18);
   
    frame.add(b5);
    frame.add(b6);
    frame.add(b7);
    frame.add(b8);
    frame.add(b9);
    CreditPanel.add(b5);
    CreditPanel.add(b6);
    CreditPanel.add(b7);
    CreditPanel.add(b8);
    CreditPanel.add(b9);
    frame.setLayout(null);
    frame.setVisible(true);
      Z1.add("Debit card",DebitPanel);
      Z1.add("Credit Card",CreditPanel);
    frame.setResizable(false);
    frame.setSize(750,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     
    //Background Color
    Color bg1 = new Color(202,231,223);
    Color bg2 = new Color(234,240,234);
    
    //Set JPanel background color to color that you choose
    CreditPanel.setBackground(bg1);
    DebitPanel.setBackground(bg1);
    b1.setBackground(bg2);
    b2.setBackground(bg2);
    b3.setBackground(bg2);
    b4.setBackground(bg2);
    b5.setBackground(bg2);
    b6.setBackground(bg2);
    b7.setBackground(bg2);
    b8.setBackground(bg2);
    b9.setBackground(bg2);
    c1.setBackground(bg2);
    c2.setBackground(bg2);
    c3.setBackground(bg2);
    c4.setBackground(bg2);
    c5.setBackground(bg2);
    c6.setBackground(bg2);
    
    //DebitPanel.setBackground(c1);

}

//Adding the Action Listeners for the JButtons
public void actionPerformed(ActionEvent e)
{
//Add to DebitCard Button
if(e.getSource() == b1)
{
    if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty()|| t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty())
    {
       
        JOptionPane.showMessageDialog(Z1, "Please fill in all fields.","Alert",JOptionPane.ERROR_MESSAGE);
    }
    else
    {
       
        try
        {
           
            int cardId = Integer.parseInt(t1.getText());
            String clientName = t2.getText();
            String bankAccount = t3.getText();
            int pinNumber = Integer.parseInt(t6.getText());
            String issuerBank = t5.getText();
            int balanceAmount = Integer.parseInt(t4.getText());
       
           
            boolean card_exists = false;
           
           
            for (BankCard id : Card)
            {
                /*if the retrived cardid from arraylist is same as the new card
                id the Card_Exists will be true and loop breaks */
                if (id.getCardId() == cardId)
                {
                    card_exists = true;
                   
                    break;
                }
            }
            if(card_exists)
            {
                JOptionPane.showMessageDialog(Z1, "Card Id already exists.", "Alert", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //Create a new DebitCard Object
                DebitCard DC = new DebitCard( balanceAmount,  cardId,  bankAccount,  issuerBank,  clientName,  pinNumber);
                 
                //Adding the above Debit Card Object to Bank Card arrayList
                Card.add(DC);
                     
                //Displaying a message to let the user know the Information was sucessfully added
                JOptionPane.showMessageDialog(Z1,"Debit Card was sucessfully Added","Alert",JOptionPane.INFORMATION_MESSAGE);
                   
                //Clearing TextFields
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
            }  
        }
   
        catch(NumberFormatException n)
        {
            JOptionPane.showMessageDialog(Z1,"Incorrect Format. Please input valid details","Alert",JOptionPane.ERROR_MESSAGE);
        }
    }  
}


else if(e.getSource() == b2)
{
    if (t19.getText().isEmpty() || t7.getText().isEmpty() || t8.getText().isEmpty())
    {
        //Displays Error message if the text field is empty
        JOptionPane.showMessageDialog(Z1, "Please fill in all fields.","Alert",JOptionPane.ERROR_MESSAGE);
    }  
    else
    {
        //Adding a try Catch block in order to prevent the data being entered in wrong format
        try
        {
            //Getting the input values from the text fields of Debit Card
            int Card_Id = Integer.parseInt(t8.getText());
            int withdrawalAmount = Integer.parseInt(t7.getText());
            int pinNumber = Integer.parseInt(t19.getText());
            //Retreving date from combobox
            String D = (String) c1.getSelectedItem();
            String M= (String) c2.getSelectedItem();
            String Y= (String) c3.getSelectedItem();
            //Combining all the combobox for date
            String dateOfWithdrawal = D+ "/" + M+ "/" + Y;
           
           
           
            //For each loop  to go through the arraylist to find the card id  
            for(BankCard id : Card)
            {
               
                if(id.getCardId() == Card_Id  && id instanceof DebitCard )  
                {
                   
                             
                   
                    //Casting the Debit_id to CreditCard class
                    DebitCard debitc = (DebitCard) id;
                   
                    if (debitc.getPinNumber() == pinNumber)
                    {
                        if(debitc.getBalanceAmount() < debitc.getWithdrawalAmount())
                        {
                            JOptionPane.showMessageDialog(Z1, "Isufficient Balance.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                           
                            //Clearing TextFields
                            t7.setText("");
                            t8.setText("");
                            t19.setText("");
                        }
                        else
                        {
                           
                            debitc.withdraw( withdrawalAmount,  dateOfWithdrawal,  pinNumber);
                       
                            JOptionPane.showMessageDialog(Z2, "Amount was successfully withdrawn from the Debit Card with Card Id " + Card_Id + ".", "Alert", JOptionPane.INFORMATION_MESSAGE);
                           
                             
                           
                            //Clearing TextFields
                            t7.setText("");
                            t8.setText("");
                            t19.setText("");
                           
                            break;
                        }
                    }
                    else
                    {
                        // Checking the pin number
                        JOptionPane.showMessageDialog(Z1, "Incorrect PIN. Please Check and enter a valid PIN." , "Alert", JOptionPane.ERROR_MESSAGE);
                    }
                }
               
                else
                {
                    JOptionPane.showMessageDialog(Z1, "The Debit Card with Card Id " + Card_Id + " does not exist. Please enter a valid Card Id." , "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
       
        catch(NumberFormatException n)
        {
            JOptionPane.showMessageDialog(Z1,"Incorrect Format. Please input valid details","Alert",JOptionPane.ERROR_MESSAGE);
        }
    }      
}

//Display Debit Card
else if (e.getSource() == b3)
{
    for(BankCard detail : Card)
    {
    if(detail instanceof DebitCard)
    {
        DebitCard dc = (DebitCard) detail;
       
        dc.display();
    }
    }
}
//Clear button
else if (e.getSource() == b4)
{      
    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t5.setText("");
    t6.setText("");
    t7.setText("");
    t8.setText("");
    t19.setText("");
}



//Add a CreditCard
else if (e.getSource() == b5)
{
    if (t9.getText().isEmpty() || t10.getText().isEmpty() || t11.getText().isEmpty()|| t12.getText().isEmpty() || t13.getText().isEmpty() || t14.getText().isEmpty() || t15.getText().isEmpty())
    {
        //Displays Error message if the text field is empty
        JOptionPane.showMessageDialog(Z1, "Please fill in all fields.","Alert",JOptionPane.ERROR_MESSAGE);
    }
    else
    {
       
        try
        {
            //Getting the input values from the text fields of Debit Card
            int Card_Id = Integer.parseInt(t9.getText());
            String Client_Name = t10.getText();
            String Bank_Account = t11.getText();
            int Balance_Amount = Integer.parseInt(t12.getText());
            String Issuer_Bank = t13.getText();
            int CVC_Number = Integer.parseInt(t14.getText());
            double Interest_Rate = Double.parseDouble(t15.getText());
            //Retreving date from combobox
            String Day = (String) c4.getSelectedItem();
            String Month = (String) c5.getSelectedItem();
            String Year = (String) c6.getSelectedItem();
            //Combining all the combobox for date
           
           
            String Expiration_Date = Day + "/" + Month + "/" + Year;
            //Condition to Check weather the card with the id exists or not
           
            boolean Card_Exists = false;
           
           
            for (BankCard c_id : Card)
            {
               
                if (c_id.getCardId() == Card_Id)
                {
                    Card_Exists = true;
                    break;
                }
            }
            if(Card_Exists)
            {
                JOptionPane.showMessageDialog(Z2, "Card with the same Id already exists.", "Alert", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
           
               
                CreditCard CC = new  CreditCard(Card_Id, Client_Name, Issuer_Bank, Bank_Account, Balance_Amount, CVC_Number, Interest_Rate, Expiration_Date);
               
                //Adding the above Debit Card Object to Bank Card arrayList
                Card.add(CC);
                 
               
                JOptionPane.showMessageDialog(Z2,"Credit Card was Added","Alert",JOptionPane.INFORMATION_MESSAGE);
               
                //Clearing TextFields
                t9.setText("");
                t10.setText("");
                t11.setText("");
                t12.setText("");
                t13.setText("");
                t14.setText("");
                t15.setText("");
               
            }
        }
        catch(NumberFormatException n)
        {
            n.printStackTrace();
            JOptionPane.showMessageDialog(Z2,"Incorrect Format.","Alert",JOptionPane.ERROR_MESSAGE);
        }
    }  
}

else if (e.getSource() == b6)
{
    if (t17.getText().isEmpty() || t18.getText().isEmpty() || t16.getText().isEmpty())
    {
        //Displays Error message if the text field is empty
        JOptionPane.showMessageDialog(Z2, "Please fill in all fields.","Alert",JOptionPane.ERROR_MESSAGE);
    }
    else
    {
        try
        {
            // Get the input values from the text fields
            int Card_Id = Integer.parseInt(t16.getText());
            double new_Credit_Limit = Double.parseDouble(t17.getText());
            int new_Grace_Period = Integer.parseInt(t18.getText());  
           

           
            //For each loop  to go through the arraylist to find the card id  
            boolean creditCardExists = false;

            for (BankCard Credit_id : Card) {
                if (Credit_id.getCardId() == Card_Id && Credit_id instanceof CreditCard) {
                    CreditCard Creditcard = (CreditCard) Credit_id;
                    Creditcard.setCreditLimit(new_Credit_Limit, new_Grace_Period);
                   
                    JOptionPane.showMessageDialog(Z2, "Credit Limit successfully set " ,"Alert", JOptionPane.INFORMATION_MESSAGE);
                   
                    creditCardExists = true;
                    break;
                }
            }

            if (!creditCardExists) {
                JOptionPane.showMessageDialog(Z2, "The Credit Card with Card Id " + Card_Id + " does not exist. Please enter a valid Card Id.", "Alert", JOptionPane.ERROR_MESSAGE);
            }

           
            //Clearing TextFields
            t17.setText("");
            t18.setText("");
            t16.setText("");
        }
        catch(NumberFormatException n)
        {
            JOptionPane.showMessageDialog(Z2,"Incorrect Format","Alert",JOptionPane.ERROR_MESSAGE);
        }
    }
}
//Remove Button
else if (e.getSource() == b7)
{
    if (t16.getText().isEmpty())
    {
        //Displays Error message if the text field is empty
        JOptionPane.showMessageDialog(Z2, "Please enter the Credit Card before cancelling .","Alert",JOptionPane.ERROR_MESSAGE);
    }
    else
    {
        try
        {
            // Get the input values from the text fields
            int Card_Id = Integer.parseInt(t16.getText());

            BankCard creditCardToRemove = null;
            for (BankCard cancell_CreditCard : Card) {
                if (cancell_CreditCard.getCardId() == Card_Id && cancell_CreditCard instanceof CreditCard) {
                    creditCardToRemove = cancell_CreditCard;
                    break;
                }
            }

            if (creditCardToRemove != null) {
                Card.remove(creditCardToRemove);
                JOptionPane.showMessageDialog(Z2, "Credit Card with Card ID " + creditCardToRemove.getCardId() + " cancelled.", "Alert", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(Z2, "The Credit Card with Card Id " + t16.getText() + " does not exist or is not a Credit Card.", "Alert", JOptionPane.ERROR_MESSAGE);
            }

        }
        catch(Exception n){
            System.out.println(n);
        }

    }
}
//Display
else if (e.getSource() == b8)
{
    for(BankCard detail : Card)
    {
        if(detail instanceof CreditCard)
        {
            CreditCard creditCard = (CreditCard) detail;
           
            creditCard.display();
        }
    }
}

else
{
    if(e.getSource() == b9){
     t9.setText("");
     t10.setText("");
     t11.setText("");
     t12.setText("");
     t13.setText("");
     t14.setText("");
     t15.setText("");
     t16.setText("");
     t17.setText("");
     t18.setText("");
    }
}  
}

public static void main(String[]args)
{
new BankGUI();
}
}