public class problema2 {
    public static void main(String[] args) {
        int[] a = { 1, 6, 5, 8 };
        int[] b = { 1, 5, 15, 12, 2,1,5,6,5 };
        String s = "";

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    if (!s.isEmpty()) {
                        s += ", ";
                    }
                    s += b[j];
                    break;
                }
            }
        }
        System.out.println(s + " <--Estos serian solo por asi decir es un ejemplo!!!");
    }
}
