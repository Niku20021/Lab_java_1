public class main {
    public static void main(String[] args) {
        int k = 0;
        int t = 0;
        int x, i = 150;
        // Double y = x/0.0;
        // float z = 20f;
        // byte b = 10;
        // short c = 14;
        // x = y.intValue();
        // c = y.byteValue();
        // System.out.println(x);
        // System.out.println(c);
        // System.out.println(y.valueOf("30"));
        // System.out.println(y);

        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String months[] = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August",
                "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
        for (i = 0; i < months.length; i++) {
            System.out.println(months[i].substring(0, 3)); // ex 5
            // System.out.println(months[i]);
            // System.out.println(month_days[i]);
            if (month_days[i] < 31) {
                System.out.println(months[i]);
                k = k + 1;
                t = t + month_days[i];
            }
        }
        System.out.println("Nr. luni sub 31 zile:");
        System.out.println(k);
        System.out.println("Nr. total de zile ale lunilor sub 31 zile:");
        System.out.println(t);

    }
}