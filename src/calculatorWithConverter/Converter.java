package calculatorWithConverter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;

public class Converter extends JFrame {
	  
    //Declaring Variables
    public String unitComboBoxString ;
    public String fromComboBoxString ;
    public String toComboBoxString ;
    
    public String inputValue;
    public String outputResult;
    
    public double converterInput ;
    public double converterOutput;

    
    //Initializing Items List    
    //Empty
    public String[] emptyItemList = new String[]{""};
    //Angle
    public String[] angleItemList = new String[]{"Degree","Radian"};
    //Time
    public String[] timeItemList = new String[]{"Day","Hour","Minute","Second"};
    //Weight
    public String[] weightItemList = new String[]{"Kilogram","Gram","Pound"};
   
         
         public void converterConvertExecute()
         {
          
             unitComboBoxString=comboBox_Unit.getSelectedItem().toString();
             fromComboBoxString=comboBox_From.getSelectedItem().toString();
             toComboBoxString=comboBox_To.getSelectedItem().toString();
         	        	
             switch(unitComboBoxString)
             {
             
             //angle
             case "Angle":
            	 
                 // both equal
                 double pi = Math.PI;
                 
                 if( fromComboBoxString.equals(toComboBoxString) )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * 1;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //degree to radian
                  if( fromComboBoxString.equals("Degree")&&toComboBoxString.equals("Radian") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * ( pi / 180 );
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                  
                 //radian to degree
                 else if( fromComboBoxString.equals("Radian")&&toComboBoxString.equals("Degree") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * ( 180 / pi );
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }

             //Time
             case "Time":
                 // both equal
                 if( fromComboBoxString.equals(toComboBoxString) )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * 1;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //day to hour
                 else if( fromComboBoxString.equals("Day")&&toComboBoxString.equals("Hour") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * ( 24 );
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //day to minute
                 else if( fromComboBoxString.equals("Day")&&toComboBoxString.equals("Minute") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * ( 24 * 60 );
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //day to second
                 else if( fromComboBoxString.equals("Day")&&toComboBoxString.equals("Second") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * ( 24 * 60 * 60 );
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //hour to day
                 else if( fromComboBoxString.equals("Hour")&&toComboBoxString.equals("Day") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput /24 ;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //hour to min
                 else if( fromComboBoxString.equals("Hour")&&toComboBoxString.equals("Minute") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * ( 60  );
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //hour to sec
                 else if( fromComboBoxString.equals("Hour")&&toComboBoxString.equals("Second") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * ( 60*60 );
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //minute to day
                 else if( fromComboBoxString.equals("Minute")&&toComboBoxString.equals("Day") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput  / ( 24 * 60 ) ;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //minute to hour
                 else if( fromComboBoxString.equals("Minute")&&toComboBoxString.equals("Hour") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput  /  60 ;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //minute to second
                 else if( fromComboBoxString.equals("Minute")&&toComboBoxString.equals("Second") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * (  60  );
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //second to day
                 else if( fromComboBoxString.equals("Second")&&toComboBoxString.equals("Day") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput / ( 24*60*60 )  ;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //second to day
                 else if( fromComboBoxString.equals("Second")&&toComboBoxString.equals("Hour") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput / ( 60*60 )   ;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //second to minute
                 else if( fromComboBoxString.equals("Second")&&toComboBoxString.equals("Minute") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput /  60    ;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }

             case "Weight":
                 //both equal
                 if( fromComboBoxString.equals(toComboBoxString) )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput = converterInput * 1;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //kilogram to Gram
                 else if( fromComboBoxString.equals("Kilogram")&&toComboBoxString.equals("Gram") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput =  converterInput * 1000;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //kilogram to Pound
                 else if( fromComboBoxString.equals("Kilogram")&&toComboBoxString.equals("Pound") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput =  converterInput * 2.2046226;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //Gram to Kilogram
                 else if( fromComboBoxString.equals("Gram")&&toComboBoxString.equals("Kilogram") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput =  converterInput * 0.001;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //Gram to Pound
                 else if( fromComboBoxString.equals("Gram")&&toComboBoxString.equals("Pound") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput =  converterInput * 0.0022046226;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //Pound to Kilogram
                 else if( fromComboBoxString.equals("Pound")&&toComboBoxString.equals("Kilogram") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput =  converterInput * 0.453592374;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
                 
                 //Pound to Gram
                 else if( fromComboBoxString.equals("Pound")&&toComboBoxString.equals("Gram") )
                 {
                     inputValue = jtf_From.getText();
                     converterInput = Double.parseDouble(inputValue);
                     converterOutput =  converterInput * 453.592374;
                     outputResult = ""+converterOutput;
                     jtf_To.setText(outputResult);
                 }
             }

         }
    
         
	private JPanel contentPane;
	private JTextField jtf_From;
	private JTextField jtf_To;
	

	public static void main(String[] args) {
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					Converter frame = new Converter();
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Converter() {
		
		setTitle("CONVERTER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
//		FROM-TEXT_FIELD--TO_TEXT_FIELD >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		jtf_From = new JTextField();
		jtf_From.setFont(new Font("Tahoma", Font.BOLD, 15));
		jtf_From.setForeground(new Color(0, 0, 128));
		jtf_From.setBackground(new Color(248, 248, 255));
		jtf_From.setEditable(false);
		jtf_From.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jtf_From.setColumns(10);
		
		jtf_To = new JTextField();
		jtf_To.setEditable(false);
		jtf_To.setFont(new Font("Tahoma", Font.BOLD, 15));
		jtf_To.setForeground(new Color(220, 20, 60));
//		jtf_To.setForeground(new Color(255, 0, 0));
		jtf_To.setBackground(new Color(245, 255, 250));
		jtf_To.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jtf_To.setColumns(10);
		
//		BUTTON START >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setForeground(new Color(153, 0, 102));
		btnMenu.setBackground(new Color(0, 204, 153));
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MAIN_BOSS.mFrame.setVisible(true);
				MAIN_BOSS.cFrame.setVisible(false);
			}
		});
		
		JButton jbt1 = new JButton("1");
		jbt1.setBackground(new Color(199, 21, 133));
		jbt1.setForeground(new Color(255, 255, 255));
		jbt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNumber = jtf_From.getText() + jbt1.getText();
				jtf_From.setText(enterNumber);
			}
		});
		jbt1.setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton jbt2 = new JButton("2");
		jbt2.setForeground(new Color(255, 255, 255));
		jbt2.setBackground(new Color(199, 21, 133));
		jbt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = jtf_From.getText() + jbt2.getText();
				jtf_From.setText(enterNumber);
			}
		});
		jbt2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton jbt3 = new JButton("3");
		jbt3.setForeground(new Color(255, 255, 255));
		jbt3.setBackground(new Color(199, 21, 133));
		jbt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = jtf_From.getText() + jbt3.getText();
				jtf_From.setText(enterNumber);
			}
		});
		
		jbt3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton jbt4 = new JButton("4");
		jbt4.setForeground(new Color(255, 255, 255));
		jbt4.setBackground(new Color(199, 21, 133));
		jbt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = jtf_From.getText() + jbt4.getText();
				jtf_From.setText(enterNumber);
			}
		});
		jbt4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton jbt5 = new JButton("5");
		jbt5.setForeground(new Color(255, 255, 255));
		jbt5.setBackground(new Color(199, 21, 133));
		jbt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = jtf_From.getText() + jbt5.getText();
				jtf_From.setText(enterNumber);
			}
		});
		jbt5.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton jbt6 = new JButton("6");
		jbt6.setForeground(new Color(255, 255, 255));
		jbt6.setBackground(new Color(199, 21, 133));
		jbt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = jtf_From.getText() + jbt6.getText();
				jtf_From.setText(enterNumber);
			}
		});
		jbt6.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton jbt7 = new JButton("7");
		jbt7.setForeground(new Color(255, 255, 255));
		jbt7.setBackground(new Color(199, 21, 133));
		jbt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = jtf_From.getText() + jbt7.getText();
				jtf_From.setText(enterNumber);
			}
		});
		jbt7.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton jbt8 = new JButton("8");
		jbt8.setForeground(new Color(255, 255, 255));
		jbt8.setBackground(new Color(199, 21, 133));
		jbt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = jtf_From.getText() + jbt8.getText();
				jtf_From.setText(enterNumber);
			}
		});
		jbt8.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton jbt9 = new JButton("9");
		jbt9.setForeground(new Color(255, 255, 255));
		jbt9.setBackground(new Color(199, 21, 133));
		jbt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = jtf_From.getText() + jbt9.getText();
				jtf_From.setText(enterNumber);
			}
		});
		jbt9.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton jbt10 = new JButton("0");
		jbt10.setForeground(new Color(255, 255, 255));
		jbt10.setBackground(new Color(199, 21, 133));
		jbt10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = jtf_From.getText() + jbt10.getText();
				jtf_From.setText(enterNumber);
			}
		});
		jbt10.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton jbt11 = new JButton(".");
		jbt11.setForeground(new Color(255, 255, 255));
		jbt11.setBackground(new Color(199, 21, 133));
		jbt11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = jtf_From.getText() + jbt11.getText();
				jtf_From.setText(enterNumber);
			}
		});
		jbt11.setFont(new Font("Tahoma", Font.BOLD, 14));
