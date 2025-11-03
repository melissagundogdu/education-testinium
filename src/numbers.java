import javax.swing.*;

public class numbers {
    public static void main(String[] args) {
        int sayi1= 100;
        int sayi2=50;
        int sum= sayi1 + sayi2;
        long multiply= (long) sayi1*sayi2;

        System.out.println(sum);
        System.out.println(multiply);

        if (multiply<5100 && multiply>4000){
            System.out.println(multiply);}
        else{
            System.out.println("Belirtilen koşulu sağlamadı: " + multiply);
        }


    }
}
