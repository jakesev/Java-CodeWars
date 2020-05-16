public enum Suit {
    HEARTS("Hearts"), 
    SPADES("Spades"), 
    DIAMONDS("Diamonds"), 
    CLUBS("Clubs");

    private final String suitText;

    //Constructor
    private void suit(String suitText){
        this.suitText=suitText;
    }

    public String printSuit(){
        return suitText;
    }

}