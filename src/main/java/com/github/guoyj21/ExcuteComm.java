package com.github.guoyj21;

import java.io.IOException;
import java.io.InputStream;

public class ExcuteComm {

	private void excuteCmd(String str) {
		InputStream pipeOut = null;
		try {
			Process pro = Runtime.getRuntime().exec(str);

			Thread pipeThread = new Thread(new StreamGobber(pro.getInputStream()));
			Thread errorThread = new Thread(new StreamGobber(pro.getErrorStream()));
			pipeThread.start();
			errorThread.start();
			pro.waitFor();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void runCmd(String str) {
		this.excuteCmd(str);
	}
}
