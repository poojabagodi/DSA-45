package DAY27;

public class prefixword {
   // prefixproblem
class Main {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        Node() {
            freq = 0;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.freq++; // correct place
        }
        curr.eow = true;
    }

    public static void findPrefixes(Node root, String prefix) {
        if (root == null) return;

        if (root.freq == 1) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                findPrefixes(root.children[i], prefix + (char) (i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"i", "love", "sam", "samsung", "mobile"};

        for (String word : words) {
            insert(word);
        }

        System.out.println("Shortest Unique Prefixes:");
        findPrefixes(root, "");
    }
}

}
