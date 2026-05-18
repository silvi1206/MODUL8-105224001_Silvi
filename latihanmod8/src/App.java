import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
         ArrayList<pembayaran> daftar = new ArrayList<>();

        daftar.add(new kartukredit("Andi", 100000.0, "1234-5678-9012-3456"));
        daftar.add(new Ewallet("Budi", 50000.0, "081234567890"));

        for (int i = 0; i < daftar.size(); i++) {

            pembayaran p = daftar.get(i);

            p.tampilkanDetail();

            if (p instanceof keamanan) {

                keamanan k = (keamanan) p;

                if (k.autentikasi()) {
                    p.prosesPembayaran();
                }
            }

            System.out.println("------------------");
        }
    }
}
    

