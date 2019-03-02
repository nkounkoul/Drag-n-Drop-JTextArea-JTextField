package cg.ebook.gleich;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javafx.scene.layout.Border;

public class Fenetre extends JFrame {

	private JPanel conteneur;
	private JPanel conteneur2;
	private JTextArea textArea;
	private JTextField jTextField;
	
	
	public Fenetre() {
		super("Exemple Drag;n Drop");
		this.setSize(400, 300);
		
		// Creation d'un conteneur
		conteneur = new JPanel();
		conteneur.setLayout(new BorderLayout());
		
		//Creation du JTextARea avec son contenu deplacable
		textArea = new JTextArea("Bonjour !!! Gleich. Deplace moi si tu peux");
		
		// Activation du deplacement de contenu
		textArea.setDragEnabled(true);
		
		//Ajout du textArea dans le conteneur.
		//Le JScrollPane dans lequel est englobe le TextArea permet d'afficher un une barre de defilement une fois la taille de l'obj depassee
		conteneur.add(new JScrollPane(textArea));
		
		// Creation d'un deuxieme conteneur qui va accueillir le JTextField
		conteneur2 = new JPanel();
		conteneur2.setLayout(new BorderLayout());
		
		//Creation du champs de saisi de texte jTextField
		jTextField = new JTextField();
		jTextField.setBackground(Color.cyan);
		
		// Activation du Drag'n Drop
		jTextField.setDragEnabled(true);
		
		//Ajout du textArea dans le conteneur
		conteneur2.add(jTextField);
		
		//Ajout des conteneur au conteneur de la fenetre
		this.getContentPane().add(conteneur, BorderLayout.CENTER);
		this.getContentPane().add(conteneur2, BorderLayout.SOUTH);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Fenetre();

	}

}
