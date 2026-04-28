package HomeWork3.ChainOfResponsibility;

public class AuthHandler extends Handler{

    public void handle(String request){
        if(request.contains("auth")){
            System.out.println("Аутентификация выполнена");
        } else if(next != null){
            next.handle(request);
        }
    }
}
