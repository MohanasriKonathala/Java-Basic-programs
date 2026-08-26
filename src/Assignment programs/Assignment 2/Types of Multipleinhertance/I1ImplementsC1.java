class C1{
    void show(){
        System.out.println("C1 method");
    }
}
// ERROR: An interface cannot implement a class
interface I1 implements C1{
    void show1();
}
