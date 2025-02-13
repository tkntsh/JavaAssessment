import java.util.HashMap;
import java.util.Map;

public class OrganizeBooks
{
    public static String canOrganizeBooks(int[] shelf)
    {
        //counting the occurrences of each book
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int books : shelf)
        {
            countMap.put(books, countMap.getOrDefault(books, 0) + 1);
        }
        //checking if all counts can form sets
        for (int books : countMap.keySet())
        {
            int count = countMap.get(books);
            boolean validSet = false;

            //checking if the count of this book count can form sets
            for (int setSize = 2; setSize <= count; setSize++)
            {
                //if divisible by setSize
                if (count % setSize == 0)
                {
                    validSet = true;
                    break;
                }
            }
            //if validSet isn't true return no
            if (!validSet)
            {
                return "NO";
            }
        }
        //returning yes as default
        return "YES";
    }

    public static void main(String[] args)
    {
        int[] bookshelf = {1234567, 1234567, 2345678, 2345678, 3456789, 3456789, 1234567, 2345678, 3456789, 4567890, 4567890, 5678901, 5678901, 6789012, 6789012, 1234567, 2345678, 3456789, 4567890, 5678901, 4567890, 5678901};
        //std out
        System.out.println(canOrganizeBooks(bookshelf));
    }
}
