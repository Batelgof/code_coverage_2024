package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import code_coverage_4.code_coverage_4.Triangle_classification.Triangle_Types;



public class Test_weak_method_1_a {
	
	Triangle_classification tester= new Triangle_classification();

//מסלול 1 	
	@Test
	public void tc1(){
        int a = 3;
        int b = 1;
        int c=7;
        String expected =Triangle_Types.Nottriangle.toString();
        String result = tester.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
//מסלול 2		
	@Test
	public void tc2(){
	        int a = 2;
	        int b = 10;
	        int c=4;
	        String expected =Triangle_Types.Nottriangle.toString();
	        String result = tester.classifyTriangle(a, b, c);
	        assertEquals(expected, result);
	    }
//מסלול 3 	
	@Test
	public void tc3(){
	        int a = 10;
	        int b = 2;
	        int c=6;
	        String expected =Triangle_Types.Nottriangle.toString();
	        String result = tester.classifyTriangle(a, b, c);
	        assertEquals(expected, result);
	    }
//מסלול 4
	@Test
	public void tc4(){
        int a = 5;
        int b = 7;
        int c=9;
        String expected =Triangle_Types.Scalene.toString();
        String result = tester.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
//מסלול 5
	@Test
	public void tc5(){
        int a = 8;
        int b = 5;
        int c=8;
        String expected =Triangle_Types.isosceles.toString();
        String result = tester.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
//מסלול 6
	@Test
	public void tc6(){
        int a = 5;
        int b = 8;
        int c=8;
        String expected =Triangle_Types.isosceles.toString();
        String result = tester.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
//מסלול 8
	@Test
	public void tc7(){
        int a = 8;
        int b = 8;
        int c=5;
        String expected =Triangle_Types.isosceles.toString();
        String result = tester.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
//מסלול 9
	@Test
	public void tc8(){
        int a = 8;
        int b = 8;
        int c=8;
        String expected =Triangle_Types.equilateral.toString();
        String result = tester.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
	
	



}
