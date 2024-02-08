/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String a = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++)
        {
            boolean is = false;
            for ( int j = 0; j < a.length(); j++)
            {
                if ((s.charAt(i) == a.charAt(j)) && ((s.charAt(i)) != ' '))
                {
                    is = true;
                }
            }
            if (!is)
            {
                a = a + s.charAt(i);
            }
        }
        return a;
    }
}