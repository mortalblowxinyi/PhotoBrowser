import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class MainWindow extends JFrame{
	JPanel mainPanel= new JPanel();
	JLabel bottomLabel= new JLabel();
	JPanel centerPanel= new JPanel();
	JMenuBar menuBar= new JMenuBar();
	JToolBar toolBar = new JToolBar();
	JPanel principalPanel= new JPanel(new BorderLayout());
	
	JToggleButton Family= new JToggleButton("Family");
	JToggleButton Vacation= new JToggleButton("Vacation");
	JToggleButton School= new JToggleButton("School");
	ButtonGroup FVSbuttonGroup= new ButtonGroup();
	
	JRadioButton Photoviewer = new JRadioButton("Photo viewer");
	JRadioButton Browser = new JRadioButton("Browser");
	JRadioButton Splitmode = new JRadioButton("Split mode");
	JMenu File= new JMenu("File");
	JMenu View= new JMenu("View");
	
	JMenuItem Import= new JMenuItem("Import...");
	JMenuItem Delete= new JMenuItem("Delete");
	JMenuItem Quit= new JMenuItem("Quit");
	ButtonGroup PBSbuttonGroup= new ButtonGroup();

	
	private void addStuff(){
		FVSbuttonGroup.add(Family);
		FVSbuttonGroup.add(Vacation);
		FVSbuttonGroup.add(School);//can only choose one dans the group
		
		toolBar.add(Family);
		toolBar.add(Vacation);
		toolBar.add(School);
		
		
		principalPanel.add(toolBar,BorderLayout.PAGE_START);
		principalPanel.add(bottomLabel,BorderLayout.PAGE_END);
		principalPanel.add(centerPanel,BorderLayout.CENTER);
		
		menuBar.add(File);
		menuBar.add(View);
		
		File.add(Import);
		File.add(Delete);
		File.add(Quit);
		
		PBSbuttonGroup.add(Photoviewer);
		PBSbuttonGroup.add(Browser);
		PBSbuttonGroup.add(Splitmode);
		View.add(Photoviewer);
		View.add(Browser);
		View.add(Splitmode);
		
	}
		
	MainWindow(){
		super("Phototh¨¨que");
		setPreferredSize(new Dimension(600,400));	
		
		centerPanel.setBackground(Color.black);
		setJMenuBar(menuBar);//set not add
		
		bottomLabel.setText("Test");
		
		Family.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				bottomLabel.setText("Family");
			}
			
		});
		
		
		add(principalPanel);
		
		
		Photoviewer.setSelected(true);
		
		menuBar.setPreferredSize(new Dimension(super.getWidth(),50));
		
		Import.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFileChooser fc= new JFileChooser();
				fc.showOpenDialog(getParent());//parent
			}
			
		});
		
		Quit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		addStuff();
				
		pack();//pack!!
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow PBrowser=new MainWindow();
		PBrowser.setVisible(true);

	}

}
