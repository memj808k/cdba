package mx.gob.bcs.dao;

/**
 *
 * @author Charles.rembao
 */
public abstract class Urleables {
    
    
    private static final String CDBA_USER         = "cdba"; 
    private static final String CDBA_PASS        = "cdba";
    private static final String CDBA_IP          = "3.5.1.8";
    private static final String CDBA_DATASOURCE  = "choya01";
    private static final String CDBA_PORT        = "3306";

    public static String getCDBA_USER() {
        return CDBA_USER;
    }

    public static String getCDBA_PASS() {
        return CDBA_PASS;
    }

    public static String getCDBA_IP() {
        return CDBA_IP;
    }

    public static String getCDBA_DATASOURCE() {
        return CDBA_DATASOURCE;
    }

    public static String getCDBA_PORT() {
        return CDBA_PORT;
    }
    
    

    

    
    
    
    
    
    
    
    
}
