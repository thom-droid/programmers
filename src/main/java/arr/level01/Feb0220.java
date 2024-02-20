package arr.level01;

import java.util.*;
import java.util.stream.Collectors;

public class Feb0220 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        List<Integer> list = Arrays.stream(photo).map(line -> Arrays.stream(line).map(map::get).filter(Objects::nonNull).mapToInt(x -> x).sum()).collect(Collectors.toList());
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
