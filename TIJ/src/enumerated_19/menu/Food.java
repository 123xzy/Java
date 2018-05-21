package enumerated_19.menu;

/**
 *  
 * @author xzy
 *
 */
public interface Food {
	enum Appetizer implements Food{
		SALAD,SOUP,SPRING_ROLLS;
	}
	enum MainCourse implements Food{
		LASAGNE,BURRITO,PAD_THAI,
		LENTILS,HUMMOUS,VINDALOO;
	}
	enum Dessert implements Food{
		TIRAMISU,GELATO,BLACK_FOREST_CAKE,
		FRUIT,CREME_CARAMEL;
	}
	enum Coffee implements Food{
		BLACK_COFFEE,DECAF_COFFEE,ESPRESSO,
		LATTE,CAPPUCCINO,TEA,HERB_TEA;
	}
}
