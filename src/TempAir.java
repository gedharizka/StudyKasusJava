import java.util.Scanner;

public class TempAir {
    public static void main(String[] args) {

        int T;

        System.out.println("Contoh Program IF tiga kasus");
        System.out.println("Temperatur (der. C) =");

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        if (T < 0){
            System.out.println("Wujud air beku " +T);
        }else if ((0<=T)&&(T<=100)){
            System.out.println("Wujud air cair " + T);
        }else if(T> 100){
            System.out.println("Wujud air uap " + T);
        }
    }
}
