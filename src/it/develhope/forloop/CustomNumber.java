package it.develhope.forloop;
import java.util.Random;
public class CustomNumber
{
    int number;
    public CustomNumber() {
        Random random = new Random();
        this.number = random.nextInt(12) + 1;
        System.out.println("random number: " + this.number);
    }
    public void getMultiplicationTable() {
        System.out.println("Multiplication table " + this.number);
        for (int i = 12; i >= 1; i--) {
            System.out.println(this.number+" x "+i+" = "+(this.number * i));
        }
    }
}


