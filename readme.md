# Java OOP - Simulasi Rekening Bank

Project kecil-kecilan buat nyoba konsep dasar OOP Java: Enkapsulasi, Static Variable, sama logika Transfer antar objek.

### 1. `rekeningbank.java`
File ini isinya struktur data sama aturan main akun banknya:
- **Proteksi Data (`private`)**: Variabel `noRekening`, `namaPemilik`, dan `saldo` sengaja di-private biar aman dan ga bisa langsung diubah dari luar.
- **Counter Rekening (`static`)**: Pake `totalRekening` buat ngitung otomatis jumlah akun yang pernah dibikin.
- **Validasi Saldo**: Pas bikin akun baru, saldo diawalin lewat `setSaldo()`. Kalau saldonya di bawah **Rp 50.000**, sistem bakal nolak dan set saldonya jadi 0.
- **Method `transfer()`**: Kirim uang dari satu akun ke akun lain. Saldo pengirim dipotong, saldo penerima ditambah (`tujuan.saldo += nominal`). Kalau saldonya ga nampung, transaksi otomatis gagal.

### 2. `MainBank.java`
File utama buat ngetes jalannya program:
- Bikin akun `rek1` (haris chudai, 500rb) sama `rek2` (pio hacker, 200rb).
- Coba bikin `rek3` (memet, 20rb) buat ngetes apa sistemnya beneran nolak saldo di bawah 50rb.
- Tes skenario transfer berhasil (150rb) dan transfer gagal gara-gara kurang saldo.
- Nampilin saldo akhir plus total akun yang ada di sistem.

---
