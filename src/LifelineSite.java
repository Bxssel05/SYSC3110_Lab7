public class LifelineSite extends Site{

    public LifelineSite(int _units, double _rate) {
        super(_units, _rate);
    }

    @Override
    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base + tax;
    }

    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }

    protected double getBaseAmount() {
        return _units * _rate * 0.5;
    }
}