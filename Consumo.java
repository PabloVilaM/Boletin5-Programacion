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
       
        
        double total = consumoMedio(km,this.litros)*pGas;
        return total;
    }
    
    //Se puede hacer de varias maneras los 2 últimos métodos. En este caso pido directamenter las variables por si se usa el constructor vacio para ahorrarse usar los sets. 
    //En caso de no pedir nada como en clase habría que utilizar los sets para ponerle el valor a las variables. Tambien se podria usar getters para sacar las variables en la otra clase y utilizarlas a partir de ahi.
    
    // (Nota aclaratoria para cuando revise esto) No es mala idea hacerlo de esta manera, pero el constructor vacio normalmente se usa para acceder a la clase y utilizar los metodos internos, no para darle valores posteiores con el set
    // Es decir, esta bien el metodo de utilizar este metodo pero es mas óptimo el otro, dado que si creas un coche con unos atributos y tienes que volver a darle los atributos no es ni lo mas optimo ni lo mas comodo.
}
