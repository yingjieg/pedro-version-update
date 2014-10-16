package com.github.guoyj21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTextField;

public class HandleFile {
	private String PEDRO[];
	private String basePath = null;
	private String fileName = null;
	private static ArrayList<ArrayList<String>> contents;

	public HandleFile(String boardType) {
		basePath = "/vobs/appsim2/CNL_PEDRO/";

		if (boardType.equals("EPB1")) {
			PEDRO = new String[] { "PEDRO1R", "PEDRO2R", "PEDRO3R", "PEDRO7R", "PEDRO8R", "PEDRO9R", "PEDRO10R",
					"PEDRO11R", "PEDRO12R", "PEDRO13R", "PEDRO14R", "PEDRO15R", "PEDRO16R", "PEDRO17R", "PEDRO18R",
					"PEDRO19R", "PEDRO7R_INTERNAL", "PEDRO7R_10G" };
		}
		if (boardType.equals("CETB1")) {
			PEDRO = new String[] { "PEDRO1R", "PEDRO2R", "PEDRO3R", "PEDRO7R", "PEDRO8R", "PEDRO9R", "PEDRO10R",
					"PEDRO11R", "PEDRO12R", "PEDRO13R", "PEDRO14R", "PEDRO15R", "PEDRO16R", "PEDRO17R", "PEDRO18R",
					"PEDRO19R" };
		}

		fileName = "/subunits/definitions/" + boardType + "/program.def";
	}

	private ArrayList<String> getPaths() {
		String tmp = null;
		ArrayList<String> file_list = new ArrayList<String>();

		for (String str : PEDRO) {
			tmp = basePath + "CAA_" + str + fileName;
			file_list.add(tmp);
		}
		return file_list;
	}

	private ArrayList<String> readFile() {
		ArrayList<String> file_list = this.getPaths();
		ArrayList<String> revision_list = new ArrayList<String>();
		contents = new ArrayList<ArrayList<String>>();
		FileReader fr = null;
		BufferedReader br = null;
		String lines = null;
		File file = null;
		for (String f : file_list) {
			ArrayList<String> tmp = new ArrayList<String>();
			file = new File(f);
			if (file.exists()) {
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					while ((lines = br.readLine()) != null) {
						if (lines.startsWith("revision")) {
							revision_list.add(lines);
						}
						tmp.add(lines);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						br.close();
						fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			} else {
				System.out.println("Can not find the path, please check !!!");
				return null;
			}
			contents.add(tmp);
		}
		return revision_list;
	}

	public ArrayList<String> getFileList() {
		return this.getPaths();
	}

	public void updateFile(ArrayList<JTextField> new_list) {
		String tmp = null;
		for (int i = 0; i < contents.size(); i++) {
			for (int j = 0; j < contents.get(i).size(); j++) {
				if (contents.get(i).get(j).startsWith("revision")) {
					tmp = "revision " + new_list.get(i).getText().trim();
					contents.get(i).set(j, tmp);
				}
			}
		}

		ArrayList<String> paths = this.getPaths();
		for (int i = 0; i < contents.size(); i++) {
			write(paths.get(i), contents.get(i));
		}

	}

	private void write(String path, ArrayList<String> content) {
		File f = new File(path);
		StringBuffer buffer = new StringBuffer();
		for (String str : content) {
			buffer.append(str + "\n");
		}
		if (f.exists()) {
			BufferedWriter output = null;
			try {
				output = new BufferedWriter(new FileWriter(f));
				output.write(buffer.toString());
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String[] getPEDRO() {
		return PEDRO;
	}

	public void setPEDRO(String[] pEDRO) {
		PEDRO = pEDRO;
	}

	public ArrayList<String> handleFile() {
		return this.readFile();
	}

	public static void main(String[] args) {
		HandleFile hf = new HandleFile("EPB1");
		hf.readFile();
	}
}
