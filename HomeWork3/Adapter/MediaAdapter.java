package HomeWork3.Adapter;

public class MediaAdapter implements MediaPlayer{

    private final AdvancedPlayer player = new AdvancedPlayer();

    public void play(String file) {
        player.playFile(file);
    }
}
