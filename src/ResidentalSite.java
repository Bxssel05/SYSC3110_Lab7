public class ResidentalSite extends Site {

    public ResidentalSite(int _units, double _rate) {
        super(_units, _rate);
    }

    @Override
    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
