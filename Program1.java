public class Program1 {

    public static void main(String[] args){
        String s="xyz";
        String temp="";
        int a =10;
        int b=20;
        int c=a+b;
    for(int i=0;i<s.length();i++){
        temp=s.charAt(i)+temp;
    }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        System.out.println("Reverse String is : "+temp);
    }
}
