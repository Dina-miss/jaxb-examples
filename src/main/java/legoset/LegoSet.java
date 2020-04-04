package legoset;

import java.util.ArrayList;
import java.time.Year;
import java.util.Set;
import java.net.URL;

import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces", "tags", "minifigs", "weight", "url"})
@Data
public class LegoSet {
    private String name;
    private String theme;
    private String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private ArrayList<Minifig> minifigs;

    private ArrayList<Weight> weight;
    private URL url;

    @XmlAttribute
    private int number;
}
