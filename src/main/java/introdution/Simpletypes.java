package introdution;

public class Simpletypes {

    public static void main(String[] args) {
    int age;
    age = 0;
    System.out.println("wiek to " + age);

    long lottoReward  = 32_000_000L;
    System.out.println("wygrana w lotto " + lottoReward); /* dlaklaracji musi być nazwa i typ */

    short dayOfMonth = 29;
        System.out.println("dzień miesiąca to " + dayOfMonth);
    dayOfMonth = 23;
    System.out.println("dzień miesiąca to " + dayOfMonth);

   final float PI = 3.14F;  /*stała PI z dużej i do stałej nie przypiszemy innej wartosci*/
       System.out.println("liczba PI to " + PI);

    final double aas = 14.64367386663D;
    System.out.println("aas " + aas);

    boolean isPaid = false;
    System.out.println("czy zapłacono rachunek?" + isPaid);
    isPaid = true;
    System.out.println("A moze juz teraz zapłacono rachunek?" + isPaid);


    }
}
