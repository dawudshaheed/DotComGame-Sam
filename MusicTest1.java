//musical Instrument Digital Interface

import javax.sound.midi.*;

//first get a sequencer object - takes in the midi data
//and sends it to the right place - it plays the music

public class MusicTest1 {

	public void play() {
		
		//getSequence( check the Oracle to determine what
		//exceptions it throws and use it in the catch
		//
		//here we are handling the exception
		
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Successfully got a sequencer");
		}catch (MidiUnavailableException ex){
			System.out.println("Did not get one");
			
		}
	}// close play
	
	public static void main (String [] arguments) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}//close main
}//close class

