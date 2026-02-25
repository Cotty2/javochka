


public class javaAplication {


    public static void main(String[] args) {
        System.out.println("hello");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3,4);
        System.out.println(r1);
        System.out.println(r2);

        Rectangle[] rectArr = new Rectangle[10];
        rectArr[0] = new Rectangle(1,3);
        rectArr[2] = new Rectangle(1,3);
        rectArr[3] = new Rectangle(1,3);
        rectArr[4] = new Rectangle(1,3);
        rectArr[5] = new Rectangle(1,3);
        rectArr[6] = new Rectangle(3,8);
        rectArr[7] = new Rectangle(2,1);
        rectArr[8] = new Rectangle(1,4);
        rectArr[9] = new Rectangle(1,7);
        rectArr[1] = new Rectangle(1,7);
        for(int i = 0; i < rectArr.length; i++ ) {
            System.out.println(rectArr[i]);
        }

    }
}