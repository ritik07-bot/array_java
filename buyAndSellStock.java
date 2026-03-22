public class buyAndSellStock {
   public static void maxProfit(int price[]){
      int buyprice=Integer.MAX_VALUE;
      int maxprofit=0;

      for(int i=0;i<price.length;i++){
        if(buyprice < price[i]){//Profit
         int profit=price[i] - buyprice;//today profit
         maxprofit=Math.max(maxprofit,profit);
        }else{
         buyprice=price[i];
        }
      }
      System.out.println("MAximum profit is: "+maxprofit);
   }
   public static void main(String args[]){
     int price[]={7,1,5,3,6,4};
     maxProfit(price); 
      }
}
