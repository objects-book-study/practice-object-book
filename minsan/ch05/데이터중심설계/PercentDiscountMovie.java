import java.time.Duration;

public class PercentDiscountMovie extends Movie {
    private double percent;

    public PercentDiscountMovie(String title, Duration runningTime, Money fee, double percent) {
        super(title, runningTime, fee);
        this.percent = percent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return this.getFee().times(percent);
    }
}
