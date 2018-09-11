package com.sbugert.rnadmob;

import com.google.android.gms.ads.AdSize;

import org.junit.Test;

import static org.junit.Assert.*;

public class RNCustomAdSizeTest {

    @Test
    public void parseCustomAdSize() {
        AdSize adSize = RNCustomAdSize.parseCustomAdSize("{230,20}");
        assertNotNull(adSize);
    }
}