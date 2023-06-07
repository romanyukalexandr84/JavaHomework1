import java.util.Random;

public class TasksForHomework1 {

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt(2000);
        System.out.println("Случайное целое число (i) = " + i);


        int n = 1 << 11; // двойку в нулевой степени смещаем побитово влево,
                         // пока не превысим 2000 (на 11 разрядов)
        while (i < n)
            n >>= 1;     // смещаемся побитово вправо,
                         // пока не превысим выпавшее число i
        System.out.println("Номер старшего значащего бита (n) = " + n);


        int count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                count++;
            }
        }
        int m1[] = new int[count];
        int k = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[k] = j;
                k++;
            }
        }
        System.out.println("Все кратные n числа в диапазоне от i до Short.MAX_VALUE:");
        PrintArray(m1);


        int count2 = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                count2++;
            }
        }
        int m2[] = new int[count2];
        k = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                m2[k] = j;
                k++;
            }
        }
        System.out.println("Все некратные n числа в диапазоне от Short.MIN_VALUE до i:");
        PrintArray(m2);
    }
}