public class BankCard                                  //class name bankcard
{
    //its an  private access modifier but this class will be able to use it for itself
    private int CardId;                                  //attributes as a private integer type CaridId
    private String ClientName;                           //attributes as a private string type ClientName
    private String IssuerBank;                           //attributes as a private string type IssuerBank
    private String BankAccount;                          //attributes as a private string type BankAccount
    private int BalanceAmount;                           //attributes as a private integer type BalanceAmount
    
    
    /*constructor is created which is used to create instance of the class
     * we create constructor on class name
     * it has no return type
     */
    
    
    public BankCard(int CardId,String IssuerBank, String BankAccount,  int BalanceAmount)
        {
    /*using this keyword given by java programming language 
     * it is used to eliminate the confusion between class attributes and paramaters with the same name
     */
            this.ClientName = "";             //this keyword is used with clientname which calls above attributes to store in clientname of constructor to remove confusion
            this.IssuerBank = IssuerBank;     //this keyword is used with IssuerBank which calls above attributes to store in IssuerBank of constructor to remove confusion
            this.BalanceAmount=BalanceAmount; //this keyword is used with BalanceAmoun which calls above attributes to store in BalanceAmoun of constructor to remove confusion
            this.CardId=CardId;               //this keyword is used with CardId which calls above attributes to store in CardId of constructor to remove confusion
            this.BankAccount= BankAccount;    //this keyword is used with BankAccount which calls above attributes to store in BankAccount of constructor to remove confusion
        }
     /*using one of the pillar of OOP Encapsulation
     * its is used as grouping of information
     * it is done in the form of secure field accessible by onlt the member of the same class
     * it uses getter and setter methods which returns value and spdates its values
     * it protects your data
     */
    
    
    //getter method is used for these instance variables which return its value 
    public String getClientName()           /*getter method also known as accessor method is used in this instance variable which return clientName value to
                                             *client name with this keyword as String
                                             */
        {
            return this.ClientName;
        }
    public String getIssuerBank()            /*getter method also known as accessor method is used in this instance variable which return IssuerBank value to
                                             *IssuerBank with this keyword as String
                                             */
        {
            return this.IssuerBank;
        }
    public int getBalanceAmount()             /*getter method also known as accessor method is used in this instance variable which return BalanceAmount value to
                                             *BalanceAmount with this keyword as int
                                             */
        {   
            return this.BalanceAmount;
        }
    public int getCardId()                    /*getter method also known as accessor method is used in this instance variable which return CardId value to
                                             *CardId with this keyword as int
                                             */
        {
            return this.CardId;
        }
    public String getBankAccount()            /*getter method also known as accessor method is used in this instance variable which return BankAccount value to
                                             *BankAccount with this keyword as String
                                             */
        {
            return this.BankAccount;
        }
    /*setter method is used for these instance variables which updates and sets its value
     * should not return a value
     * because we are just just initializing the instance variables
     */
    public void setClientName(String ClientName)            //setter method also known as mutator is used in this which sets and updates values of clientName
        {
            this.ClientName=ClientName;
        }
    public void setBalanceAmount(int BalanceAmount)          //setter method also known as mutator is used in this which sets and updates values of BalanceAmount 
        {
            this.BalanceAmount=BalanceAmount;
        }
    public void display()
    /*using of void display which is a keyword provided by java and is used to specift
     * if method dosent return anyhting
     * if main() terminates the programming language terminates too which dosent return anything
     */
    
        {
            if(ClientName.equals(""))     
                {
                    System.out.println("Error");
                }else{
                        System.out.println("ClientName : "+this.ClientName);
                        System.out.println("CardId provided by our bank is : "+this.CardId);
                        System.out.println("BankAccount of your account is : "+this.BankAccount);
                        System.out.println("BalanceAmount in your account is : "+this.BalanceAmount);
                        System.out.println("IssuerBank name : "+this.IssuerBank);
                        }
        }
    /*this is a condition made which
     * return error if client name is empty
     * or show details of the client cardid,bankaccount,issuerbank
     */
}