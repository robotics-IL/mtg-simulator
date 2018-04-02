import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class AllCards {



    private int placeNewCard = 0;
    private static int blightedGeorge = 0;
    public int getPlaceNewCard(){
        return placeNewCard;
    }
    public static int getBlightedGeroge(){
        return blightedGeorge;
    }
    public void setPlaceNewCard(){
        placeNewCard = placeNewCard++;
    }

    public int cheese;

//    public static void newCard(String newName1, String newColor1, String newType1,int newHealth1,int newAttack1, 
//     int newManaCostBlue1, int newManaCostRed1, int newManaCostGreen1, int newManaCostBlack1,
//     int newManaCostWhite1, int newManaCostColorless1, int newManaCostAnyColor1){
    
//         allCards[placeNewCard].setName(newName1);
//         // allCards[getPlaceNewCard()].color = newColor1;
//         // allCards[getPlaceNewCard()].type = newType1;
//         // allCards[getPlaceNewCard()].Card.name = newHealth1;
//         // allCards[getPlaceNewCard()].Card.name = newAttack1;
//         // allCards[getPlaceNewCard()].Card.name = newManaCostBlue1;
//         // allCards[getPlaceNewCard()].Card.name = newManaCostRed1;
//         // allCards[getPlaceNewCard()].Card.name = newManaCostGreen1;
//         // allCards[getPlaceNewCard()].Card.name = newManaCostBlack1;
//         // allCards[getPlaceNewCard()].Card.name = newManaCostWhite1;
//         // allCards[getPlaceNewCard()].Card.name = newManaCostColorless1;
//         // allCards[getPlaceNewCard()].Card.name = newManaCostAnyColor1;
//         setPlacenewCard(); 
   
//     } 

    public static void main(String[] args){


        Card[] allCards = new Card[2];

        //for (int i=0; i<allCards.length; i++) {
        //allCards[i] = new Card("pie", "cheese", "Eat", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        //}
        //allCards[0].setName("settingName");
        allCards[0] = new Card("Blighted George", "colorless", "land", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        allCards[1] = new Card("cheese", "cheese", "Eat", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        allCards[getBlightedGeroge()].setSommoingSickness(true);
        System.out.println(allCards[0].getSommoingSickness());
    
        //newCard("Zaxby's", "cheese", "Eat", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        System.out.println(allCards[1].getSommoingSickness());

    }

}