import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{4,3,2,1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {4,5,6,7};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{7,6,5,4}, ArrayExamples.reversed(input2));
  }
}
