import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        HelloWorld test = new HelloWorld();
        String s = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker; A B R-T; A Bi R-T; Doe N Joh; Joh N Doe";
        String c = "Example";
        
        
        System.out.println(test.solution(s, c));
     }
     
     public String solution(String S, String C) {
        // write your code in Java SE 8
        String[] names = S.split("; ");
        String[] lastNames = new String[names.length];
        String[] firstNames = new String[names.length];
        String emails = "";
        int index = 0;
        String company = C.toLowerCase();
        int duplicate = 1;
        Hashtable<Integer, String> namesH = new Hashtable<>();
        
        if(S.length() == 0 || C.length() == 0)
            return null;
        
        
        for(int i = 0; i < names.length; i++)
        {
            index = names[i].indexOf(" ");
            
            duplicate = countOccurrences(namesH, names[i].substring(0, index).toLowerCase().replaceAll("-", ""));
            namesH.put(i, names[i].substring(0, index).toLowerCase().replaceAll("-", ""));
            
            if(Arrays.stream(firstNames).anyMatch(names[i].substring(0, index).toLowerCase().replaceAll("-", "")::equals))
            {
                firstNames[i] = names[i].substring(0, index).toLowerCase().replaceAll("-", "") + (duplicate + 1);
                duplicate++;
            }
            else
            {
                firstNames[i] = names[i].substring(0, index).toLowerCase().replaceAll("-", "");
            }
            if(names[i].indexOf(" ", names[i].indexOf(" ") + 1) == -1)
            {
                index = names[i].indexOf(" ");
                lastNames[i] = names[i].substring(index + 1, names[i].length()).toLowerCase().replaceAll("-", "");
            }
            else
            {
                index = names[i].indexOf(" ", names[i].indexOf(" ") + 1);
                lastNames[i] = names[i].substring(index + 1, names[i].length()).toLowerCase().replaceAll("-", "");
            }
            
            if(i == names.length - 1)
            {
                emails = emails + names[i] + " <" + lastNames[i] + "_" + firstNames[i] + "@" + company + ".com>";
            }
            else
            {
                emails = emails + names[i] + " <" + lastNames[i] + "_" + firstNames[i] + "@" + company + ".com>; ";
            }
        }
        return emails;
    }
    
    int countOccurrences(Hashtable<Integer, String> table, String value)
    {
        int count = 0;
        for(int key : table.keySet()) {
            if(table.get(key).equals(value)) {
                count++;
            }
        }
        return count;
    }
}