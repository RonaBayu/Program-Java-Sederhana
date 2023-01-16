import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        boolean cek;

        Lingkaran lingkaran1 = new Lingkaran();
        Persegi persegi1 = new Persegi();
        Segitiga segitiga1 = new Segitiga();
        PersegiPanjang persegipanjang1 = new PersegiPanjang();

        System.out.println("==============================================");

        do {
            cek = true;
            try{
                double panjangSisi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang sisi persegi = "));
                persegi1.setPanjangSisi(panjangSisi);
            }catch (Exception e){
                cek=false;
                System.out.println("input salah!");
            }
        }
        while ( cek == false);

        persegi1.luas();
        persegi1.keliling();

        do {
            cek = true;
                try {
                    double jariJari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang jari-jari lingkaran = "));
                    lingkaran1.setJariJari(jariJari);
                } catch (Exception e){
                    cek=false;
                    System.out.println("input salah!");
                }

        } while (cek==false);

        lingkaran1.luas();
        lingkaran1.keliling();

        System.out.println("diameter = " + lingkaran1.getDiameter());

        do {
            cek=true;
                try {
                    double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang alas segitiga = "));
                    double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang tinggi segitiga = "));
                    segitiga1.setAlas(alas);
                    segitiga1.setTinggi(tinggi);
                }catch (Exception e){
                    cek=false;
                    System.out.println("input salah!");
                }
        }while (cek==false);

        segitiga1.luas();
        segitiga1.keliling ();

        do {
            cek=true;
                try {
                    double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang = "));
                    double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang lebar persegi panjang = "));
                    persegipanjang1.setPanjang(panjang);
                    persegipanjang1.setLebar(lebar);
                }catch (Exception e){
                    cek=false;
                    System.out.println("input salah!");
                }
        }while (cek==false);

        persegipanjang1.luas();
        persegipanjang1.keliling();
    }
}
