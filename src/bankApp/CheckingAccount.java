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
public class CheckingAccount extends BankAccount {        
    static final float interestMin = 10000.0f;    
    
    CheckingAccount(String first, String last, String ssn, float open_bal){
        super(first, last, ssn, open_bal);
        this.interestRate = 0.02f;
    }
    
    @Override
    void applyInterest(){        
        if (this.balance > interestMin){
            float earnedInterest = (this.balance - interestMin) * this.interestRate;            
            this.balance += earnedInterest;
        }        
    }
}