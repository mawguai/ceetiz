package fr.ceetiz.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SocieteAnonymeSimplifieTest {

    @Test
    public void should_compute_correct_amount_of_taxes() {
        // GIVEN
        SocieteAnonymeSimplifie sas = new SocieteAnonymeSimplifie(123_568_941_00056L, "Imprim-eure", "27000 Evreux");

        // WHEN
        double taxesAmount = sas.computeTaxes(300000L);

        // THEN
        Assertions.assertEquals(taxesAmount, 99000d);
    }

}
