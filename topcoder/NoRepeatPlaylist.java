package topcoder;

import java.util.*;

public class NoRepeatPlaylist {
	
	static final int MOD = 1000000007;
    public int numPlaylists(int N, int M, int P) {
        int res = 1;
    	
    	int div = P / (M + 1);
        
        for (int i = 0; i < N; ++i)
        	res = ((res % MOD) * (div % MOD)) % MOD;
        
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(NoRepeatPlaylist.class, "test.*");
    }

	public void test0() {
		RETester.eq(numPlaylists(1, 0, 3), 1);
	}

	public void test1() {
		RETester.eq(numPlaylists(1, 1, 3), 0);
	}

	public void test2() {
		RETester.eq(numPlaylists(2, 0, 3), 6);
	}

	public void test3() {
		RETester.eq(numPlaylists(4, 0, 4), 24);
	}

	public void test4() {
		RETester.eq(numPlaylists(2, 1, 4), 2);
	}

	public void test5() {
		RETester.eq(numPlaylists(50, 5, 100), 222288991);
	}

// END CUT HERE
}
