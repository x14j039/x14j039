import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Test003 {
	static JFrame frame = new JFrame();

	public static void main(String[] args) {

		frame.setVisible(true);

	}

	Test003() {
		frame.setBounds(100, 200, 200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();

		JTextArea area = new JTextArea(3, 20);
		area.setRows(20);

	}
}
