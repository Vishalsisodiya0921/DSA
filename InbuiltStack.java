package Stack;
import java.util.Stack;
public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();

        //push
        st.push(1);
        st.push(11);
        st.push(21);
        st.push(31);
        st.push(231);
        st.push(41);
        System.out.println(st);

    }
}
