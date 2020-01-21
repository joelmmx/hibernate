package mx.ine.hibernate;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting class!" );
        TipoCalleDAO tipoCalleDAO = new TipoCalleDAO();
        List<TipoCalle> calles = tipoCalleDAO.getCalles();
        calles.forEach(System.out::println);
        
    }
}
