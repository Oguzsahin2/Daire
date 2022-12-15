import java.util.Scanner;

public class KdvHesapProgram {
    public static void main(String[] args) {
        double fiyat, kdv1=1.08, kdv2=1.18;
        Scanner input=new Scanner(System.in);
        System.out.println("Ürünün Fiyatını Giriniz : ");
        fiyat= input.nextDouble();
        if      (fiyat>=1000) {
            System.out.println("Ürünün KDV'siz Fiyatı : "+ fiyat +" TL");
            System.out.println("Ürüne Uygulanan KDV Fiyatı : " +((fiyat*kdv1)-fiyat)+" TL");
            System.out.println("Ürünün KDV Dahil Fiyatı : " + (fiyat*kdv1)+(" TL"));
        }
        else if (fiyat<1000) {
            System.out.println("Ürünün KDV'siz Fiyatı : "+ fiyat +" TL");
            System.out.println("Ürüne Uygulanan KDV Fiyatı : "+((fiyat*kdv2)-fiyat)+" TL");
            System.out.println("Ürünün KDV Dahil Fiyatı : " + fiyat * kdv2 +" TL");

        }
    }
}