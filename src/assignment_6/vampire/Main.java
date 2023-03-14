//1. A vampire number v is a number with an even number of digits n,
// that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes,
// where v contains precisely all the digits from x and from y, in any order.
// Write a java program to print first 100 vampire numbers.
//

package assignment_6.vampire;

import assignment_6.vampire.VampireNumber;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        int count=0;
        int number=10;
        ArrayList<Integer> vampireNumbers = new ArrayList<>();
        VampireNumber vampire= new VampireNumber();
        while(count<100){
            if(vampire.isVampireNumber(number)){
                count++;
                vampireNumbers.add(number);
            }
            number++;
        }
        System.out.println("First 100 vampire numbers are..");
        System.out.println(vampireNumbers);
    }
}
