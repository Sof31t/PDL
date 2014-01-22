/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emailCorrect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Email validator Testing
 * 
 * @author mkyong
 * 
 */
public class emailCorrecter {
 
	private EmailValidator emailValidator;
 
        public emailCorrecter(){
	  
            emailValidator = new EmailValidator();
            
        }
        public String CorrectEmail(String mail){
            
            int pos = mail.indexOf( '@' );
            
            if(pos != -1){
             // Isolate the domain/machine name and get a list of mail exchangers
                 String domain = mail.substring( ++pos );
                 mail = mail.replace(domain, corretErrors(domain));
            }
            if(!SMTPMXLookup.isAddressValid(mail)){
                
               return "#UNKNOWN";

            }
        
           return mail;
        }
	public String[] ValidEmailProvider() {
		return new String[] { "tantaoui.mehdi@gmail.com",
			"anais.huitelec@gmail.com", "c.sablayro@gmail.com",
			"zhangyuchen19881007@gmail.com", "laure.pouget.2310@gmail.com",
			"wangmengqian1212@gmail.com" };
	}
       public String[]InValidEmailProvider() {
		return new String[] { "ticzzpqs.3.2.pd@gmai.c",
			"zzzzzzz@gmail.com", "hakitocalibra@Yahoo",
			"bib1111bip@gmail.com", "trankbistrolala@gmail.com",
			"a@b.c" };
	}
    private String corretErrors(String domain) {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "insee";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        String ND = null;
        try{
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url+dbName,userName,password);
            Statement st = conn.createStatement();
            String Query = "SELECT * FROM mail WHERE Error LIKE '"+domain+"'";
            ResultSet res = st.executeQuery(Query);
            while(res.next()){
                ND = res.getString("Correspondant");
            }
            conn.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        if(ND == null) return domain;
        else return ND;
    }
    
    
 
}