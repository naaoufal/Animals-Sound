import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
	public static void main (String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Eagle E = new Eagle();
		E.Sound();
	}
}