//		BUTTON EXIT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
		
		comboBox_Unit = new JComboBox<String>();
		comboBox_Unit.setBackground(new Color(240, 255, 240));
		comboBox_Unit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
								
				switch ( comboBox_Unit.getSelectedIndex()) {
				
					case 1:
						comboBox_From.setModel(new DefaultComboBoxModel<String>(angleItemList));
			            comboBox_To.setModel(new DefaultComboBoxModel<String>(angleItemList)); 
						break;
					case 2:
						comboBox_From.setModel(new DefaultComboBoxModel<String>(timeItemList));
			            comboBox_To.setModel(new DefaultComboBoxModel<String>(timeItemList)); 
						break;
					case 3:
						comboBox_From.setModel(new DefaultComboBoxModel<String>(weightItemList));
			            comboBox_To.setModel(new DefaultComboBoxModel<String>(weightItemList));
			            break;
				}
				
			}
		});
		comboBox_Unit.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_Unit.setForeground(new Color(0, 0, 205));
		comboBox_Unit.addItem("(Select A Unit: )");
		comboBox_Unit.addItem("Angle");
		comboBox_Unit.addItem("Time");
		comboBox_Unit.addItem("Weight");


//		LEBEL START >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		JLabel lbl_Unit = new JLabel("UNIT :");
		lbl_Unit.setForeground(new Color(204, 0, 0));
		lbl_Unit.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Unit.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_From = new JLabel("FROM");
		lbl_From.setForeground(new Color(60, 179, 113));
		lbl_From.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_From.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lbl_From1 = new JLabel("FROM");
		lbl_From1.setForeground(new Color(60, 179, 113));
		lbl_From1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbl_From1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_To = new JLabel("TO");
		lbl_To.setForeground(new Color(148, 0, 211));
		lbl_To.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_To.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_To1 = new JLabel("TO");
		lbl_To1.setForeground(new Color(139, 0, 139));
		lbl_To1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbl_To1.setHorizontalAlignment(SwingConstants.CENTER);
		
		
