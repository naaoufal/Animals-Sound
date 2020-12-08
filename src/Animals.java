import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animals {

	public void ReadSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		String effectSource = null;
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("C:\\Users\\Desktop-666\\eclipse-workspace\\projects\\Animal\\sounds\\eag.wav"));
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		System.out.println(effectSource+" sound is start ! ");
		System.out.println("s : "+clip.isActive());
		while(clip.isActive()) {
		//System.out.println("hola "+effectSource);
		}
		clip.close();
		System.out.println(effectSource+" sound is end ! ");
	}


}
