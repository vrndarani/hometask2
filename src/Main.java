public class Main {
    public static void main(String[] args) {

// task 1 Variable types

      byte a = 32;
      System.out.println(a);

      short b = 31_839;
      System.out.println(b);

      int cc = 2489;
      System.out.println(cc);

      long d = 345L;
      System.out.println(d);

      float e = 34.5f;
      System.out.println("e");

      double f = 345.9385;
      System.out.println(f);

      char c = 33;
      System.out.println(c);

      boolean g = true;
      System.out.println(g);

// task 2 Boxers' weight

      float boxerOneWeight = 78.3f;
      float boxerTwoWeight = 82.7f;
      float totalWeight = boxerOneWeight + boxerTwoWeight;
      System.out.println("Общий вес боксеров составляет " + totalWeight + " кг.");

      float weightDifference = boxerTwoWeight - boxerOneWeight;
      System.out.println("Разница в весе боксеров составляет " + weightDifference + " кг.");


      // task 3 Breakfast

      short banana = 80;
      banana *= 5;

      short milk = 105;
      milk *= 2;

      short ice = 100;
      ice *= 2;

      short egg = 70;
      egg *= 4;

      float breakfast = (banana + milk + ice + egg);
      breakfast /= 1000;
      System.out.println("Вес завтрака спортсмена " + breakfast + " кг.");

// Task 4 Weight loss journey

      short diet1 = 250;
      short diet2 = 500;
      short weightToLose = 7;
      weightToLose *= 1000;
      int days1 = weightToLose / diet1;
      System.out.println("До результата похудения при сбросе 250г в день " + days1 + " дней");
      int days2 = weightToLose / diet2;
      System.out.println("До результата похудения при сбросе 500г в день " + days2 + " дней");


// Task 5
      int masha = 67_760;
      int denis = 83_690;
      int kristina = 76_230;

      int mashaRaise = (masha / 100 * 10) + masha;
      int denisRaise = (denis / 100 * 10) + denis;
      int kristinaRaise = (kristina / 100 * 10) + kristina;


      int mashaYearOld = masha * 12;
      int denisYearOld = denis * 12;
      int kristinaYearOld = kristina * 12;

      int mashaYearNew = mashaRaise * 12;
      int denisYearNew = denisRaise *12;
      int kristinaYearNew = kristinaRaise *12;

      int mashaYearlyPayDifference = mashaYearNew - mashaYearOld;
      int denisYearlyPayDifference = denisYearNew - denisYearOld;
      int kristinaYearlyPayDifference = kristinaYearNew - kristinaYearOld;

      System.out.println("Masha's monthly pay is now " + mashaRaise + ". The yearly income has increased by " + mashaYearlyPayDifference + ".");
      System.out.println("Denis's monthly pay is now " + denisRaise + ". The yearly income has increased by " + denisYearlyPayDifference + ".");
      System.out.println("Kristina's monthly pay is now " + kristinaRaise + ". The yearly income has increased by " + kristinaYearlyPayDifference + ".");


























    }
}