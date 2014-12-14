package empresa.interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class DialogoLogin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoLogin dialog = new DialogoLogin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoLogin() {
		setBounds(100, 100, 385, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUsuario = new JLabel("Usuario");
			lblUsuario.setBounds(53, 166, 46, 14);
			contentPanel.add(lblUsuario);
		}
		{
			JLabel lblContrasea = new JLabel("Contrase\u00F1a");
			lblContrasea.setBounds(53, 191, 66, 14);
			contentPanel.add(lblContrasea);
		}
		{
			textField = new JTextField();
			textField.setBounds(183, 163, 158, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(183, 188, 158, 20);
			contentPanel.add(textField_1);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBorder(new TitledBorder(null, "Conexsur", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(47, 11, 294, 143);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNitXX = new JLabel("NIT: x x x x ");
				lblNitXX.setBounds(26, 39, 70, 14);
				panel.add(lblNitXX);
			}
			{
				JLabel lblDireccinXX = new JLabel("Direcci\u00F3n: x x x x ");
				lblDireccinXX.setBounds(26, 68, 95, 14);
				panel.add(lblDireccinXX);
			}
			{
				JLabel lblTelfonoXX = new JLabel("Tel\u00E9fono: x x x x ");
				lblTelfonoXX.setBounds(26, 99, 95, 14);
				panel.add(lblTelfonoXX);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.WHITE);
				panel_1.setBorder(null);
				panel_1.setBounds(151, 21, 133, 111);
				panel.add(panel_1);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setSize(110, 110);
				ImageIcon fot = new ImageIcon("./data/logo_empresa.jpg");
				ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT));
				lblNewLabel.setIcon(icono);
				panel_1.add(lblNewLabel);
				
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
