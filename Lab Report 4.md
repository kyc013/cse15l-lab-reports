# Lab Report 4  
*Kyungwoo Choi*  

step 1) Log into ieng6  
![step1](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/8cab29f2-e1bd-4389-aae8-b68d7bb9cb24)  
Keys pressed: `ssh cs15lfa23qz@ieng6.ucsd.edu` <enter>  
I logged into ieng6 using `ssh` and my username.
  
step 2) Clone your fork of the repository from your Github account(using the SSH URL)  
![step2](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/902d43fb-d061-4aa1-b857-aba98bde09e5)  
Keys pressed: `git clone <Ctrl-V> <enter>`  
I copied the fork link using `<Ctrl-C>` and used `<Ctrl-V>` to paste it.  
  
Step 3) Run the tests, demonstrating that they fail  
![step3](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/977299aa-658c-4c0b-8cc8-0e7f12ab65b1)  
Keys pressed: `bash test <enter>`  
I run the test using `bash`.  
  
Step 4) Edit the code file ListExamples.java to fix the failing test  
![step4](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/8d8bbbe9-7273-460e-8cda-030c039a3a93)  
Keys pressed: `vim List <tab> .java <enter> i <backspace> 2 <esc> : w q <enter>`  
I pressed `vim` to edit the file, typed `List` and then `<tab>` which made the terminal finish the name `ListExamples`.  
I then added `.java` and then `<enter>` which allowed me to enter 'ListExamples.java' with vim.  
I pressed `i` which allowed to go into insert mode, <backspace> and `2` which was the necessary edit,  
`<esc>` to escape insert mode, and then `: w q <enter>` to save and exit.  
  
Step 5) Run the tests, demonstrating that they now succeed  
![step5](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/ae86bde6-77c3-41ee-b01e-da34c5b84e3d)  
Keys pressed: `<up> <up> <enter>`  
I pressed <up> twice because `bash test.sh` was 2 up in the search history, so I used the up arrow to access it.  
  
Step 6) Commit and push the resulting change to your Github account  
![step6](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/bd8ac539-a4c7-419b-bbf5-0c96390310f6)  
Keys pressed: `git status <enter> git add List <tab> .java <enter> git status <enter> git commit -m "fixed ListExamples.java" <enter>`  
I typed `git status` to see any modified changes. 
I typed `git add` and then `List <tab>` which made the terminal finish the name `ListExamples`, and then added `.java`.  
This added the modified changes to the staging area.  
I pressed <up> twice because `git status` was 2 up in the search history.  
I then typed `git commit -m` to commit the modified changes, and then the message `"fixed ListExamples.java"` so I would know what the change was.  
