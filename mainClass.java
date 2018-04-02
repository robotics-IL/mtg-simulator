
public class mainClass {

    public static int test3 = 1;

    public static void main(String[] args){

        Card cheese = new Card("cheese", "Blue", "monster", 10, 20, 1, 0, 0, 0, 0, 0, 0);
        System.out.println(cheese.getName());
        new AllCards(); 
        Card pie = new Card("pie", "Blue", "monster", 10, 20, 1, 0, 0, 0, 0, 0, 0);
        new AllCards.newCard("pie", "Blue", "monster", 10, 20, 1, 0, 0, 0, 0, 0, 0);
        System.out.println(AllCards.allCards.cheese.name);
        

    }
    
    public static void initalization(){

    }

    public static void furstTurn(){

    }
}