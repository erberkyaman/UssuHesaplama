import java.util.Scanner;
public class UssuHesaplama {
    public static void main(String[] args) {
        int n,k,toplam=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı: ");
        n = input.nextInt();
        System.out.print("Üs Olacak Sayı: ");
        k = input.nextInt();

        for (int i=1;i<=k;i++){
            toplam*= n;
        }

        System.out.print("Cevap: "+ toplam);
    }
}
