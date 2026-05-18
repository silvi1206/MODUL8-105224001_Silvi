public class Ewallet  extends pembayaran implements keamanan {
    private String nomorPonsel;

    public Ewallet(String nama, Double nominal, String nomorPonsel) {
        super(nama, nominal);
        this.nomorPonsel = nomorPonsel;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Tidak ada biaya admin");
        System.out.println("Total Bayar : Rp" + nominal);
    }

    @Override
    public boolean autentikasi() {
        System.out.println("Autentikasi berhasil");
        return true;
    }
    
}
