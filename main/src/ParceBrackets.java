/**
 * Created by user on 9/3/15.
 */
public class ParceBrackets {

    public static void main (String [] args) {
        //String str = "([+{{}]})";
        String str = "([]{}{)()";
        CheckBracket cb = new CheckBracket();

        System.out.println(cb.execute(str));

    }
}
