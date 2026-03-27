import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int count = 0, sum = 0, even = 0, odd = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.print("ป้อนตัวเลข (-1 เพื่อหยุด): ");
            int n = kb.nextInt();

            if (n == -1) {
                break;
            }

            count++;
            sum += n;

            if (n > max)
                max = n;
            if (n < min)
                min = n;

            if (n % 2 == 0)
                even++;
            else
                odd++;
        }

            System.out.println("\n--- สรุปผล ---");
            System.out.println("จำนวนตัวเลข: " + count + " ตัว");
            System.out.println("ผลรวม: " + sum);
            System.out.printf("ค่าเฉลี่ย: %.2f\n", avg);
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("เลขคู่: " + even + " ตัว");
            System.out.println("เลขคี่: " + odd + " ตัว");
        }
    }
}
