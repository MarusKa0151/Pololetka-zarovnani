
package cz.alisma.alej.text.wrapping;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class AlignerTest {
	
	
	@Test
	public void leftAlignerTest() {
		Aligner aligner = new LeftAligner();
		String testString = "This should be left-aligned.";
		String goodString = "This should be left-aligned.";
		
		assertEquals(aligner.format(Arrays.asList(testString.split(" ")), 40), goodString);
	}
	
	@Test
	public void rightAlignerTest() {
		Aligner aligner = new RightAligner();
		String testString = "This should be right-aligned.";
		String goodString = "           This should be right-aligned.";
		
		assertEquals(aligner.format(Arrays.asList(testString.split(" ")), 40), goodString);
	}
	
	@Test
	public void centreAlignedTest() {
		Aligner aligner = new CentreAligner();
		String testString = "This should be in the centre.";
		String goodString = "      This should be in the centre.";
		
		assertEquals(aligner.format(Arrays.asList(testString.split(" ")), 40), goodString);		
	}
	
	@Test
	public void justifyAlignedTest() {
		Aligner aligner = new JustifyAligner();
		String testString = "This should be justified.";
		String goodString = "This      should      be      justified.";
		
		assertEquals(aligner.format(Arrays.asList(testString.split(" ")), 40), goodString);
	}
}