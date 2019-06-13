
package controlador;

import entidades.Ciudad;
import facade.CiudadFacade;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Jcarlos
 */
@Named(value = "ciudadControlador")
@Dependent
public class ciudadControlador {

    /**
     * Creates a new instance of ciudadControlador
     */
    public ciudadControlador() {
    }
    @EJB
    CiudadFacade ciudadFacade;

    Ciudad ciudad=new Ciudad();

    @PostConstruct
    public void init() {
        ciudad = new Ciudad();
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void registrar(){
        ciudadFacade.create(ciudad);
    } 
    public void eliminar(Ciudad ciudad) {
        
        this.ciudad = ciudad;
        ciudadFacade.remove(ciudad);
     
    }
    public List<Ciudad> consultarTodos(){
        return ciudadFacade.findAll();
    }
    public String preEditar(Ciudad ciudad){
        this.ciudad= ciudad;
        return "actualizar";
    }
    public String editar(){
        ciudadFacade.edit(ciudad);
        return "lista";
        
    }
}
