import java.util.*;  

public class IFPattern{
     public static void main(String []args){
        String dummyInput = "EditorialOffice";
        String dummyData = "kinguse";
        
        if(dummyInput.equals("EditorialOffice")) {
            System.out.println(dummyData+ "EditorialOfficeHandler");
        } else if (dummyInput.equals("EditorialBoard")) {
            System.out.println(dummyData+ "EditorialBoardHandler");
        }
     }
}
