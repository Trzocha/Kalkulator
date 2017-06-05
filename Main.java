import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{

	public Main()
	{
		super("Rysowanie");
		JPanel panel = new MyPanel();
		add(panel);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//new Fun();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Main();
			}
		});
	}

}
