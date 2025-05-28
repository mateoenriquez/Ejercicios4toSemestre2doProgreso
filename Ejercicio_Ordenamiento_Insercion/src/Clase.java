import java.util.ArrayList;
import java.util.List;

public class Clase {
    private List<Estudiante> lista = new ArrayList<>();

    public void agregarEstudiante(Estudiante e){
        lista.add(e);
    }

    public void ordenarPorNota(){ //esto en si el tema que nos toco..jajaj
        for (int i = 1; i < lista.size(); i++){
            Estudiante actual = lista.get(i);
            int j = i-1;
            while (j >= 0 && lista.get(j).getNota() > actual.getNota()){
                lista.set(j+1, lista.get(j));
                j--;
            }
            lista.set(j+1, actual);
        }
    }

    public String listar(){
        StringBuilder sb = new StringBuilder();
        for (Estudiante e: lista){
            sb.append(e.toString());
        }
        return sb.toString();
    }
}
