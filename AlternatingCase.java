public class AlternatingCase
{
    public static String toAlternatingCase(String s)
    {
        StringBuilder result = new StringBuilder();
        boolean upperCase = true;

        for(char c : s.toCharArray())
        {
            if(Character.isLetter(c))
            {
                if(upperCase)
                {
                    result.append(Character.toUpperCase(c));
                }
                else
                {
                    result.append(Character.toLowerCase(c));
                }
                //toggling case for next letter
                upperCase = !upperCase;
            }
            //keeping non-letter characters as they are
            else
            {
                result.append(c);
            }
        }
        //returning result in string format
        return result.toString();
    }

    public static void main(String[] args)
    {
        String input = "Za^B8g@E2jH*kWl!MoPqXr7YvT1c$Fs3Ud9IwZ&yX0pLkV6sHqN^tB4rA+oZ%gFj";
        //std out
        System.out.println(toAlternatingCase(input));
    }
}
