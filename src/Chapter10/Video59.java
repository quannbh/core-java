package Chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Video59 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			// ralative path
			in = new FileInputStream("./src/Chapter10/input.txt");

			// absolute path .

			out = new FileOutputStream("./src/Chapter10/outagain.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}

			if (out != null) {
				out.close();
			}
		}
		System.out.println("success");
	}
}
