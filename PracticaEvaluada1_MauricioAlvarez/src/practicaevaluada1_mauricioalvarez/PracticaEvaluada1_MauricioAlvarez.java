package practicaevaluada1_mauricioalvarez;

import javax.swing.JOptionPane;
public class PracticaEvaluada1_MauricioAlvarez {
    
    public static void main(String[] args) {
    int employee=0;
    //Variable  Salario
    float wage=0;
    float pagoCaja=0;
    float segEnfermedad=0;
    float invalidez=0;
    
    
    
    //Cantidad de empleados
    employee=Integer.parseInt(JOptionPane.showInputDialog("Cuantos empleados son? "));
    
    //Bucle empleados
        for (int i = 0; i < employee; i++) {
            wage+=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el salario del empleado "+(i+1)));
            
        }
    //Monto a pagar 9.25% Seguro Maternidad y Enfermedad
        segEnfermedad=(float) ((wage*9.25)/100);
     
    //Monto a pagar 5.08% Invalidez vegez y muerte
        invalidez=(float) ((wage*5.08)/100);
                
    //Sumar cantidades a pagar
        pagoCaja=segEnfermedad+invalidez;
    //Print del monto a pagar
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de "+ pagoCaja+" Por concepto de SEM Y IVM");
   
}
    
}
