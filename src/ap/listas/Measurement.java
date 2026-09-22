package ap.listas;

import java.util.List;

/**
 * Class representing one measurement. Each measurement is made up of an
 * arbitrary number of channels, each containing a float value representing a
 * sample.
 * 
 * @author mmiguel, rgarciacarmona, gadria
 */
public class Measurement {

	List<Float> channels;

	/**
	 * Builds a new measurement from an array of floats containing the values
	 * measured by each channel.
	 * 
	 * @param channels The values measured by each channel.
	 */
	public Measurement(List<Float> channels) {
		this.channels = channels;
	}
	

	/**
	 * Returns the value taken by the specified channel.
	 * 
	 * @param numChannel The channel number, starting from 0.
	 * @return The value measured.
	 */
	public float getChannel(int numChannel) {
		return channels.get(numChannel);
	}

	/**
	 * Returns how many channels the measurement has.
	 * 
	 * @return The number of channels.
	 */
	public int numChannels() {
		return channels.size();
	}
	
	public String toString() {
		String s1 = "";
		for(float ch : channels) {
			s1 = s1 + ", " + Float.toString(ch);
		}
		
		return s1;
	}
	
}
