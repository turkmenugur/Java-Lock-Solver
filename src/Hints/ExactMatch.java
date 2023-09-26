package Hints;


public class ExactMatch implements IHint {
    private final String hint;

    public ExactMatch(String hint) {
        this.hint = hint;
    }

    @Override
    public boolean isMatch(String candidate) {
        for (int i = 0; i < candidate.length(); i++) {
            if (candidate.charAt(i) == hint.charAt(i))
                return true;
        }

        return false;

        // Yukarıdaki döngüyle aynı işlemi yapar
        // return candidate.chars().zip(hint.chars(), (c, h) -> c == h ? 1 : 0).sum() == 1;

    }
}
