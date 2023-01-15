public class CilsyAutoShop  {
    public static void main(String[] args) {

        System.out.println("======================== Daftar Harga Motor ========================");

        System.out.println("\nMotor Yamaha");
        Yamaha r15 = new Yamaha(199,32_000_000, "biru", 150);
        r15.setNama("R15");
        r15.display();

        System.out.println("\nMotor Honda");
        Honda cbr1000 = new Honda(299, 600_000_000, "merah", 2022,10);
        cbr1000.setNama("CBR1000");
        cbr1000.display();

        Honda vario = new Honda (189,22_000_000, "putih", 2021,15);
        vario.setNama("Vario");
        vario.display();

        System.out.println("\nMotor");
        Motor custom = new Motor(100,21_000_000,"hijau");
        custom.setNama("Custom");
        custom.display();

        System.out.println("\nMotor Harley");
        Harley harley1 = new Harley(159,200_000_000,"biru", 2100);
        harley1.setNama("Harley Davidson");
        harley1.display();

    }
}
