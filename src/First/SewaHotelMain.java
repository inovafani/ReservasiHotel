/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class SewaHotelMain {
     public static void main(String[] args) throws IOException{
         //Pemanggilan clas tarifHotel
        tarifHotel pesan=new tarifHotel();
        
        pesan.setNama(JOptionPane.showInputDialog("Masukkan nama :"));
        String msg_nama = "Selamat datang di Hotel INALFANHA " + pesan.getNama();
        JOptionPane.showMessageDialog(null, msg_nama);
        
        String alamat;
        pesan.setAlamat(JOptionPane.showInputDialog("Masukkan alamat :"));
        
        boolean stt=true;
        while(stt){
            String menu = "\nPilih Jenis Kamar\n1. Standart Rp 275.000/hari\n2. Deluxe Rp 500.000/hari\n3. Luxury Rp 700.000/hari";
        }
        
        
        
     }
    
    
}
