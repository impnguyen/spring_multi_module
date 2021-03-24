package customer.module1;

//does not work
// import customer.module2.MyPrinter2;
import customer.module2.API;

public class MyPrinter {
    
    private String message;
    private API externalPrinter;

    public MyPrinter(String msg){
        this.message = msg;
        this.externalPrinter = new API();
    }

    public void printMessage(){
        System.out.println("the message is: " + this.message);
        this.externalPrinter.setMessage(this.message);
        this.externalPrinter.getPrintMessage();
    }
}
