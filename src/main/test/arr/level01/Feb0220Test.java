package arr.level01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb0220Test {

    Feb0220 feb0220 = new Feb0220();

    @Test
    void solution() {

        String[] name = {"a", "b", "c"};
        int[] yearning = {1, 2, 3};
        String[][] photo = {{"a", "b"}, {"b", "c"}, {"c", "a"}};
        int[] result = feb0220.solution(name, yearning, photo);
        assertArrayEquals(new int[]{3, 5, 4}, result);
    }

    @Test
    void solution2() {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] result = feb0220.solution(name, yearning, photo);
        assertArrayEquals(new int[]{19, 15, 6}, result);


        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
        int[] result2 = feb0220.solution(name2, yearning2, photo2);
        assertArrayEquals(new int[]{67, 0, 55}, result2);


        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning3 = {5, 10, 1, 3};
        String[][] photo3 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "deny", "radi"}, {"kon", "coni", "may", "coni"}};
        int[] result3 = feb0220.solution(name3, yearning3, photo3);
        assertArrayEquals(new int[]{19, 18, 5}, result3);
    }
}