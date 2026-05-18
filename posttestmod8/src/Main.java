public class Main {

    public static void main(String[] args) {

        // membuat object pengiriman darat
        PengirimanDarat darat =
                new PengirimanDarat( "DRT-001", 50, 100, "Tronton");

        // membuat object pengiriman udara
        PengirimanUdara udara = new PengirimanUdara("UDR-999",10.0, 800.0,  "GA-123", 5000000.0);

        // update status pengiriman
        darat.updateStatus(
                "Sedang di jalan tol Cipali");

        udara.updateStatus(
                "Transit di Bandara Soekarno-Hatta");

        // array polymorphism
        LayananPengiriman[] daftar = { darat, udara};

        // looping for biasa
        for (int i = 0; i < daftar.length; i++) {

            // ambil object dari array
            LayananPengiriman lp = daftar[i];

            // tampilkan data resi
            lp.tampilkanDataResi();

            // cek apakah object implement LacakKargo
            if (lp instanceof LacakKargo) {

                // casting
                LacakKargo lk =
                        (LacakKargo) lp;

                System.out.println(
                        "Status : " + lk.cekLokasiTerakhir()
                );
            }

            // hitung ongkir dasar
            double total =
                    lp.hitungOngkosKirim();

            // cek apakah object punya asuransi
            if (lp instanceof Asuransi) {

                // casting ke interface
                Asuransi a = (Asuransi) lp;

                // cetak polis
                a.cetakPolis();

                // casting ke PengirimanUdara
                PengirimanUdara pu =(PengirimanUdara) lp;

                // hitung premi
                double premi = a.hitungPremi( pu.getNilaiBarang());

                System.out.println("Premi Asuransi : Rp" + premi );

                // total akhir
                total += premi;
            }

            // tampilkan total tagihan
            System.out.println(
                    "Total Tagihan : Rp" + total );

            System.out.println(
                    "--------------------------------"
            );
        }
    }
}