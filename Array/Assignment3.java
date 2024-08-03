public class Assignment3 {
    public static int buyAndSellStock(int prices[]){
        int buy = prices[0];
        int Profit = 0;

        for(int i =0;i<prices.length;i++){
            if(buy<prices[i]){ //profit
                 
                Profit = Math.max(prices[i] - buy, Profit);

            }else{
                buy = prices[i];
            }
            
        }
        return Profit;
    }
    public static void main(String[] args) {
        int prices[] ={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));
    }
}
