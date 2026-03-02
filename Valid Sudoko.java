class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rf = new boolean[9][10];
        boolean[][] cf = new boolean[9][10];
        boolean[][] bf = new boolean[9][10];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                   continue;
                }

                int smi = (i/3)*3 + (j/3);
                int dig = board[i][j]-'0';
                if(rf[i][dig] || cf[j][dig] || bf[smi][dig]){
                    return false;
                }else{
                    rf[i][dig] = true;
                    cf[j][dig] = true;
                    bf[smi][dig] = true;
                }
                
            }
        }
        return true;
    }
}
