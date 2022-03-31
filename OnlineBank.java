import java.util.*;


class OnlineBank{

  //What do I need for this small app
  //Customer name
  //Customer id
  //Balance amount
  //method to deposit
  //method to witdraw

  private String name;
  private String id;
  private int balance;
  private int previousTransAction;
  private static ArrayList<OnlineBank> currentCust = new ArrayList<OnlineBank>();

  public OnlineBank(String cusName, String cusId){
    this.name = cusName;
    this.id = cusId;
    
    currentCust.add(this);


  }

  public String getCusName(){
    return this.name;
  }

   public String getCusId(){
    return this.id;
  }

   public int getCusBalance(){
    return this.balance;
  }

  // public void setBalance(int amount){
  //   this.balance = amount;
  // }

  public void depositToAccount(int money){
    if(money != 0){
      balance += money;
    }else{
      System.out.println("No deposit");
    }

    previousTransAction = balance;


  }

  public void withdrew(int money){
    if(money > balance){
      System.out.println("You do not have enough money to withdraw from account");
    }

    if(money != 0){
      balance -= money;
      previousTransAction = money;

    }else{
      System.out.println("No withdraw transaction");
    }
  }

  // public static OnlineBank getCustAccounts(){
  //   for (OnlineBank cust : currentCust){
  //     System.out.println(cust.getCusName());
  //   }
  // }

  public void showMenu(){
      char option = 'p';
      
      String answer;
      Scanner scanner = new Scanner(System.in);


      System.out.println("Welcome " + name);
      System.out.println("Your id is " + id);
      System.out.println("\n");
      System.out.println("A. Check balance");
      System.out.println("B. Deposit");
      System.out.println("C. Withdraw");
      System.out.println("D. Previous Transaction");
      System.out.println("E. Exit");

      do{
        System.out.println("=================================");
        System.out.println("Provide your option");
        System.out.println("=================================");
        option = scanner.next().charAt(0);
        System.out.println("\n");

        switch(option){
          case 'A':
            System.out.println("Your balance is: " + this.balance);
            showMenu();
            break;
            
          case 'B':
            System.out.println("How much would you link to deposit?");
            int amount = scanner.nextInt();
            
           
              depositToAccount(amount);
              // System.out.println("You deposted " + amount + " to your account");
             previousTransAction = amount;
             showMenu();
            
            
            break;
          case 'C':
            System.out.println("How much would you link to withdraw?");
            showMenu();
            break;
          
          case 'D':
            System.out.println("Here is your previous transaction : " + previousTransAction);
            if(previousTransaction
            showMenu();
            break;
          case 'E':
            
            break;

        }
      }while(option != 'E');
  }

}