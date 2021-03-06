package codeforces;

import java.io.*;
import java.util.*;

public class Queue1 {
	public static void main(String[] args) {
		InputReader in = new InputReader(System.in);
		
		int n = in.nextInt();
		int[] serviceTime = new int[n];
		for (int i = 0; i < n; ++i) {
			serviceTime[i] = in.nextInt();
		}
		
		Arrays.sort(serviceTime);
		int ans = 0;
		
		int waitTime = 0;
		for (int i = 0; i < n; ++i) {
			if (serviceTime[i] >= waitTime) {
				++ans;
				waitTime += serviceTime[i];
			}
		}
		System.out.println(ans);
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
