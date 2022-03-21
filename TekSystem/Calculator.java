package TekSystem;


public class Calculator {
    public Calculator(){

    }

    public double addTwoLargeNumbers(String x, String y){
        x = x.trim();
        y = y.trim();
        // Edge Cases 
        if(x.isEmpty() && y.isEmpty()){
            return 0.0;
        }else if(!x.isEmpty() && y.isEmpty()){
            return Double.parseDouble(x);
        }else if(x.isEmpty() && !y.isEmpty()){
            return Double.parseDouble(y);
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
                return 0.0; 
            }else if(arr1.length == 1 && arr2.length == 1){
                return Double.parseDouble(arr1[0]) + Double.parseDouble(arr2[0]);
            }
            
            // Preserve zeros by adding a decimal point before parsing
            arr1[1] = "." + arr1[1];
            arr2[1] = "." + arr2[1];
            
            // Debugging arrays
            System.out.println(arr1[1]);
            System.out.println(arr2[1]);
            System.out.println(arr1[0]);
            System.out.println(arr2[0]);
            
            int leftSide = 0;
            double rightSide = 0.0;
            // Adding Logic
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
            // Debugging primitives
            System.out.println("Integer Type leftSide: " + leftSide);
            System.out.println("Double Type rightSide: " + rightSide);
            System.out.println("String Value LeftSide: " + String.valueOf(leftSide));
            System.out.println("String Value RightSide: " + String.valueOf(rightSide));
            return leftSide + rightSide;
            // double totalInDouble = leftSide + rightSide;
            // String total = String.valueOf(leftSide) + "." + String.valueOf(rightSide);
            // return Double.parseDouble(total);
        }
        
    }
    public static void main (String [] args){
        Calculator c = new Calculator();
        System.out.print(c.addTwoLargeNumbers("3123", "123"));
        
}
    
    
}
