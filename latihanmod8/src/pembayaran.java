public abstract class pembayaran {
    protected String nama;
    protected Double nominal;

    public pembayaran(String nama, Double nominal) {
        this.nama = nama;
        this.nominal = nominal;
    }

    public void tampilkanDetail() {
        System.out.println("Nama: " + nama);
        System.out.println("Nominal: " + nominal);
    }

   public abstract void prosesPembayaran();
    
}
