package sistemkawalanpilihan;
import java.util.Scanner;
public class SistemkawalanPilihan {

    public static void main(String[] args) {
        String nama_pekerja;
        int bilkerja;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nama: ");
        nama_pekerja=input.nextLine();
        
        do{
            System.out.println("Masukkan bilangan hari bekerja: ");
            bilkerja=input.nextInt();
            
            if (bilkerja > 31){
                System.out.println("Bilangan hari tidak boleh melebihi 31 hari");
            }
        }while (bilkerja > 31);
                int gaji= bilkerja*160;
                       
               System.out.println("Rumusan gaji bulanan bagi "+nama_pekerja);
               System.out.println("Jumlah hari bekerja " +bilkerja);
               System.out.println("GAJI SEBULAN ADALAH " +gaji);
    }
    
}
