package behaveStatePat.realEx;

public class MoviePlayingState extends DVDPlayerState {

	public MoviePlayingState(){
		System.out.println("Movie Playing state");
	}
	@Override
	public void PlayButtonPressed(DVDPlayer pl) {
		pl.setS2(new MoviePausedState());
	}

	@Override
	public void MenuButtonPressed(DVDPlayer pl) {
		pl.setS2(new MenuState());
	}

}
