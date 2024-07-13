package in.dev.gmsk.oops;

public class MainMethod {

    /**
     * **Explanation:**
     * **Superclass Reference: **MediaFile is the superclass, and it has methods that are common to all media files.
     * **Subclass Objects: **AudioFile and VideoFile are subclasses with additional methods specific to their types.
     * **Using Superclass Reference: **In the playlist array, we use MediaFile references to hold objects of AudioFile and VideoFile. This allows us to iterate over the playlist and call the play() method on each media file, regardless of its specific type.
     * <p>
     * **Real-World Application:**
     * In a media player application, this approach allows you to manage a collection of different types of media files (audio, video) using a common interface (MediaFile). This makes the code more flexible and easier to extend, as you can add new types of media files without changing the core logic of the playlist management.
     */
    public static void main(String[] args) {

        MediaFile[] playList = new MediaFile[2];

        playList[0] = new AudioFile();
        playList[0].fileName = "Uchimalai Kaathavaraayan.mp3";

        playList[1] = new VideoFile();
        playList[1].fileName = "Teenz.mp4";

        for (MediaFile media : playList) {
            media.play();
        }
    }
}
