/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/mensajito") //Identifica la clase para mapeo para servicio web, es un URI.
@CrossOrigin //Permite el paso de información nentre servidores
public class ControladorMensajes {
    
    @Autowired RepositorioMensajito repoMensa;
    //A continuación van las operaciones básicas con la entidad del mensaje
    @RequestMapping(value="/{id}", //Se indica que se hará la uri con el id
            method = RequestMethod.GET, //Request
            headers = {"Accept=application/json"}) //Se da ebncabezado tipo json
    public Mensajito obtenerMensajito(@PathVariable Integer id)throws Exception{ //se da el id al uri (path) el mismo
        return repoMensa.findOne(id); //al regresar el valor, el controlador transforma el objeto java a json-
    }
}
