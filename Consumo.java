package boletin5;

public class Consumo {
    
    private double km;
    private float litros;
    private float vMedia;
    private float pGas;
    //private float tempo;
    
    
    public Consumo(){
        
    }
    
    public Consumo(double a, float b, float c, float d){
        km = a;
        litros = b;
        vMedia = c;
        pGas = d;
    }
    
    /*public void SetTempo(float a){
        tempo = a;
    }
    
    //En caso de que el tempo fuera una varaible como se sobreentiende en el ejercicio
    
    public float GetTempo(){
        return tempo;
    }*/
    
    public double Tempo(){
      double tempo = km*vMedia;
      return tempo;
    }
    
    public void SetLitros(float a){
        litros = a;
    }
    
    public float GetLitros(){
        return litros;
    }
    
    public void SetKm(double a){
        km = a;
    }
    
    public double GetKm(){
        return km;
    }
    
    public void SetvMedia(float a){
        vMedia = a;
    }
    
    public float GetvMedia(){
        return vMedia;
    }
    
    public void SetpGas(float a){
        pGas = a;
    }
    
    public float GetpGas(){
        return pGas;
    }
    
    
    public double consumoMedio(double a, float b){
        km = a;
        litros = b;
        
        double total = (litros*100)/km;
        
        return total;
    }
    
    
    public double consumoEuros(double a, float b){
        km = a;
        pGas = b;
        
        double total = (km*100)/pGas;
        return total;
    }
    
}
