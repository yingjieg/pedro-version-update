package com.github.guoyj21;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ActionListener {
	private JTextField txt_1r;
	private JTextField txt_2r;
	private JTextField txt_3r;
	private JTextField txt_7r;
	private JTextField txt_8r;
	private JTextField txt_9r;
	private JTextField txt_10r;
	private JTextField txt_11r;
	private JTextField txt_12r;
	private JTextField txt_13r;
	private JTextField txt_14r;
	private JTextField txt_15r;
	private JTextField txt_16r;
	private JTextField txt_17r;
	private JTextField txt_18r;
	private JTextField txt_19r;
	private JTextField txt_1r_new;
	private JTextField txt_2r_new;
	private JTextField txt_3r_new;
	private JTextField txt_7r_new;
	private JTextField txt_8r_new;
	private JTextField txt_9r_new;
	private JTextField txt_10r_new;
	private JTextField txt_11r_new;
	private JTextField txt_12r_new;
	private JTextField txt_13r_new;
	private JTextField txt_14r_new;
	private JTextField txt_15r_new;
	private JTextField txt_16r_new;
	private JTextField txt_17r_new;
	private JTextField txt_18r_new;
	private JTextField txt_19r_new;
	private JTextField txt_7r_in;
	private JTextField txt_7r_in_new;

	private JTextField txt_7r_10g;
	private JTextField txt_7r_10g_new;

	private JLabel lblNewLabel_2;

	private JLabel lblNewLabel_10g;

	private JButton btnGetVersion = null;
	private JButton btnUpdate = null;
	private JButton btnClear = null;

	private JCheckBox cbEPB1 = null;
	private JCheckBox cbCETB1 = null;

	private ButtonGroup bg = null;

	private ArrayList<JTextField> txt_list;
	private ArrayList<JTextField> new_list;

	public MainFrame() {
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("PEDRO1R");
		lblNewLabel.setBounds(43, 12, 85, 42);
		getContentPane().add(lblNewLabel);

		JLabel lblPedror = new JLabel("PEDRO2R");
		lblPedror.setBounds(43, 39, 85, 42);
		getContentPane().add(lblPedror);

		JLabel lblPedror_1 = new JLabel("PEDRO3R");
		lblPedror_1.setBounds(43, 66, 85, 42);
		getContentPane().add(lblPedror_1);

		JLabel lblPedror_2 = new JLabel("PEDRO7R");
		lblPedror_2.setBounds(43, 93, 85, 42);
		getContentPane().add(lblPedror_2);

		JLabel lblPedror_3 = new JLabel("PEDRO8R");
		lblPedror_3.setBounds(43, 120, 85, 42);
		getContentPane().add(lblPedror_3);

		JLabel lblPedror_4 = new JLabel("PEDRO9R");
		lblPedror_4.setBounds(43, 147, 85, 42);
		getContentPane().add(lblPedror_4);

		JLabel lblPedror_5 = new JLabel("PEDRO10R");
		lblPedror_5.setBounds(43, 174, 85, 42);
		getContentPane().add(lblPedror_5);

		JLabel lblPedror_6 = new JLabel("PEDRO11R");
		lblPedror_6.setBounds(43, 201, 85, 42);
		getContentPane().add(lblPedror_6);

		JLabel lblPedror_7 = new JLabel("PEDRO12R");
		lblPedror_7.setBounds(43, 228, 85, 42);
		getContentPane().add(lblPedror_7);

		JLabel lblPedror_8 = new JLabel("PEDRO13R");
		lblPedror_8.setBounds(43, 255, 85, 42);
		getContentPane().add(lblPedror_8);

		JLabel lblPedror_9 = new JLabel("PEDRO14R");
		lblPedror_9.setBounds(43, 282, 85, 42);
		getContentPane().add(lblPedror_9);

		JLabel lblPedror_10 = new JLabel("PEDRO15R");
		lblPedror_10.setBounds(43, 309, 85, 42);
		getContentPane().add(lblPedror_10);

		JLabel lblPedror_11 = new JLabel("PEDRO16R");
		lblPedror_11.setBounds(43, 336, 85, 42);
		getContentPane().add(lblPedror_11);

		JLabel lblPedror_12 = new JLabel("PEDRO17R");
		lblPedror_12.setBounds(43, 363, 85, 42);
		getContentPane().add(lblPedror_12);

		JLabel lblPedror_13 = new JLabel("PEDRO18R");
		lblPedror_13.setBounds(43, 390, 85, 42);
		getContentPane().add(lblPedror_13);

		JLabel lblPedror_14 = new JLabel("PEDRO19R");
		lblPedror_14.setBounds(43, 417, 85, 42);
		getContentPane().add(lblPedror_14);

		lblNewLabel_2 = new JLabel("PEDRO7R_IN");
		lblNewLabel_2.setBounds(43, 444, 85, 42);
		getContentPane().add(lblNewLabel_2);

		lblNewLabel_10g = new JLabel("PEDRO7R10G");
		lblNewLabel_10g.setBounds(43, 471, 85, 42);
		getContentPane().add(lblNewLabel_10g);

		txt_1r = new JTextField();
		txt_1r.setBounds(136, 24, 124, 18);
		getContentPane().add(txt_1r);
		txt_1r.setColumns(10);
		txt_1r.setEditable(false);

		txt_2r = new JTextField();
		txt_2r.setBounds(136, 51, 124, 18);
		txt_2r.setColumns(10);
		getContentPane().add(txt_2r);
		txt_2r.setEditable(false);

		txt_3r = new JTextField();
		txt_3r.setBounds(136, 78, 124, 18);
		txt_3r.setColumns(10);
		getContentPane().add(txt_3r);
		txt_3r.setEditable(false);

		txt_7r = new JTextField();
		txt_7r.setBounds(136, 105, 124, 18);
		txt_7r.setColumns(10);
		getContentPane().add(txt_7r);
		txt_7r.setEditable(false);

		txt_8r = new JTextField();
		txt_8r.setBounds(136, 132, 124, 18);
		txt_8r.setColumns(10);
		getContentPane().add(txt_8r);
		txt_8r.setEditable(false);

		txt_9r = new JTextField();
		txt_9r.setBounds(136, 159, 124, 18);
		txt_9r.setColumns(10);
		getContentPane().add(txt_9r);
		txt_9r.setEditable(false);

		txt_10r = new JTextField();
		txt_10r.setBounds(136, 186, 124, 18);
		txt_10r.setColumns(10);
		getContentPane().add(txt_10r);
		txt_10r.setEditable(false);

		txt_11r = new JTextField();
		txt_11r.setBounds(136, 213, 124, 18);
		txt_11r.setColumns(10);
		getContentPane().add(txt_11r);
		txt_11r.setEditable(false);

		txt_12r = new JTextField();
		txt_12r.setBounds(136, 240, 124, 18);
		txt_12r.setColumns(10);
		getContentPane().add(txt_12r);
		txt_12r.setEditable(false);

		txt_13r = new JTextField();
		txt_13r.setBounds(136, 267, 124, 18);
		txt_13r.setColumns(10);
		getContentPane().add(txt_13r);
		txt_13r.setEditable(false);

		txt_14r = new JTextField();
		txt_14r.setBounds(136, 294, 124, 18);
		txt_14r.setColumns(10);
		getContentPane().add(txt_14r);
		txt_14r.setEditable(false);

		txt_15r = new JTextField();
		txt_15r.setBounds(136, 321, 124, 18);
		txt_15r.setColumns(10);
		getContentPane().add(txt_15r);
		txt_15r.setEditable(false);

		txt_16r = new JTextField();
		txt_16r.setBounds(136, 348, 124, 18);
		txt_16r.setColumns(10);
		getContentPane().add(txt_16r);
		txt_16r.setEditable(false);

		txt_17r = new JTextField();
		txt_17r.setBounds(136, 375, 124, 18);
		txt_17r.setColumns(10);
		getContentPane().add(txt_17r);
		txt_17r.setEditable(false);

		txt_18r = new JTextField();
		txt_18r.setEditable(false);
		txt_18r.setColumns(5);
		txt_18r.setBounds(136, 402, 124, 18);
		getContentPane().add(txt_18r);

		txt_19r = new JTextField();
		txt_19r.setEditable(false);
		txt_19r.setColumns(5);
		txt_19r.setBounds(136, 429, 124, 18);
		getContentPane().add(txt_19r);

		txt_7r_in = new JTextField();
		txt_7r_in.setEditable(false);
		txt_7r_in.setBounds(136, 456, 124, 18);
		getContentPane().add(txt_7r_in);
		txt_7r_in.setColumns(5);

		// pedro7r10g
		txt_7r_10g = new JTextField();
		txt_7r_10g.setEditable(false);
		txt_7r_10g.setBounds(136, 483, 124, 18);
		getContentPane().add(txt_7r_10g);
		txt_7r_10g.setColumns(5);

		// buttons---------------------
		btnGetVersion = new JButton("Get Revision");
		btnGetVersion.setBounds(54, 550, 152, 26);
		getContentPane().add(btnGetVersion);

		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(303, 550, 122, 26);
		getContentPane().add(btnUpdate);

		btnClear = new JButton("Clear All");
		btnClear.setBounds(448, 550, 122, 26);
		getContentPane().add(btnClear);
		// buttons-------------------------
		txt_1r_new = new JTextField();
		txt_1r_new.setBounds(303, 24, 64, 18);
		txt_1r_new.setColumns(5);
		getContentPane().add(txt_1r_new);

		txt_2r_new = new JTextField();
		txt_2r_new.setBounds(303, 51, 64, 18);
		txt_2r_new.setColumns(5);
		getContentPane().add(txt_2r_new);

		txt_3r_new = new JTextField();
		txt_3r_new.setBounds(303, 78, 64, 18);
		txt_3r_new.setColumns(5);
		getContentPane().add(txt_3r_new);

		txt_7r_new = new JTextField();
		txt_7r_new.setBounds(303, 105, 64, 18);
		txt_7r_new.setColumns(5);
		getContentPane().add(txt_7r_new);

		txt_8r_new = new JTextField();
		txt_8r_new.setBounds(303, 132, 64, 18);
		txt_8r_new.setColumns(5);
		getContentPane().add(txt_8r_new);

		txt_9r_new = new JTextField();
		txt_9r_new.setBounds(303, 159, 64, 18);
		txt_9r_new.setColumns(5);
		getContentPane().add(txt_9r_new);

		txt_10r_new = new JTextField();
		txt_10r_new.setBounds(303, 186, 64, 18);
		txt_10r_new.setColumns(5);
		getContentPane().add(txt_10r_new);

		txt_11r_new = new JTextField();
		txt_11r_new.setBounds(303, 213, 64, 18);
		txt_11r_new.setColumns(5);
		getContentPane().add(txt_11r_new);

		txt_12r_new = new JTextField();
		txt_12r_new.setBounds(303, 240, 64, 18);
		txt_12r_new.setColumns(5);
		getContentPane().add(txt_12r_new);

		txt_13r_new = new JTextField();
		txt_13r_new.setBounds(303, 267, 64, 18);
		txt_13r_new.setColumns(5);
		getContentPane().add(txt_13r_new);

		txt_14r_new = new JTextField();
		txt_14r_new.setBounds(303, 294, 64, 18);
		txt_14r_new.setColumns(5);
		getContentPane().add(txt_14r_new);

		txt_15r_new = new JTextField();
		txt_15r_new.setBounds(303, 321, 64, 18);
		txt_15r_new.setColumns(5);
		getContentPane().add(txt_15r_new);

		txt_16r_new = new JTextField();
		txt_16r_new.setBounds(303, 348, 64, 18);
		txt_16r_new.setColumns(5);
		getContentPane().add(txt_16r_new);

		txt_17r_new = new JTextField();
		txt_17r_new.setBounds(303, 375, 64, 18);
		txt_17r_new.setColumns(5);
		getContentPane().add(txt_17r_new);

		txt_18r_new = new JTextField();
		txt_18r_new.setColumns(5);
		txt_18r_new.setBounds(303, 402, 64, 18);
		getContentPane().add(txt_18r_new);

		txt_19r_new = new JTextField();
		txt_19r_new.setColumns(5);
		txt_19r_new.setBounds(303, 429, 64, 18);
		getContentPane().add(txt_19r_new);

		txt_7r_in_new = new JTextField();
		txt_7r_in_new.setBounds(303, 456, 64, 18);
		getContentPane().add(txt_7r_in_new);
		txt_7r_in_new.setColumns(5);

		txt_7r_10g_new = new JTextField();
		// txt_7r_10g_new.setEditable(false);
		txt_7r_10g_new.setBounds(303, 483, 64, 18);
		getContentPane().add(txt_7r_10g_new);
		txt_7r_10g_new.setColumns(5);

		JLabel lblNewLabel_1 = new JLabel("Example: R1A01");
		lblNewLabel_1.setBounds(401, 25, 147, 16);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		getContentPane().add(lblNewLabel_1);

		cbEPB1 = new JCheckBox("EPB1");
		cbEPB1.setBounds(440, 99, 80, 20);
		getContentPane().add(cbEPB1);
		cbEPB1.setSelected(true);

		cbCETB1 = new JCheckBox("CETB1");
		cbCETB1.setBounds(440, 128, 80, 20);
		getContentPane().add(cbCETB1);

		bg = new ButtonGroup();
		bg.add(cbEPB1);
		bg.add(cbCETB1);

		this.initTxtList();

		/* register action */
		btnGetVersion.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnClear.addActionListener(this);
		cbEPB1.addActionListener(this);
		cbCETB1.addActionListener(this);
	}

	private void initTxtList() {
		txt_list = new ArrayList<JTextField>();
		txt_list.add(txt_1r);
		txt_list.add(txt_2r);
		txt_list.add(txt_3r);
		txt_list.add(txt_7r);
		txt_list.add(txt_8r);
		txt_list.add(txt_9r);
		txt_list.add(txt_10r);
		txt_list.add(txt_11r);
		txt_list.add(txt_12r);
		txt_list.add(txt_13r);
		txt_list.add(txt_14r);
		txt_list.add(txt_15r);
		txt_list.add(txt_16r);
		txt_list.add(txt_17r);
		txt_list.add(txt_18r);
		txt_list.add(txt_19r);
		txt_list.add(txt_7r_in);
		txt_list.add(txt_7r_10g);

		new_list = new ArrayList<JTextField>();
		new_list.add(txt_1r_new);
		new_list.add(txt_2r_new);
		new_list.add(txt_3r_new);
		new_list.add(txt_7r_new);
		new_list.add(txt_8r_new);
		new_list.add(txt_9r_new);
		new_list.add(txt_10r_new);
		new_list.add(txt_11r_new);
		new_list.add(txt_12r_new);
		new_list.add(txt_13r_new);
		new_list.add(txt_14r_new);
		new_list.add(txt_15r_new);
		new_list.add(txt_16r_new);
		new_list.add(txt_17r_new);
		new_list.add(txt_18r_new);
		new_list.add(txt_19r_new);
		new_list.add(txt_7r_in_new);
		new_list.add(txt_7r_10g_new);
	}

	public void actionPerformed(ActionEvent arg0) {
		HandleFile hf = new HandleFile(this.getBoardType());
		if (arg0.getSource() == btnGetVersion) {
			ArrayList<String> list = hf.handleFile();
			if (list == null) {
				System.out.println("Can not find the program.def, please check !!!");
			} else {
				for (int i = 0; i < list.size(); i++) {
					txt_list.get(i).setText(list.get(i));
				}
			}
		}

		if (arg0.getSource() == btnUpdate) {
			System.out.println("Now begin to check the file");
			ExcuteComm cmd = new ExcuteComm();
			ArrayList<String> files = hf.getFileList();

			for (String str : files) {
				cmd.runCmd("cleartool co -c \"update\"  " + str);
			}

			/* board type is cetb1 , remove the pedro7r_internal and pedro7r_10g */
			if (cbEPB1.isSelected() == false) {
				new_list.remove(txt_7r_10g_new);
				new_list.remove(txt_7r_in_new);
			} else {
				if (new_list.remove(txt_7r_in_new) == false)
					new_list.add(txt_7r_in_new);
				else
					new_list.add(txt_7r_in_new);

				if (new_list.remove(txt_7r_10g_new) == false)
					new_list.add(txt_7r_10g_new);
				else
					new_list.add(txt_7r_10g_new);
			}

			hf.updateFile(new_list);

			System.out.println("######  successful   ##########");
		}
		if (arg0.getSource() == btnClear) {
			for (int i = 0; i < new_list.size(); i++) {
				new_list.get(i).setText("");
				// txt_list.get(i).setText("");
			}
		}
		if (arg0.getSource() == cbEPB1) {
			txt_7r_in_new.setVisible(true);
			txt_7r_in.setVisible(true);
			lblNewLabel_2.setVisible(true);

			txt_7r_10g_new.setVisible(true);
			txt_7r_10g.setVisible(true);
			lblNewLabel_10g.setVisible(true);

			for (int i = 0; i < new_list.size(); i++) {
				new_list.get(i).setText("");
				txt_list.get(i).setText("");
			}
		}
		if (arg0.getSource() == cbCETB1) {
			txt_7r_in_new.setVisible(false);
			txt_7r_in.setVisible(false);
			lblNewLabel_2.setVisible(false);

			txt_7r_10g_new.setVisible(false);
			txt_7r_10g.setVisible(false);
			lblNewLabel_10g.setVisible(false);

			for (int i = 0; i < new_list.size(); i++) {
				new_list.get(i).setText("");
				txt_list.get(i).setText("");
			}
		}
	}

	private String getBoardType() {
		if (cbEPB1.isSelected())
			return "EPB1";
		else
			return "CETB1";
	}

	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		mf.setTitle("R1A04    Zero");
		mf.setVisible(true);
		mf.setBounds(300, 100, 590, 650);
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
