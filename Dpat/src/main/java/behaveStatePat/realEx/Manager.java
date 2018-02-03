package behaveStatePat.realEx;

public class Manager {
	public static void main(String[] args){
		DVDPlayer d=new DVDPlayer();
		d.pressPlayButton();
		d.pressMenuButton();
		d.pressPlayButton();
		d.pressPlayButton();
		d.pressMenuButton();
		d.pressPlayButton();
		d.pressPlayButton();
	}
}
