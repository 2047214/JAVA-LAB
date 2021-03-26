class ExamFee {

    private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        ExamFee ef = new ExamFee();
System.out.println("         HALTON WALDROF SCHOOL           ");
System.out.println(" ");
System.out.println("   CLASS : Ist to Vth");
        System.out.println(ef.formatNumber(2500));
System.out.println(" ");
System.out.println("   CLASS : VI th to X th");
        System.out.println(ef.formatNumber(3998.9934));
System.out.println(" ");
System.out.println("   CLASS : XIst and XIIth");
        System.out.println(ef.formatNumber("5550"));
    }
}