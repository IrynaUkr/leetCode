package easy.tasks;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    //   1
    //  1 1
    // 1 2 1
    //1 3  3 1
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int rowNumber = 0; rowNumber <= numRows - 1; rowNumber++) {
            List<Integer> row = new ArrayList<>();
            result.add(row);
            for (int i = 0; i <= rowNumber; i++) {
                if (i == 0 || i == rowNumber ) {
                    row.add(1);
                } else if (i > 0 && rowNumber > 1) {
                    List<Integer> previousRow = result.get(rowNumber - 1);
                    row.add(previousRow.get(i - 1) + previousRow.get(i));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = generate(0);
        for (int i = 0; i < res.size(); i++) {
            List<Integer> integers = res.get(i);
            System.out.println(integers);
        }
    }

}

