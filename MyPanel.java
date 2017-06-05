import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanel extends JPanel implements ActionListener{
	
	public int x=100,y=100;
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
	
		if(e.getSource() == button[0][0]){
			Area.setText("1");
			
		}
		if(e.getSource() == button[0][1]){
			Area.setText("2");
			
		}
		if(e.getSource() == button[0][2])
			Area.setText("3");
	}
}