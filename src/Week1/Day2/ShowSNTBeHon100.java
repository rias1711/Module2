package Week1.Day2;

public class ShowSNTBeHon100 {
    public static void main(String[] args) {
        int N = 2;
        while (N < 100) {
            int i = 2;
            boolean checked = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    checked = false;
                    break;
                }
                i++;
            }
            if (checked) {
                System.out.println(N);
            }
            N++;
        }
        }
    }
