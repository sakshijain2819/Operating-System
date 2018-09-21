
package boundarybuffer;

import java.util.Scanner;

public class BoundedBuffer {

    
    public static void main(String[] args) {
        while(true)
        {
            int ch = 0;
            System.out.println("1.producer"+"\n");
            System.out.println("2.consumer"+"\n");
            System.out.println("3.exit"+"\n");
            Scanner s=new Scanner(System.in);
            ch=s.nextInt();
            switch(ch){
                
                case 1: if(S==1 && E!=0)
                            producer();
                        else
                            System.out.println("producer is full ");
                        break;
                    
                case 2: if(S==1 && F!=0)
                            consumer();
                        else
                            System.out.println("consumer is empty");
                            break;
                
                case 3: System.exit(0);
                        break;
            }
            
        }
    }
    static int S=1;
    static int E=10;
    static int F=0;
    static int i=0;
    
     static int wait(int S)
    {
        return --S;
    }
     
    static int signal(int S)
    {
        return ++S;
    }
    
    static void producer()
    {
        S=wait(S);
        E=wait(E);
        F=signal(F);
         i++;
        System.out.println("producer is producing ");
        S=signal(S);
    }
    
    static void consumer()
    {
        S=wait(S);
        E=signal(E);
        F=wait(F);
       i-- ;
        System.out.println("consumer is consuming");
        S=signal(S);
    }
}