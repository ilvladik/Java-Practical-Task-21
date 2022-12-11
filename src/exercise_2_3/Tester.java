package exercise_2_3;

import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        Array<Integer> array = new Array<>(a);
        System.out.println(array.get(0));
    }
}
