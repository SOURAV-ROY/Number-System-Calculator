package calculatorWithConverter;

import java.awt.*;
//import java.awt.EventQueue;
//import java.awt.Color;
//import java.awt.Font;

import java.awt.event.*;
//import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Menu extends JFrame {

	private JPanel contentPane;

	public static Menu frame;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame = new Menu();
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
	public Menu() {
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lbl_Welcome = new JLabel("WELCOME");
		lbl_Welcome.setFont(new Font("SansSerif", Font.BOLD, 30));
		lbl_Welcome.setForeground(new Color(154, 205, 50));
		lbl_Welcome.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNSC = new JButton("NUMBER SYSTEM CALCULATOR");
		btnNSC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				
				MAIN_BOSS.mFrame.setVisible(false);
				MAIN_BOSS.nscframe.setVisible(true);
			}
		});
		btnNSC.setBackground(new Color(127, 255, 212));
		btnNSC.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNSC.setForeground(new Color(199, 21, 133));
		
		JButton btnConverter = new JButton("CONVERTER");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				MAIN_BOSS.mFrame.setVisible(false);
				MAIN_BOSS.cFrame.setVisible(true);
				
				
			}
		});
		btnConverter.setBackground(new Color(135, 206, 250));
		btnConverter.setForeground(new Color(199, 21, 133));
		btnConverter.setFont(new Font("SansSerif", Font.BOLD, 14));
		
		JButton btnAbout = new JButton("ABOUT");
		btnAbout.setBackground(new Color(0, 206, 209));
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				MAIN_BOSS.mFrame.setVisible(false);
				MAIN_BOSS.aFrame.setVisible(true);

			}
		});
		btnAbout.setForeground(new Color(0, 0, 128));
		btnAbout.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				System.exit(0);
			}
		});
		btnExit.setBackground(new Color(238, 232, 170));
		btnExit.setForeground(new Color(220, 20, 60));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblSelectOption = new JLabel("Select Option");
		lblSelectOption.setForeground(new Color(250, 128, 114));
		lblSelectOption.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblSelectOption.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_NSCWC = new JLabel("Number System Calculator With Converter");
		lbl_NSCWC.setBackground(new Color(95, 158, 160));
		lbl_NSCWC.setForeground(new Color(128, 0, 128));
		lbl_NSCWC.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_NSCWC.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_NSCWC, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(136)
							.addComponent(lbl_Welcome, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(99)
							.addComponent(lblSelectOption, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(104)
					.addComponent(btnNSC, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(160)
					.addComponent(btnConverter, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(btnAbout, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(284)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addComponent(lbl_NSCWC, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
						.addComponent(lbl_Welcome, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(97)
							.addComponent(lblSelectOption, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addComponent(btnNSC, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addComponent(btnConverter, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAbout, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
