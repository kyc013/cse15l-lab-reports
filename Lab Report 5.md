# Lab Report 5  
*Kyungwoo Choi* 
  
**Pt1 – Debugging Scenario**  
*1. Original Post*  
![280444447-a63153d8-ede8-4517-be87-d2d360360ced(1)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/318c4456-40c0-4613-9e7e-306ca8eae2bd)
The symptom shows a failure in the `testReversed` method.
```
  static int[] reversed(int[] arr) {  
    int[] newArray = new int[arr.length];  
    for(int i = 0; i < arr.length; i += 1) {  
      arr[i] = newArray[arr.length - i - 1];  
    }  
    return arr;  
  }
```
I think `newArray` should be returned instead of `arr`, but I'm not sure what else is wrong.  
It works with an empty array, but nothing else.  
  
*2. TA Response*  
Remember that the goal of the method is to return a `newArray` with the contents of `arr` in reversed order.  
Think about why it might work with certain inputs and not others.  
Good luck!  

*3. Re-Response*
Thank you for your help.  
I've fixed the code and I think it works with all other inputs as well.  
```
  static int[] reversed(int[] arr) {  
    int[] newArray = new int[arr.length];  
    for(int i = 0; i < arr.length; i += 1) {  
      newArray[i] = arr[arr.length - i - 1];  
    }  
    return newArray;  
  }
```  
I changed the `for` loop so that the contents of `newArray` would be newly written with the contents of `arr` in reversed order.  
I also changed `return arr` to `return newArray`.  
  
![280444427-5c12492c-7ff7-42a7-87c5-21a04d538b99](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/f6ef9d7a-998e-4ccc-a96b-04cf087667ec)
This is the successful result I got after running the command `bash test.sh`.  
  
*4. Overview*  
*The file & directory structure needed:*  
-home/  
  - ArrayTests.java
  - ArrayExamples.java
  - test.sh
  - lib/
    - hamcrest-core-1.3.jar
    - junit-4.13.2.jar  
  
*The contents of each file before fixing the bug:*  
**ArrayTests.java**  
```
import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
}
```  
**ArrayExamples.java**
```
public class ArrayExamples {

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
}
```  
**test.sh**
```
javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java
java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ArrayTests
```
  
*The full command line (or lines) you ran to trigger the bug:*
`bash test.sh`  

*A description of what to edit to fix the bug:*  
Any test input that isn’t an empty array, such as {3,5,7}, would come out as a failure, as the output is always an empty array.  
An empty array{}, however, would always come out as a test success.  
As we’re supposed to return an array that all the elements of the input array in reversed order,  
we should change the body of the for loop so that the values of the newArray are changed, and that the newArray is returned.  
  
**Pt2 – Reflection**  
  
This was the first time I learned about vim and editing the contents of a file through the terminal.  
It was interesting to know that I don't have to rely on a GUI and could directly make changes through the terminal.
Overall, the lab sessions were very informative and helpful.
