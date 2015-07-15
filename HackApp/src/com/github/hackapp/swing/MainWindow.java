package com.github.hackapp.swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.github.hackapp.controller.AbstractController;

public class MainWindow extends JFrame {

	public MainWindow(){
		/*Sets the initial position of the window */
		setBounds(100, 100, 450, 300);
		
		/*Set close operation*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*Create a menu bar at the top */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		/*Create a menu and add the menu bar*/
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		/*Create a menu item and add the menu*/
		JMenuItem mntmNew = new JMenuItem ("New");
		mntmNew.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
				
			}
		});
		mnFile.add(mntmNew);
		
		/*Create a menu item and add the menu*/
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener(){
			/*menu item action*/
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
				
			}
		});
		mnFile.add(mntmExit);
		
		/*Create a menu item and add the menu*/
		JMenuItem mntmOther = new JMenuItem("Other");
		mnFile.add(mntmOther);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Change to new window to show about page.
			}
		});
		
		
		
		
		
	}

	public void setController(AbstractController controller) {

	}
}
