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
public class SavingsAccount extends BankAccount{    
   
    SavingsAccount(String firstName, String lastName, 
            String socialSecurityNumber, float openingBalance){
        
        super(firstName, lastName, socialSecurityNumber, openingBalance);
        this.interestRate = 0.05f;
    }
}
