import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> map=new HashMap<>();
        map.put(" Иванов А.А.", "89874141212");
        map.put(" Иваскина Е.А.", "89855541212");
        map.put(" Иввушкина Е.А.", "89874148872");
        map.put(" Игрунина К.А.", "89874114012");
        map.put(" Ивашкина Я.А.", "89800141212");
        map.put(" Инушкина А.К.", "89874141002");
        map.put(" Кутова Н.А.", "89870061212");
        map.put(" Катова Р.А.", "89874146602");
        map.put(" Антонова А.А.", "89874100002");
        map.put(" Ивановичус А.О.", "89874149982");

        System.out.println(map);


        PasportList pasportList = new PasportList(
                Set.of(
                        new Passport(4569885, " Иванов", " Петр", "Николаевич", 2000),
                        new Passport(4569875, " Иваночкин", " Павел", "Николаевич",
                                2000)));
        System.out.println(pasportList);



        Random random = new Random();

        Set<Exersize> exersizes = new HashSet<>();
        while (exersizes.size() < 15) {
            Exersize exersize = new Exersize(random.nextInt(8)+2, random.nextInt(8)+2);
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
        HashMap <String, Integer> map1= new HashMap<>();
       map1.put("банан", 5);
       map1.put("молоко",8);
       map1.put("хлеб",2);
       map1.put("кукуруза",6);
       map1.put("банан",0);
       map1.put("яблоки",2);
       map1.put("курица",5);
       map1.put("банан",4);

        System.out.println(map1.get("банан"));

    }

}