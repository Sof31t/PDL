/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.ArrayList;

/**
 *
 * @author sofiene
 */
public class PhoneCorrecter {

    String national;
    String international;
    ArrayList<String> internationalIndicatives = new ArrayList<String>();
    ArrayList<String> internationalCountries = new ArrayList<String>();

    public PhoneCorrecter(String phone) {
        int i = 0;
        int j = 0;
        boolean country_found = false;

        InitIndicatives();
        phone = Clean(phone);
        while (i < 4 && !country_found) {
            i++;
            while (j < internationalIndicatives.size() && !country_found) {
                if (phone.substring(0, i + 1).equals(internationalIndicatives.get(j))) {
                    this.international = internationalCountries.get(j);
                    country_found = true;
                }
                j++;
            }
        }

        this.national = phone.substring(i + 1, phone.length());
        if (!country_found) {
            this.national = "Donnée incorrecte";
        } else {
            if (this.international.equals("France")) {
                this.national = "0" + this.national;
                if (this.national.length() != 10) {
                    this.national = "Donnée incorrecte";
                } else {
                    this.national = this.national.substring(0, 2) + "." + this.national.substring(2, 4) + "." + this.national.substring(4, 6) + "." + this.national.substring(6, 8) + "." + this.national.substring(8, 10);

                }
            }
        }
    }
    /* cleaning a phone number */

    private String Clean(String phone) {
        phone = phone.replaceAll("[^0-9]", "");
        return phone;
    }
    /* retrieve the national id of the number */

    public String getNational() {
        return this.national;
    }
    /* retrieve the international id of the number */

    public String getInternational() {
        return this.international;
    }
    /* initialize the international indicatives */

    private void InitIndicatives() {
        internationalIndicatives.add("244");
        internationalCountries.add("Angola");
        internationalIndicatives.add("33");
        internationalCountries.add("France");
        internationalIndicatives.add("61");
        internationalCountries.add("Australie");
        internationalIndicatives.add("55");
        internationalCountries.add("Brésil");
        internationalIndicatives.add("44");
        internationalCountries.add("Royaume-Uni");
        internationalIndicatives.add("1758");
        internationalCountries.add("Sainte-Lucie");
        internationalIndicatives.add("421");
        internationalCountries.add(" Slovaquie");
        internationalIndicatives.add("7");
        internationalCountries.add("Russie");
    }
}
