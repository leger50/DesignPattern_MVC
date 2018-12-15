package model;

import java.util.Observable;

public class TelevisionModel extends Observable {

	private int volume;

	public TelevisionModel() {
		this.volume = 10;
	}

	public void monterLeVolume() {
		this.volume++;
		
		setChanged();
		notifyObservers();
	}

	public void baisserLeVolume() {
		this.volume--;
		
		setChanged();
		notifyObservers();
	}

	public int getVolume() {
		return this.volume;
	}
}
