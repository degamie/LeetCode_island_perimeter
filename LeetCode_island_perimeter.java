class Solution {
    public int islandPerimeter(int[][] grid) {
      //New Approach
      //TC(C(N) and S(C(C(N)) ==O(N) and  ==O(N**2) as it requires Dynamic space alloc iteratively
        int output = 0;//output Declare
        int m = grid.length;//Grid'sRow Declare
        int n = grid[0].length;//Grid's  Col Declare
        for (int i = 0; i < m; i++) {//Iterating thorugh Grid's Row
            for (int j = 0; j < n; j++) {//Grid's Col Iteration
                if (grid[i][j] == 1) {//Grid's Top Most Cell
                    output += 4;//Incr the outPut At 4 Sides 
                    if (i < m - 1 && grid[i + 1][j] == 1) {//Grid's Right Cell Verifying
                        output -= 2;//Output Shifiting to Left
                    }
                    if (j < n - 1 && grid[i][j + 1] == 1) {//Grid's Top Cell Verifying
                        output -= 2;//Output Shifiting to Left
                    }
                }
            }
        }
        return output;//Printing Output
    }
}
//Old Approach
//     public int islandPerimeter(int[][] grid) {
//         int output=0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=i;j<grid[0].length;j++){
        
//         if(i<1 && grid[i-1][j])output-=2;
//         if(grid[i][j-1] && j<1)output-=2;

//     }
//         }
//           return output;
//         }
// }
      
