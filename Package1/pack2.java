package Package1;
class pack1{
    public void display(){
        System.out.println("Hello world");
    }
}
class pack2 extends pack1{
    public static void main(String[] args) {
        pack2 i1=new pack2();
        i1.display();
    }
}