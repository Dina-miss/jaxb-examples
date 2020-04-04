package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {
    @XmlValue
    private String title;

    @XmlAttribute
    private int count;

    public Minifig() {}

    public Minifig(String title, int count) {
        this.title = title;
        this.count = count;
    }
}

