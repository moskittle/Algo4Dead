public class QuickFindUF {

    private int[] id;
    private int size;

    public QuickFindUF(int N) {
        id = new int[N];
        size = N;
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pId = id[p];
        int qId = id[q];
        for (int i = 0; i < size; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }
    }

    public static void main(String[] args) {

    }
}
