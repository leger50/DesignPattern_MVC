package controller;

import model.TelevisionModel;

public class TelevisionController {

	private TelevisionModel model;

	public TelevisionController(TelevisionModel model) {
		this.model = model;
	}

	public void monterVolume() {
		model.monterLeVolume();
	}

	public void baisserVolume() {
		model.baisserLeVolume();
	}

}
