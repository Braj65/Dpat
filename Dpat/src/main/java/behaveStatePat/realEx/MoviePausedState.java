package behaveStatePat.realEx;

public class MoviePausedState extends DVDPlayerState {

	public MoviePausedState(){
		System.out.println("MOVIE PAUSED");
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
