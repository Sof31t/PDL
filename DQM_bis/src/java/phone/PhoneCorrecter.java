/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import custcorrecter.StringOperation;
import java.util.ArrayList;

/**
 *
 * @author sofiene
 */
public class PhoneCorrecter {
    String national;
    String international;
    String country;
    ArrayList<String> internationalIndicatives = new ArrayList<String>();
    ArrayList<String> internationalCountries = new ArrayList<String>();
    
    public PhoneCorrecter(String phone){
        InitIndicatives();
        NormalizePhone(phone);
    }
    
    private String Clean(String phone){
         phone = phone.replaceAll("[^0-9]","");
         return phone;
     }
    
    public String getNational(){
        return this.national;
    }
    public String getInternational(){
        return this.international;
    }
    public String getCountry(){
        return this.country;
    }
    private void NormalizePhone(String phone){
        int i = 0;
        int j = 0;
        boolean country_found = false;
        String national_number;
        phone = Clean(phone);
        while (i<4 && !country_found){
            i++;
            while (j<internationalIndicatives.size() && !country_found){
                if ( phone.substring(0,i+1).equals(internationalIndicatives.get(j))){
                    this.country = internationalCountries.get(j);
                    country_found = true;
                }
                j++;
            }
        }
        if (country_found){
            national_number = phone.substring(i+1,phone.length());
            if (this.country.equals("France")){
                national_number = "0" + national_number;
                if (national_number.length() != 10){
                    this.national = "Donnée incorrecte";
                    this.international = "Donnée incorrecte";
                }else{
                    this.national = ConvertFrenchNational(national_number);
                    this.international = ConvertFrenchInternational(national_number);
                }
            }else{
                this.national = national_number;
                this.international = "00" + phone;
            }
        }else{
            if(phone.substring(0,1).equals("0") && phone.length() == 10){
                this.country = "France";
                this.national = ConvertFrenchNational(phone);
                this.international = ConvertFrenchInternational(phone); 
            }else{
                this.country = "Donnée incorrecte";
                this.national= "Donnée incorrecte";
                this.international = "Donnée incorrecte";
            }
        }
    }
    private String ConvertFrenchNational(String national_number){
        String aux_national_number;
        aux_national_number = "";
        for(int i=0; i<10; i=i+2){
            aux_national_number = aux_national_number + national_number.substring(i,i+2) + ".";
        }
        national_number = aux_national_number.substring(0,14);
        return national_number;
    }
    private String ConvertFrenchInternational(String international_number){
        international_number = ConvertFrenchNational(international_number).substring(1,14);
        international_number = "0033." + international_number;
        return international_number;
    }
    private void InitIndicatives(){
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
