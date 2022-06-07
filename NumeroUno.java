import javax.swing.*;
import java.awt.event.*;

public class NumeroUno extends JFrame implements ActionListener{
    private JTextField textfield1;
    private JButton btn_0, btn_1, btn_2, btn_3,btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
     private JButton btn_suma, btn_igual, btn_limpiar;
    String valor1="";
int result;

    public NumeroUno(){
        setLayout(null);

         btn_0 = new JButton("0");         
         btn_0.setBounds(20,260,50,50);        
         add(btn_0);
         btn_0.addActionListener(this);

         btn_1 = new JButton("1");         
         btn_1.setBounds(20,200,50,50);        
         add(btn_1);
         btn_1.addActionListener(this);

         btn_2 = new JButton("2");   
         btn_2.setBounds(80,200,50,50);              
         add(btn_2);
         btn_2.addActionListener(this);

         btn_3 = new JButton("3");         
         btn_3.setBounds(140,200,50,50);              
         add(btn_3);
         btn_3.addActionListener(this);

         btn_4 = new JButton("4");         
         btn_4.setBounds(20,140,50,50);        
         add(btn_4);
         btn_4.addActionListener(this);

         btn_5 = new JButton("5");   
         btn_5.setBounds(80,140,50,50);              
         add(btn_5);
         btn_5.addActionListener(this);

         btn_6 = new JButton("6");         
         btn_6.setBounds(140,140,50,50);              
         add(btn_6);
         btn_6.addActionListener(this);

         btn_7 = new JButton("7");         
         btn_7.setBounds(20,80,50,50);        
         add(btn_7);
         btn_7.addActionListener(this);

         btn_8 = new JButton("8");   
         btn_8.setBounds(80,80,50,50);              
         add(btn_8);
         btn_8.addActionListener(this);

         btn_9 = new JButton("9");         
         btn_9.setBounds(140,80,50,50);              
         add(btn_9);
         btn_9.addActionListener(this);
            
         textfield1 = new JTextField();
         textfield1.setBounds(20,20,200,30);
         add(textfield1);

         btn_suma = new JButton("+");         
         btn_suma.setBounds(200,200,50,50);        
         add(btn_suma);
         btn_suma.addActionListener(this);

         btn_igual = new JButton("=");   
         btn_igual.setBounds(200,80,50,50);              
         add(btn_igual);
         btn_igual.addActionListener(this);

         btn_limpiar = new JButton("CE");         
         btn_limpiar.setBounds(200,260,50,50);              
         add(btn_limpiar);
         btn_limpiar.addActionListener(this);

    }//constructor

    public void actionPerformed(ActionEvent e){
        String resultado;
        int num1=0, num2=0;

        if(e.getSource()==btn_1){
          valor1 += "1";
          textfield1.setText(valor1);
        }//if1

        if(e.getSource()==btn_2){
           valor1 += "2";
           textfield1.setText(valor1);
        }//if2

        if(e.getSource()==btn_3){
           valor1 += "3";
           textfield1.setText(valor1);
        }//if3

        if(e.getSource()==btn_4){
          valor1 += "4";
          textfield1.setText(valor1);
        }//if4

        if(e.getSource()==btn_5){
           valor1 += "5";
           textfield1.setText(valor1);
        }//if5

        if(e.getSource()==btn_6){
           valor1 += "6";
           textfield1.setText(valor1);
        }//if6

        if(e.getSource()==btn_7){
          valor1 += "7";
          textfield1.setText(valor1);
        }//if7

        if(e.getSource()==btn_8){
           valor1 += "8";
           textfield1.setText(valor1);
        }//if8

        if(e.getSource()==btn_9){
          valor1 += "9";
          textfield1.setText(valor1);
        }//if9

        if(e.getSource()==btn_0){
           valor1 += "0";
           textfield1.setText(valor1);
        }//if0

        if(e.getSource()==btn_suma){
          num1=Integer.parseInt(textfield1.getText());
          valor1="";
          textfield1.setText("");
        }

        if(e.getSource()==btn_igual){    
          num2=Integer.parseInt(textfield1.getText());

          
          resultado=Integer.toString(num1 + num2);      
          textfield1.setText(resultado);
        }//ifigual

        if(e.getSource()==btn_limpiar){
          valor1="";
          resultado="";
          textfield1.setText("");
        }//iflimpiar

    }//evento

public static void main(String args[]){
    NumeroUno tresBotones = new NumeroUno();
    tresBotones.setBounds(0,0,540,550);
    tresBotones.setVisible(true);
    tresBotones.setResizable(false);
    tresBotones.setLocationRelativeTo(null);
    tresBotones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}//main

}//clase