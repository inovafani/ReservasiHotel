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
        String msg_nama = "Selamat datang di Hotel Blowjob " + pesan.getNama();
        JOptionPane.showMessageDialog(null, msg_nama);
        
        
        
     }
    
    
}
