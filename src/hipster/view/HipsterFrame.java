package hipster.view;

import javax.swing.Jframe;
import java.awt.Dimenson;
import hipster.controller.HipsterController;


public class HipsterFrame extend JFrame
{

	private HipsterPanel appPanel;
	private HipsterController baseController;
	
	public HipsterFrame(HipsterController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new HipsterPanel(base)
	}
	
}
