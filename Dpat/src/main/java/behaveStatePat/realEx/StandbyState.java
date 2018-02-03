package behaveStatePat.realEx;

public class StandbyState extends DVDPlayerState {

	public StandbyState(){
		System.out.println("STAND BY");
	}
	
	@Override
	public void PlayButtonPressed(DVDPlayer pl) {
		pl.setS2(new MoviePlayingState());
	}

	@Override
	public void MenuButtonPressed(DVDPlayer pl) {
		pl.setS2(new MenuState());
	}

}
