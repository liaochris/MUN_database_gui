import java.awt.BorderLayout;
import java.awt.Container;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

import java.awt.*;
import java.awt.event.*;

public class JTextAreaOutputStream extends OutputStream {
	private final JTextArea destination;
	public JTextAreaOutputStream (JTextArea destination) {
		if (destination == null)
			throw new IllegalArgumentException ("Destination is null");
		this.destination = destination;
	}
	@Override
	public void write(byte[] buffer, int offset, int length) throws IOException {
		final String text = new String (buffer, offset, length);
		SwingUtilities.invokeLater(new Runnable () {
			@Override
			public void run() {
				destination.append (text);
			}
		});
	}
	@Override
	public void write(int b) throws IOException {
		write (new byte [] {(byte)b}, 0, 1);
	}
	public static void main (String[] args) throws Exception {
		System.out.println(JTextAreaOutputStream.class.getPackage());
		JFrame frame = new JFrame("PANEL");
		frame.setVisible(true);
		frame.setSize(485,150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel panel = new JPanel(new MigLayout());
	    MigLayout layout = new MigLayout(
	    		 "", // Layout Constraints
	    		 "[center][right][left][c]", // Column constraints with default align
	    		 "[top][center][b]"); // Row constraints with default align
		frame.add(panel);
		JTextArea textArea = new JTextArea ("Welcome to my database for accessing all sorts of information about this club.\n"
				+ "Please press on the button to select the interface you want to use",25, 80);
		panel.add(textArea, "span 4, align center, wrap");
		textArea.setEditable (false);
		JButton buttona = new JButton("Interface for club");
		panel.add(buttona, "grow, wrap");
		buttona.addActionListener (new Actiona());
		JButton buttonb = new JButton("Interface for conference");
		panel.add(buttonb, "grow");
		buttonb.addActionListener (new Actionb());
	}
	static class Action1 implements ActionListener {        
		public void actionPerformed (ActionEvent e) {     
			JTextArea textArea = new JTextArea (25, 80);
			textArea.setEditable (false);
			JFrame frame = new JFrame ("stdout");
			Container contentPane = frame.getContentPane ();
			contentPane.setLayout (new BorderLayout ());
			contentPane.add (
					new JScrollPane (
							textArea, 
							JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
							JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
					BorderLayout.CENTER);
			frame.pack ();
			frame.setVisible (true);

			JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
			System.setOut (new PrintStream (out));
			Club c = new Club();
			c.getAllMemberInformation();
		}
	}   
	static class Action2 implements ActionListener {        
		public void actionPerformed (ActionEvent e) {     
			JTextArea textArea = new JTextArea (25, 80);
			textArea.setEditable (false);
			JFrame frame = new JFrame ("stdout");
			Container contentPane = frame.getContentPane ();
			contentPane.setLayout (new BorderLayout ());
			contentPane.add (
					new JScrollPane (
							textArea, 
							JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
							JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
					BorderLayout.CENTER);
			frame.pack ();
			frame.setVisible (true);

			JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
			System.setOut (new PrintStream (out));
			Club c = new Club();
			c.getAllEmails();
		}
	} 
	static class Action3 implements ActionListener {        
		public void actionPerformed (ActionEvent e) {     
			JTextArea textArea = new JTextArea (25, 80);
			textArea.setEditable (false);
			JFrame frame = new JFrame ("stdout");
			Container contentPane = frame.getContentPane ();
			contentPane.setLayout (new BorderLayout ());
			contentPane.add (
					new JScrollPane (
							textArea, 
							JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
							JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
					BorderLayout.CENTER);
			frame.pack ();
			frame.setVisible (true);

			JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
			System.setOut (new PrintStream (out));
			Club c = new Club();
			c.getAllPhoneNumbers();
		}
	}
	static class Action4 implements ActionListener {        
		public void actionPerformed (ActionEvent e) {     
			JTextArea textArea = new JTextArea (25, 80);
			textArea.setEditable (false);
			JFrame frame = new JFrame ("stdout");
			Container contentPane = frame.getContentPane ();
			contentPane.setLayout (new BorderLayout ());
			contentPane.add (
					new JScrollPane (
							textArea, 
							JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
							JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
					BorderLayout.CENTER);
			frame.pack ();
			frame.setVisible (true);

			JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
			System.setOut (new PrintStream (out));
			Club c = new Club();
			c.numberOfMembers();
		}
	}
	static class Action5 implements ActionListener {        
		public void actionPerformed (ActionEvent e) {     
			JTextArea textArea = new JTextArea (25, 80);
			textArea.setEditable (false);
			JFrame frame = new JFrame ("stdout");
			Container contentPane = frame.getContentPane ();
			contentPane.setLayout (new BorderLayout ());
			contentPane.add (
					new JScrollPane (
							textArea, 
							JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
							JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
					BorderLayout.CENTER);
			frame.pack ();
			frame.setVisible (true);

			JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
			System.setOut (new PrintStream (out));
			Club c = new Club();
			c.deleteAll();
		}
	}
	static class Action6 implements ActionListener {        
		public void actionPerformed (ActionEvent e) {     
			JTextArea textArea = new JTextArea (25, 80);
			textArea.setEditable (false);
			JFrame frame = new JFrame ("stdout");
			Container contentPane = frame.getContentPane ();
			contentPane.setLayout (new BorderLayout ());
			contentPane.add (
					new JScrollPane (
							textArea, 
							JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
							JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
					BorderLayout.CENTER);
			frame.pack ();
			frame.setVisible (true);

			JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
			System.setOut (new PrintStream (out));
			Club c = new Club();
			c.getParentEmail();
		}
	}
	static class Actiona implements ActionListener {        
		public void actionPerformed (ActionEvent e) {     
			JTextArea textArea = new JTextArea (575, 350);
			textArea.setEditable (false);
			JFrame frame = new JFrame("LIT");
			frame.setVisible(true);
			frame.setSize(575,350);
		    JPanel panel = new JPanel(new MigLayout());
		    MigLayout layout = new MigLayout(
		    		 "", // Layout Constraints
		    		 "[center][right][left][c]", // Column constraints with default align
		    		 "[top][center][b]"); // Row constraints with default align
			frame.add(panel);
			JButton button = new JButton("Information for all information for all club members");
			panel.add(button, "span 2, align center, grow, wrap");
			button.addActionListener (new Action1());
			JButton button2 = new JButton("Emails for all club members");
			panel.add(button2, "grow");
			button2.addActionListener (new Action2());
			JButton button3 = new JButton("Phone numbers for all club members");
			panel.add(button3, "grow, wrap");
			button3.addActionListener (new Action3()); 
			JButton button4 = new JButton("Total number of club members");
			panel.add(button4, "grow");
			button4.addActionListener (new Action4()); 
			JButton button6 = new JButton("All Parent Emails");
			panel.add(button6, "wrap, grow");
			button6.addActionListener (new Action6());
			JButton button5 = new JButton("Delete all data");
			panel.add(button5, "wrap, grow, span 2");
			button5.addActionListener (new Action5()); 
			JLabel l1 = new JLabel("Input name to get email");
			panel.add(l1);
			JTextField textfield1 = new JTextField(25);
			panel.add(textfield1, "wrap");
			textfield1.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Club c = new Club();
					c.getEmail(textfield1.getText());
				} 
			});
			JLabel l2 = new JLabel("Input name to get phone number");
			panel.add(l2);
			JTextField textfield2 = new JTextField(25);
			panel.add(textfield2, "wrap");
			textfield2.addActionListener(new ActionListener() { 
				@Override
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Club c = new Club();
					c.getPhoneNumber(textfield2.getText());
				} 
			});
			JLabel l3 = new JLabel("Input name to delete them");
			panel.add(l3);
			JTextField textfield3 = new JTextField(25);
			panel.add(textfield3, "wrap");
			textfield3.addActionListener(new ActionListener() { 
				@Override
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Club c = new Club();
					c.deletePerson(textfield3.getText());
				} 
			});
			JLabel l4 = new JLabel("Input file location to load data");
			panel.add(l4);
			JTextField textfield4 = new JTextField(25);
			panel.add(textfield4, "wrap");
			textfield4.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Club c = new Club();
					c.loadData(textfield4.getText());
				} 
			});
		}
	}   
	static class Actionb implements ActionListener {        
		public void actionPerformed (ActionEvent e) {     
			JTextArea textArea = new JTextArea (575, 250);
			textArea.setEditable (false);
			JFrame frame = new JFrame("LIT");
			frame.setVisible(true);
			frame.setSize(1000,375);
		    JPanel panel = new JPanel(new MigLayout());
		    MigLayout layout = new MigLayout(
		    		 "", // Layout Constraints
		    		 "[center][right][left][c]", // Column constraints with default align
		    		 "[top][center][b]"); // Row constraints with default align
			frame.add(panel);
			JLabel l5 = new JLabel("Input conference name and year to get all names of people going");
			panel.add(l5);
			JTextField textfield5 = new JTextField(27);
			panel.add(textfield5, "wrap");
			textfield5.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (27, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.namesOfEveryoneGoingToConference(textfield5.getText());
				} 
			});
			JLabel l6 = new JLabel("Input conference name and year to get all form statuses ");
			panel.add(l6);
			JTextField textfield6 = new JTextField(26);
			panel.add(textfield6, "wrap");
			textfield6.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (26, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.getFormStatus(textfield6.getText());
				} 
			});
			JLabel l7 = new JLabel("Input conference name and year to get number of people going");
			panel.add(l7);
			JTextField textfield7 = new JTextField(25);
			panel.add(textfield7, "wrap");
			textfield7.addActionListener(new ActionListener() { 
				@Override
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.numberOfPeopleGoingToConference(textfield7.getText());
				} 
			});
			JLabel l8 = new JLabel("Input conference name and year to get email list");
			panel.add(l8);
			JTextField textfield8 = new JTextField(25);
			panel.add(textfield8, "wrap");
			textfield8.addActionListener(new ActionListener() { 
				@Override
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.emailListForConference(textfield8.getText());
				} 
			});
			JLabel l9 = new JLabel("Input conference name and year to get phone list");
			panel.add(l9);
			JTextField textfield9 = new JTextField(25);
			panel.add(textfield9, "wrap");
			textfield9.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.phoneListForConference(textfield9.getText());
				} 
			});
			JLabel l15 = new JLabel("Input conference name and year to get parent email list");
			panel.add(l15);
			JTextField textfield15 = new JTextField(25);
			panel.add(textfield15, "wrap");
			textfield15.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.parentEmailListForConference(textfield15.getText());
				} 
			});
			JLabel l10 = new JLabel("Input conference name and year to get potential chaperone list");
			panel.add(l10);
			JTextField textfield10 = new JTextField(25);
			panel.add(textfield10, "wrap");
			textfield10.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.parentsCanChaperone(textfield10.getText());
				} 
			});
			JLabel l11 = new JLabel("Input name and conference (in that order) to remove someone from conference list");
			panel.add(l11);
			JTextField textfield11 = new JTextField(25);
			panel.add(textfield11);
			JTextField textfield11b = new JTextField(25);
			panel.add(textfield11b, "wrap");
			textfield11b.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.deletePerson(textfield11.getText(), textfield11b.getText());
				}
			});
			JLabel l13 = new JLabel("Input name and conference to mark that someone turned in the SOI");
			panel.add(l13);
			JTextField textfield13 = new JTextField(25);
			panel.add(textfield13);
			JTextField textfield13b = new JTextField(25);
			panel.add(textfield13b, "wrap");
			textfield13b.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.turnedInSOI(textfield13.getText(), textfield13b.getText());
				} 
			});
			
			JLabel l14 = new JLabel("Input name and conference to mark that someone turned in the PAUSD Permission Slip");
			panel.add(l14);
			JTextField textfield14 = new JTextField(25);
			panel.add(textfield14);
			JTextField textfield14b = new JTextField(25);
			panel.add(textfield14b, "wrap");
			textfield14b.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.turnedInPAUSD(textfield14.getText(), textfield14b.getText());
				} 
			});
			JLabel l16 = new JLabel("Input name and conference to mark that someone turned in the conference disclosure form");
			panel.add(l16);
			JTextField textfield16 = new JTextField(25);
			panel.add(textfield16);
			JTextField textfield16b = new JTextField(25);
			panel.add(textfield16b, "wrap");
			textfield16b.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.turnedInConferenceDisclosure(textfield16.getText(), textfield16b.getText());
				} 
			});
			JLabel l12 = new JLabel("Input name and conference to mark that someone turned in the conference waiver");
			panel.add(l12);
			JTextField textfield12 = new JTextField(25);
			panel.add(textfield12);
			JTextField textfield12b = new JTextField(25);
			panel.add(textfield12b, "wrap");
			textfield12b.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					JTextArea textArea = new JTextArea (25, 80);
					textArea.setEditable (false);
					JFrame frame = new JFrame ("stdout");
					Container contentPane = frame.getContentPane ();
					contentPane.setLayout (new BorderLayout ());
					contentPane.add (
							new JScrollPane (
									textArea, 
									JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
									JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
							BorderLayout.CENTER);
					frame.pack ();
					frame.setVisible (true);
					JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
					System.setOut (new PrintStream (out));
					Conference c = new Conference();
					c.turnedInConferenceWaiver(textfield12.getText(), textfield12b.getText());
				} 
			});
		}
	}   
	
}