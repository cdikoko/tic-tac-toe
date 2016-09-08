package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	public TicTacToe model;
	
	@Before
	public void setup(){
		model = new TicTacToe();
	}
		
	@Test
	public void testInitialBoardIsEmpty (){
			model.clear(); 
			}
		
	
	@Test
	public void testMarkXInUpperRightCorner() {
		model.getMove(0,2);
		
	}
		
	
	@Test
	public void testMarkXinCenter(){
		assertTrue(false);
		
	}

	@Test
	public void testMarkXinCenterThenOInCenter(){
		assertTrue(false);
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
	assertTrue(false);	
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		assertTrue(false);
	}	
}
