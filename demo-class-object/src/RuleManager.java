public class RuleManager {

  // Input > Output
  public static boolean isPair(Card c1, Card c2) {
    return c1.getRank() == c2.getRank();
  }

  public static boolean isPair(Card c1, Card c2, Card c3) {
    return c1.getRank() == c2.getRank() && c2.getRank() == c3.getRank();
  }

  // given 5 cards
  // 8 7 8 8 7 (3,2,0,0,0,...)

  public static boolean isFullHouse(Card[] cards) {
    if (cards == null || cards.length != 5)
      return false;
    char[] chs = new char[13];
    for (int i = 0; i < cards.length; i++) {
      if (cards[i] == null)
        return false;
      chs[cards[i].getRank() - 'A']++;
    }
    // 5
    // 1 1 1 1 1
    // 3 2 0 0 0 0 0 0 0
    boolean withThreeKind = false;
    boolean withPair = false;
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] == 2) {
        withPair = true;
      }
      if (chs[i] == 3) {
        withThreeKind = true;
      }
    }
    return withPair && withThreeKind;
  }

  // 6,7,8,9,10
  // A,K,Q,J,10
  // ! A,2,3,4,5 > special handle
  public static boolean isStraight(Card[] cards) {
    if (cards == null || cards.length != 5)
      return false;
    char[] chs = new char[13];
    for (int i = 0; i < cards.length; i++) {
      if (cards[i] == null)
        return false;
      chs[cards[i].getRank() - 'A']++;
    }
    // ! A,2,3,4,5 > special handle
    boolean checkup = false;
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] > 1)
        return false;
      if (checkup == true && chs[i] == 0)
        return false;
      if (chs[i] == 1)
        checkup = true;
    }
    return true;
  }

  //
  public static boolean isFlush(Card[] cards) {
    if (cards.length != 5)
      return false;
      return cards[0].getSuit() == cards[1].getSuit()
        && cards[0].getSuit() == cards[2].getSuit()
        && cards[0].getSuit() == cards[3].getSuit()
        && cards[0].getSuit() == cards[4].getSuit();
  }

  public static void main(String[] agrs) {
    Card c1 = new Card(Card.TWO, Card.DIAMOND);
    Card c2 = new Card(Card.THREE, Card.DIAMOND);
    Card c3 = new Card(Card.FOUR, Card.DIAMOND);
    Card c4 = new Card(Card.JACK, Card.DIAMOND);
    Card c5 = new Card(Card.KING, Card.DIAMOND);
    System.out.println(RuleManager.isFlush(new Card[] {c1, c2, c3, c4, c5})); // true
    Card c6 = new Card(Card.KING, Card.DIAMOND);
    System.out
        .println(RuleManager.isFlush(new Card[] {c1, c2, c3, c4, c5, c6})); // true


    Card card1 = new Card(Card.ACE, Card.SPADE);
    Card card2 = new Card(Card.ACE, Card.DIAMOND);
    Card card3 = new Card(Card.ACE, Card.CLUB);
    Card card4 = new Card(Card.TWO, Card.CLUB);
    Card card5 = new Card(Card.TWO, Card.SPADE);
    Card[] cards = new Card[] {card1, card2, card3, card4, card5};
    int[] sums = new int[] {2, 3, 4, 5};
    System.out.println(RuleManager.isFullHouse(cards)); // true

    Card card6 = new Card(Card.THREE, Card.SPADE);
    cards = new Card[]  {card1, card2, card3, card4, card6} ;
    

  }

}
