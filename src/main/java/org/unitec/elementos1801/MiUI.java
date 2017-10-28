
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos1801;


import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author T-107
 */
@SpringUI
@Theme("valo")
public class MiUI extends UI{

    @Autowired RepositorioMensajito repoMensa;
    
    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout=new VerticalLayout();
        
        //Generamos una etiqueta
        Label etiqueta = new Label("Aplicación por mensajes");
        etiqueta.addStyleName(ValoTheme.LABEL_H1);
        
        Label guardar = new Label("");
        guardar.addStyleName(ValoTheme.LABEL_H2);
        
        TextField textoTitulo= new TextField();
        
        //Placeholder
        textoTitulo.setPlaceholder("Mensajito");
        TextArea textoCuerpo=new TextArea();
        textoCuerpo.setPlaceholder("Escribe cuerpo de mensaje");
        Button boton=new Button("Guardar mensaje");
        boton.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        
        //Manejamos el evento boton
        boton.addClickListener(eventoSalvar->{
            
            if(textoCuerpo.getValue().equals("")&&textoTitulo.getValue().equals("")){
                Notification.show("Campos necesarios!!!!",Notification.Type.ERROR_MESSAGE);
            }
            repoMensa.save(new Mensajito(textoTitulo.getValue(), textoCuerpo.getValue()));
            Notification.show("Mensaje guardado",Notification.Type.HUMANIZED_MESSAGE);
            
/*
             Grid<Mensajito> grid = new Grid<>();
        grid.setItems((List)repoMensa.findAll());  //Casting a ArrayList
        grid.addColumn(Mensajito::getId).setCaption("ID del mensaje");
        grid.addColumn(Mensajito::getTitulo).setCaption("Título: ");
        grid.addColumn(Mensajito::getCuerpo).setCaption("Mensaje: ");

        layout.removeAllComponents(); 
        
        layout.addComponent(etiqueta);
        layout.addComponent(guardar);
        layout.addComponent(textoTitulo);
        layout.addComponent(textoCuerpo);
        layout.addComponent(boton);
        layout.addComponent(grid);
        setContent(layout);
*/
            });
        
        
        
         Grid<Mensajito> grid = new Grid<>();
        grid.setItems((List)repoMensa.findAll());  //Casting a ArrayList
        grid.addColumn(Mensajito::getId).setCaption("ID del mensaje");
        grid.addColumn(Mensajito::getTitulo).setCaption("Título: ");
        grid.addColumn(Mensajito::getCuerpo).setCaption("Mensaje: ");
        
        

        
        layout.addComponent(etiqueta);
        layout.addComponent(guardar);
        layout.addComponent(textoTitulo);
        layout.addComponent(textoCuerpo);
        layout.addComponent(boton);
        layout.addComponent(grid);
        
        //Primero creamos un horizontal layout
        HorizontalLayout layoutH = new HorizontalLayout();
        TextField textoId = new  TextField();
        textoId.setPlaceholder("Introduce el ID");;
        Button botonID = new Button("Buscar");
        botonID.addStyleName(ValoTheme.BUTTON_PRIMARY);
        
   
        
        layoutH.addComponent(textoId);
        layoutH.addComponent(botonID);
        layout.addComponent(layoutH);
        
        
        //Creasmos otro layout paara los campos de texto de edición
        HorizontalLayout layoutH2=new HorizontalLayout();
        TextField textoBuscarID=new TextField();
        TextField textoBuscarTitulo=new TextField();
        TextArea textoBuscarCuerpo=new TextArea();
        layoutH2.addComponent(textoBuscarID);
        layoutH2.addComponent(textoBuscarTitulo);
        layoutH2.addComponent(textoBuscarCuerpo);
        layout.addComponent(layoutH2);
        
        Button botonActualizar=new Button("Actualizar");
        botonActualizar.addStyleName(ValoTheme.BUTTON_HUGE);
        layout.addComponent(botonActualizar);
        
        
        
        
        
        setContent(layout);
        
             //buscar por id
        botonID.addClickListener(evento->{
            Mensajito mensa = repoMensa.findOne(Integer.parseInt(textoId.getValue()));
            //Ajustamos los 3 campos de datos
            //Primero el ID
            textoBuscarID.setValue(""+ mensa.getId());
            
            textoBuscarTitulo.setValue(""+mensa.getTitulo());
            textoBuscarCuerpo.setValue(""+mensa.getCuerpo());
            
            
            
        });
        
        
        
        
    }//cierre init
    
    
    
}//ciere de clase
