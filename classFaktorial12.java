/**
 * classFaktorial12
 */

public class classFaktorial12 {

    public int nilai;
    
    public int faktoria1BF(int n) {
    int fakto = 1;
    for (int i = 1; i <= n; i++) {
        fakto = fakto * i;
    }
    return fakto;
    }

    public int faktoria1DC(int n) {
    if (n==1) {
        return 1;
    }
    else
    {
        int fakto = n *faktoria1DC(n-1);
        return fakto;
    }
    }
}