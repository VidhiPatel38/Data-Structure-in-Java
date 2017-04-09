 import java.util.*;
 
 class Solution {
    public boolean isValidSudoku(char[][] board) {
      //  int[][] board = new int[9][9];
        List<Character> r1 = new ArrayList<Character>();
        List<Character> c1 = new ArrayList<Character>();
        List<Character> r2 = new ArrayList<Character>();
        List<Character> c2 = new ArrayList<Character>();
        List<Character> m1 = new ArrayList<Character>();
        List<Character> m2 = new ArrayList<Character>();
        List<Character> m3 = new ArrayList<Character>();
        List<Character> m4 = new ArrayList<Character>();
        List<Character> m5 = new ArrayList<Character>();
        List<Character> m6 = new ArrayList<Character>();
        List<Character> m7 = new ArrayList<Character>();
        List<Character> m8 = new ArrayList<Character>();
        List<Character> m9 = new ArrayList<Character>();
        HashMap<Integer,List<Character>> rows = new HashMap<Integer,List<Character>>();
        HashMap<Integer,List<Character>> col = new HashMap<Integer,List<Character>>();
        for(int i=0; i< board.length;i++){
            for(int j=0;j<board[i].length;j++){
                char val = board[i][j];
                if(val != '.'){
                r1 = rows.get(i);
                c1 = col.get(j);
                if(i< 3 && j < 3 ){
                    if(r1 == null && c1 == null){
                        if(m1.contains(val)){
                            return false;
                        }
                    else if(r1 == null && c1 != null){
                         if(m1.contains(val) || c1.contains(val)){
                            return false;
                        }
                    }
                    else if(c1 == null && r1 != null){
                         if(m1.contains(val) || r1.contains(val)){
                            return false;
                        }
                    }
                    // else if(m1.contains(val) || r1.contains(val) || c1.contains(val)){
                    //     return false;
                    // }
                    else{
                        r2.add(val);
                        m2.add(val);
                        c1.add(val);
                        rows.put(i,r1);
                        col.put(j,c1);
                    }
                    }
                }//2nd matrix
                if(i < 3 && j > 2 && j < 6 ){
                    if(r1 == null && c1 == null){
                        if(m2.contains(val)){
                            return false;
                        }
                    else if(r1 == null && c1 != null){
                         if(m2.contains(val) || c1.contains(val)){
                            return false;
                        }
                    }
                    else if(c1 == null && r1 != null){
                         if(m2.contains(val) || r1.contains(val)){
                            return false;
                        }
                    }
                    // else if(m2.contains(val) || r1.contains(val) || c1.contains(val)){
                    //     return false;
                    // }
                    else{
                        r1.add(val);
                        m2.add(val);
                        c1.add(val);
                        rows.put(i,r1);
                        col.put(j,c1);
                    }
                    }
                }//3rd matrix
                if(i < 3 && j > 5 && j < 9 ){
                    if(r1 == null && c1 == null){
                        if(m3.contains(val)){
                            return false;
                        }
                    else if(r1 == null && c1 != null){
                         if(m3.contains(val) || c1.contains(val)){
                            return false;
                        }
                    }
                    else if(c1 == null && r1 != null){
                         if(m3.contains(val) || r1.contains(val)){
                            return false;
                        }
                    }
                    // else if(m3.contains(val) || r1.contains(val) || c1.contains(val)){
                    //     return false;
                    // }
                    else{
                        r1.add(val);
                        m3.add(val);
                        c1.add(val);
                        rows.put(i,r1);
                        col.put(j,c1);
                    }
                    }
                }//4th marix
                if(i > 2 && i < 6 && j <3 ){
                    if(r1 == null && c1 == null){
                        if(m4.contains(val)){
                            return false;
                        }
                    else if(r1 == null && c1 != null){
                         if(m4.contains(val) || c1.contains(val)){
                            return false;
                        }
                    }
                    else if(c1 == null && r1 != null){
                         if(m4.contains(val) || r1.contains(val)){
                            return false;
                        }
                    }
                    // else if(m4.contains(val) || r1.contains(val) || c1.contains(val)){
                    //     return false;
                    // }
                    else{
                        r1.add(val);
                        m4.add(val);
                        c1.add(val);
                        rows.put(i,r1);
                        col.put(j,c1);
                    }
                    }
                }//5nd matrix
                if(i > 2 && i < 6 && j > 2 && j < 6 ){
                    if(r1 == null && c1 == null){
                        if(m5.contains(val)){
                            return false;
                        }
                    else if(r1 == null && c1 != null){
                         if(m5.contains(val) || c1.contains(val)){
                            return false;
                        }
                    }
                    else if(c1 == null && r1 != null){
                         if(m5.contains(val) || r1.contains(val)){
                            return false;
                        }
                    }
                    // else if(m5.contains(val) || r1.contains(val) || c1.contains(val)){
                    //     return false;
                    // }
                    else{
                        r1.add(val);
                        m5.add(val);
                        c1.add(val);
                        rows.put(i,r1);
                        col.put(j,c1);
                    }
                    }
                }//6rd matrix
                if(i > 2 && i < 6 && j > 5 && j < 9 ){
                    if(r1 == null && c1 == null){
                        if(m6.contains(val)){
                            return false;
                        }
                    else if(r1 == null && c1 != null){
                         if(m6.contains(val) || c1.contains(val)){
                            return false;
                        }
                    }
                    else if(c1 == null && r1 != null){
                         if(m6.contains(val) || r1.contains(val)){
                            return false;
                        }
                    }
                    // else if(m6.contains(val) || r1.contains(val) || c1.contains(val)){
                    //     return false;
                    // }
                    else{
                        r1.add(val);
                        m6.add(val);
                        c1.add(val);
                        rows.put(i,r1);
                        col.put(j,c1);
                    }
                    }
                }//7th matix
                if(i > 5 && i<9 && j < 3 ){
                    if(r1 == null && c1 == null){
                        if(m7.contains(val)){
                            return false;
                        }
                    else if(r1 == null && c1 != null){
                         if(m7.contains(val) || c1.contains(val)){
                            return false;
                        }
                    }
                    else if(c1 == null && r1 != null){
                         if(m7.contains(val) || r1.contains(val)){
                            return false;
                        }
                    }
                    // else if(m7.contains(val) || r1.contains(val) || c1.contains(val)){
                    //     return false;
                    // }
                    else{
                        r1.add(val);
                        m7.add(val);
                        c1.add(val);
                        rows.put(i,r1);
                        col.put(j,c1);
                    }
                    }
                }//8nd matrix
                if(i > 5 && i <9 && j > 2 && j < 6 ){
                    if(r1 == null && c1 == null){
                        if(m8.contains(val)){
                            return false;
                        }
                    else if(r1 == null && c1 != null){
                         if(m8.contains(val) || c1.contains(val)){
                            return false;
                        }
                    }
                    else if(c1 == null && r1 != null){
                         if(m8.contains(val) || r1.contains(val)){
                            return false;
                        }
                    }
                    // else if(m8.contains(val) || r1.contains(val) || c1.contains(val)){
                    //     return false;
                    // }
                    else{
                        r1.add(val);
                        m8.add(val);
                        c1.add(val);
                        rows.put(i,r1);
                        col.put(j,c1);
                    }
                    }
                }//9rd matrix
                if(i > 5 && i < 9 && j > 5 && j < 9 ){
                    if(r1 == null && c1 == null){
                        if(m9.contains(val)){
                            return false;
                        }
                    else if(r1 == null && c1 != null){
                         if(m9.contains(val) || c1.contains(val)){
                            return false;
                        }
                    }
                    else if(c1 == null && r1 != null){
                         if(m9.contains(val) || r1.contains(val)){
                            return false;
                        }
                    }
                    // else if(m9.contains(val) || r1.contains(val) || c1.contains(val)){
                    //     return false;
                    // }
                    else{
                        r1.add(val);
                        m9.add(val);
                        c1.add(val);
                        rows.put(i,r1);
                        col.put(j,c1);
                    }
                    }
                }//10
            }
                
                
            }
        }
        return true;
    }
}


public class Soduku{
    public static void main(String args[]){
        char[][] check = {{'0','1','2','.','.','.','.','8','.'},
                         {'1','3','.','.','.','.','.','4','.'},
                         {'2','9','6','.','.','.','.','.','.'},
                         {'.','4','.','.','.','.','.','9','.'},
                         {'5','.','3','.','.','.','.','.','.'},
                         {'.','7','.','.','.','.','.','.','2'},
                         {'.','.','.','5','.','.','1','.','.'},
                         {'.','.','.','.','.','.','9','.','.'},
                         {'.','.','.','9','.','.','.','.','.'}
                        };
         Solution s1 = new Solution();
         boolean flag = s1.isValidSudoku(check);
         System.out.println(flag);

    }
}