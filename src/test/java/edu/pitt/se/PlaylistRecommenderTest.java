package edu.pitt.se;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PlaylistRecommenderTest {

    //Energy
    @Test
    public void testEnergyHigh() {
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(Arrays.asList(150, 160)));
    }

    @Test
    public void testEnergyMedium() {
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(Arrays.asList(100, 110, 90)));
    }

    @Test
    public void testEnergyLow() {
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(Arrays.asList(40)));
    }

    //Title
    @Test
    public void testTitleGood() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Title Name"));
    }

    @Test
    public void testTitleBad() {
        assertFalse(PlaylistRecommender.isValidTrackTitle("!!!"));
    }

    @Test
    public void testTitleNull() {
        assertFalse(PlaylistRecommender.isValidTrackTitle(null));
    }

    //Normalize
    @Test
    public void normalize() {
        assertEquals(100, PlaylistRecommender.normalizeVolume(1000000000));
    }
}
