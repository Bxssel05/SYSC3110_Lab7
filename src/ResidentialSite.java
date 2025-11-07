public class ResidentialSite extends Site {

    public ResidentialSite(int _units, double _rate) {
        super(_units, _rate);
    }

    @Override
    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base + tax;
    }

    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    protected double getBaseAmount() {
        return _units * _rate;
    }

}
