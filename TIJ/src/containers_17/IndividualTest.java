package containers_17;

import java.util.*;
import holdingobjects_11.MapOfList;
import typeinfo_14.pets.*;

/**
 * 宠物首先按照类型排序，再按照名字排序
 * @author xzy
 *
 */
public class IndividualTest {
	public static void main(String[] args) {
		Set<Individual> pets = new TreeSet<Individual>();
		for(List<? extends Pet> lPets : MapOfList.petPeople.values())
			for(Pet pet : lPets)
				pets.add(pet);
		System.out.println(pets);
	}
	
}
