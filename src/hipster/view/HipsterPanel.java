package hipster.view;

import javax.swing.*;

public class HipsterPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JComboBox dropDpwn;
	private JLabel infoLabel;
	private JButton myButton;
	private HipsterController baseController;
	
	public HipsterPanel(HispsterController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("Click the buttton");
		this.infoLabel = new Jlabel(" Wow words!");	
		this.dropDown = new JComboBox(baseController.getHipsters());
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private
}
››
{

}
