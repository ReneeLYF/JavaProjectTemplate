package com.parasoft.nested;

import static com.parasoft.nested.PhoneFactory.Brand.APPLE;

public class PhoneFactory {

    public static Phone getIphone4() {
        return new Phone("iphone4", APPLE);
    }

    public enum Brand {
        APPLE
    }

    public interface Callable {
        String call911();
    }

    public static class Phone implements Callable {
        private String name;
        private Brand brand;

        public Phone(String name, Brand brand) {
            this.name = name;
            this.brand = brand;
        }

        public String call911() {
            return "call 911";
        }

        public String toString() {
            return "name: " + this.name + ", brand: " + this.brand;
        }

        public String getName() {
            return name;
        }

        public Brand getBrand() {
            return brand;
        }
    }
}
