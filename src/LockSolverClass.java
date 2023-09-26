import Hints.IHint;

import java.util.List;

public class LockSolverClass {
    private final List<IHint> hints;
    private final int digitLength;

    public LockSolverClass(List<IHint> hints, int digitLength) {
        this.hints = hints;
        this.digitLength = digitLength;
    }

    public String solve() {
        for (int i = 0; i < Math.pow(10, digitLength) - 1; i++) {
            String candidate = String.format("%0" + digitLength + "d", i);
            if (hints.stream().allMatch(h -> h.isMatch(candidate))) {
                return candidate;
            }
        }

        return "No key found";
    }
}
