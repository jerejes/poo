package semana_3;
public class Curso {
public String nomCur;
public Double costo;
public String tipo;
public int ciclo ;
public String modali;

public static  int totalMatri ;
public Curso (String nom , double cos , String tip , String mod , int cic ) {
    nomCur = nom ; 
    costo = cos;
    tipo = tip;
    modali = mod ;
    ciclo = cic;
    totalMatri ++ ; 
}
public double calpago (){
    return costo ; 
}
public double calpago (double desc){
    return costo - desc ; 
}

public static int obtenerToReg (){
    return totalMatri;
}
public static class Alumno 
{
    public String nomAlum ; 
    public Alumno (String alum)
    {
        nomAlum = alum;
    }
}
public Object [] registrar (int num , String alumno )
{
    Object [] fila = {num,nomCur,tipo,modali,ciclo, alumno,costo} ; 
    return fila;
    string a ="da";
}

}
