import java.util.*;
class Main{
  public static void main(String[] args){
    System.out.print("Enter a word: ");
    Scanner n=new Scanner(System.in);
    String word = n.nextLine();
    Queue q = new LinkedList();
    for (int i = word.length()-1; i>=0; i--){
      q.add(word.charAt(i));
    }
    String string = "";
    while (!q.isEmpty()) {
      string = string+q.remove();
    }
    if (word.equals(string))
    System.out.println("This word is a palindrome.");
    else
    System.out.println("Tis word is not a palindrome.");
  }
}