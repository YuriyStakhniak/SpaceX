/**
 * Created by yurezzz13 on 21.03.18.
 */
public enum Planets {

    MERCURY(22190000l), VENUS(45000000l), MARS(55757930l), JUPITER(967000000l),
    SATURN(1660000000l), URANUS(2600000000l), NEPTUNE(4300000000l);

    public long distance;

    Planets(long distance) {
        this.distance = distance;
    }
}
