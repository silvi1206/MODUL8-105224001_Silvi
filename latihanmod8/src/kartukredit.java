public class kartukredit extends pembayaran implements keamanan {
    private String nomorKartu;

    public kartukredit(String nama, Double nominal, String nomorKartu) {
        super(nama, nominal);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran() {
        double admin = nominal * 0.02;
        double total = nominal + admin;

        System.out.println("Biaya Admin : Rp" + admin);
        System.out.println("Total Bayar : Rp" + total);
    }

    @Override
    public boolean autentikasi() {
        System.out.println("Autentikasi PIN berhasil");
        return true; // Contoh: selalu berhasil
    }
}
