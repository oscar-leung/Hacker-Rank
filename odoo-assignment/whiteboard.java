import java.util.*;
public class whiteboard {
    public whiteboard(){

    }
    
    public static void main (String [] args){
        // Company Name , Label of Boxes, Amount of Items
        Hashtable <String,String,Double> productBoxes = new Hashtable<>(); // will pass data into Hashtable
        // Company Name, Order Number, Amt of Items 
        Hashtable <String,String,Double> orders = new Hashtable<>(); // ditto ln 8

        // best-case knap sack sol'n 

        // brute force
        
        // List of need variables
        // Output
        // totalQuantity - double
        // packs - ArrayList <String, Double>
        // Hashtable - arrayList packs, double totalQuantity

        // Edge Cases 
        // empty orders
        // wrong datatypes being past
        // right company name 

        


//         - Write a program/script/solution to find and return the best and least
// possible packing boxes to be used for shipping the ordered products
// in an order.
// - Also, each box returned should give a count of product quantity to be packed
// in each selected boxe(s) from the given list.

// Expected return :

orders = {
    'S0101': {
        'Scale-Up! The Business Game': 15.0,
        'IoT Box': 47.0,
        'Basic Cash Drawer': 10.0,
        'Shoes': 5.0,
    },

// packed_orders = {
//     'S0101': {
//         'Scale-Up! The Business Game': {
//             'packs': [('BOX-23x17x12', 14.0),
//                       ('BOX-10x08x08', 1.0)],
//             'quantity': 15.0
//         },
    }
}

