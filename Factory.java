//Clase:Factory.java
//Clase factory que permite escoger entre las diferentes implementaciones
//Hecho por: Ana Fernanda Solares, 13125 y Jose Rosales 12576
//***************************************************************
import java.util.*;

public class Factory<E>{
    public Set<E> getSet(int implementado){
        if(implementado==1){
            return new HashSet<E>(); //regresa HashSet
        }else if(implementado==2){
            return new TreeSet<E>(); //regresa TreeSet
        }else if(implementado==3){
            return new LinkedHashSet<E>(); //regresa LinkedHashSet
        }else{
            return null;
        }
    }
}
