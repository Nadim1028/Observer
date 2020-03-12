package sample;

public class TestClass
{
    public static void main(String[] args)
    {
        Auctioneer auctioneer= new Auctioneer();

        Bidder bidder1=new Bidder();
        auctioneer.addBidder(bidder1);

        Bidder bidder2=new Bidder();
        auctioneer.addBidder(bidder2);

        Bidder bidder3=new Bidder();
        auctioneer.addBidder(bidder3);

        Bidder bidder4=new Bidder();
        auctioneer.addBidder(bidder4);

        bidder1.giveNewPrice();
        bidder2.giveNewPrice();
        auctioneer.displayNewBidderPrice();

        bidder3.giveNewPrice();
        bidder4.giveNewPrice();
        auctioneer.displayNewBidderPrice();
    }
}
