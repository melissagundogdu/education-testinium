public class number {
    public static void main(String[] args) {

        for (int i=1;i<=100;i++ ){
            if(i%4==0){
                continue;
            }
            if(i%2==0){
                System.out.println("Çift sayıya denk gelindi (" + i + "). Döngüden çık:");
                break;
            }
            System.out.println("Yazdırılan sayı:" +i);
        }
        System.out.println("Döngü sonlandı.");
    }
}