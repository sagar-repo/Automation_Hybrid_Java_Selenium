package Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class deleteduplicatevalues {

    public static void main(String[] args) {


        String str = "sagarjtj";
        HashSet<String>  set=new HashSet<String>();
        Hashtable<String,Integer>  table=new Hashtable<>();
        table.put("",10);
        table.put("key1","");
        table.put("key2","");

        HashMap<String,String>  map=new HashMap<>();
        map.put("browser","Chrome");

        map.put("","xyz");
        map.put("key1","");
        map.put("key2","");
//
//        System.out.print(map.get("browser"));
//
//        map.get("sagar");
//        map.remove("browser");

        map.clear();
        System.out.print(map.get("browser"));



        char[] carr=str.toCharArray();
        for(int i = 0;i<str.length();i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carr[i]==carr[j]) {
                    set.add(String.valueOf(carr[j]));
//                        System.out.print(carr[j]);
                        break;

                }
            }
        }
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next());
        }
    }
}



