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
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Main();
			}
		});
	}

}
