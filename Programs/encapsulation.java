package Programs;

public class encapsulation {
        private int value; // data hiding

        public void setValue(int x) // data abstraction
        {
            value = x;
        }
        public int getValue() {
            return value;
        }
       class B{
            public static void main(String[] args){
                encapsulation r= new encapsulation();
                r.setValue(100);
                System.out.println(r.getValue());
            }
        }

    }



