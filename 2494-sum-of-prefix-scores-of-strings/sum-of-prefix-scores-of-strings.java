class Trie {
    Trie[] children; 
    int words; 

    public Trie() {
        children = new Trie[26]; 
        words = 0; 
    }

    public void insert(String word) {
        Trie curr = this; 
        for (char c : word.toCharArray()) {
            int index = c - 'a'; 
            if (curr.children[index] == null) {
                curr.children[index] = new Trie(); 
            }
            curr = curr.children[index]; 
            curr.words++; 
        }
    }

    public int getPrefixScore(String word) {
        Trie curr = this; 
        int score = 0;
        for (char c : word.toCharArray()) {
            int index = c - 'a'; 
            curr = curr.children[index]; 
            score += curr.words; 
        }
        return score; 
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie root = new Trie(); 
        int[] result = new int[words.length]; 

      
        for (String word : words) {
            root.insert(word);
        }

        for (int i = 0; i < words.length; i++) {
            result[i] = root.getPrefixScore(words[i]); 
        }

        return result; 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"abc", "ab", "bc", "b"};
        int[] result = solution.sumPrefixScores(words);

        for (int score : result) {
            System.out.print(score + " ");
        }
    }
}
