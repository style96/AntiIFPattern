# AntiIFPattern
Anti if pattern with using OOP Polymorphism property. I used java language and interface feature of the language.

## Wrong One - conditional pattern (IF pattern)
```
if(dummyInput.equals("EditorialOffice")) {
    System.out.println(dummyData+ "EditorialOfficeHandler");
} else if (dummyInput.equals("EditorialBoard")) {
    System.out.println(dummyData+ "EditorialBoardHandler");
}
```

## Correct One - Object Oriented way (Polymorphism)
```
IResponseHandler responseHandler = strategyHandlers.get("EditorialOffice");
responseHandler.handleResponse(dummyData);
```
