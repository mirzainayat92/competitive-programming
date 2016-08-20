package codeforces;

import java.io.*;
import java.util.*;

public class BrainsPhotos {
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();

		boolean isColored = false;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				char c = in.next().charAt(0);
				if (!"WBG".contains("" + c)) {
					isColored = true;
				}
			}
		}
		
		System.out.println(isColored ? "#Color" : "#Black&White");
	}
	

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = new StringTokenizer("");
		}

		public String next() {
			try {
				while (!tokenizer.hasMoreTokens())
					tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
			return tokenizer.nextToken();
		}
		
		public String nextLine() {
			String line = null;
			try {
				tokenizer = new StringTokenizer("");
				line =  reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			return line;
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
		
		boolean hasNext() {
            while (!tokenizer.hasMoreTokens()) {
                String line = nextLine();
                if (line == null) return false;
                tokenizer = new StringTokenizer(line);
            }
            return true;
        }
	}
}
