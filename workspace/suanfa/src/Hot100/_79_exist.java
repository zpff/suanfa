package Hot100;

import java.lang.reflect.Array;

public class _79_exist {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(dfs(board,words,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] words, int i, int j, int index) {
        if(i<0||i>board.length-1||j<0||j>board[0].length-1||board[i][j]!=words[index]){
            return false;
        }
        if(index == words.length-1){
            return true;
        }
        char tmp = board[i][j];
        board[i][j] = '.';
        boolean res = dfs(board,words,i-1,j,index+1)||dfs(board,words,i,j+1,index+1)
                ||dfs(board,words,i+1,j,index+1)||dfs(board,words,i,j-1,index+1);
        board[i][j] = tmp;
        return res;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},
                {'A','D','E','E'}};
        _79_exist exist = new _79_exist();
        exist.exist(board,"SEE");
    }
}
