import java.util.Scanner;
public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        System.out.println("Please enter your birth month in number form [1-12]: ");
        birthMonth = in.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        } else
        {
            System.out.println("You entered an incorrect month: " +birthMonth + "\nPlease try again.");
        }
    }
}