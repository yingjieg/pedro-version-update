package com.github.guoyj21;

import java.io.IOException;
import java.io.InputStream;

public class StreamGobber implements Runnable {
	private InputStream Pipe;

	public StreamGobber(InputStream pipe) {
		if (pipe == null) {
			throw new NullPointerException("bad pipe");
		}

		Pipe = pipe;
	}

	public void run() {
		byte buffer[] = new byte[2048];
		try {
			int read = Pipe.read(buffer);
			while (read >= 0) {
				System.out.write(buffer, 0, read);
				read = Pipe.read(buffer);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (Pipe != null) {
				try {
					Pipe.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
