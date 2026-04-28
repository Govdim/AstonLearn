package HomeWork3.Adapter;

public class AdapterDemo{

    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();
        player.play("music.mp3");
    }
}
