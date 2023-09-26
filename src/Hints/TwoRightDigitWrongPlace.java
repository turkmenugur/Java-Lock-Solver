package Hints;

public class TwoRightDigitWrongPlace implements IHint{
    private final String hint;

    public TwoRightDigitWrongPlace(String hint) {
        this.hint = hint;
    }

    @Override
    public boolean isMatch(String candidate) {
        int matchCount = 0;

        for (int i = 0; i < candidate.length(); i++) {
            if (hint.contains(String.valueOf(candidate.charAt(i))) && candidate.charAt(i) != hint.charAt(i)) {
                matchCount++;
            }
        }

        return matchCount == 2;

        // Yukarıdaki döngüyle aynı işlemi yapar
        // return candidate.chars().zip(hint.chars(), (c, h) -> c != h && hint.contains(String.valueOf((char)c)) ? 1 : 0).sum() == 2;
    }
}
