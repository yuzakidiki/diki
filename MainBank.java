public class MainBank {
    public static void main(String[] args) {
        System.out.println("--- Sistem Informasi Rekening Bank ---");

        // 1. Bikin 2 objek rekening
        rekeningbank rek1 = new rekeningbank("111222", "haris chudai", 500000);
        rekeningbank rek2 = new rekeningbank("333444", "pio hacker", 200000);

        // 2. Tes validasi saldo minimal di bawah Rp 50.000
        rekeningbank rek3 = new rekeningbank("555666", "memet", 20000);

        System.out.println("\n--- Skenario Transfer ---");
        // 3. Transfer Berhasil
        rek1.transfer(150000, rek2);

        // 4. Transfer Gagal (Saldo tidak cukup)
        rek2.transfer(500000, rek1);

        // 5. Cek Saldo Akhir
        System.out.println("\n--- Saldo Akhir ---");
        System.out.println("Saldo Akhir " + rek1.getNamaPemilik() + ": Rp " + rek1.getSaldo());
        System.out.println("Saldo Akhir " + rek2.getNamaPemilik() + ": Rp " + rek2.getSaldo());

        // 6. Cek Static Variable
        System.out.println("\nTotal Rekening Terdaftar: " + rekeningbank.totalRekening);
    }
}
