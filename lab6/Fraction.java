public class Fraction implements Comparable<Fraction> {
    private int num; // числитель
    private int den; // знаменатель
    
    public Fraction(int num, int den) {
        if (den == 0) {
            System.out.println("Ошибка: знаменатель = 0");
            return;
        }
        if (den < 0) {
            num = -num;
            den = -den;
        }
        int nod = nod(Math.abs(num), den);
        this.num = num / nod;
        this.den = den / nod;
    }
    
    private int nod(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    
    public int compareTo(Fraction other) {
        int left = this.num * other.den;
        int right = other.num * this.den;
        if (left < right) return -1;
        if (left > right) return 1;
        return 0;
    }
    
    public Fraction abs() {
        return new Fraction(Math.abs(num), den);
    }
    
    public String toString() {
        if (den == 1) return num + "";
        return num + "/" + den;
    }
}

class Asc implements java.util.Comparator<Fraction> {
    public int compare(Fraction a, Fraction b) { return a.compareTo(b); }
}

class Desc implements java.util.Comparator<Fraction> {
    public int compare(Fraction a, Fraction b) { return -a.compareTo(b); }
}

class AbsAsc implements java.util.Comparator<Fraction> {
    public int compare(Fraction a, Fraction b) { return a.abs().compareTo(b.abs()); }
}

class AbsDesc implements java.util.Comparator<Fraction> {
    public int compare(Fraction a, Fraction b) { return -a.abs().compareTo(b.abs()); }
}