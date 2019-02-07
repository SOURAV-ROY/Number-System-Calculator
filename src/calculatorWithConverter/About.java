package calculatorWithConverter;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.GroupLayout.*;


public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public About() {
		setTitle("ABOUT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btn_Menu = new JButton("MENU");
		btn_Menu.setForeground(new Color(154, 205, 50));
		btn_Menu.setBackground(new Color(128, 0, 128));
		btn_Menu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MAIN_BOSS.mFrame.setVisible(true);
				MAIN_BOSS.aFrame.setVisible(false);
			}
		});
		
		JLabel lblAbout = new JLabel("ABOUT");
		lblAbout.setForeground(new Color(178, 34, 34));
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbout.setFont(new Font("Tahoma", Font.BOLD, 36));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(new Color(255, 69, 0));
		btnExit.setBackground(new Color(230, 230, 250));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel = new JLabel("NUMBER SYSTEM CALCULATOR WITH CONVERTER");
		lblNewLabel.setForeground(new Color(50, 205, 50));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblSouravChandraRoy = new JLabel("SOURAV CHANDRA ROY");
		lblSouravChandraRoy.setForeground(new Color(100, 149, 237));
		lblSouravChandraRoy.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSouravChandraRoy.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblId = new JLabel("ID : 1420429042");
		lblId.setForeground(new Color(199, 21, 133));
		lblId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblSec = new JLabel("SEC : 07");
		lblSec.setForeground(new Color(240, 128, 128));
		lblSec.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSec.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_Java = new JLabel("CSE-215L (JAVA)");
		lbl_Java.setForeground(new Color(138, 43, 226));
		lbl_Java.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbl_Java.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(btn_Menu, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(404)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(140)
					.addComponent(lblAbout, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(150)
					.addComponent(lbl_Java, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 564, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(105)
					.addComponent(lblSouravChandraRoy, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(122)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblSec, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_Menu, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(lblAbout, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(lbl_Java, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblSouravChandraRoy, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addComponent(lblSec, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
