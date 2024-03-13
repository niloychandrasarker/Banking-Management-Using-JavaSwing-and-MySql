/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Niloy_Banking_Management;

import java.util.Random;

/**
 *
 * @author Niloy Sarker
 */
public class RandomNumber {
     private static final long ACCOUNT_NUMBER_MIN = 10000L;
    private static final long ACCOUNT_NUMBER_MAX = 9999999L;

    private static final long PIN_MIN = 1000L;
    private static final long PIN_MAX = 9999L;

    private final Random random;

    public RandomNumber() {
        this.random = new Random();
    }

    public long generateAccountNumber() {
        return ACCOUNT_NUMBER_MIN + Math.abs(random.nextLong()) % (ACCOUNT_NUMBER_MAX - ACCOUNT_NUMBER_MIN + 1);
    }

    public int generatePin() {
        return (int) (PIN_MIN + Math.abs(random.nextLong()) % (PIN_MAX - PIN_MIN + 1));
    }
}
