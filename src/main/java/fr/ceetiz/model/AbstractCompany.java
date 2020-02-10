package fr.ceetiz.model;

public abstract class AbstractCompany {

    private Long siretNumber;
    private String denomination;

    public abstract double computeTaxes(Long revenues);

    public AbstractCompany(Long siretNumber, String denomination) {
        this.siretNumber = siretNumber;
        this.denomination = denomination;
    }

    public Long getSiretNumber() {
        return siretNumber;
    }

    public String getDenomination() {
        return denomination;
    }
}
