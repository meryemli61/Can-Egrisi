import java.util.Scanner;

public class Main {

    public static class Ogrenci {
        String adSoyad;
        int id;
    }

    public static class Dersler {
        String dersAdi;
        int Sinav1;
        int Sinav2;
    }

    public static void main(String[] args) {

        Dersler ders1ogr1 = new Dersler();
        Dersler ders2ogr1 = new Dersler();
        Ogrenci ogr1 = new Ogrenci();

        ogr1.adSoyad = "Ahmet Dogan";
        ogr1.id = 123;
        ders1ogr1.dersAdi = "Matematik";
        ders1ogr1.Sinav1 = 40;
        ders1ogr1.Sinav2 = 66;
        ders2ogr1.dersAdi = "Kimya";
        ders2ogr1.Sinav1 = 72;
        ders2ogr1.Sinav2 = 88;
        int ders1ogr1Ortalama = (ders1ogr1.Sinav1 + ders1ogr1.Sinav2)/2;
        int ders2ogr1Ortalama = (ders2ogr1.Sinav1 + ders2ogr1.Sinav2)/2;



        Dersler ders1ogr2 = new Dersler();
        Dersler ders2ogr2 = new Dersler();
        Ogrenci ogr2 = new Ogrenci();

        ogr2.adSoyad = "Fatma Yilmaz";
        ogr2.id = 124;
        ders1ogr2.dersAdi = "Matematik";
        ders1ogr2.Sinav1 = 55;
        ders1ogr2.Sinav2 = 85;
        ders2ogr2.dersAdi = "Kimya";
        ders2ogr2.Sinav1 = 90;
        ders2ogr2.Sinav2 = 66;
        int ders1ogr2Ortalama = (ders1ogr2.Sinav1 + ders1ogr2.Sinav2)/2;
        int ders2ogr2Ortalama = (ders2ogr2.Sinav1 + ders2ogr2.Sinav2)/2;



        Dersler ders1ogr3 = new Dersler();
        Dersler ders2ogr3 = new Dersler();
        Ogrenci ogr3 = new Ogrenci();

        ogr3.adSoyad = "Ayse Kaya";
        ogr3.id = 125;
        ders1ogr3.dersAdi = "Matematik";
        ders1ogr3.Sinav1 = 100;
        ders1ogr3.Sinav2 = 96;
        ders2ogr3.dersAdi = "Kimya";
        ders2ogr3.Sinav1 = 56;
        ders2ogr3.Sinav2 = 32;
        int ders1ogr3Ortalama = (ders1ogr3.Sinav1 + ders1ogr3.Sinav2)/2;
        int ders2ogr3Ortalama = (ders2ogr3.Sinav1 + ders2ogr3.Sinav2)/2;




        Dersler ders1ogr4 = new Dersler();
        Dersler ders2ogr4 = new Dersler();
        Ogrenci ogr4 = new Ogrenci();

        ogr4.adSoyad = "Mehmet Demir";
        ogr4.id = 126;
        ders1ogr4.dersAdi = "Matematik";
        ders1ogr4.Sinav1 = 20;
        ders1ogr4.Sinav2 = 34;
        ders2ogr4.dersAdi = "Kimya";
        ders2ogr4.Sinav1 = 46;
        ders2ogr4.Sinav2 = 38;
        int ders1ogr4Ortalama = (ders1ogr4.Sinav1 + ders1ogr4.Sinav2)/2;
        int ders2ogr4Ortalama = (ders2ogr4.Sinav1 + ders2ogr4.Sinav2)/2;



        int MatematikOrtalama = (ders1ogr1Ortalama + ders1ogr2Ortalama + ders1ogr3Ortalama + ders1ogr4Ortalama)/4;


        int KimyaOrtalama = ( ders2ogr1Ortalama + ders2ogr2Ortalama + ders2ogr3Ortalama + ders2ogr4Ortalama)/4;



        int DD = MatematikOrtalama + ((100 - MatematikOrtalama) / 6);
        int DC = DD + ((100 - MatematikOrtalama) / 6);
        int CC = DC + ((100 - MatematikOrtalama) / 6);
        int CB = CC + ((100 - MatematikOrtalama) / 6);
        int BB = CB + ((100 - MatematikOrtalama) / 6);
        int BA = BB + ((100 - MatematikOrtalama) / 6);
        int AA = BA + ((100 - MatematikOrtalama) / 6);



        int kimyaDD = KimyaOrtalama + ((100 - KimyaOrtalama) / 6);
        int kimyaDC = DD + ((100 - KimyaOrtalama) / 6);
        int kimyaCC = DC + ((100 - KimyaOrtalama) / 6);
        int kimyaCB = CC + ((100 - KimyaOrtalama) / 6);
        int kimyaBB = CB + ((100 - KimyaOrtalama) / 6);
        int kimyaBA = BB + ((100 - KimyaOrtalama) / 6);
        int kimyaAA = BA + ((100 - KimyaOrtalama) / 6);


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Ogrenci Numarasini Giriniz: ");
        int id = scan.nextInt();

        if (id == 123) {
            System.out.println("Ogrenci Adi : " + ogr1.adSoyad);
            System.out.println("Ders1 Adi : " + ders1ogr1.dersAdi);

            if (MatematikOrtalama > ders1ogr1Ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + ders1ogr1Ortalama);

            }
            if (ders1ogr1Ortalama > BA) {
                System.out.println("Harf Notunuz : AA");

            } else if (ders1ogr1Ortalama > BB) {
                System.out.println("Harf Notunuz : BA");

            } else if (ders1ogr1Ortalama > CB) {
                System.out.println("Harf Notunuz : BB");

            } else if (ders1ogr1Ortalama > CC) {
                System.out.println("Harf Notunuz : CB");

            } else if (ders1ogr1Ortalama > DC) {
                System.out.println("Harf Notunuz : CC");

            } else if (ders1ogr1Ortalama > DD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }

            System.out.println("Ders2 Adi : " + ders2ogr1.dersAdi);

            if (KimyaOrtalama > ders2ogr1Ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + ders2ogr1Ortalama);

            }
            if (ders2ogr1Ortalama > kimyaBA) {
                System.out.println("Harf Notunuz : AA");

            } else if (ders2ogr1Ortalama > kimyaBB) {
                System.out.println("Harf Notunuz : BA");

            } else if (ders2ogr1Ortalama > kimyaCB) {
                System.out.println("Harf Notunuz : BB");

            } else if (ders2ogr1Ortalama > kimyaCC) {
                System.out.println("Harf Notunuz : CB");

            } else if (ders2ogr1Ortalama > kimyaDC) {
                System.out.println("Harf Notunuz : CC");

            } else if (ders2ogr1Ortalama > kimyaDD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }

        }




        if (id == 124) {
            System.out.println("Ogrenci Adi : " + ogr2.adSoyad);
            System.out.println("Ders1 Adi : " + ders1ogr2.dersAdi);

            if (MatematikOrtalama > ders1ogr2Ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + ders1ogr2Ortalama);

            }
            if (ders1ogr2Ortalama > BA) {
                System.out.println("Harf Notunuz : AA");

            } else if (ders1ogr2Ortalama > BB) {
                System.out.println("Harf Notunuz : BA");

            } else if (ders1ogr2Ortalama > CB) {
                System.out.println("Harf Notunuz : BB");

            } else if (ders1ogr2Ortalama > CC) {
                System.out.println("Harf Notunuz : CB");

            } else if (ders1ogr2Ortalama > DC) {
                System.out.println("Harf Notunuz : CC");

            } else if (ders1ogr2Ortalama > DD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }

            System.out.println("Ders2 Adi : " + ders2ogr2.dersAdi);

            if (KimyaOrtalama > ders2ogr2Ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + ders2ogr2Ortalama);

            }
            if (ders2ogr2Ortalama > kimyaBA) {
                System.out.println("Harf Notunuz : AA");

            } else if (ders2ogr2Ortalama > kimyaBB) {
                System.out.println("Harf Notunuz : BA");

            } else if (ders2ogr2Ortalama > kimyaCB) {
                System.out.println("Harf Notunuz : BB");

            } else if (ders2ogr2Ortalama > kimyaCC) {
                System.out.println("Harf Notunuz : CB");

            } else if (ders2ogr2Ortalama > kimyaDC) {
                System.out.println("Harf Notunuz : CC");

            } else if (ders2ogr2Ortalama > kimyaDD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }

        }



        if (id == 125) {
            System.out.println("Ogrenci Adi : " + ogr3.adSoyad);
            System.out.println("Ders1 Adi : " + ders1ogr3.dersAdi);

            if (MatematikOrtalama > ders1ogr3Ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + ders1ogr3Ortalama);

            }
            if (ders1ogr3Ortalama > BA) {
                System.out.println("Harf Notunuz : AA");

            } else if (ders1ogr3Ortalama > BB) {
                System.out.println("Harf Notunuz : BA");

            } else if (ders1ogr3Ortalama > CB) {
                System.out.println("Harf Notunuz : BB");

            } else if (ders1ogr3Ortalama > CC) {
                System.out.println("Harf Notunuz : CB");

            } else if (ders1ogr3Ortalama > DC) {
                System.out.println("Harf Notunuz : CC");

            } else if (ders1ogr3Ortalama > DD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }

            System.out.println("Ders2 Adi : " + ders2ogr3.dersAdi);

            if (KimyaOrtalama > ders2ogr3Ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + ders2ogr3Ortalama);

            }
            if (ders2ogr3Ortalama > kimyaBA) {
                System.out.println("Harf Notunuz : AA");

            } else if (ders2ogr3Ortalama > kimyaBB) {
                System.out.println("Harf Notunuz : BA");

            } else if (ders2ogr3Ortalama > kimyaCB) {
                System.out.println("Harf Notunuz : BB");

            } else if (ders2ogr3Ortalama > kimyaCC) {
                System.out.println("Harf Notunuz : CB");

            } else if (ders2ogr3Ortalama > kimyaDC) {
                System.out.println("Harf Notunuz : CC");

            } else if (ders2ogr3Ortalama > kimyaDD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }

        }




        if (id == 126) {
            System.out.println("Ogrenci Adi : " + ogr4.adSoyad);
            System.out.println("Ders1 Adi : " + ders1ogr4.dersAdi);

            if (MatematikOrtalama > ders1ogr4Ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + ders1ogr4Ortalama);

            }
            if (ders1ogr4Ortalama > BA) {
                System.out.println("Harf Notunuz : AA");

            } else if (ders1ogr4Ortalama > BB) {
                System.out.println("Harf Notunuz : BA");

            } else if (ders1ogr4Ortalama > CB) {
                System.out.println("Harf Notunuz : BB");

            } else if (ders1ogr4Ortalama > CC) {
                System.out.println("Harf Notunuz : CB");

            } else if (ders1ogr4Ortalama > DC) {
                System.out.println("Harf Notunuz : CC");

            } else if (ders1ogr4Ortalama > DD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }

            System.out.println("Ders2 Adi : " + ders2ogr4.dersAdi);

            if (KimyaOrtalama > ders2ogr4Ortalama) {
                System.out.println("Dersten kaldiniz");
            } else {
                System.out.println("Geçtiniz");
                System.out.println("Ders Ortalamaniz : " + ders2ogr4Ortalama);

            }
            if (ders2ogr4Ortalama > kimyaBA) {
                System.out.println("Harf Notunuz : AA");

            } else if (ders2ogr4Ortalama > kimyaBB) {
                System.out.println("Harf Notunuz : BA");

            } else if (ders2ogr4Ortalama > kimyaCB) {
                System.out.println("Harf Notunuz : BB");

            } else if (ders2ogr4Ortalama > kimyaCC) {
                System.out.println("Harf Notunuz : CB");

            } else if (ders2ogr4Ortalama > kimyaDC) {
                System.out.println("Harf Notunuz : CC");

            } else if (ders2ogr4Ortalama > kimyaDD) {
                System.out.println("Harf Notunuz : DC");

            } else {
                System.out.println("Harf notunuz : DD");
            }

        }




    }
}