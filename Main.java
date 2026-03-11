public class Main {
    public static void main(String[] args) {
        Box box = new Box(1000);
        
        Cylinder cylinder = new Cylinder(5, 10);
        Ball ball = new Ball(4);
        Pyramid pyramid = new Pyramid(25, 12);
        
        System.out.println("Добавлен цилиндр: " + box.add(cylinder));
        System.out.println("Добавлен шар: " + box.add(ball));
        System.out.println("Добавлена пирамида: " + box.add(pyramid));

        System.out.println("Объём в коробке: " + box.getVolume());

        System.out.println(cylinder);
        System.out.println(ball);
        System.out.println(pyramid);
    }
}