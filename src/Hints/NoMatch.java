package Hints;

public class NoMatch implements IHint{
    private final String hint;

    public NoMatch(String hint) {
        this.hint = hint;
    }

    @Override
    public boolean isMatch(String candidate) {
        for (int i = 0; i < candidate.length(); i++) {
            if (hint.contains(String.valueOf(candidate.charAt(i)))) {
                return false;
            }
        }

        return true;

        // Yukarıdaki döngüyle aynı işlemi yapar
        // return candidate.chars().noneMatch(c -> hint.contains(String.valueOf((char)c)));
    }
}
