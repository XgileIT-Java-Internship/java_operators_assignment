package za.co.xgileit.conditionals;

public class Conditionals {


    public void ifStatement()
    {
        int x = 5;
        int y = 3;
        if (x > y) {
            System.out.println(""+x+" is greater than "+y+"");
        }
        System.out.println("I use two values, 5 and 3, to\n" +
                "test whether 5 is greater than 3 (using the > operator).\nAs we know" +
                " that 5 is greater than 3,\nI print to the screen that \"5 is greater than 3\".");
    }

    public void elseStatement()
    {
        int amount = 20;
        if (amount < 18) {
            System.out.println("More.");
        } else {
            System.out.println("Less.");
        }
        System.out.println("I assign 20 to the variable amount and compare if amount < 18, amount (20) is greater than 18, so the condition is false.\n" +
                "Because of this, I move on to the else condition and print to the screen \"Less\".\n" +
                "If the amount was less than 18, the program would print \"More\".");
    }


    public void elseIfStatement()
    {
        int amount = 22;
        if (amount < 20) {
            System.out.println("Little.");
        } else if (amount == 20) {
            System.out.println("Average.");
        } else {
            System.out.println("More.");
        }
        System.out.println("Amount (22) is greater than 20, so the first condition is false.\n" +
                "The next condition, in the else if statement, is also false,\n" +
                "so we move on to the else condition since condition1 and condition2 is both false\n" +
                "and print to the screen \"More\".");
    }

    public void switchStatement()
    {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
    public void switchDefault()
    {
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }

}

