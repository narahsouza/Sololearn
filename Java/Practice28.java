// Method Return Types

// So You Think You Can Dance?

public class Practice28 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double score1 = read.nextDouble();
        double score2 = read.nextDouble();
        double score3 = read.nextDouble();
        double score4 = read.nextDouble();
        double avgScore = getAverageScore(score1, score2, score3, score4);
        System.out.println(avgScore);
    }
    //create your method here
    public static double getAverageScore(double a, double b, double c, double d) {
        double x = (a + b + c + d) / 4;
        return x;
    }
}