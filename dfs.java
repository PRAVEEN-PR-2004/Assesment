import java.util.*;

public class dfs {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt(), e = s.nextInt();
        List<ArrayList<Integer>> ts = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            ts.add(new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            ts.get(n1).add(n2);
            ts.get(n2).add(n1);
        }
        int vis[] = new int[v];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        while (!st.isEmpty()) {
            int a = st.pop();
            if (vis[a] != 1) {
                vis[a] = 1;
                System.out.print(a + " ");
            }
            for (int i = ts.get(a).size() - 1; i >= 0; i--) {
                int node = ts.get(a).get(i);
                if (vis[node] == 0) {
                    // vis[node]=1;
                    st.push(node);
                }
            }

        }
    }
}