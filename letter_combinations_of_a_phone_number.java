class Solution {
    public static void DFS(String digits, List<String> res, HashMap<Integer,String> mapping, 
    StringBuffer string, int left){
        if(left == digits.length()){
            res.add(string.toString());
        }
        else{
            String temp = mapping.get(digits.charAt(left) - '0');
            for (int i = 0; i < temp.length(); i++){
                string.append(temp.charAt(i));
                DFS(digits,res,mapping,string,left+1);
                string.deleteCharAt(string.length()-1);
            }  
        }
    }
    
    public static List<String> letterCombinations(String digits){
        List<String> res = new ArrayList<String>();
        if(digits.length() == 0){
            return res;
        }
        else{
            HashMap<Integer,String> mapping = new HashMap<Integer,String>();
            mapping.put(0,"");
            mapping.put(1,"");
            mapping.put(2,"abc");
            mapping.put(3,"def");
            mapping.put(4,"ghi");
            mapping.put(5,"jkl");
            mapping.put(6,"mno");
            mapping.put(7,"pqrs");
            mapping.put(8,"tuv");
            mapping.put(9,"wxyz");
            StringBuffer string = new StringBuffer();
            DFS(digits,res,mapping,string,0);
            return res;
        }
    }
}