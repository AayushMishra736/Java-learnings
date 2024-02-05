package newPackage;

public class Longestcommonprefix {
    public static void main(String[] args) {
        Longestcommonprefix lcf = new Longestcommonprefix();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("The longest Common Prefix is : " + lcf.longestCommonPrefix(input));
    }

    private String longestCommonPrefix(String[] input) {
        int n = input.length;
        String result = input[0];
        for(int i = 1;i < n;i++){
            while(input[i].indexOf(result) != 0){
                result = result.substring(0,result.length() - 1);
                if(result.isEmpty()){
                    return "-1";
                }
            }
        }
        return result;
    }
}
