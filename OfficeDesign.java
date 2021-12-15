import java.util.List;

public class OfficeDesign {

    public OfficeDesign(){

    }

    public int getMaxColors(List<Integer> prices, int budget){
        System.out.println("prices: " + prices + "budet: " + budget);
        return -1;
    }

    public static void main (String [] args){
        OfficeDesign oD = new OfficeDesign();
        System.out.println(oD.getMaxColors(List.of(2, 3, 5, 1, 1, 2, 1, 7), 7));

    }
}
