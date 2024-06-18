import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int k;
        int i, result;
        int total = 0, circle = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Lutfen Bir Sayi Giriniz :");
            k = inp.nextInt();
            if ((k % 2 == 0) && (k % 4 ==0)) {
                total += k;
            }
        } while (k % 2 == 0);

            System.out.println(total);
        }
    }





