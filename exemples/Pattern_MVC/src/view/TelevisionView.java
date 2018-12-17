package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.TelevisionController;
import model.TelevisionModel;

public class TelevisionView implements Observer {

	private TelevisionModel model;
	private TelevisionController controller;

	private JFrame jf_television;

	private JLabel jl_messageVolumeTelevision;
	private JLabel jl_volumeTelevision;
	private JButton jb_monterVolume;
	private JButton jb_baisserVolume;

	public TelevisionView(TelevisionModel model, TelevisionController controller) {
		this.model = model;
		this.controller = controller;

		// Affichage de la fenêtre
		this.jf_television = new JFrame("Télévision - Pattern MVC");
		this.jf_television.setSize(300, 100);
		this.jf_television.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Création des composants
		this.jl_messageVolumeTelevision = new JLabel("Volume de la télévision : ");
		this.jl_volumeTelevision = new JLabel("10");
		this.jb_monterVolume = new JButton("Monter le volume");
		this.jb_baisserVolume = new JButton("Baisser le volume");

		JPanel jp_television = new JPanel();
		jp_television.add(this.jl_messageVolumeTelevision);
		jp_television.add(this.jl_volumeTelevision);
		jp_television.add(this.jb_monterVolume);
		jp_television.add(this.jb_baisserVolume);

		this.jf_television.add(jp_television);
		
		//On ajoute nos écouteurs sur les boutons
		this.addUpListener();
		this.addDownListener();

		// Connexion entre le modèle et la vue
		this.model.addObserver(this);

		this.jf_television.setVisible(true);
		
	}

	public void modifierLabelVolume(int volume) {
		this.jl_volumeTelevision.setText(Integer.toString(volume));
	}

	public void addUpListener() {
		jb_monterVolume.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controller.monterVolume();

			}
		});
	}

	public void addDownListener() {
		jb_baisserVolume.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controller.baisserVolume();

			}
		});
	}

	@Override
	public void update(Observable o, Object arg) {
		this.modifierLabelVolume(this.model.getVolume());

	}

}
