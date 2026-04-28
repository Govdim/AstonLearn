package HomeWork3.ChainOfResponsibility;

public class ChainDemo{

    public static void main(String[] args){
        Handler auth = new AuthHandler();
        Handler log = new LogHandler();

        auth.setNext(log);

        auth.handle("auth request");
        auth.handle("other request");
    }
}
