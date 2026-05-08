class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < 9; j++) {

                if ((board[i][j] == '.'))
                    continue;

                if (!map.containsKey(board[i][j])) {
                    map.put(board[i][j], 1);
                } else {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < 9; j++) {

                if ((board[j][i] == '.'))
                    continue;

                if (!map.containsKey(board[j][i])) {
                    map.put(board[j][i], 1);
                } else {
                    return false;
                }
            }
        }

        for(int boxr=0;boxr<9;boxr+=3){
            for(int boxc=0;boxc<9;boxc+=3){
                Map<Character, Integer> map = new HashMap<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if ((board[boxr+i][boxc+j] == '.'))
                            continue;

                        if (!map.containsKey(board[boxr+i][boxc+j])) {
                            map.put(board[boxr+i][boxc+j], 1);
                        } else {
                            return false;
                        }
                    }
                }
           }
        }


        return true;
    }
}