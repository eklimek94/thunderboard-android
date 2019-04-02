package com.silabs.thunderboard.demos.ui;

import android.support.annotation.ColorRes;

import com.silabs.thunderboard.R;

public class RangeColor {
    interface RangeColorEnum {
        int getColorRes();

        boolean isInRange(float x);
    }

    static class RangeColorImpl {
        public final float minValue;
        public final float maxValue;
        public final int colorRes;

        RangeColorImpl(float minValue, float maxValue, @ColorRes int colorRes) {
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.colorRes = colorRes;
        }

        public int getColorRes() {
            return colorRes;
        }

        @ColorRes
        static int getColor(RangeColorEnum[] values, float value) {
            for (RangeColorEnum val : values) {
                if (val.isInRange(value)) {
                    return val.getColorRes();
                }
            }
            return R.color.black;
        }

        public boolean isInRange(float x) {
            return (x >= minValue && x < maxValue);
        }

    }

    public enum Ambient implements RangeColorEnum {
        LOWEST(-Float.MAX_VALUE, 40f, R.color.sl_dark_violet),
        LOWER(40.0f, 80.0f, R.color.sl_violet),
        LOW(80.0f, 120.0f, R.color.sl_light_violet),
        NEAR_LOW(120.0f, 160.0f, R.color.sl_white_violet),
        MEDIUM_LOW(160.0f, 200.0f, R.color.sl_light_peach),
        MEDIUM(200.0f, 300.0f, R.color.sl_peach_gold),
        MEDIUM_HIGH(300.0f, 500.0f, R.color.sl_pinky_peach),
        HIGH(500.0f, 1000.0f, R.color.sl_pink),
        HIGHER(1000.0f, 10000.0f, R.color.sl_bromine_orange),
        HIGHEST(10000.0f, Float.MAX_VALUE, R.color.sl_yellow_orange);

        private final RangeColorImpl impl;

        Ambient(float minValue, float maxValue, int colorRes) {
            this.impl = new RangeColorImpl(minValue, maxValue, colorRes);
        }

        @Override
        public int getColorRes() {
            return this.impl.getColorRes();
        }

        @Override
        public boolean isInRange(float x) {
            return this.impl.isInRange(x);
        }

        public static int getColorRes(float value) {
            return RangeColorImpl.getColor(Ambient.values(), value);
        }
    }

    public enum CO2 implements RangeColorEnum {
        LOWEST(-Float.MAX_VALUE, 1000.0f, R.color.sl_terbium_green),
        LOW(1000.0f, 1200.0f, R.color.sl_yellow),
        MEDIUM(1200.0f, 5000.0f, R.color.sl_red_orange),
        HIGH(5000.0f, Float.MAX_VALUE, R.color.sl_dark_grey);

        private final RangeColorImpl impl;

        CO2(float minValue, float maxValue, int colorRes) {
            this.impl = new RangeColorImpl(minValue, maxValue, colorRes);
        }

        @Override
        public int getColorRes() {
            return this.impl.getColorRes();
        }

        @Override
        public boolean isInRange(float x) {
            return this.impl.isInRange(x);
        }

        public static int getColorRes(float value) {
            return RangeColorImpl.getColor(CO2.values(), value);
        }
    }

    public enum Humidity implements RangeColorEnum {
        LOWEST(-Float.MAX_VALUE, 45.0f, R.color.sl_blue),
        LOWER(45.0f, 50.0f, R.color.sl_terbium_green),
        LOW(50.0f, 55.0f, R.color.sl_yellow),
        MEDIUM(55.0f, 60.0f, R.color.sl_yellow_orange),
        HIGH(60.0f, 65.0f, R.color.sl_bromine_orange),
        HIGHEST(65.0f, Float.MAX_VALUE, R.color.sl_red_orange);

        private final RangeColorImpl impl;

        Humidity(float minValue, float maxValue, int colorRes) {
            this.impl = new RangeColorImpl(minValue, maxValue, colorRes);
        }

        @Override
        public int getColorRes() {
            return this.impl.getColorRes();
        }

        @Override
        public boolean isInRange(float x) {
            return this.impl.isInRange(x);
        }

        public static int getColorRes(float value) {
            return RangeColorImpl.getColor(Humidity.values(), value);
        }
    }

