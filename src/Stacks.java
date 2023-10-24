import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        //Checking if a Stack is Empty
        System.out.println(stack.empty());

        //Adding Items to the top of a stack
        stack.push("The Last of Us II");
        stack.push("The Last of Us I");
        stack.push("FIFA 19");
        stack.push("GTA V");
        stack.push("God of War");

        System.out.println(stack.empty());

        //A stack is printable
        System.out.println("Mt Game Stack: " + stack);

        //Removing the top most object from our stack
        //you can also use pop() to reassign the removed item
        String myFave = stack.pop();

        System.out.println("Removed Item: " + myFave);
        System.out.println(stack);

        //Taking a look at the top most item without removing it
        System.out.println("Top Most Item: " + stack.peek());

        //Searching for an item in my stack
        System.out.println("Position of My Item: " + stack.search("The Last of Us II"));

        //Stacks can run out of Memory
        for (int i = 0; i < 1000000000; i++){
            stack.push("Fallout76");
        }


    }


}
