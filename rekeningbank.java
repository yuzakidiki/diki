public class rekeningbank {
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    public static int totalRekening = 0;

    public rekeningbank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        setSaldo(saldoAwal);
        totalRekening++;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 50000) {
            this.saldo = saldoBaru;
        } else {
            System.out.println("ERROR: Saldo awal " + this.namaPemilik + " kurang dari Rp 50.000!");
            this.saldo = 0;
        }
    }

    public String getNoRekening() {
        return this.noRekening;
    }

    // METHOD YANG TADI KETINGGALAN
    public String getNamaPemilik() {
        return this.namaPemilik;
    }

    public void transfer(double nominal, rekeningbank tujuan) {
        if (nominal <= this.saldo) {
            this.saldo -= nominal;
            tujuan.saldo += nominal; // Nambahin saldo penerima
            System.out.println("Transfer Rp " + nominal + " dari " + this.namaPemilik + " ke " + tujuan.namaPemilik + " BERHASIL.");
        } else {
            System.out.println("ERROR: Transfer GAGAL! Saldo " + this.namaPemilik + " tidak mencukupi.");
        }
    }
}