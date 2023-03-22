package Programs;

class overriding {
    void add(){
       int a = 10;
       int b = 20;
        int c;
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        overriding ov= new child();
                ov.add();
    }
}

class child extends overriding{
    void add(){
        super.add();
        int a= 20;
        int b = 30;
       int c=a-b;
        System.out.println(c);
    }
}
