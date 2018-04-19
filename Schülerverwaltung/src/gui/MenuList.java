package gui;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import bll.Task;

public class MenuList extends JPanel{
	private JList<Task> listTasks = null;
	private JScrollPane scrollpane = null;
	private MouseListener parent = null;
	private DefaultListModel<Task> dml;
	
	public MenuList(MouseListener parent) {
		this.parent = parent;
		this.initializeControls();
	}
	
	private void initializeControls() {
		this.listTasks = new JList<Task>();
		this.scrollpane = new JScrollPane(this.listTasks);
		dml = new DefaultListModel<Task>();
			
		this.setLayout(new BorderLayout());
		
		this.listTasks.setFont(this.getFont());
		this.listTasks.setBackground(Color.WHITE);
		this.listTasks.addMouseListener(parent);
		
		this.listTasks.setModel(dml);
		this.add(this.scrollpane, BorderLayout.LINE_START);
		this.setVisible(true);
	}
	
	public void FillList(ArrayList<Task> tasks) {
		for(Task t : tasks) {
			dml.addElement(t);
		}
	}
	
	public ArrayList<Task> getTasks() {
		ArrayList<Task> list = new ArrayList<Task>();
		for(int i = 0; i<dml.getSize(); i++) {
			list.add(dml.getElementAt(i));
		}
		return list;
	}
	
	public Task getSelectedTask() {
		return this.listTasks.getSelectedValue();
	}
}
