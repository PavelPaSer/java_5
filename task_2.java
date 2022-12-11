// Пусть дан список сотрудников: Сергей, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

import java.util.*;
import java.util.stream.Collectors;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> user_name = new ArrayList<>(Arrays.asList(
                "Сергей",
                "Милана",
                "Анастасия",
                "Василиса",
                "Татьяна",
                "Сергей",
                "Александр",
                "Павел",
                "Марк",
                "Марк",
                "Марина",
                "Александр",
                "Марк",
                "Марина",
                "Татьяна",
                "Сергей",
                "Александр"
                ,"Сергей"));
        System.out.println("Список имен: \n" + user_name);
        Map<String,Integer> user_rec = getRecurringName(user_name);
        Map<String,Integer> sort_names = user_rec.entrySet().stream().sorted(Comparator.comparingInt(i -> -i.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)-> {throw new AssertionError();}, LinkedHashMap::new));
        System.out.println("Отсортированный список популярности в кол-ве имени: \n");
        sort_names.entrySet().forEach(System.out::println);
    }
    public static Map<String,Integer> getRecurringName(ArrayList object){
        Map<String,Integer> user_rec = new HashMap<>();
        String[] temp;
        for (Object s: object
             ) {
            String value = (String) s;
            temp = value.split(" ");
            if(user_rec.containsKey(temp[0])){
                user_rec.put(temp[0], user_rec.get(temp[0]) + 1);
            } else user_rec.put(temp[0], 1);
        }
        return user_rec;
    }
}