//		LEBEL EXIT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
//		COMBO-BOX START >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		comboBox_From = new JComboBox<String>();
		comboBox_From.setForeground(new Color(0, 128, 128));
		comboBox_From.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_From.setBackground(new Color(255, 245, 238));
	    comboBox_From.setModel(new DefaultComboBoxModel<String>(new String[] { " " }));
		
		comboBox_To = new JComboBox<String>();
		comboBox_To.setForeground(new Color(255, 99, 71));
		comboBox_To.setBackground(new Color(255, 245, 238));
		comboBox_To.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox_To.setModel(new DefaultComboBoxModel<String>(new String[] { " " }));
//		COMBO-BOX EXIT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//		CONVERT START >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
		
		JButton btnConvert = new JButton("CONVERT");
		btnConvert.setForeground(new Color(0, 0, 255));
		btnConvert.setBackground(new Color(176, 224, 230));
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
            String checkIsInputEmptyOrNot = jtf_From.getText();
                
                if(checkIsInputEmptyOrNot=="")
	                {
	                }
                else
                {
                    try
                    {
                        converterConvertExecute();
                    }                    
                    catch(Exception e1)
                    {;
                        jtf_To.setText(""); 
                    }
                    
                } 
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
//		CONVER EXIT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//		BACHSPACE START >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		JButton btnBackSpace = new JButton("Backspace");
		btnBackSpace.setForeground(new Color(165, 42, 42));
		btnBackSpace.setBackground(new Color(240, 248, 255));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        int isInputEmptyFlag=0;	        
		        String sou = jtf_From.getText();
		        
		        if(sou.equals(""))
		        {
		            isInputEmptyFlag=1;
		        }
		        if(isInputEmptyFlag==0)
		        {
		            String oldString;
		            String newString;
		            
		            oldString=jtf_From.getText();
		            
		            int oldStringLength = oldString.length();
		            int index = oldStringLength-1;
		            
		            newString=oldString.substring(0,index);
		            
		            jtf_From.setText(newString);
		        }
				
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 13));
//		BACHSPACE EXIT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// 		CLEAR START >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(new Color(255, 0, 0));
		btnClear.setBackground(new Color(224, 255, 255));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_From.setText(null);
				jtf_To.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
