import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int adet, number, min = 1, max = 1;

        System.out.println("Ne kadar sayi gireceksiniz?: ");
        adet = scan.nextInt();

        for (int i = 1;  i<= adet; i++){
            System.out.print(i +" . sayiyi giriniz: ");
            number = scan.nextInt();
            if (i==1){

                max=number;
                min=number;
            }
            if (number > max){
                max= number;
            }
            if (number<min){
                min=number;
            }
        }

        System.out.println("Max: "+ max);
        System.out.print("Min: "+ min);
    }
}
