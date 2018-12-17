package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import presenter.Presenter;
import presenter.TelevisionPresenter;

@SuppressWarnings("serial")
public class TelevisionView extends JFrame implements Presenter,ActionListener{
	
	private TelevisionPresenter presenter;
	
	private JLabel jl_messageVolumeTelevision;
	private JLabel jl_volumeTelevision;
	private JButton jb_monterVolume;
	private JButton jb_baisserVolume;
	
	public TelevisionView() {
		
		//Affichage de la fenêtre
		this.setTitle("Télévision - Pattern MVP");
		this.setSize(300, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Création des composants
		this.jl_messageVolumeTelevision = new JLabel("Volume de la télévision : ");
		this.jl_volumeTelevision = new JLabel("10");
		this.jb_monterVolume = new JButton("Monter le volume");
		this.jb_baisserVolume = new JButton("Baisser le volume");
		
		JPanel jp_television = new JPanel();
		jp_television.add(this.jl_messageVolumeTelevision);
		jp_television.add(this.jl_volumeTelevision);
		jp_television.add(this.jb_monterVolume);
		jp_television.add(this.jb_baisserVolume);
		
		jb_monterVolume.addActionListener(this);
		jb_baisserVolume.addActionListener(this);
		
		this.add(jp_television);
		
		this.setVisible(true);
	}
	
	public void updateVolume(int volume) {
		this.jl_volumeTelevision.setText(Integer.toString(volume));
	}
	
	@Override
	public void setPresenter(TelevisionPresenter presenter) {
		this.presenter=presenter;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jb_monterVolume) {
			presenter.monterVolume();
		}
		
		if(e.getSource() == jb_baisserVolume) {
			presenter.baisserVolume();
		}
		
	}

	


}
