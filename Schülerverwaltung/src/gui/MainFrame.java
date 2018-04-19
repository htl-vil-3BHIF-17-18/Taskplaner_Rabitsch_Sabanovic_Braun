package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bll.Task;

public class MainFrame extends JFrame implements ActionListener, MouseListener{
	public MenuList listMenu = null;
	public MenuList list = null;
	private JButton bestätigen = null;
	private JButton hinzufügen = null;
	private JButton ändern = null;
	private JPanel buttons = null;
	private JButton löschen = null;
	private JTextField startDate = null;
	private JTextField endDate = null;
	private JTextField filter = null;
	private ArrayList<Task> tasks = null;
	
	public MainFrame(String title, ArrayList<Task> tasks) {
		super(title);
		this.tasks = tasks;
		this.initializeControls();
		this.setMinimumSize(new Dimension(600, 400));
		this.setPreferredSize(new Dimension(600, 400));
		this.pack();
		this.setVisible(true);
	}
	
	
	private void initializeControls() {
		this.list = new MenuList(this);
		this.bestätigen = new JButton("Eingaben bestätigen");
		this.bestätigen.addActionListener(this);
		this.hinzufügen = new JButton("Eintrag hinzufügen");
		this.hinzufügen.addActionListener(this);
		this.ändern = new JButton("Eintrag ändern");
		this.ändern.addActionListener(this);
		this.löschen = new JButton("Eintrag löschen");
		this.löschen.addActionListener(this);
		this.startDate = new JTextField("StartDatum");
		this.startDate.addActionListener(this);
		this.endDate = new JTextField("EndDatum");
		this.endDate.addActionListener(this);
		this.filter = new JTextField("Filter");
		this.filter.addActionListener(this);
		
		this.setLayout(new BorderLayout());
		this.add(this.list, BorderLayout.LINE_START);
		this.buttons = new JPanel();
		this.buttons.setLayout(new GridLayout(7,1));
		this.buttons.add(startDate, BorderLayout.NORTH);
		this.buttons.add(endDate);
		this.buttons.add(filter);
		this.buttons.add(bestätigen);
		this.buttons.add(hinzufügen);
		this.buttons.add(ändern);
		this.buttons.add(löschen);
		this.add(buttons);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO 
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		//Derweil unnötig
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// Derweil unnötig
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// Derweil unnötig
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// Derweil unnötig
		
	}



	
	
	
	
}
