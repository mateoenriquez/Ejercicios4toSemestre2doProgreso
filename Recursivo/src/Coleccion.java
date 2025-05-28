import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private List<Transformer> lista;

    public Coleccion() {
        lista=new ArrayList<>();
    }

    public void agregar(Transformer dato){
        lista.add(dato);
    }

    public String listar(){
        StringBuilder sb=new StringBuilder();
        for (Transformer t:lista){
            sb.append(t.toString()+"\n");
        }
        return sb.toString();
    }

    public float sumar(int indice){
        if(indice==lista.size())
            return 0;
        else
            return sumar(indice+1)+lista.get(indice).getPoder();
    }

}
