package practicejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPrac {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,1};
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr,2); //binarySearch 하기전에 sort() 필수 !!!
        System.out.println(idx);
        List list = Arrays.asList(arr);
        //list.add(6);  List list = Arrays.asList(arr); 로 만들어진 list 는 읽기전용이라서, 추가할 수 없다. 아래와 같은 방법으로 하자.
        List list2 = new ArrayList(Arrays.asList(1,2,3,4,5));
        list2.add(6);
    }
}
