public class DebitCard extends BankCard                                //this denotes that debitcard is inhertance of bankcard as a clid class of it
{
    //its an  private access modifier but this class will be able to use it for itself
    private int PinNumber;                                            //attributes as a private integer type PinNumber
    private int WithdrawalAmount;                                     //attributes as a private integer type WithdrawalAmount
    private String DateOfWithdrawal;                                  //attributes as a private String type DateOfWithdrawal
    private boolean HasWithdrawn;                                     //attributes as a private Boolean type HasWithdrawal which accepts only true or false
    
    
    /*constructor is created which is used to create instance of the class
     * we create constructor on class name
     * it has no return type
     */
    
    public DebitCard(int CardId,String IssuerBank,String BankAccount, int BalanceAmount, int PinNumber, String ClientName)
        {
    /*using this keyword given by java programming language 
     * it is used to eliminate the confusion between class attributes and paramaters with the same name
     */
            super(CardId, IssuerBank, BankAccount, BalanceAmount);    /*super key word is used which is provided by JDE which
                                                                        *elimite confusion with same name with methods in parent class and child classes
                                                                        *call parentclass methods,and access its constructor
                                                                        */
            this.PinNumber = PinNumber;                                //this keyword is used in pin number as it seperates the cinfustion between entry pin and correct pin
            setClientName(ClientName);
            HasWithdrawn = false;
        }
     /*using one of the pillar of OOP Encapsulation
     * its is used as grouping of information
     * it is done in the form of secure field accessible by onlt the member of the same class
     * it uses getter and setter methods which returns value and spdates its values
     * it protects your data
     */
    
    
    //getter method is used for these instance variables which return its value 
    public int getPinNumber()                /*getter method also known as accessor method is used in this insatance variable which return getPinNumber value to
                                             *getPinNumber with this keyword
                                             */
        {
            return this.PinNumber;
        }
    public int getWithdrawalAmount()          /*getter method also known as accessor method is used in this insatance variable which return WithdrawalAmount value to
                                             *WithdrawalAmount with this keyword
                                             */
        {
            return this.WithdrawalAmount;
        }
    public String getDateOfWithdrawal()        /*getter method also known as accessor method is used in this insatance variable which return DateOfWithdrawal value to
                                             *DateOfWithdrawal with this keyword
                                             */
        {
            return this.DateOfWithdrawal;
        }
    public boolean getHasWithdrawn()            /*getter method also known as accessor method is used in this insatance variable which return HasWithdrawn value to
                                             *HasWithdrawn with this keyword
                                             */
        {
            return this.HasWithdrawn;
        }
    /*setter method is used for these instance variables which updates and sets its value
     * should not return a value
     * because we are just just initializing the instance variables
     */
    public void setWithdrawalAmount(int WithdrawalAmount)              //setter method also known as mutator is used in this which sets and updates values of WithdrawalAmount
        {
            this.WithdrawalAmount=WithdrawalAmount;
        }
    /*this is a condition made which
     * will print output as "Invalid Pin" if pinnumber entered do not match the pin number given
     * if pin number matches it goes next step where,amount withdrawn should be less then the amount u have in balanceamount.
     * If (WithdrawalAmount >= getBalanceAmount) then it will print "Insufficient balance"
     * If (WithdrawalAmount <= getBalanceAmount) then it will go to next step and withdraw the amount
     */
    public void Withdraw(int WithdrawalAmount,String DateOfWithdrawal,int PinNumber)              
        {
            if(PinNumber == this.PinNumber)                                                               //checking if pin is correct
                {
                    if(WithdrawalAmount <= getBalanceAmount())                                       //checking if withdrawal amount is less then balance amount
                        {
                            setBalanceAmount(getBalanceAmount() - WithdrawalAmount);
                            this.WithdrawalAmount = WithdrawalAmount;
                            this.DateOfWithdrawal = DateOfWithdrawal;
                            HasWithdrawn =true;                
                        }else{
                                System.out.println("Insufficient balance in your BalanceAmount,please check your balance or contact your bank!,Thank you");
                                }   
                        }else{
                                 System.out.println("Invalid Pin");
                               }
        }   
     public void display()
     /*using of void display which is a keyword provided by java and is used to specift
     * if method dosent return anyhting
     * if main() terminates the programming language terminates too which dosent return anything
     */
     {
        super.display();
        if(HasWithdrawn){
            System.out.println("PinNumber of your DebitCard: " + PinNumber);
            System.out.println("WithdrawlAmount u have withdrawn from your card is: " + WithdrawalAmount);
            System.out.println("DateOfWithdrawal is : " + DateOfWithdrawal);
        } else {
                    System.out.println("Transaction pending has not been carried,please contact your bank!,Thank you");
                }
        /*this is a condition made which
        * will print output only if the withdrawn has been made or cleared out
        * else
        * it prints Transaction pending
        */    
    }
}