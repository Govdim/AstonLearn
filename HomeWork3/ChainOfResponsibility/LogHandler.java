package HomeWork3.ChainOfResponsibility;

public class LogHandler extends Handler{

    public void handle(String request){
        System.out.println("Логирование запроса: " + request);
        if(next != null){
            next.handle(request);
        }
    }
}
