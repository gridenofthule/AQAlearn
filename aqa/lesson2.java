public class lesson2 {
    public static void main(String[] args) {
        checkSumSign();
        printColor();
        compareNumbers();


    }

    public static void printThreeWords(String str1, String str2, String str3) {
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    public static void checkSumSign() {
        printThreeWords("Orange", "Banana", "Apple");
        int a, b;
        a = 4;
        b = -10;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 131;
        if (value <= 0 ) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");


        }

    }
    public static void compareNumbers() {
        int a, b;
        a = -50;
        b = 20;
        String text = ">=";
        if (a >= b) {
            System.out.println(a + " >= " + b);
        }
        else {
            System.out.println(a + " < " + b);
        }
    }
}



