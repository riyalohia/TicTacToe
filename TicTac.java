import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TicTac implements ActionListener{
	Frame f;
	int i=0;
	Label l1,l2,l3,l4;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	 String n1,n2;
	JLabel jl1,jl2;
	ImageIcon img1,img2;
	TicTac()
	{
		n1=JOptionPane.showInputDialog(null,"enter first player name","TicTacToe",0);
		n2=JOptionPane.showInputDialog(null,"enter second player name","TicTacToe",0);
		f=new Frame("Tic Tac Toe");
		Color c=new Color(100,200,150);
		f.setBackground(Color.black);
		f.setLayout(null);
		l1=new Label("First player");
		l1.setBackground(Color.red);
		l1.setForeground(Color.white);
		l1.setBounds(10,30,100,30);
		f.add(l1);
		l2=new Label("Second player");
		l2.setBackground(Color.red);
		l2.setForeground(Color.white);
		l2.setBounds(10,70,100,30);
		f.add(l2);
		l3=new Label(n1);
		l3.setBackground(Color.red);
		l3.setForeground(Color.white);
		l3.setBounds(130,30,100,30);
		f.add(l3);
		l4=new Label(n2);
		l4.setBackground(Color.red);
		l4.setForeground(Color.white);
		l4.setBounds(130,70,100,30);
		f.add(l4);
		b1=new Button("start");
		b1.setBackground(Color.yellow);
		b1.setBounds(600,30,70,20);
		f.add(b1);
		b2=new Button("stop");
		b2.setBackground(Color.yellow);
		b2.setBounds(600,70,70,20);
		f.add(b2);
		b3=new Button("");
		b3.setBackground(Color.pink);
		b3.setBounds(10,150,50,50);
		f.add(b3);
		b4=new Button("");
		b4.setBackground(Color.pink);
		b4.setBounds(60,150,50,50);
		f.add(b4);
		b5=new Button("");
		b5.setBackground(Color.pink);
		b5.setBounds(110,150,50,50);
		f.add(b5);
		b6=new Button("");
		b6.setBackground(Color.pink);
		b6.setBounds(10,200,50,50);
		f.add(b6);
		b7=new Button("");
		b7.setBackground(Color.pink);
		b7.setBounds(60,200,50,50);
		f.add(b7);
		b8=new Button("");
		b8.setBackground(Color.pink);
		b8.setBounds(110,200,50,50);
		f.add(b8);
		b9=new Button("");
		b9.setBackground(Color.pink);
		b9.setBounds(10,250,50,50);
		f.add(b9);
		b10=new Button("");
		b10.setBackground(Color.pink);
		b10.setBounds(60,250,50,50);
		f.add(b10);
		b11=new Button("");
		b11.setBackground(Color.pink);
		b11.setBounds(110,250,50,50);
		f.add(b11);
		img1=new ImageIcon("Untitled-1.jpg");
		jl1=new JLabel();
		jl1.setIcon(img1);
		jl1.setBounds(270,30,20,20);
		f.add(jl1);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		b10.setEnabled(false);
		b11.setEnabled(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		f.setBounds(100,150,800,600);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		Object ob=ae.getSource();
		if(ob==b1)
		{
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		b10.setEnabled(true);
		b11.setEnabled(true);
		}
		
		
		if((i%2)==0)
		{
			if(ob==b3&&(i%2)==0)
			{
				b3.setLabel("*");
				jl1.setBounds(270,30,20,20);
		f.add(jl1);
				i++;
					
			}
			if(ob==b4&&(i%2)==0)
			{
				b4.setLabel("*");
				jl1.setBounds(270,30,20,20);
		f.add(jl1);
				i++;
			}
			if(ob==b5&&(i%2)==0)
			{
				b5.setLabel("*");
				jl1.setBounds(270,30,20,20);
		f.add(jl1);
				i++;
			}
			if(ob==b6&&(i%2)==0)
			{
				b6.setLabel("*");
				jl1.setBounds(270,30,20,20);
		f.add(jl1);
				i++;
			}
			if(ob==b7&&(i%2)==0)
			{
				b7.setLabel("*");
				jl1.setBounds(270,30,20,20);
		f.add(jl1);
				i++;
			}
			if(ob==b8&&(i%2)==0)
			{
				b8.setLabel("*");
				jl1.setBounds(270,30,20,20);
		f.add(jl1);
				i++;
			}
			if(ob==b9&&(i%2)==0)
			{
				b9.setLabel("*");
				jl1.setBounds(270,30,20,20);
		f.add(jl1);
				i++;
			}
			if(ob==b10&&(i%2)==0)
			{
				b10.setLabel("*");
				jl1.setBounds(270,30,20,20);
		f.add(jl1);
				i++;
			}
			if(ob==b11&&(i%2)==0)
			{
				b11.setLabel("*");
				jl1.setBounds(270,30,20,20);
		f.add(jl1);
				i++;
			}
			
		}
		
		else
		{
			if(ob==b3&&(i%2)!=0)
			{
				b3.setLabel("0");
				jl1.setBounds(270,70,20,20);
		f.add(jl1);
				i++;
			}
			if(ob==b4&&(i%2)!=0)
			{
				b4.setLabel("0");
				jl1.setBounds(270,70,20,20);
		f.add(jl1);
					i++;
			}
			if(ob==b5&&(i%2)!=0)
			{
				b5.setLabel("0");
				jl1.setBounds(270,70,20,20);
		f.add(jl1);
					i++;
			}
			if(ob==b6&&(i%2)!=0)
			{
				b6.setLabel("0");
				jl1.setBounds(270,70,20,20);
		f.add(jl1);
					i++;
			}
			if(ob==b7&&(i%2)!=0)
			{
				b7.setLabel("0");
				jl1.setBounds(270,70,20,20);
		f.add(jl1);
					i++;
			}
			if(ob==b8&&(i%2)!=0)
			{
				b8.setLabel("0");
				jl1.setBounds(270,70,20,20);
		f.add(jl1);
					i++;
			}
			if(ob==b9&&(i%2)!=0)
			{
				b9.setLabel("0");
				jl1.setBounds(270,70,20,20);
		f.add(jl1);
					i++;
			}
			if(ob==b10&&(i%2)!=0)
			{
				b10.setLabel("0");
				jl1.setBounds(270,70,20,20);
		f.add(jl1);
					i++;
			}
			if(ob==b11&&(i%2)!=0)
			{
				b11.setLabel("0");
				jl1.setBounds(270,70,20,20);
				f.add(jl1);
					i++;
			}
			
		}
		if(i>4)
		{
			if(b3.getLabel()=="*"&&b4.getLabel()=="*"&&b5.getLabel()=="*"||b6.getLabel()=="*"&&b7.getLabel()=="*"&&b8.getLabel()=="*"||b9.getLabel()=="*"&&b10.getLabel()=="*"&&b11.getLabel()=="*")
			{
				JOptionPane.showMessageDialog(null,"First Player Won","Tic Tac Toe",0);
				System.exit(0);
			}
			else if(b3.getLabel()=="*"&&b6.getLabel()=="*"&&b9.getLabel()=="*"||b4.getLabel()=="*"&&b7.getLabel()=="*"&&b10.getLabel()=="*"||b5.getLabel()=="*"&&b8.getLabel()=="*"&&b11.getLabel()=="*")
			{
				JOptionPane.showMessageDialog(null,"First Player Won","Tic Tac Toe",0);
				System.exit(0);
			}
			else if(b3.getLabel()=="*"&&b7.getLabel()=="*"&&b11.getLabel()=="*"||b5.getLabel()=="*"&&b7.getLabel()=="*"&&b9.getLabel()=="*")
			{
				JOptionPane.showMessageDialog(null,"First Player Won","Tic Tac Toe",0);
				System.exit(0);
			}
			else if(b3.getLabel()=="0"&&b4.getLabel()=="0"&&b5.getLabel()=="0"||b6.getLabel()=="0"&&b7.getLabel()=="0"&&b8.getLabel()=="0"||b9.getLabel()=="0"&&b10.getLabel()=="0"&&b11.getLabel()=="0")
			{
				JOptionPane.showMessageDialog(null,"second Player Won","Tic Tac Toe",0);
				System.exit(0);
			}
			else if(b3.getLabel()=="0"&&b6.getLabel()=="0"&&b9.getLabel()=="0"||b4.getLabel()=="0"&&b7.getLabel()=="0"&&b10.getLabel()=="0"||b5.getLabel()=="0"&&b8.getLabel()=="0"&&b11.getLabel()=="0")
			{
				JOptionPane.showMessageDialog(null,"second Player Won","Tic Tac Toe",0);
				System.exit(0);
			}
			else if(b3.getLabel()=="0"&&b7.getLabel()=="0"&&b11.getLabel()=="0"||b5.getLabel()=="0"&&b7.getLabel()=="0"&&b9.getLabel()=="0")
			{
				JOptionPane.showMessageDialog(null,"second Player Won","Tic Tac Toe",0);
				System.exit(0);
			}
			
		}
		if(i==9)
		{
				JOptionPane.showMessageDialog(null,"Draw","Tic Tac Toe",0);
				System.exit(0);
		}
		
		if(ob==b2)
		{
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		b10.setEnabled(false);
		b11.setEnabled(false);
		System.exit(0);
		}
		
	}
	public static void main(String z[]){
		
		TicTac a=new TicTac();
	}
}