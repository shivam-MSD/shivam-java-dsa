package leetcode.string.easy;

public class Final_value_of_variable_2011 {
    String[] operations;
    public Final_value_of_variable_2011() {
        operations = new String[]{"--X","X++","X++"};

        System.out.println("2011 - Result :- "+finalValueAfterOperations(operations));
    }

    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for(var operation :operations)
        {
            if(operation.toLowerCase().equals("x++") || operation.toLowerCase().equals("++x"))
            {
                sum += 1;
            }
            else
            {
                sum -= 1;
            }
        }

        return sum;
    }
}
