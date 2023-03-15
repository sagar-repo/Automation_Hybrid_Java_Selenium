public class Program1 {

    public static void main(String[] args){
        String s="xyz";
        String temp="";
        int a =10;
        int b=20;
        int c=a+b;
    for(int i=0;i<s.length();i++) // for loop
    {
        temp=s.charAt(i)+temp;
    }
    int i=0; // while loop
    while(i<s.length()) {
        System.out.println(temp =s.charAt(i)+ temp);
        i++;
    }

        StringBuilder sb = new StringBuilder(s); // using java function
        sb.reverse();
        System.out.println(sb);
        System.out.println("Reverse String is : "+temp);
    }
}
