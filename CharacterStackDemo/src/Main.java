//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CharStack stack = new CharStack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        stack.push('f');
        stack.push('g');
        stack.push('h');
        stack.push('i');
        stack.push('j');
        stack.printElements();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printElements();
    }
}