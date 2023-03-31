import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Task2 extends JFrame implements ItemListener
{	
	JButton[] btn;
	JTextField tx;
	String s="";
	int i=0,j=0,k,z=0;
	int win=0;
	Checkbox c1;
	Checkbox c2;
	boolean state,type,set;
	Task2()
	{
		setLayout(null);
		setSize(300,330);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CheckboxGroup cbg=new CheckboxGroup();
		c1=new Checkbox("X",cbg,false);
		c2=new Checkbox("O",cbg,false);
		c1.setBounds(120,80,100,40);
		c2.setBounds(120,150,100,40);
		add(c1); 
		add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
		state=true;type=true;set=true;
	}
	public void itemStateChanged(ItemEvent e)
	{
 		if(c1.getState())
  		{ 
 			type=false;
 		}

 		else if(c2.getState())
  		{ 
			type=true;
  		}
		remove(c1);
		remove(c2);
 		repaint(0,0,300,330);
 		showGame(type);	
	}
	public void showGame(boolean type)
	{
		char c1,c2;
		String ch1,ch2;
		if(type)
		{
			ch1="O";
			ch2="X";
			c1='O';
			c2='X';		
		}
		else
		{
			ch1="X";
			ch2="O";
			c1='X';
			c2='O';		
		}
		btn=new JButton[9];
		char[][] grid=new char[3][3];
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				grid[a][b]='-';
			}
		}
		btn[0]=new JButton(" ");
		btn[1]=new JButton(" ");
		btn[2]=new JButton(" ");
		btn[3]=new JButton(" ");
		btn[4]=new JButton(" ");
		btn[5]=new JButton(" ");
		btn[6]=new JButton(" ");
		btn[7]=new JButton(" ");
		btn[8]=new JButton(" ");
		tx=new JTextField(10);
		tx.setHorizontalAlignment(JTextField.CENTER); 
		tx.setEditable(false);
		int x=0;
		int y=1;
		for(k=0;k<=8;k++,x+=100,z++)
		{
			if(z==3)
			{
				z=0; y+=100; x=0;
			}
 			btn[k].setBounds(x,y,100,100);
			add(btn[k]);
			
		}
		
	
	btn[0].addActionListener(new ActionListener() 
	{
        	public void actionPerformed(ActionEvent ae) 
		{
            		if (btn[0].getText().equals(" "))
			{
				if(i==j)
				{
               				btn[0].setText(ch1);
					grid[0][0]=c1;
					i++;
				}
				else
				{
					btn[0].setText(ch2);
					j++;
					grid[0][0]=c2;
				}
				check(grid);
         		}
		}
      	});
	
	btn[1].addActionListener(new ActionListener() 
	{
        	public void actionPerformed(ActionEvent ae) 
		{
            		if (btn[1].getText().equals(" "))
			{
				if(i==j)
				{
               				btn[1].setText(ch1);
					i++;
					grid[0][1]=c1;
				}
				else
				{
					btn[1].setText(ch2);
					j++;
					grid[0][1]=c2;
				}
				check(grid);
         		}
		}
      	});
	
	btn[2].addActionListener(new ActionListener() 
	{
        	public void actionPerformed(ActionEvent ae) 
		{
            		if (btn[2].getText().equals(" "))
			{
				if(i==j)
				{
               				btn[2].setText(ch1);
					i++;
					grid[0][2]=c1;
				}
				else
				{
					btn[2].setText(ch2);
					j++;
					grid[0][2]=c2;
				}
				check(grid);
         		}
		}
      	});
	
	btn[3].addActionListener(new ActionListener() 
	{
        	public void actionPerformed(ActionEvent ae) 
		{
            		if (btn[3].getText().equals(" "))
			{
				if(i==j)
				{
               				btn[3].setText(ch1);
					i++;
					grid[1][0]=c1;
				}
				else
				{
					btn[3].setText(ch2);
					j++;
					grid[1][0]=c2;
				}
				check(grid);
         		}
		}
      	});
	
	btn[4].addActionListener(new ActionListener() 
	{
        	public void actionPerformed(ActionEvent ae) 
		{
            		if (btn[4].getText().equals(" "))
			{
				if(i==j)
				{
               				btn[4].setText(ch1);
					i++;
					grid[1][1]=c1;
				}
				else
				{
					btn[4].setText(ch2);
					j++;
					grid[1][1]=c2;
				}
				check(grid);
         		}
		}
      	});
	
	btn[5].addActionListener(new ActionListener() 
	{
        	public void actionPerformed(ActionEvent ae) 
		{
            		if (btn[5].getText().equals(" "))
			{
				if(i==j)
				{
               				btn[5].setText(ch1);
					i++;
					grid[1][2]=c1;
				}
				else
				{
					btn[5].setText(ch2);
					j++;
					grid[1][2]=c2;
				}
				check(grid);
         		}
		}
      	});
	
	btn[6].addActionListener(new ActionListener() 
	{
        	public void actionPerformed(ActionEvent ae) 
		{
            		if (btn[6].getText().equals(" "))
			{
				if(i==j)
				{
               				btn[6].setText(ch1);
					i++;
					grid[2][0]=c1;
				}
				else
				{
					btn[6].setText(ch2);
					j++;
					grid[2][0]=c2;
				}
				check(grid);
         		}
		}
      	});
	
	btn[7].addActionListener(new ActionListener() 
	{
        	public void actionPerformed(ActionEvent ae) 
		{
            		if (btn[7].getText().equals(" "))
			{
				if(i==j)
				{
               				btn[7].setText(ch1);
					i++;
					grid[2][1]=c1;
				}
				else
				{
					btn[7].setText(ch2);
					j++;
					grid[2][1]=c2;
				}
				check(grid);
         		}
		}
      	});
	
	btn[8].addActionListener(new ActionListener() 
	{
        	public void actionPerformed(ActionEvent ae) 
		{
            		if (btn[8].getText().equals(" "))
			{
				if(i==j)
				{
               				btn[8].setText(ch1);
					i++;
					grid[2][2]=c1;
				}
				else
				{
					btn[8].setText(ch2);
					j++;
					grid[2][2]=c2;
				}
				check(grid);
         		}
		}
      	});
	}
	public void check(char[][] grid)
	{
		int val=0;
		String st="";
		for(int i=0;i<3;i++)
		{
			if(grid[i][0]==grid[i][1]&& grid[i][1]==grid[i][2] && grid[i][2]=='O')
			{
				if(win==0)
				{			
					st="	O wins";
					win=1;
				}				
			}
			if(grid[i][0]==grid[i][1]&& grid[i][1]==grid[i][2] && grid[i][2]=='X')
			{
				if(win==0)
				{
					st="	X wins";
					win=1;
				}			
			}
			if(grid[0][i]==grid[1][i] && grid[1][i]==grid[2][i] && grid[2][i]=='O')
			{
				if(win==0)
				{
					st="	O wins";
					win=1;
				}			
			}
			if(grid[0][i]==grid[1][i] && grid[1][i]==grid[2][i] && grid[2][i]=='X')
			{
				if(win==0)
				{
					st="	X wins";
					win=1;
				}	
			}
		}
		if(grid[0][0]==grid[1][1] && grid[1][1]==grid[2][2] && grid[2][2]=='O')
		{
			if(win==0)
			{
				st="	O wins";
				win=1;	
			}			
		}
		if(grid[0][0]==grid[1][1] && grid[1][1]==grid[2][2] && grid[2][2]=='X')
		{
			if(win==0)
			{
				st="	X wins";
				win=1;
			}	
		}
		if(grid[0][2]==grid[1][1] && grid[1][1]==grid[2][0] && grid[2][0]=='O')
		{
			if(win==0)
			{
			 	st="	O wins";
				win=1;
			}
		}
		if(grid[0][2]==grid[1][1] && grid[1][1]==grid[2][0] && grid[2][0]=='X')
		{
			if(win==0)
			{
				st="	X wins";
				win=1;
			}	
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(grid[i][j]=='-')
					val=1;
			}
		}
		if(val==0 && win==0)
		{
			st="DRAW GAME";
			win=1;		
		}
		if(win==1)
		{
			repaint(0,0,300,330);
			for(int i=0;i<=8;i++)
				remove(btn[i]);
			JButton b=new JButton("Reset");
			b.setBounds(100,140,100,50);
			add(b);
			JLabel l=new JLabel(st);
			JLabel l1=new JLabel("click Reset button to reset the game");
			l.setBounds(110,70,300,50);
			l1.setBounds(40,100,300,50);	
			add(l);
			add(l1);
			b.addActionListener(new ActionListener() 
			{
        			public void actionPerformed(ActionEvent ae) 
				{
					Task2 l=new Task2();
         			}		
      			});	
		}
	}
	


	public static void main(String args[])
	{
		Task2 obj=new Task2();
		obj.setTitle("TIC TAC TOE");
	}
}

