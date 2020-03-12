package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Bidder
{
    double bidPrice,maxBidPrice=0;
    Scanner scanner=new Scanner(System.in);
   // Auctioneer auc=new Auctioneer();
    public void getUpdate(ArrayList<Bidder> biddersList, double currentMaxBid)
    {
        currentMaxBid=sellCurrentMaxPrice(biddersList,currentMaxBid);
        System.out.println("Current max bid = "+currentMaxBid+'\n');

        /*if(bidPrice>maxBidPrice)
            System.out.println("Sold........");*/
    }

    public void giveNewPrice()
    {
        System.out.println("Give a new Price.");
        double price=scanner.nextInt();
        bidPrice=price;
        maxBidPrice=price;
       /* if(bidPrice>auc.currentMaxBid)
            auc.currentMaxBid=bidPrice;*/
    }

    public double sellCurrentMaxPrice(ArrayList<Bidder> biddersList, double currentMaxBid)
    {
        for(Bidder bidder:biddersList){
            if(currentMaxBid<bidder.bidPrice)
                currentMaxBid=bidder.bidPrice;
        }

        return currentMaxBid;
    }
}
