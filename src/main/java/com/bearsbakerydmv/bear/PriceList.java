package com.bearsbakerydmv.bear;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.bearsbakerydmv.bear.item.Addin;
import com.bearsbakerydmv.bear.item.Flavor;
import com.bearsbakerydmv.bear.item.Loaves;
import com.bearsbakerydmv.bear.item.Others;
import com.bearsbakerydmv.bear.item.PoundCake;
import com.bearsbakerydmv.bear.item.Topping;

public class PriceList {
    private static final BigDecimal FIFTY_CENTS = new BigDecimal(0.5);
    private static final BigDecimal SEVENTY_FIVE_CENTS = new BigDecimal(0.75);
    private static final BigDecimal ONE_TWENTY_FIVE = new BigDecimal(1.25);
    private static final BigDecimal TWO = new BigDecimal(2);
    private static final BigDecimal FIVE = new BigDecimal(5);
    private static final BigDecimal FIVE_TWENTY_FIVE = new BigDecimal(5.25);
    private static final BigDecimal FIVE_FIFTY = new BigDecimal(5.5);
    private static final BigDecimal FIVE_SIXTY = new BigDecimal(5.6);
    private static final BigDecimal TWELVE = new BigDecimal(12);
    private static final BigDecimal TWELVE_FIFTY = new BigDecimal(12.5);
    private static final BigDecimal THIRTEEN = new BigDecimal(13);
    private static final BigDecimal THIRTEEN_TWENTY_FIVE = new BigDecimal(13.25);

    private Map<String, BigDecimal> fullSizePriceMap;
    private Map<String, BigDecimal> miniSizePriceMap;
    private Map<String, BigDecimal> otherPriceMap;

