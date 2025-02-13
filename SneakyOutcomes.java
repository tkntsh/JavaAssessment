import java.util.*;

public class SneakyOutcomes
{
    public static int[] findDuplicates(int[] outcomes)
    {
        //using a HashMap to count occurrences of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        //counting each outcome
        for(int outcome : outcomes)
        {
            countMap.put(outcome, countMap.getOrDefault(outcome, 0) + 1);
        }
        //collecting outcomes that appear more than once
        List<Integer> duplicates = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet())
        {
            if(entry.getValue() > 1)
            {
                duplicates.add(entry.getKey());
            }
        }
        //converting List to Array tracking duplicates
        return duplicates.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args)
    {
        int[] outcomes = {123456, 234567, 123347, 456789, 567890, 678901, 789012, 890123, 901234,
                112233, 223344, 334455, 789012, 222234, 123347};

        int[] result = findDuplicates(outcomes);
        //std out
        System.out.println(Arrays.toString(result));
    }
}
