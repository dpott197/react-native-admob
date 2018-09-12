package com.sbugert.rnadmob;

import com.google.android.gms.ads.AdSize;

import org.junit.Test;

import static org.junit.Assert.*;

public class RNCustomAdSizeTest {

    @Test
    public void parseCustomAdSize() {
        AdSize adSize = RNCustomAdSize.parseCustomAdSize("{220,30}");
        assertNotNull(adSize);
        assertEquals(220, adSize.getWidth());
        assertEquals(30, adSize.getHeight());
    }

    @Test
    public void parseCustomAdSizeNegative() {
        AdSize adSize = RNCustomAdSize.parseCustomAdSize("220,30");
        assertNull(adSize);
    }
}