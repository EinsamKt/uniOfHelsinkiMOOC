/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class Debt {
    private double balance;
    private double rate;    
    
    public Debt(double iBalance, double iRate) {
        this.balance = iBalance;
        this.rate = iRate;
    }
    public void printBalance() {
        System.out.println(this.balance);
    }
    public void waitOneYear() {
        this.balance = this.balance*this.rate;
    }
    
}
