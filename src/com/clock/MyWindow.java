package com.clock;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

// Extending Jframe Class of swing all the variable are avaliable in the MyWindow class
// JFrame is a class of javax.swing.Jframe package
// which inherit javax.awt.frame
// wich contain componants like labels, buttons, textfields are added to create a GUI.
//Unlike Frame, JFrame has the option to hide or close the window with the help of 
//setDefaultCloseOperation(int) method.
// Swing mostly used for windows application.

public class MyWindow extends JFrame
{
	// used private for cannot access outside of the class
	//JLabel:- 1. Object of Jlabel class is the componant for placing text in the container
	// 2.it used to display single line text for readonly
	// it inherits JComponant class
	// public class JLabel extends JComponent implements SwingConstants, Accessible  
	
	private JLabel heading;
	private JLabel clockLabel;
	
	// for accessing the methods of parent class we called constructor
	MyWindow()
	{
		super.setTitle("Welcome to Digital Clock");
		super.setSize(400, 400);
		// Set location used for window axis which x and y axis give diamentions with the help of axis
		//where we use setLocation(x,y) method
		super.setLocation(300, 50);
		this.createGUI();
		this.startClock();
		
		//sets the visibility of the component. It is by default false.
		// it use to make frame visible 
		super.setVisible(true);
		
	}
	
	public void createGUI()
	{
		heading = new JLabel("My Clock");
		clockLabel = new JLabel("clock");
		
		heading.setFont(getFont());
		clockLabel.setFont(getFont());
		
		// GridLayout(a,b)- a-rows, b-column :- used to layout your gui 
		this.setLayout(new GridLayout(2,1));
		this.add(heading);
		this.add(clockLabel);
		
		
	}
	
	public void startClock() 
	{
		// Timer class is in javax.swing
		// this class used for it perform action method by every time interval
		// And update the clock
		// 1000 is delay in milisecond and ActionListner() is the method for perform an action
		// we use annonimus class ActionListner interface
		// ActionListner is an interface so child class object has been passed
		// when timer starts in every seconds actionPerform method willget called adn update time
		
		Timer timer = new Timer(1000, new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// Date is a class present in java.util package
				// and convert datetime into string
				
				//String dateTime = new Date().toString();
				//String dateTime = new Date().toLocaleString(); // this is the way for formating date and time it is predefined
				
				// For format the date and time 
				Date date = new Date();
				SimpleDateFormat sfd = new SimpleDateFormat("kk : mm : ss : a");
				
				String dateTime = sdf.format(d);
				
				
				// and update datTime on clock label
				clockLabel.setText(dateTime);
				
			}
			
		});
		
		timer.start();
		
	}

}