    public PriceList() {
	// FULL
	this.fullSizePriceMap = new HashMap<String, BigDecimal>();
	this.fullSizePriceMap.put(Flavor.VANILLA, TWELVE);
	this.fullSizePriceMap.put(Flavor.BLUEBERRY, THIRTEEN);
	this.fullSizePriceMap.put(Flavor.CHOCOLATE, TWELVE_FIFTY);
	this.fullSizePriceMap.put(Flavor.LATTE, TWELVE_FIFTY);
	this.fullSizePriceMap.put(Flavor.LEMON, TWELVE_FIFTY);
	this.fullSizePriceMap.put(Flavor.CINNAMON_SWIRL, THIRTEEN);
	this.fullSizePriceMap.put(Flavor.GINGERBREAD_SPICED, THIRTEEN);
	this.fullSizePriceMap.put(Flavor.CARROT_APPLE, THIRTEEN);
	this.fullSizePriceMap.put(Flavor.MATCHA, TWELVE_FIFTY);
	this.fullSizePriceMap.put(Flavor.HOJICHA, TWELVE_FIFTY);
	this.fullSizePriceMap.put(Flavor.OLIVE_OIL, THIRTEEN);
	this.fullSizePriceMap.put(Flavor.COCONUT, THIRTEEN_TWENTY_FIVE);
	this.fullSizePriceMap.put(PoundCake.GLUTEN_FREE, ONE_TWENTY_FIVE);
	this.fullSizePriceMap.put(PoundCake.DAIRY_FREE, ONE_TWENTY_FIVE);
	this.fullSizePriceMap.put(Topping.VANILLA_GLAZE, BigDecimal.ONE);
	this.fullSizePriceMap.put(Topping.CHOCOLATE_GLAZE, BigDecimal.ONE);
	this.fullSizePriceMap.put(Topping.CINNAMON_CRUMB_STREUSEL, TWO);
	this.fullSizePriceMap.put(Topping.CHOCOLATE_CHIPS, BigDecimal.ONE);
	this.fullSizePriceMap.put(Topping.SLICED_ALMONDS, BigDecimal.ONE);
	this.fullSizePriceMap.put(Addin.DARK_CHOCOLATE_CHIPS, BigDecimal.ONE);
	this.fullSizePriceMap.put(Addin.MILK_CHOCOLATE_CHIPS, BigDecimal.ONE);
	this.fullSizePriceMap.put(Addin.WHITE_CHOCOLATE_CHIPS, BigDecimal.ONE);
	this.fullSizePriceMap.put(Addin.TOASTED_WALNUTS, ONE_TWENTY_FIVE);
	this.fullSizePriceMap.put(Addin.TOASTED_PECANS, ONE_TWENTY_FIVE);
	this.fullSizePriceMap.put(Addin.BLUEBERRIES, ONE_TWENTY_FIVE);
	this.fullSizePriceMap.put(Addin.STRAWBERRIES, ONE_TWENTY_FIVE);
	this.fullSizePriceMap.put(Addin.RASPBERRIES, ONE_TWENTY_FIVE);

	// MINI
	this.miniSizePriceMap = new HashMap<String, BigDecimal>();
	this.miniSizePriceMap.put(Flavor.VANILLA, FIVE);
	this.miniSizePriceMap.put(Flavor.BLUEBERRY, FIVE_FIFTY);
	this.miniSizePriceMap.put(Flavor.CHOCOLATE, FIVE_TWENTY_FIVE);
	this.miniSizePriceMap.put(Flavor.LATTE, FIVE_TWENTY_FIVE);
	this.miniSizePriceMap.put(Flavor.LEMON, FIVE_TWENTY_FIVE);
	this.miniSizePriceMap.put(Flavor.CINNAMON_SWIRL, FIVE_FIFTY);
	this.miniSizePriceMap.put(Flavor.GINGERBREAD_SPICED, FIVE_FIFTY);
	this.miniSizePriceMap.put(Flavor.CARROT_APPLE, FIVE_FIFTY);
	this.miniSizePriceMap.put(Flavor.MATCHA, FIVE_TWENTY_FIVE);
	this.miniSizePriceMap.put(Flavor.HOJICHA, FIVE_TWENTY_FIVE);
	this.miniSizePriceMap.put(Flavor.OLIVE_OIL, FIVE_FIFTY);
	this.miniSizePriceMap.put(Flavor.COCONUT, FIVE_SIXTY);
	this.miniSizePriceMap.put(PoundCake.GLUTEN_FREE, FIFTY_CENTS);
	this.miniSizePriceMap.put(PoundCake.DAIRY_FREE, FIFTY_CENTS);
	this.miniSizePriceMap.put(Topping.VANILLA_GLAZE, FIFTY_CENTS);
	this.miniSizePriceMap.put(Topping.CHOCOLATE_GLAZE, FIFTY_CENTS);
	this.miniSizePriceMap.put(Topping.CINNAMON_CRUMB_STREUSEL, BigDecimal.ONE);
	this.miniSizePriceMap.put(Topping.CHOCOLATE_CHIPS, FIFTY_CENTS);
	this.miniSizePriceMap.put(Topping.SLICED_ALMONDS, FIFTY_CENTS);
	this.miniSizePriceMap.put(Addin.DARK_CHOCOLATE_CHIPS, FIFTY_CENTS);
	this.miniSizePriceMap.put(Addin.MILK_CHOCOLATE_CHIPS, FIFTY_CENTS);
	this.miniSizePriceMap.put(Addin.WHITE_CHOCOLATE_CHIPS, FIFTY_CENTS);
	this.miniSizePriceMap.put(Addin.TOASTED_WALNUTS, SEVENTY_FIVE_CENTS);
	this.miniSizePriceMap.put(Addin.TOASTED_PECANS, SEVENTY_FIVE_CENTS);
	this.miniSizePriceMap.put(Addin.BLUEBERRIES, SEVENTY_FIVE_CENTS);
	this.miniSizePriceMap.put(Addin.STRAWBERRIES, SEVENTY_FIVE_CENTS);
	this.miniSizePriceMap.put(Addin.RASPBERRIES, SEVENTY_FIVE_CENTS);

	// LOAVES
	this.otherPriceMap = new HashMap<String, BigDecimal>();
	this.otherPriceMap.put(Loaves.ULTRA_MINI_LOAVES, BigDecimal.TEN);
	this.otherPriceMap.put(Loaves.MINI_LOAVES, new BigDecimal(15.5));
	this.otherPriceMap.put(Loaves.FULL_LOAVES, new BigDecimal(37.5));

	// OTHERS
	this.otherPriceMap.put(Others.THICK_COOKIE, new BigDecimal(4.25));
	this.otherPriceMap.put(Others.CHEWY_COOKIE, new BigDecimal(2.5));
	this.otherPriceMap.put(Others.BROWNIE, TWO);
	this.otherPriceMap.put(Others.BAGUETTE, new BigDecimal(6));
    }
}
