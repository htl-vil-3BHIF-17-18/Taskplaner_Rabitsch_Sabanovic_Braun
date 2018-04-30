package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
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
	/**
	 * 
	 */
	private static final long serialVersionUID = -5164125500666934784L;
	public TaskList listMenu = null;
	public TaskList list = null;
	private JButton best�tigen = null;
	private JButton hinzuf�gen = null;
	private JButton �ndern = null;
	private JPanel buttons = null;
	private JButton l�schen = null;
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
		this.list = new TaskList(this);
		this.best�tigen = new JButton("Eingaben best�tigen");
		this.best�tigen.addActionListener(this);
		this.hinzuf�gen = new JButton("Eintrag hinzuf�gen");
		this.hinzuf�gen.addActionListener(this);
		this.�ndern = new JButton("Eintrag �ndern");
		this.�ndern.addActionListener(this);
		this.l�schen = new JButton("Eintrag l�schen");
		this.l�schen.addActionListener(this);
		this.startDate = new JTextField("StartDatum");
		this.startDate.addActionListener(this);
		this.endDate = new JTextField("EndDatum");
		this.endDate.addActionListener(this);
		this.filter = new JTextField("Filter");
		this.filter.addActionListener(this);
		
		this.setLayout(new BorderLayout());
		this.add(this.list, BorderLayout.LINE_END);
		this.buttons = new JPanel();
		this.buttons.setLayout(new GridLayout(7,1));
		this.buttons.add(startDate, BorderLayout.NORTH);
		this.buttons.add(endDate);
		this.buttons.add(filter);
		this.buttons.add(best�tigen);
		this.buttons.add(hinzuf�gen);
		this.buttons.add(�ndern);
		this.buttons.add(l�schen);
		this.add(buttons);
		this.startDate.setEnabled(false);
		this.endDate.setEnabled(false);
		this.filter.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.best�tigen)) {
		//	this.list.add()
		}
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//ToDO
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		//Derweil unn�tig
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// Derweil unn�tig
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// Derweil unn�tig
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// Derweil unn�tig
		
	}



	
	
	
	
}
