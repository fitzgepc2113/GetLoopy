import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        for (int c = 0; c <= 30; c++) {
            System.out.print("\t" + c);

        }
        System.out.print("\n");

    }
}

class Task2 {
    public static void main(String[] args)
    {
        for (int c = 30; c >= 0; c--)
        {
            System.out.print("\t" + c);
        }
        System.out.print("\n");

    }
}

class Task3 {
    public static void main(String[] args)
    {
        for (int c = 0; c <= 18; c+=3)
        {
            System.out.print("\t" + c);
        }
        System.out.print("\n");

    }
}

class Task4 {
    public static void main(String[] args)
    {
        for (int c = 10; c >= 0; c-=2)
        {
            System.out.print("\t" + c);
        }
        System.out.print("\n");

    }
}

class Task7 {
    public static void main(String[] args)
    {
        for (int row = 1; row <= 5; row++)
        {
            System.out.println("");
            for (int col = 1; col <= 5; col++)
            {
                System.out.print("*\t");
            }
        }
        System.out.println("");

    }
}

class Task5 {
    public static void main(String[] args)
    {
        for (int row = 1; row <= 5; row++)
        {
            System.out.println("");
            for (int col = 1; col <= row; col+= 1)
            {
                System.out.print("*\t");
            }
        }
        System.out.println("");

    }
}

class Task6 {
    public static void main(String[] args)
    {
        for (int row = 1; row <= 5; row++)
        {
            System.out.println("");
            for (int col = 5; col >= row; col--)
            {
                System.out.print("*\t");
            }
        }
        System.out.println("");

    }
}

class DieRollar {
    public static void main(String[] args) {
        Random gen = new Random();

        Scanner in = new Scanner(System.in);


        boolean done = false;

        do {
            int die1 = 0;
            int die2 = 1;
            int die3 = 2;
            int dieRoll = die1 + die2 + die3;
            int rollNum = 0;

            System.out.printf("Roll Die1 Die2 Die3 Sum");
            System.out.println("");
            System.out.println("----------------------------");

            while (die1 != die2 || die2 != die3 || die1 != die3) {
                rollNum++;
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                dieRoll = die1 + die2 + die3;

                System.out.printf(" %-3d %3d %3d %3d %3d\n", rollNum, die1, die2, die3, dieRoll);

            }
                System.out.println("Do you want to roll again [Y/N]?");
                if ("N".equalsIgnoreCase(in.nextLine())) {
                    done = true;
                } else {
                    done = false;
                }


            }
            while (!done) ;


        }
    }

