package Arrays_Strings.isUnique;

public class isUnique{
    public static void main(String []args){
       System.out.println(unique("Somethings"));
    }
    
    public static Boolean unique(String m){
       m = m.toLowerCase();
       for (int i = 0; i < m.length(); i++){
           for (int j = i + 1; j < m.length(); j++){
               if (m.charAt(i) == m.charAt(j))
                   return false;
           }
       }
       return true;
   }
}