package sample;

import java.util.ArrayList;

public class Auctioneer implements IObserver
{
    ArrayList<Bidder> biddersList=new ArrayList<>(100);
    double currentMaxBid=0;

    public void addBidder(Bidder bidder){
        biddersList.add(bidder);
    }

    public void displayNewBidderPrice(){
        notifyObservers();
    }

    public void notifyObservers(){
        /*for(int i=0;i<biddersList.size();i++){
            biddersList.get(i).getUpdate();
        }*/

        for(Bidder b:biddersList){
            b.getUpdate(biddersList,currentMaxBid);
        }
    }


}
