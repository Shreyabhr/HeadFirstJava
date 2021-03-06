package com.techlab.test;

import java.util.Iterator;
import java.util.List;

import com.techlab.model.Builder;
import com.techlab.model.Guitar;
import com.techlab.model.GuitarSpec;
import com.techlab.model.Inventory;
import com.techlab.model.Type;
import com.techlab.model.Wood;

public class FindGuitarTest {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
	    initializeInventory(inventory);

	    GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
	    List matchingGuitars = inventory.search(whatErinLikes);
	    if (!matchingGuitars.isEmpty()) {
	      System.out.println("Erin, you might like these guitars:");
	      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
	        Guitar guitar = (Guitar)i.next();
	        GuitarSpec spec = guitar.getSpec();
	        System.out.println("  We have a " +
	          spec.getBuilder() + " " + spec.getModel() + " " +
	          spec.getType() + " guitar:\n     " +
	          spec.getBackWood() + " back and sides,\n     " +
	          spec.getTopWood() + " top.\n  You can have it for only $" +
	          guitar.getPrice() + "!\n  ----");
	      }
	    } else {
	      System.out.println("Sorry, Erin, we have nothing for you.");
	    }

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.STIKA));
		inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("566-62", 8999.95, new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12, Wood.COCBOLO, Wood.CEDAR));


	}

}
