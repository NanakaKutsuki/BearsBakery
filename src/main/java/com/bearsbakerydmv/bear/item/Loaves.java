package com.bearsbakerydmv.bear.item;

import java.util.ArrayList;
import java.util.List;

public class Loaves extends Item {
    public static final String ULTRA_MINI_LOAVES = "ultra mini loaves";
    public static final String MINI_LOAVES = "mini loaves";
    public static final String FULL_LOAVES = "full loaves";

    private List<PoundCake> poundCakeList;

    public Loaves() {
	this.poundCakeList = new ArrayList<PoundCake>();
    }

    public boolean isUltra() {
	return poundCakeList.size() == 2;
    }
}
