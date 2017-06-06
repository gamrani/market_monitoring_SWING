package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import Controller.controller;
import metier.Metier;

public class acceuil extends JFrame {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acceuil frame = new acceuil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	protected JPanel contentPane ;
	protected JPanel panel;
	
	private acceuil acceuil ;
	private admin admin ;
	
	
	private JTextField login;
	private JPasswordField password;
	
	public acceuil()
	{
		panel = new JPanel();
		contentPane = new JPanel();
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(600, 600, 750, 750);
		this.setLocation(160, 10);
		
		this.add(new JLabel(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Market_Monitoring\\monitoring\\logo.png")));
		//"C:\\Users\\lenovo\\Desktop\\Market_Monitoring\\monitoring\\logo.png"
		//JLabel background=new JLabel(new ImageIcon("C:\\Users\\lenovo\\Desktop\\Market_Monitoring\\monitoring\\logo.png"));
		//contentPane.add(background);
		//background.setLayout(new FlowLayout());
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);	
		//this.setVisible(true);
		
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(128, 128, 128), null, null));
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(39, 540, 624, 132);
		contentPane.add(panel);
		panel.setLayout(null);
		
		login = new JTextField();
		login.setHorizontalAlignment(SwingConstants.LEFT);
		login.setBounds(224, 25, 173, 23);
		panel.add(login);
		login.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(224, 59, 173, 23);
		panel.add(password);
		
		JButton seconnecter = new JButton("LOG IN");
		seconnecter.setBounds(224, 93, 173, 23);
		panel.add(seconnecter);
		
		
		
		JLabel usernameLabel = new JLabel("Username :");
		usernameLabel.setBounds(141, 29, 71, 14);
		panel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password : ");
		passwordLabel.setBounds(129, 63, 83, 14);
		panel.add(passwordLabel);
		
		JLabel usernameError = new JLabel("");
		usernameError.setForeground(new Color(0, 0, 0));
		usernameError.setBounds(224, 11, 173, 14);
		panel.add(usernameError);
		
		JLabel passwordError = new JLabel("");
		passwordError.setForeground(new Color(165, 42, 42));
		passwordError.setBounds(407, 59, 173, 14);
		panel.add(passwordError);
		

		seconnecter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				       Metier m = new Metier();
			           if(!m.login(login.getText(),password.getText())){
			        	   usernameError.setText("CONNECTION NOT ALLOWED");
			        	    panel.setBackground(Color.RED);
			           }else{
			        	   
			        	 controller c = new controller(m.statut(login.getText(), password.getText()));
			        	   setVisible(false);
			        	   
			           }
			          
			          
				
				    }
				});
		
		this.setVisible(true);
	}
	
	
}

