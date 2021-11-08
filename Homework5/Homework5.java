package Homework5;

public class Homework5 {
    public static void main(String[] args) {

    }

    public static String reverseString(String strToReverse) {
        String[] arr = strToReverse.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i > -1; i--) {
            sb.append(arr[i]);
            sb.append(" ");
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}