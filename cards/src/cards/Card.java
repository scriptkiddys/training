package cards;

public class Card {
	private String cardNumber = "first";
	private String cardRank = "two";
	private String cardSuit = "Spades";
	
	public String getNumber() {
		return cardNumber;
	}
	public String getRank() {
		return cardRank;
	}
	public String getSuit() {
		return cardSuit;
	}
	
	public void setNumber(String newNumber) {
		cardNumber = newNumber;
	}
	public void setRank(String newRank) {
		cardRank = newRank;
	}
	public void setSuit(String newSuit) {
		cardSuit = newSuit;
	}
	public void printCard() {
		System.out.println(
				"The " + getNumber() +
				" card is a " + getRank() + 
				" of " + getSuit() + "."
		);
		
	}
}
