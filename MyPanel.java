import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanel extends JPanel implements ActionListener{
	
	public int x=100,y=100,a=0,b=1,value=0;
	//public Fun operation;
	public String name = "",score = " ";
	public JButton[][] button = new JButton[4][4];
	public JTextField Area = new JTextField();
	public String TabName[][]={{"1","2","3","C"},{"4","5","6","*"},{"7","8","9","/"},{"0","=","-","+"}};
	
	public MyPanel(){
		setPreferredSize(new Dimension(400,400));
		setLayout(null);                          //czyszczenie ustawien ustawienia butonow
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				button[i][j] = new JButton(TabName[i][j]);
				button[i][j].setBounds(x, y, 50, 50);
				button[i][j].addActionListener(this);       //sluchac na klick
				add(button[i][j]);
				x+=60; 
			}
			y+=60;
			x=100;
		}
		Area.setBounds(100, 10, 230, 70);
		add(Area);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Fun operation = new Fun();
		if(e.getSource() == button[0][0]){
			name = name.concat("1");
			Area.setText(name);
			}
		if(e.getSource() == button[0][1]){
			name = name.concat("2");
			Area.setText(name);
		}
		if(e.getSource() == button[0][2]){
			name = name.concat("3");
			Area.setText(name);
		}
		if(e.getSource() == button[0][3]){  //C
			a=0; b=0; name=""; Area.setText("");
		}
		if(e.getSource() == button[1][0]){
			name = name.concat("4");
			Area.setText(name);
			}
		if(e.getSource() == button[1][1]){
			name = name.concat("5");
			Area.setText(name);
		}
		if(e.getSource() == button[1][2]){
			name = name.concat("6");
			Area.setText(name);
		}
		if(e.getSource() == button[1][3]){
			a = Integer.valueOf(name);       //konwersja
			b=a;
			name = "";
			value = 2;
			Area.setText("*");
		}
		if(e.getSource() == button[2][0]){
			name = name.concat("7");
			Area.setText(name);
			}
		if(e.getSource() == button[2][1]){
			name = name.concat("8");
			Area.setText(name);
		}
		if(e.getSource() == button[2][2]){
			name = name.concat("9");
			Area.setText(name);
		}
		if(e.getSource() == button[2][3]){
			a = Integer.valueOf(name);       //konwersja
			b=a;
			name = "";
			value = 3;
			Area.setText("/");
		}
		if(e.getSource() == button[3][0]){
			name = name.concat("0");
			Area.setText(name);
			}
		if(e.getSource() == button[3][1]){    //=
			a = Integer.valueOf(name);
			switch(value)
			{
			case 0:
				value = operation.addition(a, b);
				break;
			case 1:
				value = operation.subtraction(a, b);
				break;
			case 2:
				value = operation.multiplication(a, b);
				break;
			case 3:
				value = operation.division(a, b);
				break;
			}
			score = Integer.toString(value);
			Area.setText(score);
		}
		if(e.getSource() == button[3][2]){
			a = Integer.valueOf(name);       //konwersja
			b=a;
			name = "";
			value = 1;
			Area.setText("-");
		}
		if(e.getSource() == button[3][3]){  //+
			a = Integer.valueOf(name);       //konwersja
			b=a;
			name = "";
			value = 0;
			Area.setText("+");
			//System.out.println(b);
		}
	}
}