import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        double sayi1=scanner.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2= scanner.nextDouble();
        System.out.println("Lutfen 4 islemden birini seciniz : \"+\",\"-\",\"/\",\"*\"");
        char islem=scanner.next().charAt(0);
        islemsecme(sayi1,sayi2,islem);
    }
    public static void islemsecme(double sayi1,double sayi2,char islem){
        switch (islem){
            case'+':toplama(sayi1,sayi2);break;
            case'*':carpma(sayi1,sayi2);break;
            case'/':bolme(sayi1,sayi2);break;
            case'-':cikarma(sayi1,sayi2);break;
            default:System.out.println("Hatali secim");}}
    public static void carpma(double a,double b) {System.out.println("Sayilar carpimi"+(a*b));}
    public static void bolme(double a,double b){System.out.println("Sayilir bolumu :"+(a/b));}
    public  static void toplama(double sayi1,double sayi2){System.out.println("Sayilar toplami : "+(sayi1+sayi2));}
    public static void cikarma(double a,double b){System.out.println("Sayilar cikarimi :"+(a-b));}
}