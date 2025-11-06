public abstract class Site {
    protected final int _units;
    protected final double _rate;

    public static double TAX_RATE;

    public Site(int _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }

    public abstract double getBillableAmount();
}
