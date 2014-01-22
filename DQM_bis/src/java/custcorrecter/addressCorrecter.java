<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java
package custcorrecter;
=======
package adress;
>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehdi & Remy
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java
import org.junit.Test;
=======
import java.util.logging.Level;
import java.util.logging.Logger;
>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java

public class addressCorrecter {

  public String QualiteDestinataire;
    public String NomComplet;
    public String LibelleCourtUnite;
    public String LibelleCourtOrganismeImplatation;
    public String ComplementAdresse;
    public String NumeroVoie;
    public String BoitePostale;
    public String CodePostale;
    public String BureauDistibuteur;
    public String Cedex;
    public ArrayList<String> stopList;
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java
    ArrayList<String> NormalWords = getNormalWords();
    ArrayList<String> Voies = getvoies();
    ArrayList<String> villes = getvilles();
    
    public addressCorrecter(){
        stopList = new ArrayList<String>();
        String fichier ="/root/NetBeansProjects/DQM_bis/keyWords/all.txt";
                
                //lecture du fichier texte        
                try{
                        InputStream ips=new FileInputStream(fichier);
                        InputStreamReader ipsr=new InputStreamReader(ips);
                        BufferedReader br=new BufferedReader(ipsr);
                        String ligne;
                        while ((ligne=br.readLine())!=null){
                                stopList.add(ligne);
                        }
                        br.close();
                }                
                catch (Exception e){
                        System.out.println(e.toString());
                }
        
    }
    @Test
    public String correctAddress(String address){
        
=======

    public addressCorrecter() {
        stopList = new ArrayList<String>();
        String fichier = "keyWords/all.txt";

        /*lecture du fichier texte   */

        InputStream ips;
        try {
            ips = new FileInputStream(fichier);

            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                stopList.add(ligne);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String correctAddress(String address) {

>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java
        address = FirstClean(address);
        
        address = CleanErrors(address);
        Cedex = getCedex(address);
        if (Cedex != null) {
            address = address.replace(Cedex, "");
        }

        LibelleCourtUnite = getLibelleCourtUnite(address);
        if (LibelleCourtUnite != null) {
            address = address.replace(LibelleCourtUnite, "");
        }

        LibelleCourtOrganismeImplatation = getLibelleCourtOrganismeImplatation(address);
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java
        if(LibelleCourtOrganismeImplatation!=null) address = address.replace(LibelleCourtOrganismeImplatation, "");
        
        NumeroVoie = getNumeroVoie(address);

         if(NumeroVoie!=null) address = address.replace(NumeroVoie, "");
                address = CleanCAErrors(address);
        System.out.println(address);
=======
        if (LibelleCourtOrganismeImplatation != null) {
            address = address.replace(LibelleCourtOrganismeImplatation, "");
        }

>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java
        ComplementAdresse = getComplementAdresse(address);
        if (ComplementAdresse != null) {
            address = address.replace(ComplementAdresse, "");
        }

<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java

        BoitePostale = getBoitePostale(address);
        if(BoitePostale!=null) address = address.replace(BoitePostale, "");

        address = CleanCityErrors(address);
=======
        NumeroVoie = getNumeroVoie(address);
        if (NumeroVoie != null) {
            address = address.replace(NumeroVoie, "");
        }

        BoitePostale = getBoitePostale(address);
        if (BoitePostale != null) {
            address = address.replace(BoitePostale, "");
        }

>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java
        CodePostale = getCodePostale(address);
        if (CodePostale != null) {
            address = address.replace(CodePostale, "");
        }

        BureauDistibuteur = getBureauDistibuteur(address, SecondClean(address), CodePostale);

        return getFinalAddress();
    }

    public String getLibelleCourtUnite(String address) {

        ArrayList<String> list = new ArrayList<String>();
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java
        String LCU="";
        String fichier ="/root/NetBeansProjects/DQM_bis/keyWords/LCU.txt";
                
                //lecture du fichier texte        
                try{
                        InputStream ips=new FileInputStream(fichier);
                        InputStreamReader ipsr=new InputStreamReader(ips);
                        BufferedReader br=new BufferedReader(ipsr);
                        String ligne;
                        while ((ligne=br.readLine())!=null){
                                list.add(ligne);
                        }
                        br.close();
                }                
                catch (Exception e){
                        System.out.println(e.toString());
                }
=======
        String LCU = "";
        String fichier = "keyWords/LCU.txt";

        /*lecture du fichier texte */

        InputStream ips;
        try {
            ips = new FileInputStream(fichier);

            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                list.add(ligne);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        }


>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java
        String[] listAddress;
        listAddress = address.split(" ");
        for (String s : list) {
            for (int i = 0; i < listAddress.length; i++) {


                if (s.toString().equals(listAddress[i])) {
                    LCU += listAddress[i] + " ";
                    for (int j = i + 1; j < listAddress.length; j++) {
                        if (stopList.contains(listAddress[j]) || StringOperation.isInt(listAddress[j])) {
                            break;
                        } else {
                            LCU += listAddress[j] + " ";
                        }
                        i = j;
                    }

                }

            }
        }
        return LCU;
    }
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java
    
    public String getLibelleCourtOrganismeImplatation(String address){
       ArrayList<String> list = new ArrayList<String>();
        String LCOI="";
        String fichier ="/root/NetBeansProjects/DQM_bis/keyWords/LCOI.txt";
                
                //lecture du fichier texte        
                try{
                        InputStream ips=new FileInputStream(fichier);
                        InputStreamReader ipsr=new InputStreamReader(ips);
                        BufferedReader br=new BufferedReader(ipsr);
                        String ligne;
                        while ((ligne=br.readLine())!=null){
                                list.add(ligne);
                        }
                        br.close();
                }                
                catch (Exception e){
                        System.out.println(e.toString());
                }
=======

    public String getLibelleCourtOrganismeImplatation(String address) {
        ArrayList<String> list = new ArrayList<String>();
        String LCOI = "";
        String fichier = "keyWords/LCOI.txt";

        /*lecture du fichier texte     */

        InputStream ips;
        try {
            ips = new FileInputStream(fichier);

            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                list.add(ligne);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        }
>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java
        String[] listAddress;
        listAddress = address.split(" ");
        for (String s : list) {
            for (int i = 0; i < listAddress.length; i++) {


                if (s.toString().equals(listAddress[i])) {
                    LCOI += listAddress[i] + " ";
                    for (int j = i + 1; j < listAddress.length; j++) {
                        if (stopList.contains(listAddress[j]) || StringOperation.isInt(listAddress[j])) {
                            break;
                        } else {
                            LCOI += listAddress[j] + " ";
                        }
                        i = j;
                    }

                }

            }
        }
        return LCOI;

    }
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java
    
    public String getComplementAdresse(String address){
    ArrayList<String> list = new ArrayList<String>();
        String CA="";
        boolean found = false;

        ArrayList<String> CAs = getCAs();
        String fichier ="/root/NetBeansProjects/DQM_bis/keyWords/CA.txt";

        //lecture du fichier texte        
                try{
                        InputStream ips=new FileInputStream(fichier);
                        InputStreamReader ipsr=new InputStreamReader(ips);
                        BufferedReader br=new BufferedReader(ipsr);
                        String ligne;
                        while ((ligne=br.readLine())!=null){
                                list.add(ligne);
                        }
                        br.close();
                }                
                catch (Exception e){
                        System.out.println(e.toString());
                }
        String[] listAddress;
        listAddress = address.split(" ");
        for(String s : list){
            for(int i=0;i<listAddress.length;i++){
                
                if(s.toString().equals(listAddress[i].toString())){
                    CA+=listAddress[i].toString()+" ";
                    CA+=listAddress[i+1].toString()+" ";
                    for(int j=i+2;j<listAddress.length;j++){
                        if((stopList.contains(listAddress[j].toString()) && !CAs.contains(listAddress[j].toString())) || (StringOperation.isInt(listAddress[j].toString()) && listAddress[j].length()==5))
                        {  
                            found = true;
                            break;
                        }
                        else CA+=listAddress[j].toString()+" ";
                        i=j;
=======

    public String getComplementAdresse(String address) {
        ArrayList<String> list = new ArrayList<String>();
        String CA = "";
        String fichier = "keyWords/CA.txt";

        /*lecture du fichier texte */

        InputStream ips;
        try {
            ips = new FileInputStream(fichier);

            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                list.add(ligne);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] listAddress;
        listAddress = address.split(" ");
        for (String s : list) {
            for (int i = 0; i < listAddress.length; i++) {

                if (s.toString().equals(listAddress[i])) {
                    CA += listAddress[i] + " ";
                    CA += listAddress[i + 1] + " ";
                    for (int j = i + 2; j < listAddress.length; j++) {
                        if (stopList.contains(listAddress[j]) || StringOperation.isInt(listAddress[j])) {
                            break;
                        } else {
                            CA += listAddress[j] + " ";
                        }
                        i = j;
>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java
                    }

                }

            }
            if(found) break;
        }
        return CA;
    }

    public String getNumeroVoie(String address) {
        ArrayList<String> list = new ArrayList<String>();
        String NV = "";
        Boolean found = false;
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java
        String fichier ="/root/NetBeansProjects/DQM_bis/keyWords/NomVoie.txt";
                
                //lecture du fichier texte        
                try{
                        InputStream ips=new FileInputStream(fichier);
                        InputStreamReader ipsr=new InputStreamReader(ips);
                        BufferedReader br=new BufferedReader(ipsr);
                        String ligne;
                        while ((ligne=br.readLine())!=null){
                                list.add(ligne);
                        }
                        br.close();
                }                
                catch (Exception e){
                        System.out.println(e.toString());
                }
=======
        String fichier = "keyWords/NomVoie.txt";

        /*lecture du fichier texte */

        InputStream ips;
        try {
            ips = new FileInputStream(fichier);

            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String ligne;
            while ((ligne = br.readLine()) != null) {
                list.add(ligne);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        }
>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java
        String[] listAddress;
        listAddress = address.split(" ");
        for (String s : list) {
            for (int i = 0; i < listAddress.length; i++) {
                if (s.toString().equals(listAddress[i])) {
                    if (StringOperation.isInt(listAddress[i - 1])) {
                        NV += listAddress[i - 1] + " ";
                        found = true;
                    }
                    NV += listAddress[i] + " ";
                    for (int j = i + 1; j < listAddress.length; j++) {
                        if (stopList.contains(listAddress[j]) || StringOperation.isInt(listAddress[j])) {
                            if (found) {
                                break;
                            } else if (StringOperation.isInt(listAddress[j]) && listAddress[j].length() <= 4) {
                                NV = listAddress[j] + " " + NV;
                                found = true;
                            } else {
                                break;
                            }
                        } else {
                            NV += listAddress[j] + " ";
                        }
                        i = j;
                    }

                }

            }
        }
        return NV;
    }

    public String getBoitePostale(String address) {
        ArrayList<String> list = new ArrayList<String>();
        String BP = "";
        Boolean found = false;

        list.add("BP");
        list.add("BOITE");
        list.add("POSTALE");

        String[] listAddress;

        listAddress = address.split(" ");

        for (String s : list) {

            for (int i = 0; i < listAddress.length; i++) {

                if (s.toString().equals(listAddress[i])) {

                    if (StringOperation.isInt(listAddress[i + 1])) {
                        found = true;
                    }
                    BP += listAddress[i] + " ";
                    BP += listAddress[i + 1] + " ";

                    for (int j = i + 2; j < listAddress.length; j++) {
                        if (stopList.contains(listAddress[j]) || StringOperation.isInt(listAddress[j])) {
                            if (found) {
                                break;
                            } else if (StringOperation.isInt(listAddress[j]) && listAddress[j].length() <= 4) {
                                BP += listAddress[j] + " ";
                                found = true;
                            } else {
                                break;
                            }
                        } else {
                            BP += listAddress[j] + " ";
                        }
                        i = j;
                    }

                }

            }
        }
        return BP;
    }

    public String getCodePostale(String address) {

        String CP = "";
        String[] listAddress;
        boolean found = false;
        listAddress = address.split(" ");

        for (int i = 0; i < listAddress.length; i++) {

            if (StringOperation.isInt(listAddress[i]) && listAddress[i].length() == 5) {

                found = true;

                CP += listAddress[i] + " ";
                break;
            }

        }
        if (found) {
            return CP;
        } else {
            return null;
        }
    }

    public String getBureauDistibuteur(String fulladdress, String shortAddress, String CP) {

        String ville = null;
        List listAddress;
        boolean found = false;
        if (CP != null) {

            listAddress = Arrays.asList(fulladdress.split(" "));
            String temp = getVilleFromCP(CP);
            if (temp != null && listAddress.contains(temp.toString())) {
                ville = temp;
                found = true;
            }

        }
        if (!found) {
            listAddress = Arrays.asList(shortAddress.split(" "));
            int i = 0;
            while (i < listAddress.size() || !found) {
                String temp = searchVille(listAddress.get(i).toString());
                if (this.CodePostale != null) {
                    found = true;
                    ville = listAddress.get(i).toString();

                }
                i++;
            }
        }

        return ville;
    }

    public String getCedex(String address) {
        String cedex = "";
        String[] listAddress;
        boolean found = false;
        listAddress = address.split(" ");

        for (int i = 0; i < listAddress.length; i++) {

            if (listAddress[i].equals("CEDEX")) {

                found = true;
                cedex += listAddress[i] + " ";

                if (i == listAddress.length - 1) {
                    break;
                } else {
                    for (int j = i + 1; j < listAddress.length; j++) {

                        if (!stopList.contains(listAddress[j]) && !(StringOperation.isInt(listAddress[j]) && listAddress[j].length() == 5)) {
                            cedex += listAddress[j] + " ";
                        } else {
                            break;
                        }

                    }
                }
                break;
            }

        }
        if (found) {
            return cedex;
        } else {
            return null;
        }


    }

    private String getVilleFromCP(String CP) {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "insee";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        String ville = null;
        try {
            Class.forName(driver).newInstance();

            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            Statement st = conn.createStatement();
            String Query = "SELECT Commune FROM annuaire WHERE Codepos LIKE '" + CP + "'";
            ResultSet res = st.executeQuery(Query);
            while (res.next()) {
                ville = res.getString("Commune");
            }
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ville;
    }

    private String searchVille(String ville) {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "insee";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        String CP = null;
        try {

            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);
            Statement st = conn.createStatement();
            String Query = "SELECT * FROM annuaire WHERE Commune LIKE '" + ville + "'";
            ResultSet res = st.executeQuery(Query);

            while (res.next()) {
                CP = res.getString("Codepos");
            }
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addressCorrecter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return CP;
    }
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java
    
    public String FirstClean(String address){
        
        address = address.replaceAll(",","");
        address = address.replaceAll("°"," ");
        address = address.replaceAll("[\\s\\p{Punct}]"," ");
        address = address.replaceAll("  ", " ");
        address = StringOperation.sansAccent(address);    
=======

    public String FirstClean(String address) {

        address = address.replaceAll("[\\s\\p{Punct}]", " ");
        address = address.replaceAll(" ", " ");
        address = StringOperation.sansAccent(address);
>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java
        address = address.toUpperCase();
        return address;
    }

    public String SecondClean(String address) {
        String temp = address;

        if (this.Cedex != null) {
            temp = temp.replace(this.Cedex, "");
        }

        if (this.BoitePostale != null) {
            temp = temp.replace(this.BoitePostale, "");
        }
        if (this.CodePostale != null) {
            temp = temp.replace(this.CodePostale, "");
        }
        if (this.ComplementAdresse != null) {
            temp = temp.replace(this.ComplementAdresse, "");
        }
        if (this.LibelleCourtOrganismeImplatation != null) {
            temp = temp.replace(this.LibelleCourtOrganismeImplatation, "");
        }
        if (this.LibelleCourtUnite != null) {
            temp = temp.replace(this.LibelleCourtUnite, "");
        }
        if (this.NumeroVoie != null) {
            temp = temp.replace(this.NumeroVoie, "");
        }
        if (this.QualiteDestinataire != null) {
            temp = temp.replace(this.QualiteDestinataire, "");
        }

        return temp;
    }
<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/addressCorrecter.java
    
    public String CleanErrors(String address){
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "insee";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        ArrayList<String> NormalWords = getNormalWords();
        ArrayList<String> villes = getvilles();
        ArrayList<String> CAs = getCAs();
        ArrayList<String> temp=new ArrayList<String>();
       
        String[] listAddress;
        listAddress = address.split(" ");
        try{

            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url+dbName,userName,password);
            Statement st = conn.createStatement();
         
         //Correction du champ decrivant le type de la voie
            
           for(int j=0;j<listAddress.length;j++){
               if(!NormalWords.contains(listAddress[j].toString()) && !CAs.contains(listAddress[j].toString()) && !villes.contains(listAddress[j].toString().toUpperCase()) ){
                String forQuery = listAddress[j].substring(0, 1);
                
                for(int i=1;i<listAddress[j].length();i++){
                    if(i==listAddress[j].length()-1) forQuery +='%'+listAddress[j].substring(i)+'%';
                    else forQuery +='%'+listAddress[j].substring(i, i+1);
                }
                
                String Query = "SELECT * FROM NomVoie WHERE Correspondant LIKE '"+forQuery+"'";
                ResultSet res = st.executeQuery(Query);
           
             while(res.next()){
                 if(listAddress[j].toString().equals(res.getString("Abreviation").toUpperCase()) || listAddress[j].toString().equals(res.getString("Correspondant").toUpperCase())){
                    temp.clear();
                    //temp.add(res.getString("Correspondant").toUpperCase());
                    address = address.replaceFirst(listAddress[j],res.getString("Correspondant").toUpperCase());
                    break;
                }
                else{

                    temp.add(res.getString("Correspondant").toUpperCase());
                    temp.add(res.getString("Abreviation").toUpperCase());
                 }
             }
             if(temp.size()!=0){
             String match = getTheWriteWord(listAddress[j],temp);
             temp.clear();
             Query = "SELECT * FROM NomVoie WHERE Abreviation LIKE '"+match+"'";
             res = st.executeQuery(Query);
             String Correspodant = null;
             while(res.next()){
                Correspodant = res.getString("Correspondant");
             }
             if(stopList.contains(Correspodant.toString().toUpperCase())){
             if(Correspodant==null) address = address.replaceFirst(listAddress[j],match);
             else address = address.replaceFirst(listAddress[j],Correspodant.toUpperCase());
             }
             }
            }
           }                     
           
           conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        address = StringOperation.sansAccent(address);

        return address;
    }
    
    private String CleanCAErrors(String address){
        
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "insee";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        ArrayList<String> temp=new ArrayList<String>();
       
        String[] listAddress;
        try{

            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url+dbName,userName,password);
            Statement st = conn.createStatement();

        //Partie de correction des autres champs autre que la voie !
          listAddress = address.split(" ");

           for(int j=0;j<listAddress.length;j++){
               if(!NormalWords.contains(listAddress[j].toString()) && !Voies.contains(listAddress[j].toString()) && !villes.contains(listAddress[j].toString().toUpperCase())){
                 String forQuery = listAddress[j].substring(0, 1);
                for(int i=1;i<listAddress[j].length();i++){
                    if(i==listAddress[j].length()-1) forQuery +='%'+listAddress[j].substring(i)+'%';
                    else forQuery +='%'+listAddress[j].substring(i, i+1);
                }
                
                String Query = "SELECT * FROM autreAbreviation WHERE Correspondant LIKE '"+forQuery+"' OR Abreviation LIKE  '"+forQuery+"'";
                ResultSet res = st.executeQuery(Query);
            
          while(res.next()){

                 if(listAddress[j].toString().equals(res.getString("Abreviation").toUpperCase()) || listAddress[j].toString().equals(res.getString("Correspondant").toUpperCase())){
                    temp.clear();

                    //temp.add(res.getString("Correspondant").toUpperCase());
                    address = address.replaceFirst(listAddress[j],res.getString("Correspondant").toUpperCase());
                    break;
                }
                else{
                    temp.add(res.getString("Correspondant").toUpperCase());
                    temp.add(res.getString("Abreviation").toUpperCase());
                 }
             }
             String match = null;
             if(temp.size() > 1){
              match = getTheWriteWord(listAddress[j],temp);
            
             temp.clear();
             Query = "SELECT * FROM autreAbreviation WHERE Abreviation LIKE '"+match+"'";
             res = st.executeQuery(Query);
             String Correspodant = null;
             while(res.next()){

                Correspodant = res.getString("Correspondant");
             }
            if(stopList.contains(Correspodant.toString().toUpperCase())){
             if(Correspodant==null) address = address.replaceFirst(listAddress[j],match);
             else address = address.replaceFirst(listAddress[j],Correspodant.toUpperCase());
            }
            }
           }
           }  
           
                 conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        address = StringOperation.sansAccent(address);

        return address;
    }
    private String CleanCityErrors(String address){
        
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "insee";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        ArrayList<String> NormalWords = getNormalWords();
     
        ArrayList<String> temp=new ArrayList<String>();
       
        String[] listAddress;
        listAddress = address.split(" ");
        try{

            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url+dbName,userName,password);
            Statement st = conn.createStatement();
         
         for(int j=0;j<listAddress.length;j++){
               if(!NormalWords.contains(listAddress[j].toString()) && !stopList.contains(listAddress[j].toString())){
                String forQuery = listAddress[j].substring(0, 1);
                
                for(int i=1;i<listAddress[j].length();i++){
                    if(i==listAddress[j].length()-1) forQuery +='%'+listAddress[j].substring(i)+'%';
                    else forQuery +='%'+listAddress[j].substring(i, i+1);
                }
                
                String Query = "SELECT * FROM annuaire WHERE Commune LIKE '"+forQuery+"'";
                ResultSet res = st.executeQuery(Query);
           
             while(res.next()){
                temp.add(res.getString("Commune").toUpperCase());
             }
             if(temp.size()!=0){
             String match = getTheWriteWord(listAddress[j],temp);
             temp.clear();
             address = address.replace(listAddress[j],match);
             }
            }
           }
                 conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        address = StringOperation.sansAccent(address);

        return address;
    }
    private ArrayList<String> getNormalWords(){
        ArrayList<String> temp = new ArrayList<String>();
         String fichier ="/root/NetBeansProjects/DQM_bis/keyWords/NormalWords.txt";
                
                //lecture du fichier texte        
                try{
                        InputStream ips=new FileInputStream(fichier);
                        InputStreamReader ipsr=new InputStreamReader(ips);
                        BufferedReader br=new BufferedReader(ipsr);
                        String ligne;
                        while ((ligne=br.readLine())!=null){
                                temp.add(ligne);
                        }
                        br.close();
                }                
                catch (Exception e){
                        System.out.println(e.toString());
                }
             return temp;
    }
    
    private ArrayList<String> getvoies() {
       ArrayList<String> temp = new ArrayList<String>();
         String fichier ="/root/NetBeansProjects/DQM_bis/keyWords/NomVoie.txt";
                
                //lecture du fichier texte        
                try{
                        InputStream ips=new FileInputStream(fichier);
                        InputStreamReader ipsr=new InputStreamReader(ips);
                        BufferedReader br=new BufferedReader(ipsr);
                        String ligne;
                        while ((ligne=br.readLine())!=null){
                                temp.add(ligne);
                        }
                        br.close();
                }                
                catch (Exception e){
                        System.out.println(e.toString());
                }
             return temp;
    }
    private String getFinalAddress(){
        
         String temp = "";

        if(this.LibelleCourtUnite!=null) temp += this.LibelleCourtUnite+"\n";
        if(this.LibelleCourtOrganismeImplatation!=null) temp += this.LibelleCourtOrganismeImplatation+"\n";
        if(this.ComplementAdresse!=null) temp += this.ComplementAdresse+"\n";
        if(this.BoitePostale!=null) temp += this.BoitePostale+"\n";
        if(this.NumeroVoie!=null) temp += this.NumeroVoie+"\n";
        if(this.CodePostale!=null) temp += this.CodePostale+" ";
        if(this.BureauDistibuteur!=null) temp += this.BureauDistibuteur+" ";
        if(this.Cedex!=null) temp += this.Cedex;
        
=======
    /* The final method to be called */

    private String getFinalAddress() {

        String temp = "";

        if (this.LibelleCourtUnite != null) {
            temp += this.LibelleCourtUnite + "\n";
        }
        if (this.LibelleCourtOrganismeImplatation != null) {
            temp += this.LibelleCourtOrganismeImplatation + "\n";
        }
        if (this.ComplementAdresse != null) {
            temp += this.ComplementAdresse + "\n";
        }
        if (this.BoitePostale != null) {
            temp += this.BoitePostale + "\n";
        }
        if (this.NumeroVoie != null) {
            temp += this.NumeroVoie + "\n";
        }
        if (this.CodePostale != null) {
            temp += this.CodePostale + " ";
        }
        if (this.BureauDistibuteur != null) {
            temp += this.BureauDistibuteur + " ";
        }
        if (this.Cedex != null) {
            temp += this.Cedex;
        }

>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/addressCorrecter.java
        return temp;
    }

    private String getTheWriteWord(String word,ArrayList<String> temp) {
        
        int i = word.length();
        int min = 100;
        int index=0;
        for(String s : temp){
            if(s.length()-i<min){
                min = s.length()-i;
                index = temp.indexOf(s);
            }
        }
        return temp.get(index).toString();
    }

    private ArrayList<String> getCAs() {
        ArrayList<String> temp = new ArrayList<String>();
         String fichier ="/root/NetBeansProjects/DQM_bis/keyWords/CA.txt";
                
                //lecture du fichier texte        
                try{
                        InputStream ips=new FileInputStream(fichier);
                        InputStreamReader ipsr=new InputStreamReader(ips);
                        BufferedReader br=new BufferedReader(ipsr);
                        String ligne;
                        while ((ligne=br.readLine())!=null){
                                temp.add(ligne);
                        }
                        br.close();
                }                
                catch (Exception e){
                        System.out.println(e.toString());
                }
             return temp;
    }

    private ArrayList<String> getvilles() {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "insee";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        ArrayList<String> temp = new ArrayList<String>();
        
        try{

            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url+dbName,userName,password);
            Statement st = conn.createStatement();
            
             String Query = "SELECT Commune FROM annuaire ";
                ResultSet res = st.executeQuery(Query);
           
             while(res.next()){
                temp.add(res.getString("Commune").toUpperCase());
             }
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return temp;
    }

    
}