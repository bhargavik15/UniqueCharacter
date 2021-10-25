package generateUniqueCharacter.com;

import java.util.Scanner;

public class UserInput implements StringInterface
{
    @Override
    public String generateString()
    {
        return null;
    }

    @Override
    public int getNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1-230");
        int x = sc.nextInt();
        sc.nextLine();
        while (x < 1 || x > 230) {
            System.out.println("Enter the number");
            x = sc.nextInt();
            sc.nextLine();
        }
                System.out.println("value of x is" + x);
                return x;
            }
        }







