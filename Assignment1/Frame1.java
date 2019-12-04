import java.lang.*;
import javax.swing.*;

public class Frame1 extends JFrame{
	//JLabel calcLabel;
	JTextField calcTF;
	JButton b1,b2,b3,b4,b5;
	JPanel panel;
	
	public Frame1(){
		super("Calculator");
		this.setSize(450,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground()
		
		calcTF =new JTextField();
		calcTF.setBounds(10,20,420,40);
		panel.add(calcTF);
		
		this.add(panel);
	}
	
	
	
}