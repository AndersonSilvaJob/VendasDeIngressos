public class VendaDeIngresso {

    private double desconto;
    private double valor_final;

     //SE FOR AFILIADO DESCONTO DE 60%1
    public double TipoAfiliado(double valor) {
         desconto = (60 * valor) / 100;
         valor_final = valor - desconto;   
        
        return valor_final;
    }
     //PARA ESTUDANTE DESCONTO DE 50%
     public double TipoEstudante(double valor) {
        desconto = (50 * valor) / 100;
        valor_final = valor - desconto;     
       return valor_final;
   }
     //PARA DEFICIENTE DESCONTO DE 70%
     public double TipoDeficiente(double valor) {
        desconto = (70 * valor) / 100;
        valor_final = valor - desconto;     
       return valor_final;
   }
     //SE FOR PUBLICO GERAL NÃO POSSUI DESCONTO 
     public double TipoGeral(double valor) {
        valor_final = valor;
       return valor_final;
   }
      public double Tipom(double valor) {
        valor_final = valor;
       return valor_final;
   }
}