package Lesson17;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Names {
    public static void main(String[] args) {

        List a = new ArrayList();
        a.add("Анна");
        a.add("Дмитрий");
        a.add("Сергей");
        a.add("Елена");
        a.add("Ольга");

        Set b = new HashSet(a);

        List c = new ArrayList(b);

        Collections.sort(c);

        for (Object name : c) {
            System.out.println(name);
        }
    }
}

