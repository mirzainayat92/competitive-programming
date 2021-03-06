
public class DerivativeSequence {
    public int[] derSeq(int[] a, int n) {
        int[] res = new int[a.length - 1];

        if (n == 0)
            return a;
        for (int i = 0; i < res.length; ++i)
            res[i] = a[i + 1] - a[i];
        return derSeq(res, n - 1);
    }
 // BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(DerivativeSequence.class, "test.*");
    }

	public void test0() {
		RETester.eq(derSeq(new int[] {5,6,3,9,-1}, 1), new int[] {1, -3, 6, -10 });
	}

	public void test1() {
		RETester.eq(derSeq(new int[] {5,6,3,9,-1}, 2), new int[] {-4, 9, -16 });
	}

	public void test2() {
		RETester.eq(derSeq(new int[] {5,6,3,9,-1}, 4), new int[] {-38 });
	}

	public void test3() {
		RETester.eq(derSeq(new int[] {4,4,4,4,4,4,4,4}, 3), new int[] {0, 0, 0, 0, 0 });
	}

	public void test4() {
		RETester.eq(derSeq(new int[] {-100,100}, 0), new int[] {-100, 100 });
	}

// END CUT HERE
}
