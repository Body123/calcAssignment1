import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCases {

	@Test
	void test() {
		Calculator object =new Calculator();
		int input=object.add(5, 5);
		assertEquals(10,input);
		input=object.add(6, 8);
		assertEquals(14,input);
		input=object.add(6, 20);		//for add function
		assertEquals(26,input);
	
		float input2=object.divide(5, 10);
		assertEquals(0.5,input2);	
		input2=object.divide(7, 10);
		assertEquals(0.7f,input2);
		input2=object.divide(0, -5);		//for division function
		assertEquals(0,input2);
		try {
		input2=object.divide(0, 0);
		input2=object.divide(5, 0);	
		}catch (Exception r) {
			System.out.println(r.toString());
		}
		
		
	
		
	}

}
