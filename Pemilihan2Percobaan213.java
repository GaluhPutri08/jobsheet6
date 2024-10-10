import java.util.Scanner;

public class Pemilihan2Percobaan213{

    public static void main(String[] args) {

        Scanner input13 =new Scanner(System.in);

        int pilihan_menu, harga = 0;
        String member, jenis_pembayaran;
        double total_bayar = 0, diskon=0;

        System.out.println("---------------------------------");
        System.out.println("========= MENU KAFE JTI =========");
        System.out.println("---------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        pilihan_menu =input13.nextInt();
        input13.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input13.nextLine();
        System.out.println("--------------------------------------");

        //jika pembeli memiliki member //
        if (member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1 ){
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);

            } else if (pilihan_menu == 2){
                harga=3000;
                System.out.println("harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bundling = " + harga);

            } else {
                System.out.println("masukkan pilihan menu dengan benar");
                input13.close();
                return;
            }   
        
        //menghitung total bayar setelah diskon//
        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);  
    }

    //jika tidak memiliki member//
    else if (member.equalsIgnoreCase("n")){
        if (pilihan_menu == 1){
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

        } else if (pilihan_menu ==2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);

        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            input13.close();
            return;
        }
        //menghitung total bayar//
        System.out.println("Total bayar = + harga");

    } else { 
        System.out.println("Member tidak valid");
    }
    System.out.println("------------------------------------");
    
     
    
    System.out.println("Pilih jenis pembayaran (cash/qris): ");
    jenis_pembayaran = input13.nextLine();

    if (jenis_pembayaran.equalsIgnoreCase("qris")){
        total_bayar -= 1000;
        System.out.println("Anda mendapat potongan 1000 karena menggunakan QRIS");

    } else if (!jenis_pembayaran.equalsIgnoreCase("cash")){
    System.out.println("Jenis pembayaran tidak valid");}

     System.out.println("total bayar akhir = " + total_bayar);
     System.out.println("----------------------------------");
     input13.close();

    }

}