package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Bread {
        private String type;
        private Bread(String type) {
                this.type = type;
        }
        private static final List<Bread> breadTypes = new ArrayList<>();

        public static final Bread WHITE = new Bread("White");
        public static final Bread RYE = new Bread("Rye");
        public static final Bread WHEAT = new Bread("Wheat");
        public static final Bread WRAP = new Bread("Wrap");

        static {
                breadTypes.add(WHITE);
                breadTypes.add(RYE);
                breadTypes.add(WHEAT);
                breadTypes.add(WRAP);
        }

        public String getType() {
                return type;
        }

        public static List<Bread> getBreadTypes() {
                return breadTypes;
        }

        @Override
        public String toString() {
                return getType();
        }
}
