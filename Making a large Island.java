class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        int changeValue = 1;  
        int[][] visited = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    dfs(grid,visited,i,j,n,changeValue);
                    changeValue++;
                }
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int row = 0 ; row < n ; row++){
            for(int col = 0; col < n ; col++){
                if(visited[row][col] != 0){
                    int curr = map.getOrDefault(visited[row][col],0);
                    map.put(visited[row][col], curr + 1);
                }
            }
        }
        int[] dirX = {0,0,1,-1};
        int[] dirY = {1,-1,0,0};

        int ans = 0;
        for(int row =0 ; row < n ; row++){
            for(int col =0 ; col < n ; col++){
                if(grid[row][col]==0){
                    int total = 1;
                    HashSet<Integer> set = new HashSet<>();
                    for(int i=0;i<4;i++){

                        int nr = row + dirX[i];
                        int nc = col + dirY[i];

                        if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==1){
                            int id = visited[nr][nc];
                            if(!set.contains(id)){
                                total += map.get(id);
                                set.add(id);
                            }
                        }
                    }
                    ans = Math.max(ans,total);
                }
            }
        }
        if(ans == 0) return n*n;

        return ans;
    }

    public void dfs(int[][] grid, int[][] visited, int row, int col,int n,int changeValue){

        visited[row][col] = changeValue;

        int[] dirX = {0,0,1,-1};
        int[] dirY = {1,-1,0,0};

        for(int i=0;i<4;i++){

            int nr = row + dirX[i];
            int nc = col + dirY[i];

            if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==1 && visited[nr][nc]==0){

                dfs(grid,visited,nr,nc,n,changeValue);
            }
        }
    }
}
