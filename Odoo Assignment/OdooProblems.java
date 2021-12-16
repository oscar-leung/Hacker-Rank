import java.util.*;
import java.util.regex.Pattern;
public class OdooProblems {
    public OdooProblems(){

    }

    // Problem 1
    // Given an amount in dollars and a tax percentage. Return an array with the tax amount in cents.
    // Not sure what's the the point of return an array of the tax amount as oppose the double.

    public double[] taxAmounts(double dollars, double taxPercentage){
        return new double[] { dollars * taxPercentage/100};
    }

    // Problem 2
    // Given the deck ['A',1,2,3,4,5,6,7,8,9,10,'J','K','Q'], 
    // write a function that shuffles the deck using the randint function. 
    // The random module includes a basic function randint(a, b) that returns
    // a uniformly random integer from a to b (including both endpoints). 
    Random rand = new Random();
    public char[] shuffleDeck(char [] card){
        for(int i = 0; i < card.length; i++){
            // Random for remaining positions
            int r = i + rand.nextInt(14 - i);
            char temp = card[r];
            card[r] = card[i];
            card[i] = temp;
        }
        return card;
    }

    // Problem 3
    // Given a string s, return the sum of the vowels in the string if each vowel's weight 
    // increases by 1 according to the vowels order. 

    public double sumOfVowels(String str){
        double sum = 0;
        for(int i = 0; i < str.length(); i++){
            switch(str.charAt(i)){
                case 'a':
                sum = sum + 1;
                break;
                case 'e':
                sum = sum + 2;
                break;
                case 'i':
                sum = sum + 3;
                break;
                case 'o':
                sum = sum + 4;
                break;
                case 'u':
                sum = sum + 5;
                break;
                default:
            }
        }
        return sum;
    }

    // Problem 4
    // Write a recursive version of the previous function (or an iterative version if you already did a 
    // recursive version).

    // public double sumOfVowelsRecursion(String str){
    //     double sum = 0;
    //     int i = 0;
    //     if(i == str.length()){
    //         return str.length();
    //     }else{
    //         switch(str.charAt(i)){
    //             case 'a':
    //             sum = sum + 1;
    //             break;
    //             case 'e':
    //             sum = sum + 2;
    //             break;
    //             case 'i':
    //             sum = sum + 3;
    //             break;
    //             case 'o':
    //             sum = sum + 4;
    //             break;
    //             case 'u':
    //             sum = sum + 5;
    //             break;
    //             default:
    //             return sumOfVowelsRecursion(str.substring(0, i + 1));
    //         }
    //     }
    //     return sum;
    // }

    // Problem 5
    // Write a regular expression to find any word between 4 and 9 letters long and 
    // containing either “odoo”, “code” or “work”?
    public boolean matchFound(String str){
        boolean expressionFound = false;

        if((str.length() >= 4 && str.length() <= 9) && Pattern.matches("odoo", str) || Pattern.matches("code", str) || Pattern.matches("work", str)){
            expressionFound = true;
        }
        return expressionFound;
    }
    
    public static void main (String [] args){
        OdooProblems oD = new OdooProblems();
        System.out.println(oD.taxAmounts(10.00, 10)[0]); // 1.0
        System.out.println(oD.shuffleDeck(new char[] {'A',1,2,3,4,5,6,7,8,9,10,'J','K','Q'})); // A       QKJ
        // In java, you can't have letters and numbers, it prints just the acii for char
        System.out.println(oD.sumOfVowels("Welcome to Indonesia")); // 22
    }
}

