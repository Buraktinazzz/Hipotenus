import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner Veri= new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz: ");
        a= Veri.nextInt();
        System.out.print("2.Kenarı Giriniz: ");
        b= Veri.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.print("Üçgenin Hipotenüsü= " + c);

    }
}
