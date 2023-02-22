/**
 * Clase para manejar las entradas de un blog.
 * @author Alejandro Vicente Carpena
 * @since 22/02/2023
 * @version versión 2.3
 */
public class EntradaBlogAVC {
    
    /**
     *Separador es el carácter que separa ENTRADA DE del
     * nombre del autor
     */

    public static char separador=':';
    private int id;
    private String texto;
    private String autor;

    /**
     *
     * @param id Numero de la entrada
     * @param autor Nombre del autor
     * @param texto Texto de la entrada
     * @throws IllegalArgumentException Si el id es negativo lanza la excepcion
     */
    public EntradaBlogAVC(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     *Devuelve el número de la entrada
     * @return id
     */
    public int getId(){
        return this.id;
    }

    /**
     *Devuelve el texto completo de la entrada
     * @return texto
     */
    public String getTexto(){
        return this.texto;
    }

    /**
     *Devuelve el nombre del autor de la entrada en mayúsculas
     * @return autor
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     *Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     * @return autor
     */
    public String devuelveAutor(){
        return this.autor;
    }

    /**
     *No tierne porqué tener argumentos.
     * @param args
     */
    public static void main(String[] args) {
  
        EntradaBlogAVC e1=new EntradaBlogAVC (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}