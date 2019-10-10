/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
         System.out.print("\nEnter an integer: ");
         int integerSign = in.nextInt();

         if(integerSign > 0) {
           System.out.println("\nPositive.");
         } else if(integerSign < 0) {
           System.out.println("\nNegative.");
         } else if(integerSign == 0) {
           System.out.println("\nZero.");
         }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
         System.out.print("\nEnter an integer: ");
         int integerParity = in.nextInt();

         if((integerParity % 2) == 0) {
           System.out.println("\nEven.");
         } else {
           System.out.println("\nOdd.");
         }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      System.out.println("\nEnter three integers.");
         System.out.print("\nEnter integer: ");
         int integer1 = in.nextInt();
         System.out.print("Enter integer: ");
         int integer2 = in.nextInt();
         System.out.print("Enter integer: ");
         int integer3 = in.nextInt();

         if(integer1 == integer2 && integer2 == integer3) {
           System.out.println("\nSame.");
         } else if(integer1 < integer2 && integer2 < integer3) {
             System.out.println("\nStrictly increasing.");
         } else if(integer1 <= integer2 && integer2 <= integer3) {
             System.out.println("\nIncreasing.");
         } else if(integer1 > integer2 && integer2 > integer3) {
           System.out.println("\nStrictly decreasing.");
         } else if(integer1 >= integer2 && integer2 >= integer3) {
           System.out.println("\nDecreasing.");
         } else {
           System.out.println("\nUnordered.");
         }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {
          final double aGrade = 4.00;
          final double bGrade = 3.00;
          final double cGrade = 2.00;
          final double dGrade = 1.00;
          final double fGrade = 0.00;
          final double pointDifference = 0.33;
          String plusMinus = "";
          double gpa = 0.00;

          System.out.print("\nEnter a letter grade: ");
          in.nextLine();
          String gradeInput = in.nextLine();
          gradeInput = gradeInput.trim();
          gradeInput = gradeInput.toUpperCase();
          String firstLetter = gradeInput.substring(0, 1);
          if(gradeInput.length() == 2) {
            plusMinus = gradeInput.substring(1, 2);
          }
          if(gradeInput.length() <= 2 && gradeInput.length() > 0 && (firstLetter.equals("A") || firstLetter.equals("B") || firstLetter.equals("C") || firstLetter.equals("D") || firstLetter.equals("F")) && (plusMinus.equals("") || plusMinus.equals("+") || plusMinus.equals("-")) && !gradeInput.equals("F+") && !gradeInput.equals("F-")) {
            if(plusMinus.equals("+")) {
              gpa += pointDifference;
            } else if(plusMinus.equals("-")) {
              gpa -= pointDifference;
            }
            if(firstLetter.equals("A")) {
              gpa += aGrade;
              if(gpa > 0) {
                gpa -= pointDifference;
              }
            } else if(firstLetter.equals("B")) {
              gpa += bGrade;
            } else if(firstLetter.equals("C")) {
              gpa += cGrade;
            } else if(firstLetter.equals("D")) {
              gpa += dGrade;
            } else if(firstLetter.equals("F")) {
              gpa += fGrade;
              if(gpa < 0) {
                gpa += pointDifference;
              }
            }
            System.out.printf("\nYour GPA is %.2f.\n", gpa);
          } else {
            System.out.println("\nThat's not a valid letter grade.");
          }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
      System.out.print("\nEnter a grade: ");
      double numberGrade = in.nextDouble();
      char letterGrade2 = 'X';
      String grammar = "";
      int highA = 100;
      int lowA = 90;
      int highB = 89;
      int lowB = 80;
      int highC = 79;
      int lowC = 70;
      int highD = 69;
      int lowD = 60;
      int highF = 59;
      int lowF = 0;

      if(numberGrade >= lowF && numberGrade <= highA) {
        if(numberGrade >= lowA && numberGrade <= highA) {
          letterGrade2 = 'A';
          grammar = "an";
        } else if(numberGrade >= lowB && numberGrade <= highB) {
          letterGrade2 = 'B';
          grammar = "a";
        } else if(numberGrade >= lowC && numberGrade <= highC) {
          letterGrade2 = 'C';
          grammar = "a";
        } else if(numberGrade >= lowD && numberGrade <= highD) {
          letterGrade2 = 'D';
          grammar = "a";
        } else if(numberGrade >= lowF && numberGrade <= highF) {
          letterGrade2 = 'F';
          grammar = "an";
        }
        System.out.printf("\nYou received " + grammar + " " + letterGrade2 +  ".\n");
      } else if(numberGrade < lowF) {
        System.out.println("\nGrades below 0 are invalid.");
      } else if(numberGrade > 100) {
        System.out.println("\nGrades above 100 are invalid.");
}
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
      System.out.print("\nEnter a card: ");
      in.nextLine();
      String card = in.nextLine();
      String rank = card.substring(0, 1).toUpperCase();
      String suit = card.substring(1, 2).toUpperCase();
      String rankList = "";
      String suitType = "";

      if(card.length() == 2 && (rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A")) && (suit.equals("C") || suit.equals("H") || suit.equals("D") || suit.equals("S"))) {
        if (rank.equals("2")) {
          rankList = "Two";
        } else if (rank.equals("3")) {
          rankList = "Three";
        } else if (rank.equals("4")) {
          rankList = "Four";
        } else if (rank.equals("5")) {
          rankList = "Five";
        } else if (rank.equals("6")) {
          rankList = "Six";
        } else if (rank.equals("7")) {
          rankList = "Seven";
        } else if (rank.equals("8")) {
          rankList = "Eight";
        } else if (rank.equals("9")) {
          rankList = "Nine";
        } else if (rank.equals("T")) {
          rankList = "Ten";
        } else if (rank.equals("J")) {
          rankList = "Jack";
        } else if (rank.equals("Q")) {
          rankList = "Queen";
        } else if (rank.equals("K")) {
          rankList = "King";
        } else if (rank.equals("A")) {
          rankList = "Ace";
        }
        if (suit.equals("C")) {
          suitType = "Clubs";
        } else if (suit.equals("D")) {
          suitType = "Diamonds";
        } else if (suit.equals("H")) {
          suitType = "Hearts";
        } else if (suit.equals("S")) {
          suitType = "Spades";
        }
        System.out.println("\n" + rankList + " of " + suitType + ".");
      } else if(card.length() != 2) {
        System.out.println("\nThat's not a valid card.");
      } else if(!(rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A")) && !(suit.equals("C") || suit.equals("H") || suit.equals("D") || suit.equals("S"))) {
        System.out.println("\nThat's not a valid rank or a valid suit.");
      } else if(!(rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") || rank.equals("7") || rank.equals("8") || rank.equals("9") || rank.equals("T") || rank.equals("J") || rank.equals("Q") || rank.equals("K") || rank.equals("A"))) {
        System.out.println("\nThat's not a valid rank.");
      } else if(!(suit.equals("C") || suit.equals("H") || suit.equals("D") || suit.equals("S"))) {
        System.out.println("\nThat's not a valid suit.");
      }
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
      System.out.print("\nEnter a year: ");
      int testLeapYear = in.nextInt();
      String isOrIsNot = "";

      if (testLeapYear % 4 == 0 && (testLeapYear % 100 != 0 | testLeapYear % 400 == 0)) {
        isOrIsNot = " is ";
      } else {
        isOrIsNot = " is not ";
      }
      System.out.println("\n" + testLeapYear + isOrIsNot + "a leap year.");
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
      System.out.print("\nEnter a temperature: ");
      double temperature = in.nextDouble();
      System.out.print("Enter a scale: ");
      in.nextLine();
      String scale = in.nextLine();
      scale = scale.toUpperCase();
      String state = "";
      int fahrenheitFreezingPoint = 32;
      int fahrenheitBoilingPoint = 212;
      int celsiusFreezingPoint = 0;
      int celsiusBoilingPoint = 100;

      if (scale.equals("F") || scale.equals("C")) {
        if (scale.equals("F")) {
          if (temperature <= fahrenheitFreezingPoint) {
            state = "Solid.";
          } else if (temperature > fahrenheitFreezingPoint && temperature < fahrenheitBoilingPoint) {
            state = "Liquid.";
          } else if (temperature >= fahrenheitBoilingPoint) {
            state = "Gas.";
          }
        } else if (scale.equals("C")) {
          if (temperature <= celsiusFreezingPoint) {
            state = "Solid.";
          } else if (temperature > celsiusFreezingPoint && temperature < celsiusBoilingPoint) {
            state = "Liquid.";
          } else if (temperature >= celsiusBoilingPoint) {
            state = "Gas.";
          }
        }
        System.out.println("\n" + state);
      } else {
        System.out.println("\nThat's not a valid scale.");
      }
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {
      System.out.print("\nEnter a month: ");
          String month = in.nextLine();
          month = month.toLowerCase();

          if (month.equals("jan") || month.equals("janu") || month.equals("january")) {
            System.out.println("\n31 days.");
          } else if (month.equals("feb") || month.equals("febr") || month.equals("february")) {
            System.out.println("\n28 or 29 days.");
          } else if (month.equals("mar") || month.equals("marc") || month.equals("march")) {
            System.out.println("\n31 days.");
          } else if (month.equals("apr") || month.equals("apri") || month.equals("april")) {
            System.out.println("\n30 days.");
          } else if (month.equals("may")) {
            System.out.println("\n31 days.");
          } else if (month.equals("jun") || month.equals("june")) {
            System.out.println("\n30 days.");
          } else if (month.equals("jul") || month.equals("july")) {
            System.out.println("\n31 days.");
          } else if (month.equals("aug") || month.equals("augu") || month.equals("august")) {
            System.out.println("\n31 days.");
          } else if (month.equals("sep") || month.equals("sept") || month.equals("september")) {
            System.out.println("\n30 days.");
          } else if (month.equals("oct") || month.equals("octo") || month.equals("october")) {
            System.out.println("\n31 days.");
          } else if (month.equals("nov") || month.equals("nove") || month.equals("november")) {
            System.out.println("\n30 days.");
          } else if (month.equals("dec") || month.equals("dece") || month.equals("december")) {
            System.out.println("\n31 days.");
          } else {
            System.out.println("\nThat's not a valid month.");
          }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {
      System.out.print("\nWage: ");
          double wage = in.nextDouble();
          System.out.print("Hours: ");
          double hours = in.nextDouble();
          double payGrade = 1.5;
          double overtimeWage = payGrade * wage;
          double overtime = 0;

          if (wage >= 0 && hours >= 0) {
            if (hours > 40) {
              double overtimeHours = hours - 40;
              hours = 40;
              overtime = overtimeHours * overtimeWage;
            }
            double salary = wage * hours;
            salary += overtime;
            System.out.printf("\nYou'll make $%,.2f this week.\n", salary);
          } else if (wage < 0 && hours < 0) {
            System.out.println("\nYour wage must be greater than or equal to $0.00/hour and your hours must be greater than or equal to 0.0.");
          } else if (wage < 0) {
            System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
          } else if (hours < 0) {
            System.out.println("\nYour hours must be greater than or equal to 0.0.");
          }
    }
}
