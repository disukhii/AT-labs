package lab17andLab18;

public class RequestRepo {

    public static Request getPostman() {
        Request request=new Request();
        request.setProtocol("https");
        request.setHost("postman-echo.com");
        request.setPath("get");
        request.setMethod("GET");
        return request;
    }

    private final static String KEY="b7e98ef7fb7f7cff6bfaea7d8bb17726";
    private final static String TOKEN="1b3f72b6db9f27616c059562f4da71891dca78e895ab743d037008e5e4deff4b";



    public static Request createTrelloBoard(String boardName) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/?name="+boardName+"&key="+KEY +
                "&token="+TOKEN);
        request.setMethod("POST");
        request.setBody("{\"defaultLists\":false,\"name\":\"test_board1\",\"prefs_permissionLevel\"" +
                ":\"org\",\"prefs_selfJoin\":true,\"idOrganization\":\"60fefe65beb  2b76caa04761c\"}");
        return request;
    }

        public static Request AddDescriptionToCard(String cardId, String idList, String text) {
        Request request=baseTrelloRequest();
        request.setPath("1/cards/"+ cardId +"?&key="+KEY + "&token="+TOKEN + "&idList="+idList +"&desc="+text);
        request.setMethod("PUT");
        return request;
    }



    public static Request createCard(String idList, String nameCard) {
        Request request=baseTrelloRequest();
        request.setPath("1/cards?&key="+KEY + "&token="+TOKEN + "&idList="+idList +"&name="+nameCard);
        request.setMethod("POST");
        return request;
    }


    public static Request inviteToBoard(String boardID, String memberEmail) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/"+boardID +"/members?&key="+KEY + "&token="+TOKEN +"&email=" +memberEmail);
        request.setMethod("PUT");
        return request;
    }



    public static Request renameBoard(String boardID, String newNameForBoard) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/"+boardID +"?&key="+KEY + "&token="+TOKEN +"&name=" + newNameForBoard);
        request.setMethod("PUT");
        return request;
    }


    private static Request baseTrelloRequest() {
        Request request=new Request();
        request.setProtocol("https");
        request.setHost("api.trello.com");
        return request;
    }
    public static Request createList(String boardID, String nameList) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/"+boardID +"/lists?name="+nameList+"&key="+KEY + "&token="+TOKEN);
        request.setMethod("POST");
        return request;
    }

    public static Request deleteTrelloBoard(String boardId) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/"+boardId+"?key="+KEY +
                "&token="+TOKEN);
        request.setMethod("DELETE");
        return request;
    }
}
