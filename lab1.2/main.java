
public class main {
    
     public static void main(String[] args) {
         Stock[] rectArr = new Stock[3];
         rectArr[0] = new Stock("ПАО Сбербанк", "SBER", 281.50,282.87);
         rectArr[1] = new Stock("ПАО аэрофлот", "AEROFLOT", 1002.12,1030);
         rectArr[2] = new Stock("T", "T-bank", 2000,2100);
         for(int i = 0; i < rectArr.length; i++ ) {
            System.out.println(rectArr[i]);
        }
     
    }
}
