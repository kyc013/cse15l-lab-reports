# Lab Report 1  
*Kyungwoo Choi*  
PT1

Here is my code for StringServer.java(I also used Server.java that we used in the labs)
...

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
...


![스크린샷(167)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/0ff2d04d-2cde-4a51-abfa-248ee4253436)

    Since I typed 'add-messages', the url.getPath() in the else if was called, and then the if statement.
    The message "Hi" is the arguementWhat are the relevant arguments to those methods, and the values of any relevant fields of the class?
    How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.

![스크린샷(168)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/797931bc-7142-4e67-8e86-dad4fc378d6d)

    Which methods in your code are called?
    What are the relevant arguments to those methods, and the values of any relevant fields of the class?
    How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.

PT2

![스크린샷(169)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/b6f7e2d2-85b1-43dd-8f51-dde35b9f21fe)
![스크린샷(171)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/0d787220-c3a1-40ff-b094-4db6d4f0a25b)
![스크린샷(170)](https://github.com/kyc013/cse15l-lab-reports/assets/147003854/2aebbd67-f19b-460e-a1ae-12cc40e171cc)

PT3
In a couple of sentences, describe something you learned from lab in week 2 or 3 that you didn’t know before.

