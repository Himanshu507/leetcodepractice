import java.util.ArrayList;

public class StackImplementation {

    public ArrayList<Integer> pop(ArrayList<Integer> list){
        list.remove(list.size()-1);
        return list;
    }

    public int top(ArrayList<Integer> list){
       return list.get(list.size() - 1);
    }

    public ArrayList<Integer> push (ArrayList<Integer> list, int element){
        list.add(element);
        return list;
    }

    public boolean isEmpty(ArrayList<Integer> list){
        if(list.size() == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StackImplementation stackImplementation = new StackImplementation();
        ArrayList<Integer> stack = new ArrayList<>();
        System.out.println("Current is Empty: "+stackImplementation.isEmpty(stack));
        stack.add(10);
        stack.add(12);
        stack.add(1);
        stack.add(15);
        stack.add(20);
        System.out.println("Current Stack: "+stack);
        System.out.println("Stack is Empty: "+stackImplementation.isEmpty(stack));
        System.out.println("Top Operation: "+stackImplementation.top(stack));
        System.out.println("Pop Operation: "+stackImplementation.pop(stack));
        System.out.println("Push Operation: "+stackImplementation.push(stack, 20));
    }

}
