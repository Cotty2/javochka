public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        
        System.out.println("размер масива 5");
        System.out.println();
        
        System.out.println("добавили 3 числа");
        stack.push(10);
        System.out.println("Добавили 10: " + stack);
        stack.push(20);
        System.out.println("Добавили 20: " + stack);
        stack.push(30);
        System.out.println("Добавили 30: " + stack);
        System.out.println();
        
        System.out.println("добавили еще 2 числа");
        stack.push(40);
        System.out.println("Добавили 40: " + stack);
        stack.push(50);
        System.out.println("Добавили 50: " + stack);
        System.out.println();
        
        System.out.println("добавили еще 1 элемент");
        stack.push(60);
        System.out.println("Добавили 60: " + stack);
        System.out.println();
        
        System.out.println("убираем элементы");
        while (!stack.isEmpty()) {
            System.out.println("убрали " + stack.pop() + ": " + stack);
        }
    }
}