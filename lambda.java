@FunctionalInterface 
interface ex1{  
    public void hii(int a, int b);  
}  
  
public class lambda {  
    public static void main(String[] args) {  
        //int m=10,n=70;
          
        //with lambda  
        ex1 n=(int a, int b)->{  
            System.out.println(a+b);  
        };  
        n.hii(10,70); 
	System.out.println(a+b); 
    }  
} 
