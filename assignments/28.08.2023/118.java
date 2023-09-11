import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

       
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

           
            currentRow.add(1);

            
            for (int j = 1; j < rowNum; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            
            currentRow.add(1);

            triangle.add(currentRow);
        }

        return triangle;
    }
}





