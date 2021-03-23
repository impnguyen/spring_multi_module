package customer.module2;

public class MyPrinter2 {
    
    private String message;

    public MyPrinter2(String msg){
        this.message = msg;
    }

    public void printMessage(){
        System.out.println("the message is: " + this.message + " by module2");
    }
}
