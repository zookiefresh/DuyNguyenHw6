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
    
    private BankAccount[] allAccounts = new BankAccount[5];
    private int numAccounts = -1;
    
    BankDatabase(){
        
    }
    
    void createCheckingAccount(String customerName, String ssn, float deposit){                
        String[] name = customerName.split(" ");        
        numAccounts = numAccounts + 1;
        allAccounts[numAccounts] = new CheckingAccount(name[0], name[1], ssn, deposit);        
    }
    
    void createSavingAccount(String customerName, String ssn, float deposit){
        String[] name = customerName.split(" ");        
        numAccounts = numAccounts + 1;
        allAccounts[numAccounts] = new SavingsAccount(name[0], name[1], ssn, deposit);                
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
