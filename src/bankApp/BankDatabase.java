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
        if(name.length == 2){           
            allAccounts[numAccounts] = new CheckingAccount(name[0], 
                    name[1], ssn, deposit);             
             numAccounts++;
        }
        else{
            System.out.println("Invalid name");
        }
    }
    
    void createSavingAccount(String customerName, String ssn, float deposit){
        String[] name = customerName.split(" "); 
        if(name.length == 2){       
            allAccounts[numAccounts] = new SavingsAccount(name[0], 
                name[1], ssn, deposit);                
            numAccounts++;
        }
    }
    
    void print(){
        for(int i = 0 ; i < numAccounts; i++){
            // allAccounts[i].checkBalance(); 
            // Not considered polymorphic
          
            // TODO - Object class override toString
            System.out.println(allAccounts[i]);
            // What is the advantage?
            // Makes it easier for the user. One less method the user needs 
            // to know -- Encapsulation! 
            // Hide the complexity so that the user doesn't need to know            
        }
    }
    
    void applyInterest(){
        for(int i = 0 ; i < numAccounts; i++){
            allAccounts[i].applyInterest(); 
            // Polymorphic behavior because overriden in Checking account
        }
    }    
    
    boolean exists(BankAccount accnt){
        for (int i=0; i < numAccounts; i++){
            if(allAccounts[i].equals(accnt)){
                return true;
            }
        }
        return false;
    }
}
