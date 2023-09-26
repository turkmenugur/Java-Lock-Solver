package Hints;

public class RightDigitWrongPlace implements IHint {
    private final String hint;

    public RightDigitWrongPlace(String hint) {
        this.hint = hint;
    }

    @Override
    public boolean isMatch(String candidate) {
        for (int i = 0; i < candidate.length(); i++) {
            if (hint.contains(String.valueOf(candidate.charAt(i))) && candidate.charAt(i) != hint.charAt(i)) {
                return true;
            }
        }

        return false;

        // Yukarıdaki döngüyle aynı işlemi yapar
        // return candidate.chars().zip(hint.chars(), (c, h) -> c != h && hint.contains(String.valueOf((char)c)) ? 1 : 0).sum() == 1;
    }
}
