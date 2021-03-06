import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JButton;
	import javax.swing.JTextField;
	import javax.swing.JLabel;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	
public class Okno extends JFrame{

		private JPanel contentPane;
		private JTextField textField;
		private JLabel lblNewLabel;

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Okno frame = new Okno();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		public Okno() {
			setTitle("Moje okynko");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
			setVisible(true);
			
			JButton btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblNewLabel.setText(textField.getText());
				}
			});
			contentPane.add(btnNewButton, BorderLayout.EAST);
			
			textField = new JTextField();
			contentPane.add(textField, BorderLayout.CENTER);
			textField.setColumns(10);
			
			lblNewLabel = new JLabel(" ");
			contentPane.add(lblNewLabel, BorderLayout.SOUTH);
		}

	}


