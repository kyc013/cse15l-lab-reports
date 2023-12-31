# Lab Report 1  
*Kyungwoo Choi*  

Some of the basic filesystem commands we learned today was **cd**, **ls**, and **cat**.
* **cd** is used for changing directory
* **ls** is used for listing all the files in the directory
* **cat** prints the cnontents of whichever file the user selects

## cd

![스크린샷(124)-1](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/c5856114-f8a5-4471-bf0e-09879ad91ec5)  
`The current working directory is /home. When commanded without any arugements, the working directory would take you back to the home directory. For instance, if the working directory was /home/folder1, then it would change to /home.`

![스크린샷(124)-2](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/2bf29182-857d-4f37-9ab2-8606a0f9715d)  
`The current working directory is /home. When commanded with a path to a directory, the working directory is changed to the sepcified directory, which in this case is /home/lecture1.`

![스크린샷(124)-3](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/4d8f0106-ff1b-4579-b26e-2b46ac9eb992)  
`The current working directory is now /home/lecture1. When commanded with a path to a file, an error messgae is printed saying that it is not a directory. As we can see, this command can only be used for directories.`
***
## ls

![스크린샷(125)-1](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/03b2841b-7c6d-43e9-ad93-0609728ce575)  
`The current working directory is /home. When commanded without any arugements, the files and folder of the working directory(which is 'home' in this case) is listed.`

![스크린샷(125)-2](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/55ac5b7c-5c13-45e9-8b03-6fa88a760c1f)  
`The current working directory is /home. When commanded with a path to a directory, the files and folders within the written direcotry is listed.`

![스크린샷(125)-3](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/55e9ea02-825a-41d6-9d76-4b350db63299)  
`The current working directory is /home. When commanded with a path to a file, the path of the file is printed.`
***
## cat

![스크린샷(127)-1](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/23b188b0-6381-4dc9-89d5-994d56131e1b)  
`The current working directory is /home. When commanded without any arugements, then it waits for the user to type a printable message until manually stopped.`

![스크린샷(127)-2](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/546278eb-978b-4f5e-89ca-dc9ebe534a3b)  
`The current working directory is /home. When commanded with a path to a directory, there is an error since this command is used to print a content of a file.`

![스크린샷(127)-3](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/b122f650-01a9-4754-8f35-7cff23788c78)  
`The current working directory is /home. When commanded with a path to a file, the contents of the specified file is printed.`  
  
*This was a blog post on* **cd**, **ls**, **cat**. *Hope you found it useful.*
