# Lab Report 2 
*Kyungwoo Choi*  

**PT1**

Here is my StringServer.java(I also used Server.java that we used during the labs)


    import java.io.IOException;
    import java.net.URI;
    
    class Handler implements URLHandler {
    
    private StringBuilder String = new StringBuilder();
    private int num = 0;
    
        public String handleRequest(URI url) {
    
    
            if (url.getPath().equals("/")) {
                return String.toString();
            } else if (url.getPath().equals("/add-message")) {
    
                    String[] parameters = url.getQuery().split("=");
                        if (parameters.length == 2 && parameters[0].equals("s")){
                            String message = parameters[1];
                            num++;
    
                        String.append(num).append(". ").append(message).append("\n");
                        return String.toString();
                        }
            }     
            
            return "Invalid request";
        }
    }
    
    
    class StringServer {
        public static void main(String[] args) throws IOException {
            if(args.length == 0){
                System.out.println("Missing port number! Try any number between 1024 to 49151");
                return;
            }
    
            int port = Integer.parseInt(args[0]);
    
            Server.start(port, new Handler());
        }
    }



*Case 1: After /add-message?s=Hi*
![스크린샷(167)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/0ff2d04d-2cde-4a51-abfa-248ee4253436)
1. The method handleRequest(URI url) is called.
2. The relevant argument to this method is the URI object "url" which represents the incoming request URL, and the relevant fields of the class "Handler" are:
   - StringBuilder object "String" representing the running string
   - int variable "num" representing the next number in order      
The value of "String" is initially an empty string, and the value of "num" is initially 0. The value of "url" represents the URL '/add-message?s=Hi'.  
3. After typing in "Hi", the value of "num" changes from 0 to 1, while the value of "String" changes from an empty string to "1. Hi\n".


*Case 2: After /add-message?s=Welcome*
![스크린샷(168)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/797931bc-7142-4e67-8e86-dad4fc378d6d)
1. The method handleRequest(URI url) is called again.
2. The relevant argument to this method is again the URI object "url", and the relevant fields of the class "Handler" are again:
   - StringBuilder object "String"
   - int variable "num"  
However, the value of "String" is now "1. Hi\n", and the value of "num" is 1. The value of "url" now represents the URL '/add-message?s=Welcome'.  
3. After typing in "Welcome", the value of "num" changes from 1 to 2., while the value of "String" changes from "1. Hi\n" to "1. Hi\n2. Welcome\n".

**PT2**

![스크린샷(173)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/248720c7-8684-45e3-86e0-d315c4eaa16c)
![스크린샷(174)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/6c88eaaf-f4ac-42d8-906e-b13cc0b05f03)
![스크린샷(170)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/2aebbd67-f19b-460e-a1ae-12cc40e171cc)

**PT3**

I can't say for the rest of the students taking this class, but I didn't know how to do any of these things before. Learning commands such as pwd, cat, cd, ls, curl etc was fun, as was accessing remote servers from a local computer. One thing I didn't initially recognize its importance was the working directory. As I participated in the labs, however, I found myself making mistakes because I was in the wrong directory without realizing it. For instance, I'd try to compile my java file inside the folder while still being in the home directory. A basic concept, but I'm sure it'll still be crucial for whatever stage I'm in.
