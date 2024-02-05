package newPackage;

public class Shortestdistance {
    public static void main(String[] args) {
        String[] s = {"the", "quick", "brown", "fox", "quick"};
        String word1 = "the", word2 = "fox";
        int result = sortestDistanceBetweenWords(s, word1, word2);
        System.out.println("Difference between words is " + result);
    }

    private static int sortestDistanceBetweenWords(String[] s, String word1, String word2) {
        int firstWordPos = 0;
        int secondWordPos = 0;
        int differenceBetweenWords = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == word1) {
                firstWordPos = i;
            } else if (s[i] == word2) {
                secondWordPos = i;
            }
            if(firstWordPos < secondWordPos){
                differenceBetweenWords = secondWordPos - firstWordPos;
            }
            else if(secondWordPos < firstWordPos){
                differenceBetweenWords = firstWordPos - secondWordPos;
            }
        }
        return differenceBetweenWords;
    }

}
