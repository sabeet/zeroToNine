import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(zeroToNineDigitCheck(1234567890));
    }

    public static boolean zeroToNineDigitCheck(int num){

        int[] numArray = digitsToArray(num);

        if(numArray.length <= 9){ //check if there are at least 10 digits
            return false;
        }

        TreeSet<Integer> listOfNumsFrom0to9 = new TreeSet<>();

        for(int i=0; i<10; i++){
            listOfNumsFrom0to9.add(i);
        }

        List<Integer> listedNum = new ArrayList<>(numArray.length);
        for(int i: numArray){
            listedNum.add(i);
        }

        TreeSet<Integer> sortedNum = new TreeSet<>(listedNum);

        boolean checkTrue = false;
        if(sortedNum.equals(listOfNumsFrom0to9) == true){
            checkTrue = true;
        }

        return checkTrue;
    }

    public static int digitCount(int digits){ //this counts digits
        int count = 0;
        while(!(digits < 1)){
            digits /= 10;
            count++;
        }
        return count;
    }

    public static int[] digitsToArray(int digits){
        //for the length of the digits, add each digit into the array
        int arr[] = new int[digitCount(digits)];
        for(int i = 0; i <= digitCount(digits) - 1; i++ ) {
            arr[i] = Integer.parseInt(Integer.toString(digits).substring(i, i+1));;
        }
        return arr;
    }
}
