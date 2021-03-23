package customer.module1;

public class MyPrinter {
    
    private String message;

    public MyPrinter(String msg){
        this.message = msg;
    }

    public void printMessage(){
        System.out.println("the message is: " + this.message);
    }
}
