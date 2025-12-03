class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray;
        char[] tArray;
        char[] tArrayInverted;

        if (s.length() == t.length()) {

            sArray = s.toCharArray();
            tArray = t.toCharArray();

            int aux = 0;

            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < t.length(); j++) {
                    if(sArray[i]==tArray[j]){
                        tArray[j]='*';
                        aux++;
                        break;
                    }
                }
            }
            if (aux==s.length()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}

//Correct Solution
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) count[c - 'a']--;

        for (int n : count) if (n != 0) return false;

        return true;
    }
}

//Complejidad: O(n)
//Uso un arreglo de frecuencias de 26 letras.
