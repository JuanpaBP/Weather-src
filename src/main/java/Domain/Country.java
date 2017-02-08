package Domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Usuario on 12/01/2017.
 */
@Component
@Entity
@Table(name = "Country")
final public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID",unique = true, nullable = false, insertable = false, updatable = false)
    private int id_country;
    //@Column(name = "Name: ",length = 50)
    private String name = "";
    //@Column(name = "Alpha2: ", length = 2)
    private String alpha2 = "";
    //@Column(name = "Alpha3: ", length = 3)
    private String alpha3 = "";

        public int getId_country(){return this.id_country;}

        public void setId_country(int id_country){this.id_country = id_country;}

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

        public Country(int id_country, String name, String alpha2, String alpha3) {
            this.id_country = id_country;
            this.name = name;
            this.alpha2 = alpha2;
            this.alpha3 = alpha3;
        }
        public Country(){}

        public String toString() {
            return "Country ID: " + Integer.toString(this.id_country) + "\nName: " + this.name + "\nShort2: " +
                    this.alpha2 + "\nShort3: " + this.alpha3;
        }

}
