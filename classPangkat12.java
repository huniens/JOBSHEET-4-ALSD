public class classPangkat12 {
    public int nilai,pangkat;

    public classPangkat12(int n, int p) {
        nilai = n;
        pangkat = p;
    }
    
    public int pangkatBF(int a,int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public int pangkatDC(int a,int n) {
        if (n==0) {
            return 1;
        }
        else
        {
            if (n % 2 == 1) {//bil ganjil
                return (pangkatDC(a, n/2) *pangkatDC(a, n/2) * a);
            } else {//bil genap
                return (pangkatDC(a, n/2) *pangkatDC(a, n/2));
            }
        }
    }
}