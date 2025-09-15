public class variableNumTest {
    public static void main(String[] args) {
        // ==================== VARIABEL SESUAI NOMINAL ====================
        
        // ● Berat badan: 56 kg (bisa menggunakan byte karena < 127)
        byte beratBadan = 56; // kg
        
        // ● Tinggi badan: 160 cm (bisa menggunakan short karena < 32767)
        short tinggiBadan = 160; // cm
        
        // ● Uang di dompet senilai: Rp. 30.000 (cocok pakai int)
        int uangDompet = 30000; // rupiah
        
        // ● Uang di rekening: Rp. 2.100.000.000 (masih dalam range int)
        int uangRekening = 2100000000; // rupiah
        
        // ● Nilai investasi: Rp 30.000.000.000 (perlu long karena > 2.1 miliar)
        long nilaiInvestasi = 30000000000L; // rupiah, note: tambahkan L
        
        // ● Jarak sekolah ke rumah: 5.5 km (perlu double untuk pecahan)
        double jarakSekolah = 5.5; // km
        
        // ==================== VARIABEL TAMBAHAN UNTUK KONTEKS ====================
        // Konstanta untuk konversi
        final double KONVERSI_KM_KE_M = 1000.0;
        final double KONVERSI_CM_KE_M = 0.01;
        
        // Variabel turunan
        double beratBadanDouble = 56.0; // untuk perhitungan lebih presisi
        double tinggiBadanMeter = tinggiBadan * KONVERSI_CM_KE_M;
        double jarakSekolahMeter = jarakSekolah * KONVERSI_KM_KE_M;
        
        // ==================== TAMPILKAN NILAI VARIABEL ====================
        System.out.println("=== DATA NUMERIK ===");
        System.out.println("Berat Badan: " + beratBadan + " kg");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Tinggi Badan (meter): " + tinggiBadanMeter + " m");
        System.out.printf("Uang di Dompet: Rp %,d%n", uangDompet);
        System.out.printf("Uang di Rekening: Rp %,d%n", uangRekening);
        System.out.printf("Nilai Investasi: Rp %,d%n", nilaiInvestasi);
        System.out.println("Jarak Sekolah: " + jarakSekolah + " km");
        System.out.println("Jarak Sekolah (meter): " + jarakSekolahMeter + " m");
        
        // ==================== CONTOH PERHITUNGAN ====================
        System.out.println("\n=== PERHITUNGAN ===");
        
        // Hitung BMI (Body Mass Index)
        double bmi = beratBadanDouble / (tinggiBadanMeter * tinggiBadanMeter);
        System.out.printf("BMI: %.2f%n", bmi);
        
        // Total kekayaan
        long totalKekayaan = uangDompet + uangRekening + nilaiInvestasi;
        System.out.printf("Total Kekayaan: Rp %,d%n", totalKekayaan);
        
        // Biaya transportasi (asumsi Rp 2.000 per km)
        final int BIAYA_PER_KM = 2000;
        double biayaTransportasi = jarakSekolah * BIAYA_PER_KM * 2; // pulang pergi
        System.out.printf("Biaya Transportasi Harian: Rp %,.0f%n", biayaTransportasi);
        
        // ==================== DEMONSTRASI TIPE DATA ====================
        System.out.println("\n=== TIPE DATA YANG DIGUNAKAN ===");
        System.out.println("beratBadan (byte): " + ((Object)beratBadan).getClass().getSimpleName());
        System.out.println("tinggiBadan (short): " + ((Object)tinggiBadan).getClass().getSimpleName());
        System.out.println("uangDompet (int): " + ((Object)uangDompet).getClass().getSimpleName());
        System.out.println("uangRekening (int): " + ((Object)uangRekening).getClass().getSimpleName());
        System.out.println("nilaiInvestasi (long): " + ((Object)nilaiInvestasi).getClass().getSimpleName());
        System.out.println("jarakSekolah (double): " + ((Object)jarakSekolah).getClass().getSimpleName());
    }
}

