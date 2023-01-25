import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack <String> stacks=new Stack<>();
        stacks.push("abebe");
        stacks.push("belete");
        stacks.push("melate");
        System.out.println("the names are: "+ stacks);
        String head= String.valueOf(stacks.search("abebe"));
        System.out.println(head);

        stacks.pop();
        System.out.println(stacks);
        String names=stacks.peek();
        System.out.println(names);
        boolean age=stacks.isEmpty();
        System.out.println(age);

    }
}