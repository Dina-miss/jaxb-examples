package legoset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Year;
import java.util.ArrayList;
import java.util.Set;
import java.net.URL;

import jaxb.JAXBHelper;

public class Main {
    public static void main(String[] args) throws Exception {
        LegoSet legoset = new LegoSet();
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(Set.of("Starfighter","Stormtrooper","Star Wars","Solo"));

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));
        legoset.setMinifigs(minifigs);

        ArrayList<Weight> weight = new ArrayList<>();
        weight.add(new Weight("kg",0.89));
        legoset.setWeight(weight);

        legoset.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));
        legoset.setNumber(75211);

        JAXBHelper.toXML(legoset, System.out);

        JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoset.xml")));
    }

}