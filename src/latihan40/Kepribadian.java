/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan40;

/**
 *
 * @author lutfi
 */
class Kepribadian {
    private static final String pribadi_merah[] = {
        "Periang,","Pemberani,","Berani mengambil resiko dalam setiap langkah,","Menyukai tantangan,","Kurang sabar,","Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,","Memiliki energi kehangatan dan cinta."
    };
    
    private static final String pribadi_hijau[] = {
        "Romantis,","Menyukai hal yang berbau alami dan keindahan,","Teguh pada prinsip,","Menginginkan kesempurnaan,","Mudah cemburu,","Mudah merasa iri,","Menjunjung tinggi suatu nilai toleransi dan kepercayaan."
    };
    
    private static final String pribadi_kuning[] = {
        "Optimis,","Suka bergaul,","Periang,","Senang menolong,","Lincah dan aktif,","Tidak suka meremehkan kekurangan orang lain,","Loyal,","Hangat,","Meskipun karakternya optimis dan idealis, sering kali goyah dan tidak stabil,","Cenderung penakut."
    };
    
    private static final String pribadi_biru[] = {
        "Menyenangkan,","Bijaksana,","Pembawaan diri tenang saat menghadapi masalah,","Dinamis,","Senang Berbagi,","Bersahabat,","Tidak terlalu suka menjadi sorotan banyak orang,","Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai."
    };
    
    private static final String pribadi_ungu[] = {
        "Optimis,","Tidak pernah ragu,","Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,","Memiliki ambisi yang besar,","Memiliki empati yang besar,","Memiliki sisi misterius sebab seringkali menutup perasaannya,","Terkadang bersikap keras kepala dan angkuh."
    };
    
    public static void kepribadian(String[] warna){
        int jml = warna.length;
        for (int i = 0; i < jml; i++) {
            System.out.println((i+1)+". "+warna[i]);
        }
    }
    
    public void cek(String warna_fav){
        Warna warna = new Warna();
        switch (warna_fav.toUpperCase()) {
            case "MERAH":
                System.out.println("Warna Favoritmu adalah "+warna.TXT_MERAH+""+warna_fav+warna.DEFAULT);
                kepribadian(pribadi_merah);
                break;
            case "HIJAU":
                System.out.println("Warna Favoritmu adalah "+warna.TXT_HIJAU+warna_fav+warna.DEFAULT);
                kepribadian(pribadi_hijau);
                break;
            case "KUNING":
                System.out.println("Warna Favoritmu adalah "+warna.TXT_KUNING+warna_fav+warna.DEFAULT);
                kepribadian(pribadi_kuning);
                break;
            case "BIRU":
                System.out.println("Warna Favoritmu adalah "+warna.TXT_BIRU+warna_fav+warna.DEFAULT);
                kepribadian(pribadi_biru);
                break;
            case "UNGU":
                System.out.println("Warna Favoritmu adalah "+warna.TXT_UNGU+warna_fav+warna.DEFAULT);
                kepribadian(pribadi_ungu);
                break;
            default:
                System.out.println(warna.DEFAULT+"Oops... Belum Teridentifikasi");
                break;
        }
    }
}
