public class MyCharacter {
    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }


    public char charValue() {
        return value;
    }


    public int compareTo(MyCharacter anotherCharacter) {
        return this.value - anotherCharacter.value;
    }
    public boolean equals(Object anotherCharacter) {
        if (anotherCharacter instanceof MyCharacter) {
            MyCharacter other = (MyCharacter) anotherCharacter;
            return this.value == other.value;
        }
        return false;
    }

    public boolean isDigit() {
        return value >= '0' && value <= '9';
    }

    public static boolean isDigit(MyCharacter ch) {
        return ch.value >= '0' && ch.value <= '9';
    }

   
    public static boolean isLetter(MyCharacter ch) {
        char c = ch.value;
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

   
    public static boolean isLetterOrDigit(MyCharacter ch) {
        return isLetter(ch) || isDigit(ch);
    }
}