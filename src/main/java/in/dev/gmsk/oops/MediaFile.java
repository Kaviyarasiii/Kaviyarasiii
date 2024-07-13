package in.dev.gmsk.oops;

public class MediaFile {
    String fileName;

    public void play() {
        System.out.println("playing = " + fileName);
    }

    public void pause() {
        System.out.println("pause = " + fileName);
    }

    public void stop() {
        System.out.println("stop = " + fileName);
    }
}
