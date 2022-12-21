import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Set <String> set= new HashSet<>();
       set.add("банан");
       set.add("молоко");
       set.add("хлеб");
       set.add("кукуруза");
       set.add("банан");
       set.add("яблоки");
       set.add("курица");
       set.add("банан");




        System.out.println(Arrays.toString(set.toArray(new String[0])));
    }
}