// 		CLEAR EXIT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//		EXIT START >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(new Color(255, 0, 0));
		btnExit.setBackground(new Color(192, 192, 192));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});			
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(400)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lbl_Unit, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(115)
					.addComponent(lbl_From, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(145)
					.addComponent(lbl_To, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(comboBox_Unit, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(78)
					.addComponent(comboBox_From, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(72)
					.addComponent(comboBox_To, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(436)
					.addComponent(lbl_From1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(jbt1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbt4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbt7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbt10, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(jbt2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbt5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbt8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(jbt3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbt6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbt9, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbt11, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnConvert, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBackSpace, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(jtf_From, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(71)
							.addComponent(lbl_To1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addComponent(jtf_To, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_Unit, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lbl_From, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lbl_To, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_Unit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_From, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_To, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(72)
					.addComponent(lbl_From1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(jbt1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(jbt4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(jbt7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(jbt10, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(jbt2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(jbt5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(jbt8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(jbt3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(jbt6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(jbt9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(jbt11, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(btnConvert, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(btnBackSpace, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(jtf_From, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addComponent(lbl_To1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(jtf_To, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))
		);
		contentPane.setLayout(gl_contentPane);
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public JButton btn_Menu;
    public JButton btnBackSpace;
    public JButton btnClear;
    public JButton btnConvert;
    public JButton jbt11;
    public JButton jbt8;
    public JButton jbt5;
    public JButton jbt4;
    public JComboBox<String> comboBox_From;
    public JLabel converterFromLabel;
    public JButton converterNegativeButton;
    public JButton jbt9;
    public JButton jbt1;
    public JButton jbt7;
    public JButton jbt6;
    public JButton jbt3;
    public JComboBox<String> comboBox_To;
    public JLabel converterToLabel;
    public JButton jbt2;
    public JComboBox<String> comboBox_Unit;
    public javax.swing.JLabel converterUnitLabel;
    public JButton jbt10;
	
}
