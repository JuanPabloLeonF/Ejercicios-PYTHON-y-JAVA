import java.util.Scanner;
public class peso {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido usuario, si desea conocer si actualmente se encuentra con sobrepeso, ingrese su altura y su peso a continuación: ");
        Scanner x1 = new Scanner(System.in);
        Integer n1 = x1.nextInt();
        try{
            if(n1 < 10){
             }
                else{
                    return; 
                }
                
           
            }catch (Exception ex){
            System.out.println("Por favor, ingrese denuevo los datos");
        }
            finally{
                System.out.println("Escribiste bien los datos");
            }
            
        

    }
}
