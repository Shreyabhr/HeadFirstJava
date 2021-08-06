package com.techlab.test;

import java.util.Iterator;
import java.util.List;

import com.techlab.model.Builder;
import com.techlab.model.Guitar;
import com.techlab.model.GuitarSpec;
import com.techlab.model.InstrumentSpec;
import com.techlab.model.Inventory;
import com.techlab.model.Mandolin;
import com.techlab.model.Type;
import com.techlab.model.Wood;
import com.techlab.model.MandolinSpec;
import com.techlab.model.Style;

public class FindInstrumentTest {
	public static void main(String[] args) {
	
	Inventory inventory1 = new Inventory();
    initializeInventoryGuitars(inventory1);
    Inventory inventory2 = new Inventory();
    initializeInventoryMandolins(inventory2);
	
    GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
    List matchingGuitars = inventory1.search(whatErinLikes);
    if (!matchingGuitars.isEmpty()) {
      System.out.println("Erin, you might like these guitars:");
      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
        Guitar guitar = (Guitar)i.next();
        InstrumentSpec spec = guitar.getSpec();
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
    
    MandolinSpec whatErinLiked = new MandolinSpec(Builder.GIBSON, "F-5G", Type.ACOUSTIC, Style.A, Wood.MAPLE, Wood.MAPLE);
    List matchingmandolins = inventory2.search(whatErinLiked);
    if (!matchingmandolins.isEmpty()) {
      System.out.println("Erin, you might like these mandolins:");
      for (Iterator i = matchingmandolins.iterator(); i.hasNext(); ) {
        Mandolin mandolin = (Mandolin)i.next();
        InstrumentSpec spec = mandolin.getSpec();
        System.out.println("  We have a " +
          spec.getBuilder() + " " + spec.getModel() + " " +
          spec.getType() + " Mandolin:\n     " +
          spec.getBackWood() + " back and sides,\n     " +
          spec.getTopWood() + " top.\n  You can have it for only $" +
          mandolin.getPrice() + "!\n  ----");
      }
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }
    


	}

	private static void initializeInventoryMandolins(Inventory inventory) {
		// TODO Auto-generated method stub
		inventory.addInstrument("9019920", 5495.99, new MandolinSpec(Builder.GIBSON,"F-5G",Type.ACOUSTIC,Style.A,Wood.MAPLE,Wood.MAPLE));
		
	}

	private static void initializeInventoryGuitars(Inventory inventory) {
		// TODO Auto-generated method stub
		inventory.addInstrument("11277", 3999.95, new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.STIKA));
		inventory.addInstrument("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addInstrument("V9512", 1549.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addInstrument("566-62", 8999.95, new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12, Wood.COCBOLO, Wood.CEDAR));
		
		
	}
	
}
