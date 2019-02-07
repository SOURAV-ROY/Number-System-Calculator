package calculatorWithConverter;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import javax.swing.GroupLayout.*;


public class NumberSystemCalculator extends JFrame {
	  
//     Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29
//    Integer.parseInt(String, int radix)
    
    public String getDecimal(String decimal) 
    {
		return ""+Integer.parseInt(decimal,10);
	}
    public String getBinary(String binary )
    {
        return ""+Integer.parseInt(binary,2);      
    }
    public String getOctal(String octal )
    {
        return ""+Integer.parseInt(octal,8);      
    }
    public String getHexadecimal(String hexadecimal)
    {
        return ""+Integer.parseInt(hexadecimal,16);      
    }
    
    public String systemTypeComboString;
    
	private JPanel contentPane;
	private JTextField jtf_1;
	private JTextField jtf_2;
	private JTextField jtf_3;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					NumberSystemCalculator frame = new NumberSystemCalculator();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	/**
	 * 
	 */	
	
	public NumberSystemCalculator() {
		
		setTitle("NUMBER SYSTEM CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.setForeground(new Color(0, 0, 128));
		btnMenu.setBackground(new Color(154, 205, 50));
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MAIN_BOSS.mFrame.setVisible(true);
				MAIN_BOSS.nscframe.setVisible(false);
			}
		});
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		jtf_1 = new JTextField();
		jtf_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		jtf_1.setBackground(new Color(245, 255, 250));
		jtf_1.setForeground(new Color(30, 144, 255));
		jtf_1.setColumns(10);
		
		jtf_2 = new JTextField();
		jtf_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		jtf_2.setForeground(new Color(100, 149, 237));
		jtf_2.setBackground(new Color(245, 255, 250));
		jtf_2.setColumns(10);
		
		jtf_3 = new JTextField();
		jtf_3.setEditable(false);
		jtf_3.setBackground(new Color(255, 250, 250));
		jtf_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		jtf_3.setForeground(new Color(255, 0, 0));
		jtf_3.setColumns(10);
		
		JLabel lblSelectNumberSystem = new JLabel("Select Number System :");
		lblSelectNumberSystem.setForeground(new Color(148, 0, 211));
		lblSelectNumberSystem.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSelectNumberSystem.setHorizontalAlignment(SwingConstants.CENTER);

//		COMBO START************************************************************************************************************>>>>>>>>>>>>>>
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(64, 224, 208));
		
		comboBox.setForeground(new Color(165, 42, 42));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.addItem("(Select A Type :)");
		comboBox.addItem("Decimal");
		comboBox.addItem("Binary");
		comboBox.addItem("Octal");
		comboBox.addItem("Hexadecimal");
