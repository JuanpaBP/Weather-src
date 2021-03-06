/**
 * Created by Usuario on 12/01/2017.
 */
public class State1{

    private Country1 X;
    private Weather Today;
    private Weather _10Days;
    private String name = "";
    private String abbr = "";
    private String area = "";
    private String largest_city = "";
    private String capital = "";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbr() {
        return this.abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLargest_city() {
        return this.largest_city;
    }

    public void setLargest_city(String largest_city) {
        this.largest_city = largest_city;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public State1(int cID, String cName, String cAlpha2, String cAlpha3, int wTemp, int wMaxTemp, int wMinTemp,
                  String wDesc, int wWSpe, String wWDir, String wAHum, String wAPress, String wAVisibility,
                  String sName, String sAbbr, String sArea, String sLargest_city, String sCapital) {
        this.X = new Country1(cID, cName, cAlpha2, cAlpha3);
        this.Today = new Weather(wTemp, wMaxTemp, wMinTemp, wDesc, wWSpe, wWDir, wAHum, wAPress, wAVisibility);
        this._10Days = new Weather(wMaxTemp, wMinTemp, wDesc);
        this.name = sName;
        this.abbr = sAbbr;
        this.area = sArea;
        this.largest_city = sLargest_city;
        this.capital = sCapital;
    }

    public String toString() {
        return this.X.toString() + "\n" +"Name: " + this.name + "\nShort: " + this.abbr + "\nLargest City: " +
                this.largest_city + "\nCapital: " + this.capital + "\n" + this.Today.toString();
    }
}
