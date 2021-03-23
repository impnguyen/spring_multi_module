package customer.module1;

import customer.module2.MyPrinter2;

public class MyPrinter {
    
    private String message;
    private MyPrinter2 externalPrinter;

    public MyPrinter(String msg){
        this.message = msg;
        this.externalPrinter = new MyPrinter2("text from external printer class (module2)");
    }

    public void printMessage(){
        System.out.println("the message is: " + this.message);
        this.externalPrinter.printMessage();
    }
}
