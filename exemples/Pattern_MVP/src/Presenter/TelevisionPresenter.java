package presenter;

import model.TelevisionModel;

public class TelevisionPresenter {
	
	private TelevisionModel model;
	private Presenter view;
	
	public void setModel( TelevisionModel model) {
		this.model=model;
	}
	
	public void setView( Presenter view) {
		this.view = view;
	}
	
	public void monterVolume() {
		model.monterLeVolume();
		view.updateVolume(model.getVolume());
	}
	
	public void baisserVolume() {
		model.baisserLeVolume();
		view.updateVolume(model.getVolume());
	}
}
