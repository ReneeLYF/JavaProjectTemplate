package com.parasoft.nested;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneFactoryTest {

    @Test
    void getIphone4() {
        PhoneFactory factory = new PhoneFactory();
        factory.toString();
        PhoneFactory.Phone iphone4 = PhoneFactory.getIphone4();
        assertEquals("iphone4", iphone4.getName());
        assertEquals("call 911", iphone4.call911());
        assertEquals(PhoneFactory.Brand.APPLE, iphone4.getBrand());
        assertEquals("name: iphone4, brand: APPLE", iphone4.toString());
    }
}