    public enum Pressure implements RangeColorEnum {
        LOWEST(-Float.MAX_VALUE, 995.0f, R.color.sl_terbium_green),
        LOW(995.0f, 1010.0f, R.color.sl_terbium_green),
        MEDIUM(1010.0f, 1025.0f, R.color.sl_terbium_green),
        HIGH(1025.0f, 1040.0f, R.color.sl_terbium_green),
        HIGHEST(1040.0f, Float.MAX_VALUE, R.color.sl_terbium_green);

        private final RangeColorImpl impl;

        Pressure(float minValue, float maxValue, int colorRes) {
            this.impl = new RangeColorImpl(minValue, maxValue, colorRes);
        }

        @Override
        public int getColorRes() {
            return this.impl.getColorRes();
        }

        @Override
        public boolean isInRange(float x) {
            return this.impl.isInRange(x);
        }

        public static int getColorRes(float value) {
            return RangeColorImpl.getColor(Pressure.values(), value);
        }
    }

    public enum SoundLevel implements RangeColorEnum {
        LOWEST(-Float.MAX_VALUE, 30.0f, R.color.sl_blue),
        LOW(30.0f, 60.0f, R.color.sl_terbium_green),
        MEDIUM(60.0f, 90.0f, R.color.sl_yellow),
        HIGH(90.0f, 120.0f, R.color.sl_yellow_orange),
        HIGHEST(120.0f, Float.MAX_VALUE, R.color.sl_red_orange);

        private final RangeColorImpl impl;

        SoundLevel(float minValue, float maxValue, int colorRes) {
            this.impl = new RangeColorImpl(minValue, maxValue, colorRes);
        }

        @Override
        public int getColorRes() {
            return this.impl.getColorRes();
        }

        @Override
        public boolean isInRange(float x) {
            return this.impl.isInRange(x);
        }

        public static int getColorRes(float value) {
            return RangeColorImpl.getColor(SoundLevel.values(), value);
        }
    }

    public enum Temperature implements RangeColorEnum {
        LOWEST(-Float.MAX_VALUE, 194.0f, R.color.sl_bright_green),
        HIGHEST(194.0f, Float.MAX_VALUE, R.color.sl_red);

        private final RangeColorImpl impl;

        Temperature(float minValue, float maxValue, int colorRes) {
            this.impl = new RangeColorImpl(minValue, maxValue, colorRes);
        }

        @Override
        public int getColorRes() {
            return this.impl.getColorRes();
        }

        @Override
        public boolean isInRange(float x) {
            return this.impl.isInRange(x);
        }

        public static int getColorRes(float value) {
            return RangeColorImpl.getColor(Temperature.values(), value);
        }
    }

    public enum UV implements RangeColorEnum {
        LOWEST(-Float.MAX_VALUE, 3.0f, R.color.sl_terbium_green),
        LOW(3.0f, 6.0f, R.color.sl_yellow),
        MEDIUM(6.0f, 8.0f, R.color.sl_yellow_orange),
        HIGH(8.0f, 11.0f, R.color.sl_red_orange),
        HIGHEST(11.0f, Float.MAX_VALUE, R.color.sl_violet);

        private final RangeColorImpl impl;

        UV(float minValue, float maxValue, int colorRes) {
            this.impl = new RangeColorImpl(minValue, maxValue, colorRes);
        }

        @Override
        public int getColorRes() {
            return this.impl.getColorRes();
        }

        @Override
        public boolean isInRange(float x) {
            return this.impl.isInRange(x);
        }

        public static int getColorRes(float value) {
            return RangeColorImpl.getColor(UV.values(), value);
        }
    }

    public enum VOC implements RangeColorEnum {
        LOW(-Float.MAX_VALUE, 100.0f, R.color.sl_terbium_green),
        MEDIUM(100.0f, 1000.0f, R.color.sl_yellow),
        HIGH(1000.0f, Float.MAX_VALUE, R.color.sl_red_orange);

        private final RangeColorImpl impl;

        VOC(float minValue, float maxValue, int colorRes) {
            this.impl = new RangeColorImpl(minValue, maxValue, colorRes);
        }

        @Override
        public int getColorRes() {
            return this.impl.getColorRes();
        }

        @Override
        public boolean isInRange(float x) {
            return this.impl.isInRange(x);
        }

        public static int getColorRes(float value) {
            return RangeColorImpl.getColor(VOC.values(), value);
        }
    }
}
