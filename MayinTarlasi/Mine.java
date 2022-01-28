package kodluyoruz.MayinTarlasi;

public class Mine {
	
	
	String text;
	boolean isExistMine;
	boolean isOpen;
	
	public Mine(String text,boolean isExistMine,boolean isOpen) {
		this.text = text;
		this.isExistMine = isExistMine;
		this.isOpen = isOpen;
	}
	
	public void setMineText(String text) {
		this.text = text;
	}
	
	public void isExistMine(boolean isExistMine) {
		this.isExistMine = isExistMine;
	}
	
	public void isOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

}
