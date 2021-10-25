package generateUniqueCharacter.com;

public class GenerateString implements StringInterface
{
    @Override
    public String generateString()
    {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String sum = upperCase + lowerCase +numbers ;
        StringBuffer r = new StringBuffer();
        for (int k= 0; k< 100; k++)
        {
            int r1= (int) (Math.random() * sum.length());
            r.append(sum.charAt(r1));
        }
        return r.toString();

    }
       @Override
        public int getNumber ()
        {
            return 0;

        }

    }






