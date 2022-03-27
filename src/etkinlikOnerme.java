import java.util.Scanner;
public class etkinlikOnerme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklığı Giriniz:");
        heat=input.nextInt();
        if (heat<5){
            System.out.print("Kayak yapabilirsin.");
        }else if (heat<15){
            System.out.print("Sinemaya gidebilirsin.");
        }else if (heat<25){
            System.out.print("Pikniğe gidebilirsin.");
        }else {
            System.out.print("Yüzmeye gidebilirsin");
        }

    }
}
