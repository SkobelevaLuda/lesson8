import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Set<Exersize> exersizes=new HashSet<>();
        while (exersizes.size()<15){
            Exersize exersize=new Exersize(random.nextInt(10),random.nextInt(10));
            exersizes.add(exersize);
            System.out.println(exersize);
        }





        Set<Integer> nambers = new HashSet<>();
        while (nambers.size() < 20) {
            nambers.add(random.nextInt(1000));
        }
        Iterator<Integer> iterator = nambers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(nambers);

       /*Set <String> set= new HashSet<>();
       set.add("банан");
       set.add("молоко");
       set.add("хлеб");
       set.add("кукуруза");
       set.add("банан");
       set.add("яблоки");
       set.add("курица");
       set.add("банан");

        System.out.println(Arrays.toString(set.toArray(new String[0])));
    }*/
    }

}