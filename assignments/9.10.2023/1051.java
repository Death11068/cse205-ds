import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] cop=Arrays.copyOf(heights,n);
        Arrays.sort(cop);
        int ne=0;
        for(int i=0;i<n;i++)
        {
            if(cop[i]!=heights[i])
            {
                ne++;
            }
        }
        return ne;
    }
}