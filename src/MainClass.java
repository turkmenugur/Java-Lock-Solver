import Hints.*;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    /* KİLİT ŞİFRE PROBLEMİ
     *
     * 682 -> 1 rakam doğru ve yeri de doğru
     * 614 -> 1 rakam doğru ama yeri yanlış
     * 206 -> 2 rakam doğru ama yeri yanlış
     * 738 -> Hiçbir rakam doğru değil
     * 780 -> Bir rakam doğru ama yeri yanlış
     *
     * Verilen ipuçları ile 3 rakamlı kilidin şifresini çözebilecek misin?
     */
    public static void main(String[] args) {
        List<IHint> hints = getHints_1();
        LockSolverClass lockSolver = new LockSolverClass(hints, 3);
        String key = lockSolver.solve();
        System.out.println("Key: " + key);
    }

    static List<IHint> getHints_1() {
        List<IHint> hints = new ArrayList<>();
        hints.add(new ExactMatch("682"));
        hints.add(new RightDigitWrongPlace("614"));
        hints.add(new TwoRightDigitWrongPlace("206"));
        hints.add(new NoMatch("738"));
        hints.add(new RightDigitWrongPlace("780"));
        return hints;
    }
}