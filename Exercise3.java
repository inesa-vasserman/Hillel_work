import java.util.HashSet;

public class Exercise3 {
    public static void main(String[] args) {
    }
//    3*) Решить задачу
//    https://leetcode.com/problems/unique-email-addresses/

    public static int numUniqueEmails(String[] emails) {
        String[] arr = new String[emails.length];
        for (int i = 0; i < emails.length; i++) {
            String checker = emails[i];
            StringBuilder sb = new StringBuilder(checker);
            int index2 = checker.indexOf('@');
            if (checker.contains(".")) {
                while (checker.contains(".")) {
                    index2 = checker.indexOf('@');
                    int index3 = checker.indexOf('.');
                    if (index3 < index2) {
                        sb.replace(index3, index3 + 1, "");
                        checker = sb.toString();
                    } else {
                        break;
                    }
                }
            }
            if (checker.contains("+")) {
                int index1 = checker.indexOf('+');
                if (index1 < index2) {
                    sb.replace(index1, index2, "");
                }
            }
            arr[i] = sb.toString();
        }
        HashSet<String> states = new HashSet<String>();
        for (int i = 0; i < arr.length; i++) {
            states.add(arr[i]);
        }
        return states.size();
    }
}
