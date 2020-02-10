package fr.ceetiz.model;

public class AutoEntreprise extends AbstractCompany {

    private static final double TAX_RATE = 0.25;

    public AutoEntreprise(Long siretNumber, String denomination) {
        super(siretNumber, denomination);
    }

    @Override
    public double computeTaxes(Long revenues) {
        return revenues * TAX_RATE;
    }
}
