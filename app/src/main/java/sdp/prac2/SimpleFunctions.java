package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

    // Task 1 Jobayer
    public static int Task1(List<Integer> a, List<Integer> b){
        int sum = 0;
        for(int i = 0; i < b.size(); i++){
            if (b.get(i) < 0 || b.get(i) >= a.size()){
                continue;
            }
            else{
                sum += a.get(b.get(i));
            }
        }
        return sum;
    }
    
  // Task 2 Antony
    public <T> List<String> Task2(List<T> nested) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < nested.size(); i++) {
            if (nested.get(i).toString().length() != 0) {
                String item = nested.get(i).toString();
                item = item.substring(1, item.length() - 1);
                result.add(item);
            }
        }
        return result;
    }

    //Task 3 Thato

    public boolean Task3(String str){
        Stack<Character> stack = new Stack<>();

        char characterArray[] = str.toCharArray();

        for(int i = 0; i < characterArray.length; i++){
            if(characterArray[i] == '('){
                stack.push('(');
            }else{
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
