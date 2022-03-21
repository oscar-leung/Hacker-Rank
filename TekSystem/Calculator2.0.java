import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'addStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING string1
     *  2. STRING string2
     */

    public static String addStrings(String x, String y) {
    // Write your code here
    
    // Using BigInteger
    if(x.length()>17 || y.length() > 17){     
    BigDecimal big1 = new BigDecimal(x);
    BigDecimal big2 = new BigDecimal(y);
    BigDecimal big3 = big1.add(big2);
    
    return String.valueOf(big3);
    }
        x = x.trim();
        y = y.trim();
        // Edge Cases 
        if(x.isEmpty() && y.isEmpty()){
            return "0.0";
        }else if(!x.isEmpty() && y.isEmpty()){
            return x;
        }else if(x.isEmpty() && !y.isEmpty()){
            return y;
        }else{
            boolean isXNeg = false;
            boolean isYNeg = false;

            if(x.startsWith("-")){
                 isXNeg = true;
                 x = x.substring(1,x.length());
            }
            if(y.startsWith("-")){
                 isYNeg = true;
                 y = y.substring(1,y.length());
            }
            String[] arr1 = x.split("\\.");
            String[] arr2 = y.split("\\.");
            // Edge case – Bad Inputs or no decimals
            if((arr1.length > 2 || arr2.length > 2) && arr1.length == 2 && arr2.length == 2){
                return "0.0"; 
            }else if(arr1.length == 1 && arr2.length == 1){
                double totalCase = Double.parseDouble(arr1[0]) + Double.parseDouble(arr2[0]);
                return String.valueOf(totalCase);
            }
            
            int leftSide = 0;
            double rightSide = 0.0;
            
            // Preserve zeros by adding a decimal point before parsing
            if(arr1.length > 1 && arr2.length > 1){                
                arr1[1] = "." + arr1[1];
                arr2[1] = "." + arr2[1];
                
                if(!isXNeg && !isYNeg){ // 100.05, 150.05
                 leftSide = Integer.parseInt(arr1[0]) + Integer.parseInt(arr2[0]);
                 rightSide = Double.parseDouble(arr1[1]) + Double.parseDouble(arr2[1]);
            }else if(isXNeg && !isYNeg){ // -100.05, 150.05
                 leftSide = -(Integer.parseInt(arr1[0])) + Integer.parseInt(arr2[0]);
                 rightSide = -(Double.parseDouble(arr1[1])) + Double.parseDouble(arr2[1]);
            }else if(!isXNeg && isYNeg){ // 100.05, -150.05
                 leftSide = (Integer.parseInt(arr1[0])) - Integer.parseInt(arr2[0]);
                 rightSide = (Double.parseDouble(arr1[1])) - Double.parseDouble(arr2[1]);
            }else{// -100.05, -150.05
                 leftSide = -(Integer.parseInt(arr1[0])) - Integer.parseInt(arr2[0]);
                 rightSide = -(Double.parseDouble(arr1[1])) - Double.parseDouble(arr2[1]);
            }
            }
            
            // Debugging arrays
            // System.out.println(arr1[1]);
            // System.out.println(arr2[1]);
            // System.out.println(arr1[0]);
            // System.out.println(arr2[0]);
            
          
            // Adding Logic

            // Debugging primitives
            System.out.println("Integer Type leftSide: " + leftSide);
            System.out.println("Double Type rightSide: " + rightSide);
            System.out.println("String Value LeftSide: " + String.valueOf(leftSide));
            System.out.println("String Value RightSide: " + String.valueOf(rightSide));
            return String.valueOf(leftSide + rightSide);
            // double totalInDouble = leftSide + rightSide;
            // String total = String.valueOf(leftSide) + "." + String.valueOf(rightSide);
            // return Double.parseDouble(total);
    }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String string1 = bufferedReader.readLine();

        String string2 = bufferedReader.readLine();

        String result = Result.addStrings(string1, string2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
