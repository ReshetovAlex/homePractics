package home.work2;

public class bilet {
    public static boolean getBilet(int bilet) {
        //bilet = 100001;
        boolean chastliviyBilet;
        int sumPervoyPoloviny;
        int sumVtoroyPoloviny;
        if ((bilet < 1000000) && (bilet > 99999)) {
            int x6 = bilet / 100000;
            int x5 = bilet % 100000 / 10000;
            int x4 = bilet % 10000 / 1000;
            int x3 = bilet % 1000 / 100;
            int x2 = bilet % 100 / 10;
            int x1 = bilet % 10;
            sumPervoyPoloviny = x6 + x5 + x4;
            sumVtoroyPoloviny = x3 + x2 + x1;
            if (sumPervoyPoloviny == sumVtoroyPoloviny) {
                chastliviyBilet = true;
                System.out.println("Билет счатливый");
            } else {
                chastliviyBilet = false;
                System.out.println("Билет не счастливый, суммы половинок не равны");
            }
        } else {
            chastliviyBilet = false;
            System.out.println("Билет не счастливый");
        }
        return chastliviyBilet;
    }
}
