/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_06;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args){
        System.out.print("What age are you now?");
        Scanner input = new Scanner(System.in);
        String currentAge = input.next();
        int ageNow = Integer.parseInt(currentAge);

        System.out.print("What do you want to retire?");
        String retirementAge = input.next();
        int retire = Integer.parseInt(retirementAge);
        int yearsLeft = retire - ageNow;
        System.out.print("You have "+ yearsLeft + " years left until you retire \n");

        System.out.print("What year is it?");
        String currentYear = input.next();
        int year = Integer.parseInt(currentYear);
        int retirementYear = year + yearsLeft;
        System.out.print("It's "+currentYear+" so you can retire in "+ retirementYear);

    }
}
