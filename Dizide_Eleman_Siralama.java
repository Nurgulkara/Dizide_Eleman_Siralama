import java.util.Arrays;
import java.util.Scanner;
public class Dizide_Eleman_Siralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int boyut;

        System.out.print("Dizinin boyutunu giriniz : ");
        boyut = inp.nextInt();

        int[] dizi = new int[boyut];

        for (int i=0;i<boyut;i++){
            System.out.print("Dizinizin " + (i+1) + ". elemanini giriniz : ");
            dizi[i] = inp.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
    }
}
