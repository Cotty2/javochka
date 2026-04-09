import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fraction> list = new ArrayList<>();
        list.add(new Fraction(3, 4));
        list.add(new Fraction(-1, 2));
        list.add(new Fraction(5, 1));
        list.add(new Fraction(-3, 4));
        list.add(new Fraction(1, 3));
        list.add(new Fraction(-5, 2));
        list.add(new Fraction(2, -3));
        list.add(new Fraction(4, 8));
        
        System.out.println("Исходный: " + list);
        
        ArrayList<Fraction> copy;
        
        copy = new ArrayList<>(list); Collections.sort(copy);
        System.out.println("Возрастание: " + copy);
        
        copy = new ArrayList<>(list); Collections.sort(copy, new Desc());
        System.out.println("Убывание: " + copy);
        
        copy = new ArrayList<>(list); Collections.sort(copy, new AbsAsc());
        System.out.println("Возрастание |значений|: " + copy);
        
        copy = new ArrayList<>(list); Collections.sort(copy, new AbsDesc());
        System.out.println("Убывание |значений|: " + copy);
    }
}