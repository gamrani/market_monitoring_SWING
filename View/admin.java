package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.controller;
import metier.Metier;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Font;

public class admin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(600, 600, 750, 750);
		this.setLocation(160, 10);
		this.setTitle("admin");
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.setForeground(SystemColor.activeCaptionBorder);
		menuBar.setBackground(SystemColor.control);
		menuBar.setBounds(0, 0, 734, 50);
		
		JMenu menu = new JMenu("Projets");
		menu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menu.setHorizontalAlignment(SwingConstants.TRAILING);
		menu.setForeground(SystemColor.textHighlight);
		menu.setBackground(SystemColor.controlHighlight);
		
		JMenuItem itemProjet = new JMenuItem("Liste des projets");
		JMenuItem itemProjet2 = new JMenuItem("Modifier");
		JMenuItem itemProjet3 = new JMenuItem("Supprimer");
		
		menu.add(itemProjet);
		menu.add(itemProjet2);
		menu.add(itemProjet3);
		
		
		
		JMenu menu2 = new JMenu("Services");
		menu2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menu2.setForeground(SystemColor.textHighlight);
		menu2.setBackground(SystemColor.controlHighlight);
		
		JMenuItem itemService = new JMenuItem("Liste des services");
		JMenuItem itemService2 = new JMenuItem("Modifier");
		JMenuItem itemService3 = new JMenuItem("Arreter");
		JMenuItem itemService4 = new JMenuItem("Ajouter");
	
		menu2.add(itemService);
		menu2.add(itemService4);
		menu2.add(itemService2);
		menu2.add(itemService3);
		
		menu.add(itemProjet);
		menu.add(itemProjet2);
		menu.add(itemProjet3);
		
		JMenu menu3 = new JMenu("Employers");
		menu3.setBackground(SystemColor.controlHighlight);
		menu3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menu3.setForeground(SystemColor.textHighlight);
		
		JMenuItem itemEmployer = new JMenuItem("Liste des employers");
		JMenuItem itemEmployer2 = new JMenuItem("Modifier");
		JMenuItem itemEmployer3 = new JMenuItem("Supprimer");
		JMenuItem itemEmployer4 = new JMenuItem("ajouter");
		
		menu3.add(itemEmployer);
		menu3.add(itemEmployer4);
		menu3.add(itemEmployer2);
		menu3.add(itemEmployer3);
		
		
		JMenu menu4 = new JMenu("Chefs de service");
		menu4.setBackground(SystemColor.controlHighlight);
		menu4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menu4.setForeground(SystemColor.textHighlight);
		
		JMenu menu5 = new JMenu("Quitter");
		menu5.setBackground(SystemColor.controlHighlight);
		menu5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menu5.setForeground(SystemColor.textHighlight);
		
		JMenuItem menuItem = new JMenuItem("Deconnecter");
		JMenuItem menuItem2 = new JMenuItem("Sortir");
		menu5.add(menuItem);
		menu5.add(menuItem2);		
		
		menuBar.add(menu);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);
		menuBar.add(menu5);
		
		menuItem2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
			      
				     
						setVisible(false);
					
			
			}
			});
		
		menuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
			      
				     setVisible(false);
				     controller c = new controller("acceuil");
			
			    }
			});
		
		contentPane.add(menuBar);
		this.setVisible(true);
	}
}
