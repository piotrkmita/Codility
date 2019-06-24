package codility.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A ={5,2,3,4,5,2,1,3,4,5,5};
        solution(A);
    }

    private static int solution(int[] a) {
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

        Map<Integer, Long> counters = list.stream()
                .collect(Collectors.groupingBy(p -> p,
                        Collectors.counting()));
        System.out.println(counters);
        for (Map.Entry<Integer, Long> entry : counters.entrySet()) {
            if(entry.getValue()%2==1)
                return list.get(list.lastIndexOf(entry.getKey()));
        }
        return 0;
    }

}


