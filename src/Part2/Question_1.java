package Part2;

/**
 *
 * @author abdo
 */
public class Question_1 {
    
    
    public static int count(String str , char c ){
        
       return str.indexOf(c)+1;

    }
    
    public static void main(String[] args) {
        
        
      int c =  Question_1.count("mazen", '0');
        
      
        System.out.println(c);
    }
    
    
}
