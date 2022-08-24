/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einsa
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHearRate) {
        this.age = age;
        this.restingHeartRate = restingHearRate;
    }
    public double maximumHearRate() {
        return 206.3 - (0.711*this.age);
    }
    public double targetHeartRate(double porcentage) {
        return ((this.maximumHearRate()-this.restingHeartRate) * (porcentage) + this.restingHeartRate);
    }
    
}
