package Inesa_Vasserman.hw2;

public class Main {

    public static int counter = 0;
    public static int side = 0;
    public static int height = 0;
    public static char[] robotsWay;
    public static char[] jewelsArray;
    public static char[] checkStones;

    public static void main(String[] args) {

    }

    // 1)  Jewels and Stones
    //
    //  public static int numJewelsInStones(String jewels, String stones) {
    //
    //  }
    //jewels: символы уникальны, каждый символ символизирут тип драгоценного камня.
    //
    //Регистр имеет значение.
    //
    //
    //
    //stones: камни, среди которых могут встречаться драгоценные.
    //
    //
    //
    //Метод должне вернуть количество драгоценых камней в строке stones.

    public static int numJewelsInStones(String jewels, String stones) {
        jewelsArray = jewels.trim().toCharArray();
        checkStones = stones.trim().toCharArray();
        counter = 0;
        for (int i = 0; i < jewelsArray.length; i++) {
            for (int j = 0; j < checkStones.length; j++) {
                if (jewelsArray[i] == checkStones[j]) {
                    counter++;
                }
            }
        }

        return counter;

    }

    // 2) Robot Return to Origin
    //
    //Есть робот на плоскости. Он может двигаться на 1 шаг в стороны:
    //
    //
    //
    //R (right), L (left), U (up), and D (down)
    //
    //
    //
    //Задана последовательность движений, вернуть true если оне вернется в исходную точку.

    public static boolean judgeCircle(String moves) {
        robotsWay = moves.toCharArray();
        for (int i = 0; i < robotsWay.length; i++) {
            if (robotsWay[i] == 'L') {
                side -= 1;
            } else if (robotsWay[i] == 'R') {
                side += 1;
            } else if (robotsWay[i] == 'D') {
                height -= 1;
            } else {
                height += 1;
            }
        }
        if (side != 0 || height != 0) {
            return false;
        }

        return true;


    }
}
