package Programs;

public class overloading {
    int add() {
        int a = 10, b = 20, c;
        c = a + b;
        return c;
    }
      int add(int a, int b){
          int c=a+b;
          return c;
    }
    double add(int a, double b){
        double c;
        c=a+b;
       return c;
    }
      public static void main(String[] args)
    {
        overloading ov=new overloading();
        int add=ov.add();
        System.out.println(add);
        int add1=ov.add(50,50);
        System.out.println(add1);
        double add2=ov.add(10, 85.36);
        System.out.println(add2);
    }
}
