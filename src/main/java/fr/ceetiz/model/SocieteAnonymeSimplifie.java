package fr.ceetiz.model;

public class SocieteAnonymeSimplifie extends AbstractCompany {

    private static final double TAX_RATE = 0.33;
    private String address;

    public SocieteAnonymeSimplifie(Long siretNumber, String denomination, String address) {
        super(siretNumber, denomination);
        this.address = address;
    }

    @Override
    public double computeTaxes(Long revenues) {
        return revenues * TAX_RATE;
    }

    public String getAddress() {
        return address;
    }
}
