package model;

public class TelevisionModel {

	private int volume;
	
	public TelevisionModel() {
		this.volume = 10;
	}
	
	public void monterLeVolume() {
		this.volume++;
	}
	
	public void baisserLeVolume() {
		this.volume--;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	
}
