/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan waktu saat ini
 */
package pboif2.pkg10119059.latihan26.waktusaatini;
/**
 *
 * @author Corazon
 */
import java.util.*;
public class PBOIF210119059Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int detik,menit,jam,tanggal,bulan,tahun,hari;
        
        GregorianCalendar date = new GregorianCalendar();
        String namabulan[]={"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        String namahari[]={"Sabtu","Minggu","Senin","Selasa","Rabu","Kamis","Jumat"};
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam =  date.get(Calendar.HOUR_OF_DAY);
        tanggal = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        hari = date.get(Calendar.DAY_OF_WEEK);
        
        System.out.println("Hari ini adalah hari : "+namahari[hari]+", "+tanggal+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik);
    }
    
}
