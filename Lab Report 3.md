# Lab Report 3 
*Kyungwoo Choi*  

**PT1 - Bugs**

    A failure-inducing input for the buggy program, as a JUnit test and any associated code (write it as a code block in Markdown)
    An input that doesn’t induce a failure, as a JUnit test and any associated code (write it as a code block in Markdown)
    The symptom, as the output of running the tests (provide it as a screenshot of running JUnit with at least the two inputs above)
    The bug, as the before-and-after code change required to fix it (as two code blocks in Markdown)
I'll be talking about the bug in the *static int[] reversed* inside ArrayExamples.java
Any test input that isn't an empty array would come out as a failure, as it always prints out an empty array. An empty array would always come out as a test success.
    Briefly describe why the fix addresses the issue.
As we're supposed to return an array that all the elements of the input array in reversed order, we should change the body of the for loop so that the values of the newArray are changed, and that the newArray is returned.

**PT2 - Researching Commands**
I'll be talking about the command `grep`

https://www.geeksforgeeks.org/grep-command-in-unixlinux/

-c : This prints only a count of the lines that match a pattern
-i : Ignores, case for matching
-v : This prints out all the lines that do not matches the pattern
-w : Match whole word

For each of those options, give 2 examples of using it on files and directories from ./technical. Show each example as a `code block` that shows the command and its output, and write a sentence or two about what it’s doing and why it’s useful.
That makes 8 total examples, all focused on a single command. There should be two examples each for four different command-line options.
Along with each option/mode you show, cite your source for how you found out about it as a URL or a description of where you found it.
