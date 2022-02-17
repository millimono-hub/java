import java.util.*;
public class Incapsulation{
    private int a =12;
    public static void main(String[] args) {
        System.out.println(a);
        Scanner input=new Scanner(System.in);
     
    }
    public int getSom(){
        return a;
    }
    public void setSom(int b){
        this.a=b;
    }
}