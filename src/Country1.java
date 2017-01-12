/**
 * Created by Usuario on 12/01/2017.
 */
public class Country1 {

        private int id_country = 0;
        private String name = "";
        private String alpha2 = "";
        private String alpha3 = "";

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlpha2() {
            return this.alpha2;
        }

        public void setAlpha2(String alpha2) {
            this.alpha2 = alpha2;
        }

        public String getAlpha3() {
            return this.alpha3;
        }

        public void setAlpha3(String alpha3) {
            this.alpha3 = alpha3;
        }

        public Country1(int id_country, String name, String alpha2, String alpha3) {
            this.id_country = id_country;
            this.name = name;
            this.alpha2 = alpha2;
            this.alpha3 = alpha3;
        }

        public String toString() {
            return "Country ID: " + Integer.toString(this.id_country) + "Name: " + this.name + "\nAlpha2: " + this.alpha2 + "\nAlpha3: " + this.alpha3;
        }

}
