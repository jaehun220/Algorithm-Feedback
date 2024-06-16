import java.util.*;

public class String1 {
    static class WordComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return Integer.compare(a.length(), b.length());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Set<String> hashset = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hashset.add(sc.nextLine());
        }

        List<String> words = new ArrayList<>(hashset);

        Collections.sort(words, new String1.WordComparator());

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
