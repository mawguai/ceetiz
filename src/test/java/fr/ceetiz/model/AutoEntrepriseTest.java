package fr.ceetiz.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutoEntrepriseTest {

    public static final long SIRET_NUMBER = 123_568_941_00056L;

    @Test
    public void should_compute_correct_amount_of_taxes() {
        // GIVEN
        AutoEntreprise autoEntreprise = new AutoEntreprise(SIRET_NUMBER, "Imprim-eure");

        // WHEN
        double taxesAmount = autoEntreprise.computeTaxes(300000L);

        // THEN
        Assertions.assertEquals(taxesAmount, 75000d);
    }

    @Test
    void two_auto_entreprises_with_same_siret_should_be_equal() {
        AbstractCompany autoEntreprise1 = new AutoEntreprise(SIRET_NUMBER, "Imprim-eure");
        AbstractCompany autoEntreprise2 = new AutoEntreprise(SIRET_NUMBER, "Other denomination");

        Assertions.assertEquals(autoEntreprise1, autoEntreprise2);

    }

    @Test
    void an_auto_entreprise_should_have_a_non_null_siret_number() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new AutoEntreprise(null, "denomation")
        );
    }

    @Test
    void when_the_revenue_is_null_it_should_return_an_exception() {
        AutoEntreprise autoEntreprise = new AutoEntreprise(SIRET_NUMBER, "denomation");
        Assertions.assertThrows(IllegalArgumentException.class, () ->
            autoEntreprise.computeTaxes(null)
        );
    }

}
