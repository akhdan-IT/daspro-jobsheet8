import java.util.Scanner;

public class Tugas130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
        } while (n < 1);

        int totalAngka = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalAngka++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + totalAngka);
        sc.close();
    }
    
}
