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
                item = item.substring(1, item.length());
                result.add(item);
            }
        }
        return result;
    }

    //Task 3 Thato

    public boolean Task3(String str){
        Stack<Character> stack = new Stack<>(); // using a stack data structure

        char characterArray[] = str.toCharArray(); // converting the string into an array of characters

        for(int i = 0; i < characterArray.length; i++){
            if(characterArray[i] == '('){ // check if the character at index i is '('
                stack.push('(');// if that's true then push that character into the stack
            }else if (characterArray[i] == ')'){
                if(stack.isEmpty()){ // if the stack is empty, I cannot pop anything, so just return false. to avoind the empty stack exception
                    return false;
                }
                stack.pop();  
            }
        }

        return stack.isEmpty();
    }


    //Task 6 Hazel
     public static List<Integer> Task6(List<Integer> numbers) {
        List<Integer> roundedNumbers = new ArrayList<>();
       
        for (int number : numbers) {
            if (number % 100 == 0) {
                roundedNumbers.add(number);
            } else {
                int nextMultiple = ((number / 100) + 1) * 100;
                roundedNumbers.add(nextMultiple);
            }
        }
       
        return roundedNumbers;
    }
}
