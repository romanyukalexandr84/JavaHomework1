import java.util.Random;

public class TasksForHomework1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2000);
        System.out.println("Случайное целое число = " + i);

        int n = 1 << 11;   //двойку в нулевой степени смещаем побитово влево, 
                           //пока не превысим 2000 (на 11 разрядов)
        while (i < n)
            n >>= 1;       //смещаемся побитово вправо, 
                           //пока не превысим выпавшее число i
        System.out.println("Номер старшего значащего бита = " + n);
    }
}