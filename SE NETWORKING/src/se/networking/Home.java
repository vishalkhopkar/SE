package se.networking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JList;
import javax.swing.JComboBox;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setBounds(100,100,1397,744);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOperatingSystem = new JLabel("Operating System:");
		lblOperatingSystem.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblOperatingSystem.setBounds(826, 662, 108, 14);
		frame.getContentPane().add(lblOperatingSystem);
		
		JLabel osNameLabel = new JLabel("hello");
		osNameLabel.setForeground(new Color(204, 0, 0));
		osNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 48));
		osNameLabel.setBounds(944, 634, 391, 49);
		frame.getContentPane().add(osNameLabel);
		osNameLabel.setText(System.getProperty("os.name"));
		
		JLabel lblNetworkDelay = new JLabel("Network delay (in seconds)");
		lblNetworkDelay.setBounds(10, 11, 245, 14);
		frame.getContentPane().add(lblNetworkDelay);
		
		JLabel label = new JLabel("0");
		label.setBounds(322, 11, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Select your adapter:");
		lblNewLabel.setBounds(897, 20, 160, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBoxForAdapters = new JComboBox(NetworkingMain.adapterNames);
		comboBoxForAdapters.setBounds(1058, 11, 277, 32);
		frame.getContentPane().add(comboBoxForAdapters);
		comboBoxForAdapters.setSelectedIndex(0);
		
		JLabel lblPrivateIpAddress = new JLabel("Private IP address");
		lblPrivateIpAddress.setBounds(438, 663, 98, 14);
		frame.getContentPane().add(lblPrivateIpAddress);
		
		JLabel ipAddrLabel;
		try {
			ipAddrLabel = new JLabel(NetworkingMain.returnIP(null, null));
			ipAddrLabel.setBounds(582, 663, 108, 14);
			frame.getContentPane().add(ipAddrLabel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		comboBoxForAdapters.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String h=(String)comboBoxForAdapters.getSelectedItem();
				comboBoxForAdapters.setSelectedItem(h);
				
			}
		});
		try{
			//String r=NetworkingMain.returnIP("Windows",null);
		}catch(Exception e){ e.printStackTrace();}
		
	}
}
