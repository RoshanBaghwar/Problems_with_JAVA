
import javax.swing.*;
import java.awt.*;
public class q2
{
	public static void main(String args[])
	{
		Base obj = new Base();
	}
}
class Base extends JFrame
{
	JTextField t1,t2;
	JButton b;
	JLabel l;
	public Base()
	{
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b = new JButton("+");
		l = new JLabel("Result");

		add(t1);
		add(t2);
		add(b);
		add(l);

		ActionListener al = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				int value = num1 + num2;
				l.setText(value + "");
			}
		};

		b.addActionListener(al);
	}

}
