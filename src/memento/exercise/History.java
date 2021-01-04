package memento.exercise;

import java.util.Stack;

public class History {
    Stack<State> history = new Stack<>();

    public void push(State state) {
        history.push(state);
    }

    public State pop() {
        if (history.size() < 2){
            history.clear();
            return null;
        }

        history.pop();
        return history.peek();
    }

}
