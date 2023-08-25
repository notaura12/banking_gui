public class CreditCard extends BankCard                              //this denotes that debitcard is inhertance of bankcard as a clid class of it
{                             
    private int CVC_number;                                            //attributes as a private integer type CVC_number
    private double credit_limit;                                       //attributes as a private double type credit_limit which will take two numbers after decimal
    private double interest_rate;                                      //attributes as a private double type interest_rate which will take two numbers after decimal
    private String expiration_date;                                    //attributes as a private String type expiration_date
    private int grace_period;                                          //attributes as a private integer type grace_period
    private boolean isGranted;                                         //attributes as a private boolean type isGranted which accepts only true or false
    
     /*constructor is created which is used to create instance of the class
     * we create constructor on class name
     * it has no return type
     */
    public CreditCard(int CardId, String ClientName, String IssuerBank, String BankAccount, int BalanceAmount, int CVC_number, double interest_rate, String expiration_date)
    {
    /*using this keyword given by java programming language 
     * it is used to eliminate the confusion between class attributes and paramaters with the same name
     */
        super(CardId, IssuerBank, BankAccount, BalanceAmount);          /*super key word is used which is provided by JDE which
                                                                        *elimite confusion with same name with methods in parent class and child classes
                                                                        *call parentclass methods,and access its constructor
                                                                        */
        this.CVC_number = CVC_number;
        this.interest_rate = interest_rate;
        this.expiration_date = expiration_date;
        setClientName(ClientName);
        this.isGranted = false;
    }
    /*using one of the pillar of OOP Encapsulation
     * its is used as grouping of information
     * it is done in the form of secure field accessible by onlt the member of the same class
     * it uses getter and setter methods which returns value and spdates its values
     * it protects your data
     */
    
    //getter method is used for these instance variables which return its value 
    public int getCVC_number()               /*getter method also known as accessor method is used in this insatance variable which return getPinNumber value to
                                             *getPinNumber with this keyword as a integer type
                                             */
        {
            return this.CVC_number;
        }

    public double getcredit_limit()          /*getter method also known as accessor method is used in this insatance variable which return getcredit_limit value to
                                             *getPinNumber with this keyword as a double type
                                             */
        {
            return this.credit_limit;
        }

    public double getinterest_rate()          /*getter method also known as accessor method is used in this insatance variable which return getinterest_rate value to
                                             *getPinNumber with this keyword as a double type
                                             */
        {
            return this.interest_rate;
        }

    public String getexpiration_date()       /*getter method also known as accessor method is used in this insatance variable which return getexpiration_date value to
                                             *getPinNumber with this keyword as a String type
                                             */
        {
            return this.expiration_date;
        }

    public int getgrace_period()              /*getter method also known as accessor method is used in this insatance variable which return getgrace_period value to
                                             *getPinNumber with this keyword  as a integer type
                                             */
        {
            return this.grace_period;
        }

    public boolean getisGranted()            /*getter method also known as accessor method is used in this insatance variable which return getisGranted value to
                                             *getPinNumber with this keyword as a boolean type
                                             */
        {
            return this.isGranted;
        }
    /*this is a condition made which
     * will check if credit limit is less then 2.5 times the balanceamount
     * if yes,it will grant permission
     * if credit limit is greater then 2.5 times the balanceamount then it will print "Credit cannot be issued"
     */
    public void setcredit_limit(double new_credit_limit, int new_grace_period)
    {
        if(new_credit_limit <= (2.5 * getBalanceAmount())){
            this.credit_limit = new_credit_limit;
            this.grace_period = new_grace_period;
            isGranted = true;
        } else {
            System.out.println("Credit cannot be issued,please contact your bank!,Thank you");
        }
    }
    /*this is a condition made which
     * will cancle CreditCard which will remove client CVC number, credit limit and grace period
     * if not
     * it will print card is not active
     */
    public void cancelCreditCard()
    {
        if(isGranted = true)
        {
            this.CVC_number = 0;
            this.credit_limit = 0;
            this.grace_period = 0;
            this.isGranted = false;
        } else {
                    System.out.println("Credit card is not active!,remove it and insert again,or contact bank for more help,Thank you");
                }
    }
    /*using of void display which is a keyword provided by java and is used to specift
     * if method dosent return anyhting
     * if main() terminates the programming language terminates too which dosent return anything
     */
    public void display(){
        super.display();
        if(isGranted)
            {
                System.out.println("Your CVC Number is : " + CVC_number);
                System.out.println("Your Credit Limit is : " + credit_limit);
                System.out.println("Interest Rate provided by our bank  is: " + interest_rate);
                System.out.println("Expiration Date of your CreditCard is: " + expiration_date);
                System.out.println("Grace Period provided is : " + grace_period);
        } else {
                    System.out.println("Credit card not granted to the client.");
                }
        /*this is a condition made which
         * which will display the card Id, client name, issuer bank, bank account, and BalanceAmount
         * if not granted 
         * Credit Limit and Grace Period will not be displayed
         */    
    }
}
