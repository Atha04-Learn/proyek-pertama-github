import java.util.*;
public class Input {
    public static void main(String[] args) {
       String nama_depan,nama_belakang;
       Scanner keyboard = new Scanner (System.in);
       {
        System.out.print("Masukkan nama depan Anda: ");
        nama_depan=keyboard.nextLine()+" ";
        System.out.print("Masukkan nama belakang Anda: ");
        nama_belakang=keyboard.nextLine();
        System.out.println("Nama lengkap anda adalah: "+nama_depan+nama_belakang);

       } 
    }
}
