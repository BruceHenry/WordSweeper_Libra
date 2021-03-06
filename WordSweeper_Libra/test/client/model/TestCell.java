package client.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import client.model.Cell;

/**@author You Zhou, Qingquan Zhao, Han Bao, Ruochen Shi (Authors contribute equally)
 * This is responsible for testing "Cell" Entity class*/
public class TestCell {
	
	/**the test for checking if the cell is bonus function*/
	@Test
	public void TestIsBonus()
	//the test for set&get isBonus function
	{
		Cell cell1=new Cell();
		assertEquals(false,cell1.isBonus());
		cell1.setBonus(true);
		assertEquals(true,cell1.isBonus());
	}
	
	/**the test about the cell's local position*/
	@Test
	public void TestLocalPosition()
	//the test for set&get local column &row function
	{
		Cell cell2=new Cell();
		assertEquals(0,cell2.getLocalCol());
		cell2.setLocalCol(3);
		assertEquals(3,cell2.getLocalCol());
		assertEquals(0,cell2.getLocalRow());
		cell2.setLocalRow(2);
		assertEquals(2,cell2.getLocalRow());
	}
	
	/**the test about the cell's global position*/
	@Test
	public void TestGlobalPosition()
	//the test for set&get global  column &row function
	{
		Cell cell3=new Cell();
		assertEquals(0,cell3.getGlobalCol());
		cell3.setGlobalCol(5);
		assertEquals(5,cell3.getGlobalCol());
		assertEquals(0,cell3.getGlobalRow());
		cell3.setGlobalRow(4);
		assertEquals(4,cell3.getGlobalRow());
	}
	
	/**the test for getting and letters in cells*/
	@Test
	public void TestCellLetter()
	//the test for set&get cell letter function
	{
		Cell cell4=new Cell();
		assertEquals("",cell4.getLetter());
		cell4.setLetter("R");
		assertEquals("R",cell4.getLetter());
	}
	
	/**the test for checking and setting if the cell is chosen*/
	@Test
	public void TestIsChosen()
	//the test to know if the cell is chosen or not function
	{
		Cell cell5=new Cell();
		assertEquals(false,cell5.isChosen());
		cell5.setAsChosen();
		assertEquals(true,cell5.isChosen());
		cell5.setAsUnchosen();
		assertEquals(false,cell5.isChosen());
	}
}
//end of the test of Cell entity
