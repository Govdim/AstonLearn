package HomeWork3.ChainOfResponsibility;

abstract class Handler{

    protected Handler next;

    public void setNext(Handler next){
        this.next = next;
    }

    public abstract void handle(String request);
}
