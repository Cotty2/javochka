public class main {
    public static void main(String[] args) {
        MyCharacter ch1 = new MyCharacter('5');
        MyCharacter ch2 = new MyCharacter('A');
        MyCharacter ch3 = new MyCharacter('5');

        System.out.println(ch1.isDigit());                    
        System.out.println(MyCharacter.isLetter(ch2));        
        System.out.println(ch1.equals(ch3));                  
        System.out.println(ch1.compareTo(ch2));               
        System.out.println(ch1.charValue());                   
    }
}