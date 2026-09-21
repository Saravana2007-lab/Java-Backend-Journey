public class Lengthoflastword {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int end = s.length() - 1;

        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        int count = 0;
        while (end >= 0 && s.charAt(end) != ' ') {
            count++;
            end--;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
