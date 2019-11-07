package ru.dilmar.test;

public class Test {
    public static void main(String[] args) {
       A a=new A();
        System.out.println("A a=new A();");
        a.method();
        a.methodS();
       B b=new B();
        System.out.println("B b=new B();");
        b.method();
        b.methodS();
       A ab=new B();
        System.out.println("A a=new B();");
        ab.method();
        ab.methodS();

    }
}


class A{
    int i=1;
    String s="A";

    static int is=1;
    static String ss="A";

    public void method(){
        System.out.println("Class A method non static i=1= "+i+"s=A="+s);
        System.out.println("Static var is=1="+is+"ss=A="+ss);
    }

    public static void methodS(){
        System.out.println("Class A method static var is=1="+is+"ss=A="+ss);
    }
}
class B extends A{
    int i=2;
    String s="B";

    static int is=2;
    static String ss="B";

    public void method(){
        System.out.println("Class B method non static i=2= "+i+"s=B="+s);
        System.out.println("Static var is=2="+is+"ss=B="+ss);
    }

    public static void methodS(){
        System.out.println("Class B method static var is=2="+is+"ss=B="+ss);
    }

}