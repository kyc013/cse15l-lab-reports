# Lab Report 3 
*Kyungwoo Choi*  

**PT1 - Bugs**  

I'll be talking about the bug in the method *static int[] reversed* inside **ArrayExamples.java**  
Any test input that isn't an empty array, such as `{3,5,7}`, would come out as a failure, as the output is always an empty array.  
![스크린샷(189)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/a63153d8-ede8-4517-be87-d2d360360ced)  
  
An empty array`{}`, however, would always come out as a test success.  
![스크린샷(188)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/5c12492c-7ff7-42a7-87c5-21a04d538b99)  

`  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
  `  
As we're supposed to return an array that all the elements of the input array in reversed order, we should change the body of the for loop so that the values of the newArray are changed, and that the newArray is returned.  
`  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }
`  

**PT2 - Researching Commands**  
I'll be talking about the command `grep`  
There are several options for `grep`, the following being some of them:  
  
-c : This prints only a count of the lines that match a pattern  
-i : Ignores, case for matching  
-v : This prints out all the lines that do not matches the pattern  
-w : Match whole word  
The options above are from the link *https://www.geeksforgeeks.org/grep-command-in-unixlinux/*

**For each of those options, give 2 examples of using it on files and directories from ./technical. Show each example as a `code block` that shows the command and its output, and write a sentence or two about what it’s doing and why it’s useful.
That makes 8 total examples, all focused on a single command. There should be two examples each for four different command-line options.**

