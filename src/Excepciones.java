import javax.swing.JOptionPane;

public class Excepciones {

    public static void main(String[] args) {
        operacion();
    }
    public static void operacion(){
        int resul;
        try {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1re numero"));
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 2do numero"));
        if(num<10 ){

        resul=num/num1;
        JOptionPane.showMessageDialog(null,"Resultado: "+ resul);
        }
        else{
        JOptionPane.showMessageDialog(null,"El numero es mayor a 10");
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Ingreso letras: "+e);
        }
        catch(ArithmeticException ex){
        JOptionPane.showMessageDialog(null,"division por 0"+ ex.getMessage());
        }
    }
   
}

