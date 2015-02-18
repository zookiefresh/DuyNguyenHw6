/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankApp;

/**
 *
 * @author duy
 */
public class BankDatabase {
    /* An alternative is an ArrayList
    * Automatically increases the size as you add new elments
    */
    private BankAccount[] allAccounts; 
    private int numAccounts;
    
    final int maxAccounts = 100;
    
    BankDatabase(){
        allAccounts = new BankAccount[maxAccounts];
        numAccounts = 0;
    }
    
    void createCheckingAccount(String customerName, String ssn, float deposit){                
        String[] name = customerName.split(" ");        
        numAccounts = numAccounts + 1;
        allAccounts[numAccounts - 1] = new CheckingAccount(name[0], 
                name[1], ssn, deposit);        
    }
    
    void createSavingAccount(String customerName, String ssn, float deposit){
        String[] name = customerName.split(" ");        
        numAccounts = numAccounts + 1;
        allAccounts[numAccounts] = new SavingsAccount(name[0], 
                name[1], ssn, deposit);                
    }
    
    void print(){
        for(int i = 0 ; i <= numAccounts; i++){
            allAccounts[i].checkBalance();
        }
    }
    
    void applyInterest(){
        for(int i = 0 ; i <= numAccounts; i++){
            allAccounts[i].applyInterest();
        }
    }    
}
