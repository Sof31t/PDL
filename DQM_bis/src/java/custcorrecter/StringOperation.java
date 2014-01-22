<<<<<<< HEAD:DQM_bis/src/java/custcorrecter/StringOperation.java
package custcorrecter;
=======
package adress;

>>>>>>> 1c4d67613e4518103618c9713e28d56c231f48c8:DQM/src/java/adress/StringOperation.java
import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehdi
 */
public abstract class StringOperation {

    /* Index du 1er caractere accentué */
    private static final int MIN = 192;
    /* Index du dernier caractere accentué */
    private static final int MAX = 255;
    /* Vecteur de correspondance entre accent / sans accent */
    private static final Vector map = initMap();

    /* Initialisation du tableau de correspondance entre les caractéres accentués
     * et leur homologues non accentués
     */
    private static Vector initMap() {
        Vector Result = new Vector();
        java.lang.String car = null;

        car = new java.lang.String("A");
        /* '\u00C0' À alt-0192 */
        Result.add(car);
        /* '\u00C1' Á alt-0193 */
        Result.add(car);
        /* '\u00C2' Â alt-0194 */
        Result.add(car);
        /* '\u00C3' Ã alt-0195 */
        Result.add(car);
        /* '\u00C4' Ä alt-0196 */
        Result.add(car);
        /* '\u00C5' Å alt-0197 */
        Result.add(car);
        car = new java.lang.String("AE");
        /* '\u00C6' Æ alt-0198 */
        Result.add(car);
        car = new java.lang.String("C");
        /* '\u00C7' Ç alt-0199 */
        Result.add(car);
        car = new java.lang.String("E");
        /* '\u00C8' È alt-0200 */
        Result.add(car);
        /* '\u00C9' É alt-0201 */
        Result.add(car);
        /* '\u00CA' Ê alt-0202 */
        Result.add(car);
        /* '\u00CB' Ë alt-0203 */
        Result.add(car);
        car = new java.lang.String("I");
        /* '\u00CC' Ì alt-0204 */
        Result.add(car);
        /* '\u00CD' Í alt-0205 */
        Result.add(car);
        /* '\u00CE' Î alt-0206 */
        Result.add(car);
        /* '\u00CF' Ï alt-0207 */
        Result.add(car);
        car = new java.lang.String("D");
        /* '\u00D0' Ð alt-0208 */
        Result.add(car);
        car = new java.lang.String("N");
        /* '\u00D1' Ñ alt-0209 */
        Result.add(car);
        car = new java.lang.String("O");
        /* '\u00D2' Ò alt-0210 */
        Result.add(car);
        /* '\u00D3' Ó alt-0211 */
        Result.add(car);
        /* '\u00D4' Ô alt-0212 */
        Result.add(car);
        /* '\u00D5' Õ alt-0213 */
        Result.add(car);
        /* '\u00D6' Ö alt-0214 */
        Result.add(car);
        car = new java.lang.String("*");
        /* '\u00D7' × alt-0215 */
        Result.add(car);
        car = new java.lang.String("0");
        /* '\u00D8' Ø alt-0216 */
        Result.add(car);
        car = new java.lang.String("U");
        /* '\u00D9' Ù alt-0217 */
        Result.add(car);
        /* '\u00DA' Ú alt-0218 */
        Result.add(car);
        /* '\u00DB' Û alt-0219 */
        Result.add(car);
        /* '\u00DC' Ü alt-0220 */
        Result.add(car);
        car = new java.lang.String("Y");
        /* '\u00DD' Ý alt-0221 */
        Result.add(car);
        car = new java.lang.String("Þ");
        /* '\u00DE' Þ alt-0222 */
        Result.add(car);
        car = new java.lang.String("B");
        /* '\u00DF' ß alt-0223 */
        Result.add(car);
        car = new java.lang.String("a");
        /* '\u00E0' à alt-0224 */
        Result.add(car);
        /* '\u00E1' á alt-0225 */
        Result.add(car);
        /* '\u00E2' â alt-0226 */
        Result.add(car);
        /* '\u00E3' ã alt-0227 */
        Result.add(car);
        /* '\u00E4' ä alt-0228 */
        Result.add(car);
        /* '\u00E5' å alt-0229 */
        Result.add(car);
        car = new java.lang.String("ae");
        /* '\u00E6' æ alt-0230 */
        Result.add(car);
        car = new java.lang.String("c");
        /* '\u00E7' ç alt-0231 */
        Result.add(car);
        car = new java.lang.String("e");
        /* '\u00E8' è alt-0232 */
        Result.add(car);
        /* '\u00E9' é alt-0233 */
        Result.add(car);
        /* '\u00EA' ê alt-0234 */
        Result.add(car);
        /* '\u00EB' ë alt-0235 */
        Result.add(car);
        car = new java.lang.String("i");
        /* '\u00EC' ì alt-0236 */
        Result.add(car);
        /* '\u00ED' í alt-0237 */
        Result.add(car);
        /* '\u00EE' î alt-0238 */
        Result.add(car);
        /* '\u00EF' ï alt-0239 */
        Result.add(car);
        car = new java.lang.String("d");
        /* '\u00F0' ð alt-0240 */
        Result.add(car);
        car = new java.lang.String("n");
        /* '\u00F1' ñ alt-0241 */
        Result.add(car);
        car = new java.lang.String("o");
        /* '\u00F2' ò alt-0242 */
        Result.add(car);
        /* '\u00F3' ó alt-0243 */
        Result.add(car);
        /* '\u00F4' ô alt-0244 */
        Result.add(car);
        /* '\u00F5' õ alt-0245 */
        Result.add(car);
        /* '\u00F6' ö alt-0246 */
        Result.add(car);
        car = new java.lang.String("/");
        /* '\u00F7' ÷ alt-0247 */
        Result.add(car);
        car = new java.lang.String("0");
        /* '\u00F8' ø alt-0248 */
        Result.add(car);
        car = new java.lang.String("u");
        /* '\u00F9' ù alt-0249 */
        Result.add(car);
        /* '\u00FA' ú alt-0250 */
        Result.add(car);
        /* '\u00FB' û alt-0251 */
        Result.add(car);
        /* '\u00FC' ü alt-0252 */
        Result.add(car);
        car = new java.lang.String("y");
        /* '\u00FD' ý alt-0253 */
        Result.add(car);
        car = new java.lang.String("þ");
        /* '\u00FE' þ alt-0254 */
        Result.add(car);
        car = new java.lang.String("y");
        /* '\u00FF' ÿ alt-0255 */
        Result.add(car);
        /* '\u00FF' alt-0255 */
        Result.add(car);

        return Result;
    }

    /**
     * Transforme une chaine pouvant contenir des accents dans une version sans
     * accent
     *
     * @param chaine Chaine a convertir sans accent
     * @return Chaine dont les accents ont été supprimé
     *
     */
    public static java.lang.String sansAccent(java.lang.String chaine) {
        /* Result Buffer */
        java.lang.StringBuffer Result = new StringBuffer(chaine);
        /* For loop to go through all results */
        for (int bcl = 0; bcl < Result.length(); bcl++) {
            int carVal = chaine.charAt(bcl);
            if (carVal >= MIN && carVal <= MAX) { 
                /* Remplacement*/
                java.lang.String newVal = (java.lang.String) map.get(carVal - MIN);
                Result.replace(bcl, bcl + 1, newVal);
            }
        }
        /* Return of result */
        return Result.toString();
    }
    
    /** @param String chaine : the string we want to test 
     */
    public static boolean isInt(String chaine) {
        boolean valeur = true;
        /* Transformation en CharArray */
        char[] tab = chaine.toCharArray();
        /* Parcours de la chaine */
        for (char carac : tab) {
            if (!Character.isDigit(carac) && valeur) {
                valeur = false;
            }
        }
        /* Renvoi du resultat */
        return valeur;
    }
}