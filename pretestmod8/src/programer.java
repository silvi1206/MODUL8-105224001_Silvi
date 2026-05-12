public class programer extends karyawan {
    private Double gajipokok;

    public programer(String nama, Double gajipokok) {
        super(nama);
        this.gajipokok = gajipokok;
    }

    @Override
    public void hitungGaji() {
        System.out.println("Gaji Programer " + nama + ": " + gajipokok);
    }

}
