//find if two strings are anagrams or not

class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
            
        int count [] = new int[26];
        for(int i =0; i<s1.length(); i++){
            count[s1.charAt(i) -'a']++;
            count[s2.charAt(i) -'a']--;
        }
        
        for(int val:count){
            if(val!=0) return false;
        }
        return true;
        
        }
        
        // Your code here
    }


//Hashmap version for unicode 

import java.util.HashMap;

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in s1
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract character counts using s2
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) return false;
        }

        return true;
    }
}
