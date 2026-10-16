void main() {
    System.out.printf("  %-8s%5s\n", "C", "F");

    for (int i = -100; i <= 100; i++)
        System.out.printf("%-12d%5.2f\n", i, CtoF(i));
}

public static double CtoF(double celsius) {
    return celsius * 9/5 + 32;
}