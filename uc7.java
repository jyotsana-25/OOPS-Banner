public class uc7 {

    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern('O', new String[]{
                " ****** ",
                "**    **",
                "**    **",
                "**    **",
                " ****** "
        }));

        map.put('P', new CharacterPattern('P', new String[]{
                " ****** ",
                "**    **",
                " ****** ",
                "**      ",
                "**      "
        }));

        map.put('S', new CharacterPattern('S', new String[]{
                " ****** ",
                "**      ",
                " ****** ",
                "      **",
                " ****** "
        }));

        String word = "OOPS";

        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                CharacterPattern cp = map.get(word.charAt(j));
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}