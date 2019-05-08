import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        //parameter, the final result set, current string, 
        //length n, # of left bracket, # of right bracket
        backtracking(res, "", n, 0, 0);
        return res;
    }

    public void backtracking(List<String> res, String currentString, int n, int left, int right){
        if (currentString.length() == n * 2){
            res.add(currentString);
            return;
        }
        if (left < n){
            backtracking(res, currentString + "(", n, left + 1, right);
        }
        if(right < left) {
            backtracking(res, currentString + ")", n, left, right + 1);
        }
    }
}