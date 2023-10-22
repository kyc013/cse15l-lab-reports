This is the 2nd lab reoprt.
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

