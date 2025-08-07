public class ComputeExpression2 {
    public static void main(String[] args) {
        
        double num = (7.5 * 2.5 - 1.5 * 3) / (4 - 2.5);
        
        System.out.printf("""
                The result of 7.5 x 2.5 - 1.5 x 3
                              -------------------   is %.1f
                                  4 - 2.5""", num);
        
    }
}
