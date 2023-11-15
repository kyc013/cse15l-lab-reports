# Lab Report 3 
*Kyungwoo Choi*  

**PT1 - Bugs**  

I'll be talking about the bug in the method *static int[] reversed* inside **ArrayExamples.java**  
Any test input that isn't an empty array, such as `{3,5,7}`, would come out as a failure, as the output is always an empty array.  
```
  public void testReversed() {
    int[] input1 = {3,5,7};
    assertArrayEquals(new int[]{7,5,3}, ArrayExamples.reversed(input1));
  }
```  
![스크린샷(189)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/a63153d8-ede8-4517-be87-d2d360360ced)  
  
An empty array`{}`, however, would always come out as a test success.  
```
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
```  
![스크린샷(188)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/5c12492c-7ff7-42a7-87c5-21a04d538b99)  
```
  static int[] reversed(int[] arr) {  
    int[] newArray = new int[arr.length];  
    for(int i = 0; i < arr.length; i += 1) {  
      arr[i] = newArray[arr.length - i - 1];  
    }  
    return arr;  
  }
```
As we're supposed to return an array that all the elements of the input array in reversed order, we should change the body of the for loop so that the values of the newArray are changed, and that the newArray is returned.  
```
  static int[] reversed(int[] arr) {  
    int[] newArray = new int[arr.length];  
    for(int i = 0; i < arr.length; i += 1) {  
      newArray[i] = arr[arr.length - i - 1];  
    }  
    return newArray;  
  }
```  

**PT2 - Researching Commands**  
I'll be talking about the command `grep`  
There are several options for `grep`, the following being some of them(all the options below are from the link *https://www.geeksforgeeks.org/grep-command-in-unixlinux/*):  
  
`-c` : This prints only a count of the lines that match a pattern  
`-i` : Ignores case for matching  
`-v` : This prints out all the lines that do not matches the pattern  
`-w` : Match whole word  

Below are the examples of what happens when we use each option for a directory. Our working direcotry is `/docsearch/technical`, and we will be using `grep` for a file called `1471-2202-4-12.txt` inside `biomed`.  
```
grep -c "example" biomed/1471-2202-4-12.txt
3
```
As we can see from the output, if we wish to see how many lines inside the file that has the word 'example', we can use `grep -c`.  
  
```
grep -i "example" biomed/1471-2202-4-12.txt
] . For example, brain slices containing microgyric cortex
maladaptive in all cases. For example, the presence of
in other studies; for example, our auditory environment
```
As we can see from the output, if we wish to see all the lines inside the file with the word 'example' regardless of whether it is in capitals or not, we can use `grep -i`.  
  
```
grep -v "example" biomed/1471-2202-4-12.txt
Background
        Focal damage to the developing brain can have widespread
        consequences for structures and regions that project to or
        receive direct or even indirect projections from the
        damaged area [ 1 2 3 ] . Focal neocortical malformations
        induced by freeze injury to the developing cortical plate
        exemplify this fact. It has been shown that these
        malformations, resembling human microgyria, are associated
        with widespread disturbances in neuronal organization [ 4 5
...(continued)...
        manuscript. RHF supervised all aspects of the study and
        participated in all aspects of its design, coordination,
        and drafting. JJT performed the auditory testing and
        perfusions of Study 2. ANY performed the anatomic measures
        and collaborated on the statistical analysis. GDR performed
        the freezing lesions, supervised the anatomic measures,
        supervised the final data analysis, and participated in the
        drafting of the manuscript. All authors have read and
        approved the final manuscript.
```
As we can see from the output, if we wish to see all the lines inside the file without the word 'example'. we can use `grep -v`.  
  
```
grep -w "example" biomed/1471-2202-4-12.txt
] . For example, brain slices containing microgyric cortex
maladaptive in all cases. For example, the presence of
in other studies; for example, our auditory environment
```
As we can see from the output, if we wish to see all the lines that have the words specifically matching 'example' inside the file, we can use `grep -w`.  
  
  
Let's try grep using a letter instead of a word.  
```
grep -c "e" biomed/1471-2202-4-12.txt
350
```
As we can see from the output, if we wish to see how many lines inside the file that has the letter 'e', we can use `grep -c`.  
  
```
grep -i "e" biomed/1471-2202-4-12.txt
Focal damage to the developing brain can have widespread  
consequences for structures and regions that project to or  
receive direct or even indirect projections from the  
damaged area [ 1 2 3 ] . Focal neocortical malformations  
induced by freeze injury to the developing cortical plate
...(continued)...
perfusions of Study 2. ANY performed the anatomic measures  
and collaborated on the statistical analysis. GDR performed  
the freezing lesions, supervised the anatomic measures,  
supervised the final data analysis, and participated in the  
drafting of the manuscript. All authors have read and  
approved the final manuscript.
```
As we can see from the output, if we wish to see all the lines inside the file with the letter 'e' regardless of whether it is 'E' or 'e', we can use `grep -i`.  
  
```
grep -v "e" biomed/1471-2202-4-12.txt
Background
          paradigm [ 15 19 20 21 ] . In both paradigms, auditory`
      
      
        
        condition (F 
          2,34 = 18.1, P < .001), with
          2,50 = 508.6, P < .001), but no
      ...(continued)...
        P - Postnatal Day
        E - Embryonic Day
      
      
        Authors' contributions
```
As we can see from the output, if we wish to see all the lines inside the file without the letter 'e'. we can use `grep -v`. Additionally, any lines that do not match the case, in this case 'E', are still printed.  
  
```
grep -w "e" biomed/1471-2202-4-12.txt
        (e.g.,.Refs. [ 27 28 ] ). Further, reorganization (i.e.,
        (e.g., behavior, brain weight, thalamic morphology [ 14 30
        alterations (e.g., in function) may reflect a developmental
```
As we can see from the output, if we wish to see all the lines that have the words specifically matching 'e' inside the file, we can use `grep -w`. 

