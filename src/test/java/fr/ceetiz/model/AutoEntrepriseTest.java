package fr.ceetiz.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutoEntrepriseTest {

    @Test
    public void should_compute_correct_amount_of_taxes() {
        // GIVEN
        AutoEntreprise autoEntreprise = new AutoEntreprise(123_568_941_00056L, "Imprim-eure");

        // WHEN
        double taxesAmount = autoEntreprise.computeTaxes(300000L);

        // THEN
        Assertions.assertEquals(taxesAmount, 75000d);
    }

}
