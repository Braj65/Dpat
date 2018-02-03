package behaveStatePat.realEx;

public class MenuState extends DVDPlayerState {

	public MenuState(){
		System.out.println("MENU");
	}
	@Override
	public void PlayButtonPressed(DVDPlayer pl) {
		System.out.println("Next menu item selected");
	}

	@Override
	public void MenuButtonPressed(DVDPlayer pl) {
		pl.setS2(new StandbyState());
	}

}
