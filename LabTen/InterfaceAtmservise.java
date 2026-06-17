interface ATMService 
{  
void withdraw(double amount);  
void deposit(double amount);  
void checkBalance();  
}  
  
class DBBL implements ATMService {  
  
    double balance = 10000;  
  
    public void withdraw(double amount) {  
  
        if (amount <= balance) {             
balance = balance - amount;  
            System.out.println("Withdraw Successful: " + amount);  
        } else {  
            System.out.println("Insufficient Balance");  
        }  
    }  
  
    public void deposit(double amount) {  
  
        balance = balance + amount;  
        System.out.println("Deposit Successful: " + amount);  
    }  
  
    public void checkBalance() {  
  
        System.out.println("Current Balance: " + balance);  
    }  
}  
  
public class TestATM {  
  
    public static void main(String[] args) {  
  
        DBBL account = new DBBL();  
  
        account.deposit(7000);  
  
account.withdraw(8600);  
account.checkBalance();  
} 
}  
