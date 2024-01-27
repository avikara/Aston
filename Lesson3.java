public class Lesson3 {
    public static void main(String[] args) {

    }
    //1
    public static boolean Sum (int a, int b){
        int a = b + c;
        if (a >= 10 && a <= 20)
        {
            return true;
        }
        else return false;
    }
    //2
    public static void PositivNegativ (int a) {
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //3
    public static boolean Negative (int a) {
        if (a>=0){
            return false;
        } else {
            return true;
        }
    }
    //4
    public static void printStrInt (String s, int a){
        for (int b = 0; i < a; b++) {
            System.out.println(s);
        }
    }
    //5
    public static boolean LeapYear (int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
            return true;
        } else return false;
    }
    //6
    public static void Replacement ()  {
        int[] b = new int[10];
        for (int a = 0; a < b.length; a = a + 2) {
            b[a] = 1;
        }
        for (int a = 0; a < b.length; a = a + 1) {
            b[a] = 0;
        }
        for (int a = 0; a < b.length; a++) {
            if (b[a]==1) b[a]=0;
            else b[a]=1;
        }
    }
    //7
    public static void Filling () {
        int[] a = new int[100];
        for (int b = 0; b < a.length; b++) {
            a[b] = b+1;
        }
    }
    //8
    public static void Multiplication () {
        int[] a = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int b = 0; b < a.length; b++) {
            if (a[b] < 6) a[b] = a[b]*2;
        }
    }
    //9
    public static void DiagonalPadding () {
        int[][] a = new int[6][6];
        for (int b = 0; b < a.length; b++) {
            for (int c = 0; c < a.length; c++) {
                if (b==c) a[b][c] = 1;
            }
        }
    }
    //10
    public static int[] returnArray (int b, int c) {
        int[] arr = new int[b];
        for (int a = 0; a < arr.length; a++) {
            arr[a]=c;
        }
        return arr;
    }

}
