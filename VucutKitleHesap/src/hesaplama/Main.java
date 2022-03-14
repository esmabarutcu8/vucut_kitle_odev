package hesaplama;
import java.util.Scanner;
public class Main {
    public static void Main(String[]args){
        double boy,kilo;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        kilo=input.nextDouble();
        double vte=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+vte);


    }
}
