import java.util.ArrayList;
import java.util.ListIterator;

public class Urbanizacion {

    Vivienda[][] U;
    public void Urbanizacion(int filas,int columnas){
        U=new Vivienda[filas][columnas];

    }
    public void añadirAdosado(Adosado a1){
        boolean salir=false;
        for (int i=0;i<1;i++){
            for(int e=0;e<U[1].length;e++){
               if(U[i][e]==null){
               U[i][e]=a1;
               salir=true;break;}
            }
            if (salir==true) break;
        }
    }
    public void añadirEdificio(Edificio e1){
        boolean salir=false;
        for (int i=2;i<U.length;i++){
            for(int e=0;e<U[1].length;e++){
                if(U[i][e]==null){
                    U[i][e]=e1;
                    salir=true;break;}
            }
            if (salir==true) break;
        }
    }

    //las excepciones son de tipo checked
    public void añadeVivienda(Vivienda v, int i, int j) throws lugarIncorrectoException, ViviendaYaExisteException{

    }

    }

    //la excepción será de tipo unchecked
    public void eliminaVivienda(Vivienda v) throws NoExisteViviendaException{

    }

    }




}
