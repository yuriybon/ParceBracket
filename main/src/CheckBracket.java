import java.util.*;

/**
 * Created by user on 9/3/15.
 */
public class CheckBracket {
    Map<Character,Integer> openMap = new HashMap<Character,Integer>();
    Map<Character,Integer> closeMap = new HashMap<Character,Integer>();
    List<Character> openList = new ArrayList<Character>();
    int control = 0;
    char current;
    char lastOpen;

    CheckBracket() {
        openMap.put('{',10);
        openMap.put('(',17);
        openMap.put('[',26);
        closeMap.put('}',10);
        closeMap.put(')',17);
        closeMap.put(']',26);

    }


    public boolean execute(String str) {
        StringBuffer sb = new StringBuffer(str);
        for (int i=0;i<sb.length();i++) {
            current = sb.charAt(i);
            if ( openMap.containsKey(current) ) {
                openList.add(current);
                control += openMap.get(current);
            }
            if ( (closeMap.containsKey(current)) && (closeMap.get(current) == openMap.get(openList.get(openList.size()-1)))) {
                control -= closeMap.get(current);
                openList.remove(openList.size()-1);
            }
        }

        return control==0;

    }

}
