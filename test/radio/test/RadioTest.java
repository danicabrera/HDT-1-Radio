/**
 * 
 */
package radio.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.uvg.ayed.Radio;

/**
 * @author Acer
 *
 */
class RadioTest {

	/**
	 * Test method for {@link com.uvg.ayed.Radio#getStatus()}.
	 */
	@Test
	void testGetStatus() {
		Radio radio = new Radio();
		assertEquals(false, radio.getStatus());
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#switchButton()}.
	 */
	@Test
	void testSwitchButton() {
		Radio radio = new Radio();
		radio.switchButton();
		assertEquals(true, radio.getStatus());
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#changeMode()}.
	 */
	@Test
	void testChangeMode() {
		Radio radio = new Radio();
		radio.changeMode();
		assertEquals(1, radio.getActualMode());
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#getActualMode()}.
	 */
	@Test
	void testGetActualMode() {
		Radio radio = new Radio();
		assertEquals(0, radio.getActualMode());
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#saveInAM(int, int)}.
	 */
	@Test
	void testSaveInAM() {
		Radio radio = new Radio();
		radio.saveInAM(1, 1060);
		assertEquals(1060, radio.getSavedFreqAM(1));
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#getSavedFreqAM(int)}.
	 */
	@Test
	void testGetSavedFreqAM() {
		Radio radio = new Radio();
		radio.saveInAM(1, 1060);
		assertEquals(1060, radio.getSavedFreqAM(1));
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#saveInFM(int, double)}.
	 */
	@Test
	void testSaveInFM() {
		Radio radio = new Radio();
		radio.saveInFM(3, 88.1);
		assertEquals(88.1, radio.getSavedFreqFM(3));
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#getSavedFreqFM(int)}.
	 */
	@Test
	void testGetSavedFreqFM() {
		Radio radio = new Radio();
		radio.saveInFM(3, 88.1);
		assertEquals(88.1, radio.getSavedFreqFM(3));
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#getActualFreqAM()}.
	 */
	@Test
	void testGetActualFreqAM() {
		Radio radio = new Radio();
		radio.saveInAM(1, 1060);
		int num = radio.getSavedFreqAM(1);
		assertEquals(num, radio.getActualFreqAM());
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#getActualFreqFM()}.
	 */
	@Test
	void testGetActualFreqFM() {
		Radio radio = new Radio();
		radio.saveInFM(1, 88.1);
		double num = radio.getSavedFreqFM(1);
		assertEquals(num, radio.getActualFreqFM());
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#moveForward()}.
	 */
	@Test
	void testMoveForward() {
		Radio radio = new Radio();
		radio.changeMode();
		radio.saveInFM(1, 88.1);
		double num = radio.getSavedFreqFM(1);
		radio.moveForward();
		assertEquals(num + 0.2, radio.getActualFreqFM());
	}

	/**
	 * Test method for {@link com.uvg.ayed.Radio#moveBackward()}.
	 */
	@Test
	void testMoveBackward() {
		Radio radio = new Radio();
		radio.changeMode();
		radio.saveInFM(1, 88.1);
		double num = radio.getSavedFreqFM(1);
		radio.moveBackward();
		assertEquals(num - 0.4, radio.getActualFreqFM());
	}

}
