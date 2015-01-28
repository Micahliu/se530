package edu.olivet.se530.entry;

import java.io.IOException;
import java.net.MalformedURLException;

import com.google.inject.Guice;

import edu.olivet.se530.SellerHunter;
import edu.olivet.se530.model.Offer;
import edu.olivet.se530.modules.CrawlerModule;
import edu.olivet.se530.modules.ProfileModule;

public class CnSellerHunterEntry {

	public static void main(String[] args) throws MalformedURLException, IOException {
		SellerHunter hunter = Guice.createInjector(new CrawlerModule(), new ProfileModule()).getInstance(SellerHunter.class);
		Offer offer = new Offer();
		offer = hunter.getOfferList("B00KRZJYXW", "New");
		System.out.println(offer);
		System.out.println("my commit");
	}	
}