//		 COMBO EXIT************************************************************************************************************>>>>>>>>>>>>>>
//		ADDITION START************************************************************************************************************>>>>>>>>>>>>>>
		
		JButton btnAddition = new JButton("ADDITION");
		btnAddition.setForeground(new Color(0, 51, 153));
		btnAddition.setBackground(new Color(50, 205, 50));
		
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        String s1 = jtf_1.getText();
		        String s2 = jtf_2.getText();
		        String s3 = systemTypeComboString = comboBox.getSelectedItem().toString();
		        int checkerFlag = 0;
		        
		        if(checkerFlag==0)
		        {
		            if(s3.equals("Decimal"))
		            {
		                try
		                {
		                    double x1 = Double.parseDouble(jtf_1.getText());
		                    double x2 = Double.parseDouble(jtf_2.getText());
		                    double x3 = x1+x2;
		                    
		                    jtf_3.setText(Double.toString(x3));
//		                    File creatFile = new File("/resutl.txt");
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		            else if(s3.equals("Binary"))
		            {
		                try
		                {
		                    int z1=Integer.parseInt(getBinary(s1));
		                    int z2=Integer.parseInt(getBinary(s2));
		                    int z3 = z1+z2;
		                    
//		                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29
		                    
		                    String result = Integer.toBinaryString(z3);
		                    jtf_3.setText(result);
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		            else if(s3.equals("Octal"))
		            {
		                try
		                {
		                    int z1=Integer.parseInt(getOctal(s1));
		                    int z2=Integer.parseInt(getOctal(s2));
		                    int z3 = z1+z2;
		                    
//		                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29
	
		                    String result = Integer.toOctalString(z3);
		                    jtf_3.setText(result);
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		            else if(s3.equals("Hexadecimal"))
		            {
		                try
		                {
		                    int z1=Integer.parseInt(getHexadecimal(s1));
		                    int z2=Integer.parseInt(getHexadecimal(s2));
		                    int z3 = z1+z2;
		                    
//		                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29
	
		                    String result = Integer.toHexString(z3);
		                    jtf_3.setText(result);
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		        }
			}
		});
		btnAddition.setFont(new Font("Tahoma", Font.BOLD, 14));
//		 ADDITION EXIT************************************************************************************************************>>>>>>>>>>>>>>
//		 SUBTRACTION START************************************************************************************************************>>>>>>>>>>>>>>		
		
		JButton btnSubtraction = new JButton("SUBTRACTION");
		btnSubtraction.setForeground(new Color(0, 51, 204));
		btnSubtraction.setBackground(new Color(144, 238, 144));
		
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	        String s1 = jtf_1.getText();
	        String s2 = jtf_2.getText();
	        String s3  = comboBox.getSelectedItem().toString();
	        int checkerFlag =0;
	        
	        if(checkerFlag==0)
	        {
	            if(s3.equals("Decimal"))
	            {
	                try
	                {
	                    double x1 = Double.parseDouble(jtf_1.getText());
	                    double x2 = Double.parseDouble(jtf_2.getText());
	                    double x3 = x1-x2;
	                    jtf_3.setText(Double.toString(x3));
	                }
	                catch(Exception e1)
	                {
	                    
	                }
	            }
	            else if(s3.equals("Binary"))
	            {
	                try
	                {
	                    int z1=Integer.parseInt(getBinary(s1));
	                    int z2=Integer.parseInt(getBinary(s2));
	                    int z3 = z1-z2;
	                    
//	                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29

	                    String result = Integer.toBinaryString(z3);
	                    jtf_3.setText(result);
	                }
	                catch(Exception e1)
	                {
	                    
	                }
	            }
	            else if(s3.equals("Octal"))
	            {
	                try
	                {
	                    int z1=Integer.parseInt(getOctal(s1));
	                    int z2=Integer.parseInt(getOctal(s2));
	                    int z3 = z1-z2;
	                    
//	                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29

	                    String result = Integer.toOctalString(z3);
	                    jtf_3.setText(result);
	                }
	                catch(Exception e1)
	                {
	                    
	                }
	            }
	            else if(s3.equals("Hexadecimal"))
	            {
	                try
	                {
	                    int z1=Integer.parseInt(getHexadecimal(s1));
	                    int z2=Integer.parseInt(getHexadecimal(s2));
	                    int z3 = z1-z2;
	                    
//	                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29

	                    String result = Integer.toHexString(z3);
	                    jtf_3.setText(result);
	                }
	                catch(Exception e1)
	                {
	                    
	                }
	            }
	        }
				
			}
		});
		
		btnSubtraction.setFont(new Font("Tahoma", Font.BOLD, 14));
//		 SUBTRACTION EXIT************************************************************************************************************>>>>>>>>>>>>>>
//		 MULTIPLY START************************************************************************************************************>>>>>>>>>>>>>>
		
		JButton btnMultiply = new JButton("MULTIPLY");
		btnMultiply.setForeground(new Color(0, 0, 128));
		btnMultiply.setBackground(new Color(199, 21, 133));
		
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        String s1 = jtf_1.getText();
		        String s2 = jtf_2.getText();
		        String s3 = systemTypeComboString = comboBox.getSelectedItem().toString();
		        int checkerFlag =0;

		        if(checkerFlag==0)
		        {
		            if(s3.equals("Decimal"))
		            {
		                try
		                {
		                    double x1 = Double.parseDouble(jtf_1.getText());
		                    double x2 = Double.parseDouble(jtf_2.getText());
		                    double x3 = x1*x2;
		                    jtf_3.setText(Double.toString(x3));
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		            else if(s3.equals("Binary"))
		            {
		                try
		                {
		                    int z1=Integer.parseInt(getBinary(s1));
		                    int z2=Integer.parseInt(getBinary(s2));
		                    int z3 = z1*z2;
		                    
//		                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29
	
		                    String result = Integer.toBinaryString(z3);
		                    jtf_3.setText(result);
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		            else if(s3.equals("Octal"))
		            {
		                try
		                {
		                    int z1=Integer.parseInt(getOctal(s1));
		                    int z2=Integer.parseInt(getOctal(s2));
		                    int z3 = z1*z2;
		                    
//		                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29
	
		                    String result = Integer.toOctalString(z3);
		                    jtf_3.setText(result);
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		            else if(s3.equals("Hexadecimal"))
		            {
		                try
		                {
		                    int z1=Integer.parseInt(getHexadecimal(s1));
		                    int z2=Integer.parseInt(getHexadecimal(s2));
		                    int z3 = z1*z2;
		                    String result = Integer.toHexString(z3);
		                    jtf_3.setText(result);
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		        }
				
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
//		MULTIPLY EXIT************************************************************************************************************>>>>>>>>>>>>>>
// 		DIVIDE START************************************************************************************************************>>>>>>>>>>>>>>	
		
		JButton btnDivide = new JButton("DIVIDE");
		btnDivide.setForeground(new Color(51, 51, 153));
		btnDivide.setBackground(new Color(205, 92, 92));
		
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        String s1 = jtf_1.getText();
		        String s2 = jtf_2.getText();
		        String s3 = systemTypeComboString = comboBox.getSelectedItem().toString();
		        int checkerFlag =0;

		        if(checkerFlag==0)
		        {
		            if(s3.equals("Decimal"))
		            {
		                try
		                {
		                    double x1 = Double.parseDouble(jtf_1.getText());
		                    double x2 = Double.parseDouble(jtf_2.getText());
		                    double x3 = x1/x2;
		                    jtf_3.setText(Double.toString(x3));
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		            else if(s3.equals("Binary"))
		            {
		                try
		                {
		                    int z1=Integer.parseInt(getBinary(s1));
		                    int z2=Integer.parseInt(getBinary(s2));
		                    int z3 = z1/z2;
		                    
//		                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29
	
		                    String result = Integer.toBinaryString(z3);
		                    jtf_3.setText(result);
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		            else if(s3.equals("Octal"))
		            {
		                try
		                {
		                    int z1=Integer.parseInt(getOctal(s1));
		                    int z2=Integer.parseInt(getOctal(s2));
		                    int z3 = z1/z2;
		                    
//		                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29
	
		                    String result = Integer.toOctalString(z3);
		                    jtf_3.setText(result);
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		            else if(s3.equals("Hexadecimal"))
		            {
		                try
		                {
		                    int z1=Integer.parseInt(getHexadecimal(s1));
		                    int z2=Integer.parseInt(getHexadecimal(s2));
		                    int z3 = z1/z2;
		                    
//		                  Collect From http://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt%28java.lang.String,%20int%29
	
		                    String result = Integer.toHexString(z3);
		                    jtf_3.setText(result);
		                }
		                catch(Exception e1)
		                {
		                    
		                }
		            }
		        }
				
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
//		 DIVIDE EXIT************************************************************************************************************>>>>>>>>>>>>>>	
//		 CLEAR START************************************************************************************************************>>>>>>>>>>>>>>	
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(new Color(0, 0, 128));
		btnClear.setBackground(new Color(255, 0, 102));
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        jtf_1.setText(null);
		        jtf_2.setText(null);
		        jtf_3.setText(null);
				
			}
		});
		
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
//		 CLEAR EXIT************************************************************************************************************>>>>>>>>>>>>>>
//		 EXIT START************************************************************************************************************>>>>>>>>>>>>>>	
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(new Color(204, 0, 0));
		btnExit.setBackground(new Color(0, 191, 255));
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
//		 EXIT EXIT************************************************************************************************************>>>>>>>>>>>>>>	
		
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(400)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(jtf_1, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(jtf_2, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
						.addComponent(jtf_3, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSelectNumberSystem)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGap(61)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnAddition, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSubtraction, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
							.addGap(68)
							.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(jtf_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(jtf_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addComponent(jtf_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblSelectNumberSystem, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAddition, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(btnSubtraction, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
