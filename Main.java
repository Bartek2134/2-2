import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner wpisz = new Scanner(System.in);
        int h;
        String znak;
        System.out.print("Podaj z czego stworzyc choinke: ");
        znak=wpisz.next();
        System.out.println();
        System.out.print("Podaj wysokosc choinki: ");
        h=wpisz.nextInt();
        for(int a=0;a<4;a++){
        for(int i=h; i > 0; i--) {
            System.out.println();
            for (int j = i; j > 0; j--)
                System.out.print(" ");
            for (int k = (h - i)+1; k > 0; k--)
                System.out.print(znak);
        }
        }
        }
}