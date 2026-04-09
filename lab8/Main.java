
public class Main {
    public static void main(String[] args) {
        IntContainer container = new IntContainer();
        
        try {
            container.push(5);
            container.push(3);
            container.push(8);
            System.out.println("Контейнер: " + container);
            
            container.push(1);
        } catch (ContainerFullException e) {
            System.out.println("Ошибка добавления: " + e.getMessage());
        }
        
        try {
            container.sort();
            System.out.println("Отсортирован: " + container);
        } catch (ContainerEmptyException | SortException e) {
            System.out.println("Ошибка сортировки: " + e.getMessage());
        }
        
        try {
            System.out.println("Удален: " + container.pop() + "  " + container);
            System.out.println("Удален: " + container.pop() + "  " + container);
            System.out.println("Удален: " + container.pop() + "  " + container);
            System.out.println("Удален: " + container.pop() + "  " + container);
        } catch (ContainerEmptyException e) {
            System.out.println("Ошибка удаления: " + e.getMessage());
        }
        
        IntContainer equalContainer = new IntContainer();
        try {
            equalContainer.push(7);
            equalContainer.push(7);
            equalContainer.push(7);
            System.out.println("Контейнер: " + equalContainer);
            equalContainer.sort();
        } catch (ContainerFullException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ContainerEmptyException | SortException e) {
            System.out.println("Ошибка сортировки: " + e.getMessage());
        }
    }
}