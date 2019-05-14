package main;

public class MathException extends RuntimeException{
    public MathException(){
        super("Es ist ein mathematischer Fehler aufgetreten!");
    }

    public MathException(String msg){
        super(msg);
    }
}
