
import basic.PropertyUtil;
import lab17andLab18.TrelloBO;
import org.testng.annotations.Test;

public class TAPI {
    TrelloBO trelloBO=new TrelloBO();

    // @Test
    //   public void createBoardTest(){
    //       trelloBO.create();
    //   }



    @Test
    public void createAndDeleteBoardTest(){
        //Step_1
        String boardId=trelloBO.create();
        //Step_2
        String listId=trelloBO.createList(boardId, ((String) new PropertyUtil().getProperty("nameList")));
        //Step_3
        String cardId=trelloBO.createCard(listId, ((String) new PropertyUtil().getProperty("nameCard")));
        //Step_4
        String addDesc=trelloBO.addDesc(cardId, listId, ((String) new PropertyUtil().getProperty("description")));
        //Step_5
        String renameBoard=trelloBO.renameBoard(boardId,((String) new PropertyUtil().getProperty("newNameForBoard")));
        //Step_6
        String inviteToBoard=trelloBO.inviteToBoard(boardId,((String) new PropertyUtil().getProperty("memberEmail")));

    }


}