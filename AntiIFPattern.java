import java.util.*;  

    // Interface
interface IResponseHandler {
   public void handleResponse(String data);
}

// Concrete class for EditorialOffice response
class EditorialOfficeHandler implements IResponseHandler {
   public void handleResponse(String data) {
       // Do something to handle Editorial Office response
        System.out.println(data+ "EditorialOfficeHandler");
   }
}

// Concrete class for EditorialBoard response
class EditorialBoardHandler implements IResponseHandler {
   public void handleResponse(String data) {
       // Do something to handle Editorial Board response
        System.out.println(data + "EditorialBoardHandler");
   }
}

public class AntiIFPattern{
     public static void main(String []args){
        Map<String, IResponseHandler> strategyHandlers = new HashMap<String,IResponseHandler>();
        strategyHandlers.put("EditorialOffice", new EditorialOfficeHandler());
        strategyHandlers.put("EditorialBoard", new EditorialBoardHandler());
        
        IResponseHandler responseHandler = strategyHandlers.get("EditorialOffice");
        responseHandler.handleResponse("kinguse");
        
        responseHandler = strategyHandlers.get("EditorialBoard");
        responseHandler.handleResponse("kinguse");
     }
}
