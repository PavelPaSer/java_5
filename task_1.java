//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class task_1 {
    public static void main(String[] args) {
        Map<Long, String> numbers_phone = new HashMap<>();
        numbers_phone.put(+79775441622L, "Иванов Сергей Петрович");
        numbers_phone.put(+79893361222L, "Иванов Сергей Петрович");
        numbers_phone.put(+79177722234L, "Иванов Сергей Петрович");
        numbers_phone.put(89134445522L, "Сидорва Елена Васильевна");
        numbers_phone.put(89174325422L, "Сидорва Елена Васильевна");
        numbers_phone.put(89293401355L, "Фирченко Антонина Сергеевна");
        numbers_phone.put(89293417766L, "Коровкин Василий Ильич");
        numbers_phone.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        // Сортировка и вывод по значению
    }
}