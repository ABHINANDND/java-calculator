import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.*;

public class Calculator implements ActionListener{


    //global declaration 
    JFrame jf;
    JLabel DisplayLabel;

    //boolean 
   boolean isoperatorclicked = false;

   //for storing entered first number

   String oldvalue;

   //for storing entered second number

   String newvalue;
 
   
   //identify operator
    char operator;


    // declaration of buttons
    JButton SevenButton;
    JButton EIGHTButton;
    JButton NineButton;
    JButton OneButton;
    JButton TwoButton;
    JButton ThreeButton;
    JButton FourButton;
    JButton FiveButton;
    JButton SixButton;
    JButton DotButton;
    JButton EqualButton;
    JButton ZeroButton;
    JButton DivideButton;
    JButton SubstractionButton;
    JButton MultiplyButton;
    JButton AdditionButton;
    JButton ClearButton;

    
    public Calculator(){
        jf=new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(410, 125);

        DisplayLabel = new JLabel();
        DisplayLabel.setBounds(25, 25, 540, 70);
        DisplayLabel.setFont(new Font("BW Seido", Font.PLAIN, 40));
        DisplayLabel.setBackground(Color.DARK_GRAY);
        DisplayLabel.setOpaque(true);
        jf.add(DisplayLabel);
        DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayLabel.setForeground(Color.WHITE);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//buttons

    SevenButton=new JButton("7");
    SevenButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    SevenButton.setBounds(30, 130, 80, 80);
    SevenButton.addActionListener(this);
    jf.add(SevenButton);

    EIGHTButton=new JButton("8");
    EIGHTButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    EIGHTButton.setBounds(130, 130, 80, 80);
    EIGHTButton.addActionListener(this);
    jf.add(EIGHTButton);

    NineButton=new JButton("9");
    NineButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    NineButton.setBounds(230, 130, 80, 80);
    NineButton.addActionListener(this);
    jf.add( NineButton);


    
    FourButton=new JButton("4");
    FourButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    FourButton.setBounds(30, 230, 80, 80);
    FourButton.addActionListener(this);
    jf.add(FourButton);

    FiveButton=new JButton("5");
    FiveButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    FiveButton.setBounds(130, 230, 80, 80);
    FiveButton.addActionListener(this);
    jf.add(FiveButton);

     SixButton=new JButton("6");
    SixButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    SixButton.setBounds(230, 230, 80, 80);
    SixButton.addActionListener(this);
    jf.add(SixButton);


    


     
     OneButton=new JButton("1");
    OneButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    OneButton.setBounds(30, 330, 80, 80);
    OneButton.addActionListener(this);
    jf.add(OneButton);

    TwoButton=new JButton("2");
    TwoButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    TwoButton.setBounds(130, 330, 80, 80);
    TwoButton.addActionListener(this);
    jf.add(TwoButton);

     ThreeButton=new JButton("3");
    ThreeButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    ThreeButton.setBounds(230, 330, 80, 80);
    ThreeButton.addActionListener(this);
    jf.add(ThreeButton);


    DotButton=new JButton(".");
    DotButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    DotButton.setBounds(30, 430, 80, 80);
    DotButton.addActionListener(this);
    jf.add(DotButton);

     ZeroButton=new JButton("0");
    ZeroButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    ZeroButton.setBounds(130, 430, 80, 80);
    ZeroButton.addActionListener(this);
    jf.add(ZeroButton);

     EqualButton=new JButton("=");
    EqualButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    EqualButton.setBounds(230, 430, 80, 80);
    EqualButton.addActionListener(this);
    jf.add(EqualButton);



     DivideButton=new JButton("/");
    DivideButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
     DivideButton.setBounds(330, 130, 80, 80);
     DivideButton.addActionListener(this);
    jf.add(DivideButton);

    
    MultiplyButton=new JButton("X");
    MultiplyButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    MultiplyButton.setBounds(330, 230, 80, 80);
    MultiplyButton.addActionListener(this);
    jf.add(MultiplyButton);

  
    SubstractionButton=new JButton("-");
    SubstractionButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    SubstractionButton.setBounds(330, 330, 80, 80);
    SubstractionButton.addActionListener(this);
    jf.add(SubstractionButton);

    AdditionButton=new JButton("+");
    AdditionButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    AdditionButton.setBounds(330, 430, 80, 80);
    AdditionButton.addActionListener(this);
    jf.add(AdditionButton);

    //clear button

    ClearButton=new JButton("C");
    ClearButton.setFont(new Font("BW Seido", Font.PLAIN, 30));
    ClearButton.setBounds(430, 430, 80, 80);
    ClearButton.addActionListener(this);
    jf.add(ClearButton);





    }
    //Main class
    public static void main(String[] args) {
        new Calculator();
    }
    //Action
      @Override
      public void actionPerformed(ActionEvent e) {
        if(e.getSource()==SevenButton){
            //isoperatorclicked==true
            if(isoperatorclicked){
                DisplayLabel.setText("7");
                isoperatorclicked=false;
            }
            else{
                DisplayLabel.setText(DisplayLabel.getText()+"7");
            }
       
        }

        else if(e.getSource()==EIGHTButton){
            if(isoperatorclicked){
                DisplayLabel.setText("8");
                isoperatorclicked=false;
            }
            else{
                DisplayLabel.setText(DisplayLabel.getText()+"8");
            }

        }

        else if(e.getSource()==NineButton){
            if(isoperatorclicked){
                DisplayLabel.setText("9");
                isoperatorclicked=false;
            }
            else{
                DisplayLabel.setText(DisplayLabel.getText()+"9");
            }
        }

        
        else if(e.getSource()==FourButton){
            if(isoperatorclicked){
                DisplayLabel.setText("4");
                isoperatorclicked=false;
            }
            else{
                DisplayLabel.setText(DisplayLabel.getText()+"4");
            }
            }

            
        else if(e.getSource()==FiveButton){
            if(isoperatorclicked){
                DisplayLabel.setText("5");
                isoperatorclicked=false;
            }
            else{
                DisplayLabel.setText(DisplayLabel.getText()+"5");
            }
            }
    
            
        else if(e.getSource()==SixButton){
            if(isoperatorclicked){
                DisplayLabel.setText("6");
                isoperatorclicked=false;
            }
            else{
                DisplayLabel.setText(DisplayLabel.getText()+"6");
            }
            }
            
            
        else if(e.getSource()==OneButton){
            if(isoperatorclicked){
                DisplayLabel.setText("1");
                isoperatorclicked=false;
            }
            else{
                DisplayLabel.setText(DisplayLabel.getText()+"1");
            }
            }

            
        else if(e.getSource()==TwoButton){
            if(isoperatorclicked){
                DisplayLabel.setText("2");
                isoperatorclicked=false;
            }
            else{
                DisplayLabel.setText(DisplayLabel.getText()+"2");
            }
            }

            
        else if(e.getSource()==ThreeButton){
            if(isoperatorclicked){
                DisplayLabel.setText("3");
                isoperatorclicked=false;
            }
            else{
                DisplayLabel.setText(DisplayLabel.getText()+"3");
            }
            }

        else if(e.getSource()==DotButton){
            DisplayLabel.setText(DisplayLabel.getText()+".");
            }

        else if(e.getSource()==ZeroButton){
            if(isoperatorclicked){
                DisplayLabel.setText("0");
                isoperatorclicked=false;
            }
            else{
                DisplayLabel.setText(DisplayLabel.getText()+"0");
            }
            }

        else if(e.getSource()==EqualButton){
            switch(operator){
                case '/':
                newvalue=DisplayLabel.getText();
                //changing value to float value
                float oldvalueF=Float.parseFloat(oldvalue);
                float newvalueF=Float.parseFloat(newvalue);
                float result=oldvalueF/newvalueF;
                DisplayLabel.setText(result+"");//"" is for change to float to string
                break;

                case 'X':
                newvalue=DisplayLabel.getText();
                //changing value to float value
                float oldvalueF1=Float.parseFloat(oldvalue);
                float newvalueF1=Float.parseFloat(newvalue);
                float result1=oldvalueF1*newvalueF1;
                DisplayLabel.setText(result1+"");
                break;

                case '-':

                newvalue=DisplayLabel.getText();
                //changing value to float value
                float oldvalueF2=Float.parseFloat(oldvalue);
                float newvalueF2=Float.parseFloat(newvalue);
                float result2=oldvalueF2-newvalueF2;
                DisplayLabel.setText(result2+"");
                break;

                case '+':
                newvalue=DisplayLabel.getText();
                //changing value to float value
                float oldvalueF3=Float.parseFloat(oldvalue);
                float newvalueF3=Float.parseFloat(newvalue);
                float result3=oldvalueF3+newvalueF3;
                DisplayLabel.setText(result3+"");
                break;
  
            }
             
                }
            
        else if(e.getSource()==DivideButton){
            operator='/';
            isoperatorclicked=true;
            oldvalue=DisplayLabel.getText();   
            }

        else if(e.getSource()==MultiplyButton){
            operator='X';
            isoperatorclicked=true;
            oldvalue=DisplayLabel.getText();  
                
            }

        else if(e.getSource()==SubstractionButton){
            operator='-';
            isoperatorclicked=true;
            oldvalue=DisplayLabel.getText();  
            }
    

        else if(e.getSource()==AdditionButton){
             operator='+';
            isoperatorclicked=true;
            oldvalue=DisplayLabel.getText();  
            }

        else if(e.getSource()==ClearButton){

            DisplayLabel.setText("");
        }





    
    
    
    
    
       
        
      }
}
