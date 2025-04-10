package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

    //Task 1
    public static int Task1(List<Integer> a, List<Integer> b){
        int sum = 0;
        for(int i = 0; i < b.length; i++){
            if (b.get(i) < 0 || b.get(i) >= a.length){
                continue;
            }
            else{
                sum += a.get(b.get(i));
            }
        }
        return sum;
    }
}
