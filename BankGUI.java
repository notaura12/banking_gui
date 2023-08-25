import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

//Creating a new class
public class BankGUI implements ActionListener
{
    //creating objects for the frame
    //aading Components for creating a GUI
    private JFrame f1,f2,f3,f4,f5;                                                                                                          //Adding Jframe
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,ll3,ll4,ll5,ll6,ll7,ll8,ll9,r1,r2,r3,r4,r5,r6,r7,r8,j1,j2,j3,j4;                                 //adding JLabel
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,bb6,bb7,bb8,bb9,bb10,bbb1,bbb2,bbb3;                                                     //adding JButton
    private JPanel p1,p2,p3,p4,p5;                                                                                                          //adding JPanel
    private JTextField t1,t2,t3,t4,t5,t6,tt1,tt2,tt3,tt4,tt5,tt6,tt7,rr3,rr4,rr5,rr6,rr7,o1;                                 //adding JTextField
    private ImageIcon i1,i2,ii1,ii2;                                                                                                        //adding imageIcon
    private JComboBox d1,d2,d3,y4,y5,y6;                                                                                                    //adding JComboBox
    
    
    //creating arraylist
    private ArrayList<BankCard> infoBankCard = new ArrayList<BankCard>();                                                                    //adding ArrayList
    public BankGUI()
    {
        //creating JFrame
        f1 = new JFrame("Course work 2");
        f2 = new JFrame("Debit Card");
        f3 = new JFrame("Credit Card");
        f4 = new JFrame("WithDraw");
        f5 = new JFrame("Set Credit Limit");
        
        //adding JPanel for Frame
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        
        
        //adding JTextField for JFrame
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        tt1 = new JTextField();
        tt2 = new JTextField();
        tt3 = new JTextField();
        tt4 = new JTextField();
        tt5 = new JTextField();
        tt6 = new JTextField();
        tt7 = new JTextField();
        rr3 = new JTextField();
        rr4 = new JTextField();
        rr5 = new JTextField();
        rr6 = new JTextField();
        rr7 = new JTextField();
        o1 = new JTextField();
        
        //adding JLabel for JPanel
        l1 = new JLabel("Please Choose an option");
        l2 = new JLabel("Last updated March 4th");
        l3 = new JLabel("Debit Card");
        l4 = new JLabel("Credit ID");
        l5 = new JLabel("Client Name");
        l6 = new JLabel("Bank Account");
        l7 = new JLabel("Pin Number");
        l8 = new JLabel("Issuer Bank");
        l9 = new JLabel("Balance Amount");
        ll3 = new JLabel("Credit Card");
        ll4 = new JLabel("Card ID");
        ll5 = new JLabel("Client Name");
        ll6 = new JLabel("Bank Account");
        ll7 = new JLabel("Expiration Date");
        ll8 = new JLabel("Issuer Bank");
        ll9 = new JLabel("Balance Amount");
        r1 = new JLabel("Intrest Rate");
        r2 = new JLabel("CVC number");
        r3 = new JLabel("Withdraw");
        r4 = new JLabel("Card ID");
        r5 = new JLabel("Date Of Withdrawal");
        r6 = new JLabel("Withdrawal Amount");
        r7 = new JLabel("Pin Number");
        r8 = new JLabel("Withdraw");
        j1 = new JLabel("Set Credit Limit");
        j2 = new JLabel("Card ID");
        j3 = new JLabel("Grace Period");
        j4 = new JLabel("Credit Limit");
        
        
        //adding JButton for JPanel
        b1 = new JButton("Debit Card");
        b2 = new JButton("Credit Card");
        b3 = new JButton("©️  Community");
        b4 = new JButton("📞 Support");
        b5 = new JButton("📧  Mail");
        b6 = new JButton("🔙");
        b7 = new JButton("Withdraw");
        b8 = new JButton("Add Debit Card");
        b9 = new JButton("Display");
        b10 = new JButton("Clear");
        bb6 = new JButton("🔙");
        bb7 = new JButton("Set Credit Limit");
        bb8 = new JButton("Add Credit Card");
        bb9 = new JButton("Display");
        bb10 = new JButton("Clear");
        bbb1 = new JButton("Withdraw");
        bbb2 = new JButton("Confirm Limit");
        bbb3 = new JButton("Cancle CreditCard");
        
        
        //Creating ArrayList fot for JComboBox
        String d[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String m[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String y[] = {"2023","2024","2025","2026","2027","2028"};
        
        
        //Adding ArrayList to JComboBox
        d1 = new JComboBox(d);
        d2 = new JComboBox(m);
        d3 = new JComboBox(y);
        y4 = new JComboBox(d);
        y5 = new JComboBox(m);
        y6 = new JComboBox(y);
            
        
        //Adding every Object to JPanel and every Panel to Frame
        
        //adding for Frame 1
        f1.add(p1);
        p1.add(l1);
        p1.add(l2);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        
        
        //adding for Frame 2
        
        f2.add(p2);
        p2.add(l3);
        p2.add(l4);
        p2.add(l5);
        p2.add(l6);
        p2.add(l7);
        p2.add(l8);
        p2.add(l9);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);
        p2.add(t4);
        p2.add(t5);
        p2.add(t6);
        
        
        //adding for Frame 3
        f3.add(p3);
        p3.add(ll3);
        p3.add(ll4);
        p3.add(ll5);
        p3.add(ll6);
        p3.add(ll7);
        p3.add(ll8);
        p3.add(ll9);
        p3.add(r1);
        p3.add(r2);
        p3.add(tt1);
        p3.add(tt2);
        p3.add(tt3);
        p3.add(tt4);
        p3.add(tt5);
        p3.add(tt6);
        p3.add(tt7);
        p3.add(d1);
        p3.add(d2);
        p3.add(d3);
        p3.add(bb7);
        p3.add(bb8);
        p3.add(bbb3);
        p3.add(bb6);
        p3.add(bb9);
        p3.add(bb10);
        
        
        //adding for Frame 4
        f4.add(p4);
        p4.add(r3);
        p4.add(r4);
        p4.add(r5);
        p4.add(r6);
        p4.add(r7);
        p4.add(rr3);
        p4.add(rr4);
        p4.add(rr5);
        p4.add(y4);
        p4.add(y5);
        p4.add(y6);
        p4.add(bbb1);
        
        //adding for Frame 5
        f5.add(p5);
        p5.add(j1);
        p5.add(j2);
        p5.add(j3);
        p5.add(j4);
        p5.add(rr6);
        p5.add(rr7);
        p5.add(o1);
        p5.add(bbb2);
        
        //adding Fonts to JLabel texts
        l1.setFont(new Font("Arial", Font.PLAIN,20));
        l2.setFont(new Font("Arial", Font.PLAIN,12));
        l3.setFont(new Font("Arial", Font.PLAIN,30));
        l4.setFont(new Font("Arial", Font.PLAIN,18));
        l5.setFont(new Font("Arial", Font.PLAIN,15));
        l6.setFont(new Font("Arial", Font.PLAIN,15));
        l7.setFont(new Font("Arial", Font.PLAIN,16));
        l8.setFont(new Font("Arial", Font.PLAIN,15));
        l9.setFont(new Font("Arial", Font.PLAIN,15));
        ll3.setFont(new Font("Arial", Font.PLAIN,25));
        ll4.setFont(new Font("Arial", Font.PLAIN,18));
        ll5.setFont(new Font("Arial", Font.PLAIN,15));
        ll6.setFont(new Font("Arial", Font.PLAIN,15));
        ll8.setFont(new Font("Arial", Font.PLAIN,15));
        ll9.setFont(new Font("Arial", Font.PLAIN,15));
        r1.setFont(new Font("Arial", Font.PLAIN,15));
        r2.setFont(new Font("Arial", Font.PLAIN,15));
        ll7.setFont(new Font("Arial", Font.PLAIN,15));
        r3.setFont(new Font("Arial", Font.PLAIN,30));
        r4.setFont(new Font("Arial", Font.PLAIN,15));
        r5.setFont(new Font("Arial", Font.PLAIN,15));
        r6.setFont(new Font("Arial", Font.PLAIN,15));
        r7.setFont(new Font("Arial", Font.PLAIN,15));
        j1.setFont(new Font("Arial", Font.PLAIN,20));
        j2.setFont(new Font("Arial", Font.PLAIN,15));
        j3.setFont(new Font("Arial", Font.PLAIN,15));
        j4.setFont(new Font("Arial", Font.PLAIN,15));
        
        
        
        //adding ActionListiner to each JButtons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        bb6.addActionListener(this);
        bb7.addActionListener(this);
        bb8.addActionListener(this);
        bb9.addActionListener(this);
        bb10.addActionListener(this);
        bbb1.addActionListener(this);
        bbb2.addActionListener(this);
        bbb3.addActionListener(this);
        
        //Creating Color
        
        Color c1 = new Color(255,255,204);
        Color c2 = new Color(0, 255, 255);
        Color c3 = new Color(255, 0, 0);
        Color c4 = new Color(0,255,0);
        Color c5 = new Color(204,255,255);
        Color c6 = new Color(255,255,0);
        
        //setting Color 
        p1.setBackground(c1);
        b6.setBackground(c5);
        b4.setBackground(c2);
        b3.setBackground(c2);
        b5.setBackground(c2);
        b8.setBackground(c4);
        bb6.setBackground(c5);
        b7.setBackground(c2);
        bbb3.setBackground(c3);
        bb8.setBackground(c4);
        r3.setForeground(c2);
        r4.setForeground(c2);
        r5.setForeground(c2);
        r6.setForeground(c2);
        r7.setForeground(c2);
        ll3.setForeground(c2);
        ll4.setForeground(c2);
        ll5.setForeground(c2);
        ll6.setForeground(c2);
        ll7.setForeground(c2);
        ll8.setForeground(c2);
        ll9.setForeground(c2);
        r1.setForeground(c6);
        r2.setForeground(c6);
        j1.setForeground(c6);
        j2.setForeground(c6);
        j3.setForeground(c6);
        j4.setForeground(c6);
        
        //setting BOunds For JFrame Components for Frame 1
        
        //setting Bounds For JFrames
        f1.setBounds(600,300,500,300);
        f2.setBounds(600,300,700,400);
        f3.setBounds(600,300,700,400);
        f4.setBounds(700,350,500,300);
        f5.setBounds(650,350,500,300);
        
        
        //setting Bounds for JPanel
    
        p1.setBounds(0,0,500,300);
        p2.setBounds(0,0,700,400);
        p3.setBounds(0,0,700,400);
        p4.setBounds(0,0,500,200);
        p5.setBounds(0,0,500,200);
        
        
        //setting Bounds for JLabel
        
        l1.setBounds(130,20,300,30);
        l2.setBounds(170,150,150,30);
        l3.setBounds(250,20,150,30);
        l4.setBounds(45,100,100,20);
        l5.setBounds(50,160,100,20);
        l6.setBounds(50,200,100,20);
        l7.setBounds(100,300,100,20);
        l8.setBounds(280,160,100,20);
        l9.setBounds(280,200,130,20);
        ll3.setBounds(250,20,150,30);
        ll4.setBounds(45,100,130,20);
        ll5.setBounds(40,160,130,20);
        ll6.setBounds(40,200,130,20);
        r2.setBounds(40,240,130,20);
        ll7.setBounds(100,300,130,20);
        ll8.setBounds(255,160,130,20);
        ll9.setBounds(255,200,130,20);
        r1.setBounds(255,240,130,20);
        r3.setBounds(170,20,150,30);
        r4.setBounds(60,90,150,30);
        r5.setBounds(50,165,150,30);
        r6.setBounds(50,130,150,30);
        r7.setBounds(100,220,150,30); 
        j1.setBounds(180,20,150,30);
        j2.setBounds(60,100,150,30); 
        j3.setBounds(50,160,150,30); 
        j4.setBounds(280,160,150,30); 
        
        //setting Bounds for JButton
        
        b1.setBounds(185,80,100,30);
        b2.setBounds(185,120,100,30);
        b3.setBounds(30,200,140,40);
        b4.setBounds(180,200,140,40);
        b5.setBounds(330,200,140,40);
        b6.setBounds(40,20,60,30);
        b7.setBounds(530,70,130,30);
        b8.setBounds(530,120,130,30);
        b9.setBounds(530,170,130,30);
        b10.setBounds(530,220,130,30);
        bb6.setBounds(50,20,60,30);
        bb7.setBounds(500,70,150,30);
        bb8.setBounds(500,120,150,30);
        bbb3.setBounds(500,170,150,30);
        bb9.setBounds(500,220,150,30);
        bb10.setBounds(500,270,150,30);
        bbb1.setBounds(350,220,100,30);
        bbb2.setBounds(330,220,120,30);
        
        
        //setting Bounds for JComboBox
        
        d1.setBounds(220,298,60,25);
        d2.setBounds(280,298,60,25);
        d3.setBounds(340,298,60,25);
        y4.setBounds(200,170,60,25);
        y5.setBounds(260,170,60,25);
        y6.setBounds(320,170,60,25);
        
        //setting Bounds for JTextField
        
        t1.setBounds(155,90,120,35);
        t2.setBounds(160,155,100,30);
        t3.setBounds(160,193,100,30);
        t4.setBounds(400,155,100,30);
        t5.setBounds(400,193,100,30);
        t6.setBounds(195,295,110,32);
        tt1.setBounds(130,95,110,35);
        tt2.setBounds(140,155,90,30);
        tt3.setBounds(140,193,90,30);
        tt4.setBounds(140,235,90,30);
        tt5.setBounds(370,155,90,30);
        tt6.setBounds(370,193,90,30);
        tt7.setBounds(370,240,90,30);
        rr3.setBounds(160,90,80,32);
        rr4.setBounds(190,130,100,28);
        rr5.setBounds(185,220,70,28);
        rr6.setBounds(130,100,70,32);
        rr7.setBounds(150,160,70,28);
        o1.setBounds(370,160,70,28);
        
        //adding image as background
        i1 = new ImageIcon("blue.jpg");
        i1.setImage(i1.getImage().getScaledInstance(700,400,Image.SCALE_DEFAULT));
        JLabel l12 = new JLabel(i1);
        p2.add(l12);
        l12.setBounds(0,0,700,400);
        
        i2 = new ImageIcon("pup.jpg");
        i2.setImage(i2.getImage().getScaledInstance(700,400,Image.SCALE_DEFAULT));
        JLabel l13 = new JLabel(i2);
        p3.add(l13);
        l13.setBounds(0,0,700,400);
        
        ii1 = new ImageIcon("hm.jpg");
        ii1.setImage(ii1.getImage().getScaledInstance(700,400,Image.SCALE_DEFAULT));
        JLabel l15 = new JLabel(ii1);
        p4.add(l15);
        l15.setBounds(-100,-100,700,400);
        
        ii2 = new ImageIcon("gr.jpg");
        ii2.setImage(ii2.getImage().getScaledInstance(700,400,Image.SCALE_DEFAULT));
        JLabel l14 = new JLabel(ii2);
        p5.add(l14);
        l14.setBounds(-100,-100,700,400);
            
        //setting Jpanel Visible settings
        p1.setVisible(true);
        p2.setVisible(true);
        p3.setVisible(true);
        p4.setVisible(true);
        p5.setVisible(true);
        
        
        //setting Jpanel Layout
        p1.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);
        p4.setLayout(null);
        p5.setLayout(null);
        
        
        //Closing program from BackGround
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //setting JFrame visibility
        f1.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //adding action to Buttons
        if(e.getSource() == b1)
        {
            f1.setVisible(false);
            f2.setVisible(true);
        }
        else if(e.getSource() == b2 )
        {
            f1.setVisible(false);
            f3.setVisible(true);
        }
        else if(e.getSource() == b6 )
        {
            f2.setVisible(false);
            f1.setVisible(true);
        }
        else if(e.getSource() == bb6 )
        {
            f3.setVisible(false);
            f1.setVisible(true);
        }
        else if(e.getSource() == bb7 )
        {
            f5.setVisible(true);
        }
        else if(e.getSource() == b7 )
        {
            f4.setVisible(true);
        }
        //Displaying Debit Card
        else if (e.getSource() == b9)
        {
            for(BankCard info : infoBankCard) 
            {
                if(info instanceof DebitCard)
                {
                    //opeing arraylist
                    DebitCard Debitcard = (DebitCard) info;
                    //displaying arraylist
                    Debitcard.display();
                }
            }
        }
        //Displaying Credit Card
        else if (e.getSource() == bb9)
        {
            for(BankCard info : infoBankCard) 
            {
                if(info instanceof CreditCard)
                {
                    //calling arrays
                    CreditCard creditCard = (CreditCard) info;
                    //displaying CreditCard
                    creditCard.display();
                }
            }
        }
        //Clearing Debit Card
        else if (e.getSource() == b10)
        {      
             t1.setText("");
             t2.setText("");
             t3.setText("");
             t4.setText("");
             t5.setText("");
             t6.setText(""); 
        }
        //Clearing Credit Card
        else if (e.getSource() == bb10)
        {      
             tt1.setText("");
             tt2.setText("");
             tt3.setText("");
             tt4.setText("");
             tt5.setText("");
             tt6.setText(""); 
        }
        //adding Credit Card
        else if (e.getSource() == bb8)
        {
            if (tt1 .getText().isEmpty() || tt2.getText().isEmpty() || tt3.getText().isEmpty()|| tt4.getText().isEmpty() || tt5.getText().isEmpty() || tt6.getText().isEmpty() || tt7.getText().isEmpty())
            {
                //adding a error message if textfield is empty
                JOptionPane.showMessageDialog(f3, "Please fill all the boxes.","Alert",JOptionPane.ERROR_MESSAGE);
            } 
            else
            {
                //Adding a try Catch block in order to prevent the data being entered in wrong format
                try
                {
                    //Retriving input values
                    int CardId = Integer.parseInt(tt1.getText());
                    String ClientName = tt2.getText();
                    String BankAccount = tt3.getText();
                    String IssuerBank = tt5.getText();
                    int BalanceAmount = Integer.parseInt(tt6.getText());
                    int CVC_number = Integer.parseInt(tt4.getText());
                    double interest_rate = Double.parseDouble(tt7.getText());
                    
                    
                    //retriving all data for combo box
                    String Day = (String) d1.getSelectedItem();
                    String Month = (String) d2.getSelectedItem();
                    String Year = (String) d3.getSelectedItem();
                    
                    //combobox output setup
                    String expiration_date = Day + "/" + Month + "/" + Year;
                    
                    //conditon to check if cardId exist or not
                    boolean CCardExists = false;
                    
                    //saves in infobankcard
                    for (BankCard Id : infoBankCard) 
                    {
                        if (Id.getCardId() == CardId) 
                        {
                            CCardExists = true;
                            break;
                        }
                    }
                    if(CCardExists)
                    {
                        JOptionPane.showMessageDialog(f3, "Card with the same Id already exists.", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                    
                        //CreditCard Object
                        CreditCard CCard = new  CreditCard(CardId,ClientName,IssuerBank,BankAccount,BalanceAmount,CVC_number,interest_rate,expiration_date);
                        
        
                        infoBankCard.add(CCard);
                         
                        //to show data was added
                        JOptionPane.showMessageDialog(f3,"Credit Card was sucessfully Added","Alert",JOptionPane.INFORMATION_MESSAGE);
                        
                        //Clearing TextFields
                        tt1.setText("");
                        tt2.setText("");
                        tt3.setText("");
                        tt4.setText("");
                        tt5.setText("");
                        tt6.setText("");
                        tt7.setText("");
                        
                    }
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(f3,"Incorrect Format. Please input valid details","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }  
        }
        //adding Debit Card
        if(e.getSource() == b8)
        {
            if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty()|| t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty())
            {
                //adding a error message if textfield is empty
                JOptionPane.showMessageDialog(f2, "Please fill in all fields.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //Adding a try Catch block in order to prevent the data being entered in wrong format
                try
                {
                    //Getting the input values from the text fields of Debit Card
                    int CardId = Integer.parseInt(t1.getText());
                    String ClientName = t2.getText();
                    String BankAccount = t3.getText();
                    int PinNumber = Integer.parseInt(t5.getText());
                    String IssuerBank = t4.getText();
                    int BalanceAmount = Integer.parseInt(t6.getText());
                
                    
                    //checking if credit card exist
                    boolean DCardExists = false;
                    
                    /*c_id is a variable which the card_id is retrives 
                       card_id from the array list bankcard*/
                    for (BankCard id : infoBankCard) 
                    {
                        if (id.getCardId() == CardId) 
                        {
                            DCardExists = true;
                            break;
                        }
                    }
                    if(DCardExists)
                    {
                        JOptionPane.showMessageDialog(f2, "Card with the same Id already exists.", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        DebitCard debitcard = new DebitCard(CardId, ClientName, BankAccount, PinNumber, BalanceAmount, IssuerBank);
                            
                        //Adding  Debit Card Object to Bank Card arrayList
                        infoBankCard.add(debitcard);
                             
                        //disppay to show data was saved
                        JOptionPane.showMessageDialog(f2,"Debit Card was sucessfully Added","Alert",JOptionPane.INFORMATION_MESSAGE);
            
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
                    //error message if wrong variable is entered
                    JOptionPane.showMessageDialog(f2,"Incorrect Format. Please input valid details","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }   
        }
        //Withdraw method
         else if(e.getSource() == bbb1)
        {
            if (rr3.getText().isEmpty() || rr4.getText().isEmpty() || rr5.getText().isEmpty())
            {
                //Displays Error message if the text field is empty 
                JOptionPane.showMessageDialog(f4, "Please fill in all the empty fields.","Alert",JOptionPane.ERROR_MESSAGE);
            }  

            else
            {
                //Adding a try Catch block in order to prevent the data being entered in the wrong format
                try
                {
                    //Getting the input values from the JTextFields of the Debit Card
                    int CardId = Integer.parseInt(rr3.getText());
                    int WithdrawalAmount = Integer.parseInt(rr4.getText());
                    int PinNumber = Integer.parseInt(rr5.getText());
                    
                    rr3.setText("");
                    rr4.setText("");
                    rr5.setText("");

                    //Retreving date from the JComboBox
                    String Day = (String) y4.getSelectedItem();
                    String Month = (String) y5.getSelectedItem();
                    String Year = (String) y6.getSelectedItem();

                    //Combining all the JComboBox for date
                    String DateOfWithdrawal = Day + "/" + Month + "/" + Year;
                    boolean DebitC = false;
                    boolean DebitCardID = false;
                    for(BankCard DebitID : infoBankCard) 
                    {
                        //Downcasting to get the withdraw Method and checking if the card id mathces or not
                        if(DebitID instanceof DebitCard)
                        {
                            //If the card exists the DebitC_ID will be true 
                            DebitCard D_C = (DebitCard) DebitID;
                            DebitC = true;
                            
                            if(D_C.getCardId() == CardId)
                            {
                                DebitCardID = true;
                                if(D_C.getPinNumber() == PinNumber)
                                {
                                    if(D_C.getBalanceAmount() >= WithdrawalAmount)
                                    {
                                        D_C.Withdraw(WithdrawalAmount, DateOfWithdrawal, PinNumber);
                                    
                                        JOptionPane.showMessageDialog(f4, "Amount withdrawan successfully with Card ID : " + CardId);
                                        rr3.setText("");
                                        rr4.setText("");
                                        rr5.setText("");
                                        break;
                                    }
                                
                                    else
                                    {
                                        JOptionPane.showMessageDialog(f4,"Insufficient Balance");
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(f4,"Inter a valid pin number.");
                                }
                            }
                        }    
                    }        
                    if(DebitC == false)
                    {
                        JOptionPane.showMessageDialog(f4,"There is no debit Card, please add one first.");
                    }
                    if(DebitC && DebitCardID == false)
                    {
                        JOptionPane.showMessageDialog(f4,"Card ID does not match, please enter a valid ID.");
                    }
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(f4, " Please fill the details correctly");
                }
            }
        }
        //setting credit card limit
        else if (e.getSource() == bbb2)
        {
            if (rr6.getText().isEmpty() || rr7.getText().isEmpty() || o1.getText().isEmpty())
            {
                //Displays Error message if the text field is empty 
                JOptionPane.showMessageDialog(f5, "Please fill in all fields.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    // Get the input values from the text fields
                    int CardId = Integer.parseInt(rr6.getText());
                    double credit_limit = Double.parseDouble(o1.getText()); 
                    int grace_period = Integer.parseInt(rr7.getText());  
                    
                    
                    boolean Creditid = false;

                    for(BankCard Cid : infoBankCard) 
                    {
                        //checking if card id matches
                        if(Cid.getCardId() == CardId && Cid instanceof CreditCard )  
                        {
                            //If the card exists the 
                            Creditid = true;
                            
                            //Casting the Credit_id to CreditCard class
                            CreditCard ditcard = (CreditCard) Cid;
                            //Calling the setCredit_Limit from Credit Card class
                            ditcard.setcredit_limit(credit_limit,grace_period);
                            
                            JOptionPane.showMessageDialog(f5, "Credit Limit successfully set for Credit Card with card id " + CardId + ".", "Alert", JOptionPane.INFORMATION_MESSAGE);
                            
                            break;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(f3, "The Credit Card with Card Id " + CardId + " dose not exist. Please enter a valid Card Id." , "Alert", JOptionPane.ERROR_MESSAGE); 
                        }
                    }
                    
                    //Clearing TextFields
                    rr6.setText("");
                    rr7.setText("");
                    o1.setText("");
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(f2,"Incorrect Format. Please input valid details","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //cancel Credit Card
        else if (e.getSource() == bbb3)
        {
            for(BankCard cancel : infoBankCard) 
            {
                if(cancel instanceof CreditCard)
                {               
                    infoBankCard.remove(cancel);
                    
                    JOptionPane.showMessageDialog(f3,"Credit Card is now Cancalled","Alert",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        
        else
        {
             tt1.setText("");
             tt2.setText("");
             tt3.setText("");
             tt4.setText("");
             tt5.setText("");
             tt6.setText("");
             tt7.setText("");
             rr6.setText("");
             rr7.setText("");
             o1.setText("");
        }   
    }
    public static void main(String[]args)
    {
        new BankGUI();
    }
}
