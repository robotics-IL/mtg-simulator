public class Card {

    private int deckPlacement = 2000;
    private String name;
    private String color;
    private String where = "deck";
    private boolean tapped = false;
    private boolean sommoningSickness = false;
    private boolean attackStatus = false;
    private String type;
    private int health;
    private int attack;
    private int manaCostBlue;
    private int manaCostRed;
    private int manaCostGreen;
    private int manaCostBlack;
    private int manaCostWhite;
    private int manaCostColorless;
    private int manaCostAnyColor;
    private int healthCounters;
    private int attackCounters;

public int getDeckPlacement(){
    return deckPlacement;
}
public String getName(){
    return name;
}
public String getColor(){
    return color;
}
public String getWhere(){
    return where;
}
public boolean getTapped(){
    return tapped;
}
public boolean getSommoingSickness(){
    return sommoningSickness;
}
public boolean getAttackStatus(){
    return attackStatus;
}
public String getType(){
    return type;
}
public int getHealth(){
    return health;
}
public int getAttack(){
    return attack;
}
public int getManaCostBlue(){
    return manaCostBlue;
}
public int getManaCostRed(){
    return manaCostRed;
}
public int getManaCostGreen(){
    return manaCostGreen;
}
public int getManaCostBlack(){
    return manaCostBlack;
}
public int getManaCostWhite(){
    return manaCostWhite;
}
public int getManaCostAnyColor(){
    return manaCostAnyColor;
}
public int getManaCostColorless(){
    return manaCostColorless;
}
public int getHealthCounters(){
    return healthCounters;
}
public int getAttackCounters(){
    return attackCounters;
}



public void setDeckPlacement(int settingDeckPlacement){
    deckPlacement = settingDeckPlacement;
}
public void setName(String settingName){
    name = settingName;
}
public void setColor(String settingColor){
    color = settingColor;
}
public void setWhere(String SettingWhere){
    where = SettingWhere;
}
public void setTapped(boolean settingTapped){
    tapped = settingTapped;
}
public void setSommoingSickness(boolean settingSommoningSickness){
    sommoningSickness = settingSommoningSickness;
}
public void setAttackStatus(boolean settingSttackStatus){
    attackStatus = settingSttackStatus;
}
public void setType(String settingType){
    type = settingType;
}
public void setHealth(int changeInHealth){
    health = health + changeInHealth;
}
public void setAttack(int changeInAttack){
    attack = attack + changeInAttack;
}
public void setManaCostBlue(int settingManaCostBlue){
    manaCostBlue = settingManaCostBlue;
}
public void setManaCostRed(int settingManaCostRed){
    manaCostRed = settingManaCostRed;
}
public void setManaCostGreen(int settingManaCostGreen){
    manaCostGreen = settingManaCostGreen;
}
public void setManaCostBlack(int settingManaCostBlack){
    manaCostBlack = settingManaCostBlack;
}
public void setManaCostWhite(int settingManaCostWhite){
    manaCostWhite = settingManaCostWhite;
}
public void setManaCostAnyColor(int settingManaCostAnyColor){
    manaCostAnyColor = settingManaCostAnyColor;
}
public void setManaCostColorless(int settingManaCostColorless){
    manaCostColorless = settingManaCostColorless;
}
public void setHealthCounters(int changeInHealthCounters){
    healthCounters = attackCounters + changeInHealthCounters;
    health = health + healthCounters;
}
public void setAttackCounters(int changeInAttackCounters){
    attackCounters = attackCounters + changeInAttackCounters;
    health = health + attackCounters;
}



public Card(String newName, String newColor, String newType,int newHealth,int newAttack, 
    int newManaCostBlue, int newManaCostRed, int newManaCostGreen, int newManaCostBlack,
    int newManaCostWhite, int newManaCostColorless, int newManaCostAnyColor)
     {
         name = newName;
         color = newColor;
         type = newType;
         health = newHealth;
         attack = newAttack;
         manaCostBlue = newManaCostBlue;
         manaCostRed = newManaCostRed;
         manaCostBlack = newManaCostBlack;
         manaCostWhite = newManaCostWhite;
         manaCostGreen = newManaCostGreen;
         manaCostAnyColor = newManaCostAnyColor;
         manaCostColorless = newManaCostColorless;

}

}

/*
    
    {	name = blightedGeorge
	color = colorless
	status1Where = MainDeck
        status2Tapped = untappedCard
        status3Attack = noAttack
        status4Possibility = for{ability2Cost}, possibleAttack
	enterBattlefield {status2Tapped = untappedCard}
        type = land
        health = N/A
        attack = N/A
	possibleAttack = 2
        ability1Cost = noManna
        ability1 {	colorlessMana = +1, 
			status2Tapped = tappedCard
		}
        ability2 {	Cost = { 4 anyManna, 1 mountainManna }
			attack = 2, 
			status2Tapped = tappedCard, 
			status3Attack = attacking, 
			attackTargetCreatureOrPlayer, 
			attack = N/A, 
			status3Attacking = noAttack, 
			status1Where = graveyard
		}

}
*/