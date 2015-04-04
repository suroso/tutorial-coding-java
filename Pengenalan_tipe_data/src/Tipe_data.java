/*
    Kunjungi terus dolanan-java.blogspot.com
*/

// Kelas utama 
public class Tipe_data {
    // Method main
    public static void main(String[] args) {
        
        /*
        TIPE DATA BILANGAN BULAT
        >>  Byte , Short , Int dan Long
        */
        
        // Min dan Max dari tipe data byte
        byte min_byte = Byte.MIN_VALUE;
        byte max_byte = Byte.MAX_VALUE;
        
        // Min dan Max dari tipe data short
        short min_short = Short.MIN_VALUE;
        short max_short = Short.MAX_VALUE;
        
        // Min dan Max dari tipe data int
        int min_int = Integer.MIN_VALUE;
        int max_int = Integer.MAX_VALUE;
        
        // Min dan Max dari tipe data long
        long min_long = Long.MIN_VALUE;
        long max_long = Long.MAX_VALUE;
        
        // Untuk melihat Isi Variabel
        System.out.println("Tipe Data Bilangan Bulat (Tanpa Koma)");
        System.out.println("");
        System.out.println("MIN BYTE = " + min_byte);
        System.out.println("MAX BYTE = " + max_byte);
        System.out.println("");
        System.out.println("MIN SHORT = " + min_short);
        System.out.println("MAX SHORT = " + max_short);
        System.out.println("");
        System.out.println("MIN INT = " + min_int);
        System.out.println("MAX INT = " + max_int);
        System.out.println("");
        System.out.println("MIN LONG = " + min_long);
        System.out.println("MAX LONG = " + max_long);
        System.out.println("");
        System.out.println("============================================");
        
        /*
        Bilangan pecahan
        >> Double dan Float
        */
        
        // Min dan Max dari tipe data double
        double min_dob = Double.MIN_VALUE;
        double max_dob = Double.MAX_VALUE;
        
        // Min dan Max dari tipe data float
        float min_float = Float.MIN_VALUE;
        float max_float = Float.MAX_VALUE;
        
        // Untuk Melihat Isi variabel
        System.out.println("UNTUK TIPE DATA BILANGAN PECAHAN (DENGAN KOMA)");
        System.out.println("");
        System.out.println("MIN DOUBLE = " + min_dob);
        System.out.println("MAX DOUBLE = " + max_dob);
        System.out.println("");
        System.out.println("MIN FLOAT = " + min_float);
        System.out.println("MAX FLOAT = " + max_float);
        System.out.println("");
        System.out.println("============================================");
        
        /* 
        Untuk Tipe Data Kata
        >> String
        */
        
        String a = " Saya ";
        String b = " Belajar ";
        String c = " Java ";
        String d = a + b +c ;
        
        // Untuk melihat isi variabel
        System.out.println("UNTUK TIPE DATA STRING");
        System.out.println("");
        System.out.println(d);
        System.out.println("");
        System.out.println("============================================");
        
        /*
        Untuk Tipe data Karakter
        >> Char
        */
        char A = 'a';
        int B =(int) A; // Casting atau perubahan tipe data dari char ke int
                        // Untuk Mendapatkan kode asci
        
        // Untuk melihat isi karakter
        System.out.println("UNTUK TIPE DATA CHAR");
        System.out.println("");
        System.out.println("isi variabel A = " + A);
        System.out.println("isi variabel B (casting dari variabel A ke Int) = " + B);
        System.out.println("");
        System.out.println("============================================");
        
        /*
        Untuk tipe data benar atau salah (logika)
        >> Boolean
        */
        
        boolean cek = false;
        
        // Untuk melihat isi variabel
        System.out.println("UNTUK TIPE DATA BOOLEAN");
        System.out.println("");
        System.out.println(cek);
    }
}
