import java.util.*;
public class Stream {
    public static double average(Object[][] l, int t) {
        ArrayList<List<Object>> p = new ArrayList<List<Object>>();
        List<Object> test;
        for (int i = 0; i<l.length; i++){
            test = Arrays.asList(l[i]);
            p.add(test);
            test = null;
        }
        double x = p.stream()
                .mapToInt(w -> (int)w.get(t))
                .average().getAsDouble();
        return x;
    }

    public static int sum(Object[][] l, int t) {
        ArrayList<List<Object>> p = new ArrayList<List<Object>>();
        List<Object> test;
        for (int i = 0; i<l.length; i++){
            test = Arrays.asList(l[i]);
            p.add(test);
            test = null;
        }
        int x = p.stream()
                .mapToInt(w -> (int)w.get(t))
                .sum();
        return x;
    }
}