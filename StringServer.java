mport java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    string string;

    public String handleRequest(URI url) {

            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("-message?s=");
                    num++;
                    return String.format(num, parameters[1]/n);
            }

    
}

class NumberServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
