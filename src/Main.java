//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

