import java.util.Scanner;

public class Pemilihan2Percobaan113{

    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        int tahun;

        System.out.println("Masukkan Tahun:");
        tahun=input.nextInt();

        if ((tahun % 4) ==0){
            if((tahun % 100) ==0){
              if((tahun % 400 == 0)){
               System.out.println("Tahun Kabisat");

        } else {
              System.out.println("Bukan Tahun Kabisat");
            } 
        }else {
                System.out.println("tahun kabisat");
            }
        }else {
                System.out.println("Bukan Tahun kabisat");
            }

        input.close();
    }
}

