import java.util.Random;

public class TasksForHomework1 {

    public static void PrintArray(short[] arr) {
        for (short l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Random random = new Random();
        short i = (short) random.nextInt(2000);
        System.out.println("Случайное целое число (i) = " + i);


        short n = 1 << 11; // двойку в нулевой степени смещаем побитово влево,
                           // пока не превысим 2000 (на 11 разрядов)
        while (i < n)
            n >>= 1; // смещаемся побитово вправо,
                     // пока не превысим выпавшее число i
        System.out.println("Номер старшего значащего бита (n) = " + n);

        
        short count = 0;
        for (short j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                count++;
            }
        }
        short m1[] = new short[count];
        short k = 0;
        for (short j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[k] = j;
                k++;
            }
        }
        System.out.println("Все кратные n числа в диапазоне от i до Short.MAX_VALUE:");
        PrintArray(m1);
    }
}