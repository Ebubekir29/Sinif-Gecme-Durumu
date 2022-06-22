import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mat, fizik, kimya, turkce, muzik,sayac=5, gecmeNotu = 55;
        double ortalama;
        System.out.print("Matematik notunu giriniz : ");
        mat = scan.nextInt();
        System.out.print("Fizik notunu giriniz : ");
        fizik = scan.nextInt();
        System.out.print("Kimya notunu giriniz : ");
        kimya = scan.nextInt();
        System.out.print("Turkce notunu giriniz : ");
        turkce = scan.nextInt();
        System.out.println("Muzik notunu giriniz : ");
        muzik = scan.nextInt();
        if(mat<0||mat>100)
        {
            sayac--;
            mat=0;
        }
        if(fizik<0||fizik>100)
        {
            sayac--;
            fizik=0;
        }
        if(kimya<0||kimya>100)
        {
            sayac--;
            kimya = 0;
        }
        if(turkce<0||turkce>100)
        {
            sayac--;
            turkce =0;
        }
        if(muzik<0||muzik>100)
        {
            sayac--;
            muzik =0;
        }
            ortalama = (mat+fizik+kimya+turkce+muzik)/sayac;
            if (ortalama >= gecmeNotu) {
                System.out.println("Gectiniz...");
                System.out.println("Ortalamaniz : " + ortalama);
            } else {
                System.out.println("Kaldiniz...");
                System.out.println("Ortalamaniz : " + ortalama);
            }
    }
}
