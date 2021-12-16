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



public class ReductorArray {
    public ReductorArray(){
        
    }

    /*
     * Complete the 'comparatorValue' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     *  3. INTEGER d
     */

    public int comparatorValue(List<Integer> a, List<Integer> b, int d) {
    // Write your code here
        int cV = 0;
        int inner = 0;
        int outer = 0;

        outerLoop: 
        for(int i = 0; i < a.size(); i++){
            innerLoop:
            for(int j = 0; j < b.size(); j++){
                // 
                if(Math.abs(a.get(i)- b.get(j)) <= d){
                    break innerLoop;
                }else{
                    inner++;
                    if(inner >= b.size() ){
                        cV++;
                        inner=0;
                    }
                    
                }
                
            }
        }
        return cV; // 7
    }

    public static void main(String[] args) throws IOException {
        ReductorArray rA = new ReductorArray();
        List <Integer> a = new ArrayList<>();
        a.add(3);
        a.add(1);
        a.add(5);
        List <Integer> b = new ArrayList<>();
        b.add(5);
        b.add(6);
        b.add(7);
        System.out.println(rA.comparatorValue(a, b, 3));
    
    }

}


