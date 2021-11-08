package FirstHomeworks.Homework3;

//Задана строка. Вывести все перестановки этой строки.
//        Например для строки "abc":
//        abc, acb, bac, bca, cab, cba

public class Exercise3 {
    public static void main(String[] args) {
    }

    public static void getVariations(String elements) {
        String[] arr = elements.split("");
        prepareElements(arr, 0);
    }

    private static void prepareElements(String[] arrElements, int i) {
        if (i == arrElements.length - 1) {
            getResults(arrElements);
        } else {
            for (int j = i; j < arrElements.length; j++) {
                changeElements(arrElements, i, j);
                prepareElements(arrElements, i + 1);
                changeElements(arrElements, i, j);
            }
        }
    }


    static void changeElements(String[] arr, int index1, int index2) {
        String tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    private static void getResults(String[] pa) {
        StringBuffer s = new StringBuffer();

        for (String a : pa) {
            s.append(a);
        }

        s.substring(0, s.length() - 2);

        System.out.print(s + " ");
    }
}
