import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ProductSort {
    List<Integer> items;
    public ProductSort(List <Integer> items){
        this.items = items;
    }
    
    public List<Integer> itemsSort(List<Integer> items){
        Collections.sort(items);
        
        int current = 0;
        int frequency = 0;
        for(int i = 0; i < items.size() - 1; i++){
            current = i;
            if(items.get(current).equals(items.get(current + 1))){
                items.remove(i);
                items.add(i);
                frequency++;
            }
        }
        return items;
    }

    public static void main(String [] args){
        List <Integer> lst = new ArrayList<>();
        lst.add(3);
        lst.add(1);
        lst.add(2);
        lst.add(2);
        lst.add(4);
        ProductSort pD = new ProductSort(lst);
        System.out.println(pD.itemsSort(lst));
        
    }
}


