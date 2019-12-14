 
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
    JLabel label;
	JPanel panel;
	Color myColor,BC1,BC2;
	JButton OffButton,ACButton,DelButton,MPButton,MMButton,MCButton,MRButton,Num1,Num2,Num3,Num4,Num5,Num6,Num7,Num8,Num9,Num0,AddButton,SubButton,MulButton,DivButton,DecButton,EqButton;
	Font numFont,mFont,sFont,lFont;
	double var1,var2,res,sub,Mem;
	char choice;
	public Calculator(){
		super("Calculator");
		this.setSize(400,420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor= new Color(0,0,0);
		BC1= new Color(255,0,0);
		mFont= new Font("Arial",Font.BOLD,18);
		sFont= new Font("Arial",Font.PLAIN,18);
		numFont= new Font("Arial",Font.ITALIC,18);
		lFont= new Font("Digital",Font.BOLD,18);
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);//This sets the background
		
		
		label =new JLabel();//This is the box where numbers are written
		label.setBounds(10,20,365,40);
		label.setBackground(Color.CYAN);
		label.setFont(lFont);
		label.setOpaque(true);
		panel.add(label);
		
		OffButton = new JButton("OFF");
		OffButton.setBounds(10,70,150,50);                             
		OffButton.setBackground(BC1);
		OffButton.setFont(sFont);
		OffButton.addActionListener(this);
		panel.add(OffButton);
		
		ACButton = new JButton("AC");
		ACButton.setBounds(170,70,150,50);                             
		ACButton.setBackground(Color.RED);
		ACButton.setFont(sFont);
		ACButton.addActionListener(this);
		panel.add(ACButton);
		
		DelButton = new JButton("<");
		DelButton.setBounds(330,70,45,50);                             
		DelButton.setBackground(Color.WHITE);
		DelButton.setFont(sFont);
		DelButton.addActionListener(this);
		panel.add(DelButton);
		
		MPButton = new JButton("M+");//
		MPButton.setBounds(10,130,65,45);                             
		MPButton.setBackground(Color.BLUE);
		MPButton.setFont(mFont);
		MPButton.setForeground(Color.WHITE);
		MPButton.addActionListener(this);
		panel.add(MPButton);
		
		Num7 = new JButton("7");
		Num7.setBounds(85,130,65,45);                             
		Num7.setBackground(Color.WHITE);
		Num7.setFont(numFont);
		Num7.addActionListener(this);
		panel.add(Num7);
		
		Num8 = new JButton("8");
		Num8.setBounds(160,130,65,45);                             
		Num8.setBackground(Color.WHITE);
		Num8.setFont(numFont);
		Num8.addActionListener(this);
		panel.add(Num8);
		
		Num9 = new JButton("9");
		Num9.setBounds(235,130,65,45);                             
		Num9.setBackground(Color.WHITE);
		Num9.setFont(numFont);
		Num9.addActionListener(this);
		panel.add(Num9);
		
		DivButton = new JButton("/");
		DivButton.setBounds(310,130,65,45);                             
		DivButton.setBackground(Color.GREEN);
		DivButton.setFont(numFont);
		DivButton.addActionListener(this);
		panel.add(DivButton);
		
		MMButton = new JButton("M-");//
		MMButton.setBounds(10,190,65,45);                             
		MMButton.setBackground(Color.BLUE);
		MMButton.setFont(mFont);
		MMButton.setForeground(Color.WHITE);
		MMButton.addActionListener(this);
		panel.add(MMButton);
		
		Num4 = new JButton("4");
		Num4.setBounds(85,190,65,45);                             
		Num4.setBackground(Color.WHITE);
		Num4.setFont(numFont);
		Num4.addActionListener(this);
		panel.add(Num4);
		
		Num5 = new JButton("5");
		Num5.setBounds(160,190,65,45);                             
		Num5.setBackground(Color.WHITE);
		Num5.setFont(numFont);
		Num5.addActionListener(this);
		panel.add(Num5);
		
		Num6 = new JButton("6");
		Num6.setBounds(235,190,65,45);                             
		Num6.setBackground(Color.WHITE);
		Num6.setFont(numFont);
		Num6.addActionListener(this);
		panel.add(Num6);
		
		MulButton = new JButton("*");
		MulButton.setBounds(310,190,65,45);                             
		MulButton.setBackground(Color.GREEN);
		MulButton.setFont(numFont);
		MulButton.addActionListener(this);
		panel.add(MulButton);
		
		MCButton = new JButton("MC");//
		MCButton.setBounds(10,250,65,45);                             
		MCButton.setBackground(Color.BLUE);
		MCButton.setFont(mFont);
		MCButton.setForeground(Color.WHITE);
		MCButton.addActionListener(this);
		panel.add(MCButton);
		
		Num1 = new JButton("1");
		Num1.setBounds(85,250,65,45);                             
		Num1.setBackground(Color.WHITE);
		Num1.setFont(numFont);
		Num1.addActionListener(this);
		panel.add(Num1);
		
		Num2 = new JButton("2");
		Num2.setBounds(160,250,65,45);                             
		Num2.setBackground(Color.WHITE);
		Num2.setFont(numFont);
		Num2.addActionListener(this);
		panel.add(Num2);
		
		Num3 = new JButton("3");
		Num3.setBounds(235,250,65,45);                             
		Num3.setBackground(Color.WHITE);
		Num3.setFont(numFont);
		Num3.addActionListener(this);
		panel.add(Num3);
		
		SubButton = new JButton("-");
		SubButton.setBounds(310,250,65,45);                             
		SubButton.setBackground(Color.GREEN);
		SubButton.setFont(numFont);
		SubButton.addActionListener(this);
		panel.add(SubButton);
		
		MRButton = new JButton("MR");//
		MRButton.setBounds(10,310,65,45);                             
		MRButton.setBackground(Color.BLUE);
		MRButton.setFont(mFont);
		MRButton.setForeground(Color.WHITE);
		MRButton.addActionListener(this);
		panel.add(MRButton);
		
		Num0 = new JButton("0");
		Num0.setBounds(85,310,65,45);                             
		Num0.setBackground(Color.WHITE);
		Num0.setFont(numFont);
		Num0.addActionListener(this);
		panel.add(Num0);
		
		DecButton = new JButton(".");
		DecButton.setBounds(160,310,65,45);                             
		DecButton.setBackground(Color.WHITE);
		DecButton.setFont(numFont);
		DecButton.addActionListener(this);
		panel.add(DecButton);
		
		EqButton = new JButton("=");
		EqButton.setBounds(235,310,65,45);                             
		EqButton.setBackground(Color.WHITE);
		EqButton.setFont(numFont);
		EqButton.addActionListener(this);
		panel.add(EqButton);
		
		AddButton = new JButton("+");
		AddButton.setBounds(310,310,65,45);                             
		AddButton.setFont(numFont);
		AddButton.setBackground(Color.GREEN);
		AddButton.addActionListener(this);
		panel.add(AddButton);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae){
		
		String command =ae.getActionCommand();
		
		if(Num1.getText().equals(command))
		{
			String text=label.getText()+Num1.getText();
			label.setText(text);
		}
		
		else if(Num2.getText().equals(command))
		{
			String text=label.getText()+Num2.getText();
			label.setText(text);
		}
		
		else if(Num3.getText().equals(command))
		{
			String text=label.getText()+Num3.getText();
			label.setText(text);
		}
		
		else if(Num4.getText().equals(command))
		{
			String text=label.getText()+Num4.getText();
			label.setText(text);
		}
		
		else if(Num5.getText().equals(command))
		{
			String text=label.getText()+Num5.getText();
			label.setText(text);
		}
		
		else if(Num6.getText().equals(command))
		{
			String text=label.getText()+Num6.getText();
			label.setText(text);
		}
		
		else if(Num7.getText().equals(command))
		{
			String text=label.getText()+Num7.getText();
			label.setText(text);
		}
		
		else if(Num8.getText().equals(command))
		{
			String text=label.getText()+Num8.getText();
			label.setText(text);
		}
		
		else if(Num9.getText().equals(command))
		{
			String text=label.getText()+Num9.getText();
			label.setText(text);
		}
		
		else if(Num0.getText().equals(command))
		{
			String text=label.getText()+Num0.getText();
			label.setText(text);
		}
		
		else if(DecButton.getText().equals(command))
		{
			String text=label.getText()+DecButton.getText();
			label.setText(text);
		}
		else if(command.equals("+")){
			var1=Double.parseDouble(label.getText());
			choice='+';
			label.setText("");
		}
		else if(command.equals("-")){
			var1=Double.parseDouble(label.getText());
			choice='-';
			label.setText("");
		}
		else if(command.equals("*")){
			var1=Double.parseDouble(label.getText());
			choice='*';
			label.setText("");
		}
		else if(command.equals("/")){
			var1=Double.parseDouble(label.getText());
			choice='/';
			label.setText("");
		}
		//try{
		else if(command.equals("=") && choice=='+'){
			var2=Double.parseDouble(label.getText());
			res=var1+var2;
			label.setText(String.valueOf(res));
		}
		//}
		//catch()
		
		else if(command.equals("=") && choice=='-'){
			var2=Double.parseDouble(label.getText());
			res=var1-var2;
			label.setText(String.valueOf(res));
		}
		
		
		else if(command.equals("=") && choice=='*'){
			var2=Double.parseDouble(label.getText());
			res=var1*var2;
			label.setText(String.valueOf(res));
		}
		
		
		else if(command.equals("=") && choice=='/'){
			var2=Double.parseDouble(label.getText());
			res=var1/var2;
			label.setText(String.valueOf(res));
		}
		
		else if(OffButton.getText().equals(command))
		{
			System.exit(0);
		}
		
		else if(ACButton.getText().equals(command))
		{
			var1=0;
			var2=0;
			res=0;
			label.setText("");
		}
		else if(MPButton.getText().equals(command))
		{
			Mem=Mem+Double.parseDouble(label.getText());
		}
		else if(MRButton.getText().equals(command))
		{
			label.setText(Double.toString(Mem));
		}
		else if(MCButton.getText().equals(command)){
			Mem=0;
		}
		else if(MMButton.getText().equals(command)){
			sub=Double.parseDouble(label.getText());
			Mem=Mem-sub;
		}
		
		else if(DelButton.getText().equals(command)){
		  try{	
		    String text=label.getText().substring(0,(label.getText().length() - 1));
			label.setText(text);
		  }
		  catch(Exception ex){JOptionPane.showMessageDialog(this,"Enter a number to delete");}
		}
		}
		
	}
	
	
	
	

