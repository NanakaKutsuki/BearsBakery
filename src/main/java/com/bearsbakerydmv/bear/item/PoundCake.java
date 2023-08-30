package com.bearsbakerydmv.bear.item;

import java.util.List;

public class PoundCake extends Item {
    public static final String GLUTEN_FREE = "gluten free";
    public static final String DAIRY_FREE = "dairy free";

    private String flavor;
    private List<String> toppingList;
    private List<String> addinList;
    private boolean fullSize;
    private boolean glutenFree;
    private boolean dairyFree;
    private boolean loaves;

    public String getFlavor() {
	return flavor;
    }

    public void setFlavor(String flavor) {
	this.flavor = flavor;
    }

    public List<String> getToppingList() {
	return toppingList;
    }

    public void setToppingList(List<String> toppingList) {
	this.toppingList = toppingList;
    }

    public List<String> getAddinList() {
	return addinList;
    }

    public void setAddinList(List<String> addinList) {
	this.addinList = addinList;
    }

    public boolean isFullSize() {
	return fullSize;
    }

    public void setFullSize(boolean fullSize) {
	this.fullSize = fullSize;
    }

    public boolean isGlutenFree() {
	return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
	this.glutenFree = glutenFree;
    }

    public boolean isDairyFree() {
	return dairyFree;
    }

    public void setDairyFree(boolean dairyFree) {
	this.dairyFree = dairyFree;
    }

    public boolean isLoaves() {
	return loaves;
    }

    public void setLoaves(boolean loaves) {
	this.loaves = loaves;
    }
}
