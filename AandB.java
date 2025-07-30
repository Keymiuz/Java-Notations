class A extends Object {
    public A(){
        super();
        System.out.println("A");

    }
    public A(int x){
        super();
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("B");
    }

    public B(int x){
        this();
        System.out.println("In B int");
    }
}
public class AandB{
    public static void main(String[] args){
        B obj = new B(5);
    }   
}
