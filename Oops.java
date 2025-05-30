class Shape{
    public Shape(){
        System.out.println("Shape");
    }
    void Add(){
        System.out.println("Add");
    }
    void sub(){
        System.out.println("Hello");
    }
        // static {System.out.println("Parent");}



}

class Circle extends Shape{

public Circle(){
    System.out.println("Circle");
}
void sub(){
        System.out.println("sub");
    }
    static {System.out.println("Static");}


}
class Rect extends Circle{
    public Rect(){
        System.out.println("Rect");
    }
}



class Je{
    public static void main(String [] args){
        Shape s=new Rect();
        s.sub();
        s.Add();
    }
}