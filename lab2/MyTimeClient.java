public class MyTimeClient {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(555550000L);
        MyTime time3 = new MyTime(5, 23, 55);
        
        System.out.println("Объект 1 (текущее время): " + time1);
        System.out.println("Объект 2 (555550000 мс): " + time2);
        System.out.println("Объект 3 (5:23:55): " + time3);
    }
}