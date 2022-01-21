
import java.util.HashSet;
import java.util.List;

public class RansomNote {
    static List<String> note = List.of("Ransom", "10","grand");
    static List<String> megazine = List.of("Ransom", "10","gradnd");
    
    public RansomNote(){
    }

    public static void main(String [] args){
        RansomNote rN = new RansomNote();
        rN.checkMegazine(note, megazine);
    }

    public void checkMegazine(List<String> note, List<String> megazine){
        HashSet<String> hS = new HashSet<>();
        if(hS.addAll(note)){
            if(hS.addAll(megazine)){
                System.out.print("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
    
    public List<String> getNote(){
        return note;
    }

    public static void setNote(List<String> newNote){
        note = newNote;
    }
    public List<String> getMegazine(){
        return megazine;
    }

    public static void setMegazine(List<String> newMegazine){
        megazine = newMegazine;
    }
}
