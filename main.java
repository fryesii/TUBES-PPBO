package kasir_laundry;
import java.util.Scanner;

public class LaundryMain {
    public static void main(String[] args) {
        String name;
        int pil,plus;
        double berat,bayar;
        Scanner input = new Scanner(System.in);

        cuci_biasa obj = new cuci_biasa();
        setrika obj1 = new setrika();
        cuci_setrika obj2 = new cuci_setrika();

        System.out.println("====== PEMBAYARAN LOUNDRY MIZUZU ======");
        System.out.println("Jenis Layanan Loundry :");
        System.out.println("1. Cuci");
        System.out.println("2. Setrika");
        System.out.println("3. Cuci Setrika");
        System.out.print("Masukan jenis layanan yang anda gunakan : ");
        pil = input.nextInt();

        switch (pil) {
            case 1 -> {
                //            cuci_biasa obj = new cuci_biasa();
                System.out.println("jenis Loundy : ");
                System.out.println("1. Reguler");
                System.out.println("2. Express");
                System.out.print("Masukan pilihan anda : ");
                plus = input.nextInt();
                System.out.print("Nama : ");
                name = input.next();
                obj.setName(name);
                System.out.print("Berat Pakaian : ");
                berat = input.nextDouble();
                obj.setBerat(berat);
                bayar = obj.getBerat();
                if(plus == 1){
                    System.out.println("Tagihan " + obj.getName() + " sebesar Rp." + bayar);
                }else if (plus == 2){
                    System.out.println("Tagihan " + obj.getName() + " sebesar Rp." + (bayar*1.5));
                }
            }
            case 2 -> {
                //            setrika obj = new setrika();
                System.out.println("jenis Loundy : ");
                System.out.println("1. Reguler");
                System.out.println("2. Express");
                System.out.print("Masukan pilihan anda : ");
                plus = input.nextInt();
                System.out.print("Nama : ");
                name = input.next();
                obj1.setName(name);
                System.out.print("Berat Pakaian : ");
                berat = input.nextDouble();
                obj1.setBerat(berat);
                bayar = obj1.getBerat();
                if(plus == 1){
                    System.out.println("Tagihan " + obj1.getName() + " sebesar Rp." + bayar);
                }else if (plus == 2){
                    System.out.println("Tagihan " + obj1.getName() + " sebesar Rp." + (bayar*1.5));
                }
            }
            case 3 -> {
                //            cuci_setrika obj = new cuci_setrika();
                System.out.println("jenis Loundy : ");
                System.out.println("1. Reguler");
                System.out.println("2. Express");
                System.out.print("Masukan pilihan anda : ");
                plus = input.nextInt();
                System.out.print("Nama : ");
                name = input.next();
                obj2.setName(name);
                System.out.print("Berat Pakaian : ");
                berat = input.nextDouble();
                obj2.setBerat(berat);
                bayar = obj2.getBerat();
                if(plus == 1){
                    System.out.println("Tagihan " + obj2.getName() + " sebesar Rp." + bayar);
                }else if (plus == 2){
                    System.out.println("Tagihan " + obj2.getName() + " sebesar Rp." + (bayar*1.5));
                }
            }
            default -> System.out.println("PILIHAN TIDAK TERSEDIA !");
        }

    }
}
