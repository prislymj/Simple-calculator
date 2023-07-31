import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{

    boolean isOperatorClicked=false;

    JFrame frame;
    JLabel displayLabel;
    JButton clrButton,dotButton, equalsButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton, zeroButton, plusButton, minButton, divButton, mulButton;
    String oldValue;
    char selectedOperator;
    public Calculator(){
        frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setLocation(200, 200);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel = new JLabel();
        displayLabel.setBounds(10, 10, 260, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        
        sevenButton=new JButton("7", null);
        sevenButton.setBounds(10, 60, 50, 50);
        frame.add(sevenButton);
        sevenButton.addActionListener(this);
        
        eightButton=new JButton("8", null);
        eightButton.setBounds(70, 60, 50, 50);
        frame.add(eightButton);
        eightButton.addActionListener(this);

        nineButton=new JButton("9", null);
        nineButton.setBounds(130, 60, 50, 50);
        frame.add(nineButton);
        nineButton.addActionListener(this);

        divButton=new JButton("/", null);
        divButton.setBounds(190, 60, 50, 50);
        frame.add(divButton);
        divButton.addActionListener(this);

        fourButton=new JButton("4", null);
        fourButton.setBounds(10, 120, 50, 50);
        frame.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton=new JButton("5", null);
        fiveButton.setBounds(70, 120, 50, 50);
        frame.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton=new JButton("6", null);
        sixButton.setBounds(130, 120, 50, 50);
        frame.add(sixButton);
        sixButton.addActionListener(this);

        mulButton=new JButton("*", null);
        mulButton.setBounds(190, 120, 50, 50);
        frame.add(mulButton);
        mulButton.addActionListener(this);

        oneButton=new JButton("1", null);
        oneButton.setBounds(10, 180, 50, 50);
        frame.add(oneButton);
        oneButton.addActionListener(this);

        twoButton=new JButton("2", null);
        twoButton.setBounds(70, 180, 50, 50);
        frame.add(twoButton);
        twoButton.addActionListener(this);

        threeButton=new JButton("3", null);
        threeButton.setBounds(130, 180, 50, 50);
        frame.add(threeButton);
        threeButton.addActionListener(this);

        minButton=new JButton("-", null);
        minButton.setBounds(190, 180, 50, 50);
        frame.add(minButton);
        minButton.addActionListener(this);

        dotButton=new JButton(".", null);
        dotButton.setBounds(10, 240, 50, 50);
        frame.add(dotButton);
        dotButton.addActionListener(this);

        zeroButton=new JButton("0", null);
        zeroButton.setBounds(70, 240, 50, 50);
        frame.add(zeroButton);
        zeroButton.addActionListener(this);

        equalsButton=new JButton("=", null);
        equalsButton.setBounds(130, 240, 50, 50);
        frame.add(equalsButton);
        equalsButton.addActionListener(this);

        plusButton=new JButton("+", null);
        plusButton.setBounds(190, 240, 50, 50);
        frame.add(plusButton);
        plusButton.addActionListener(this);

        clrButton=new JButton("C", null);
        clrButton.setBounds(10, 300, 240, 50);
        frame.add(clrButton);
        clrButton.addActionListener(this);

        frame.add(displayLabel);
    }
    public static void main(String[] args){
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action performed: " + e.getActionCommand());
        if(e.getSource()==zeroButton)
        {
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }
            else
                displayLabel.setText(displayLabel.getText()+"0");
        }
        else if(e.getSource()==oneButton)
        {
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }
            else
            displayLabel.setText(displayLabel.getText()+"1");
        }
        else if(e.getSource()==twoButton)
        {
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }
            else
            displayLabel.setText(displayLabel.getText()+"2");
        }
        else if(e.getSource()==threeButton)
        {
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }
            else
            displayLabel.setText(displayLabel.getText()+"3");
        }
        else if(e.getSource()==fourButton)
        {
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }
            else
                displayLabel.setText(displayLabel.getText()+"4");
        }
        else if(e.getSource()==fiveButton)
        {
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }
            else
            displayLabel.setText(displayLabel.getText()+"5");
        }
        else if(e.getSource()==sixButton)
        {
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }
            else
            displayLabel.setText(displayLabel.getText()+"6");
        }
        else if(e.getSource()==sevenButton)
        {
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }
            else
            displayLabel.setText(displayLabel.getText()+"7");
        }
        else if(e.getSource()==eightButton)
        {
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }
            else
            displayLabel.setText(displayLabel.getText()+"8");
        }
        else if(e.getSource()==nineButton)
        {
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }
            else
            displayLabel.setText(displayLabel.getText()+"9");
        }
        else if(e.getSource()==dotButton)
        {
            displayLabel.setText(displayLabel.getText()+".");
        }
        else if(e.getSource()==clrButton)
        {
            displayLabel.setText("");
            isOperatorClicked=false;
        }
        else if(e.getSource()==plusButton){
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            selectedOperator = '+';
        }
        else if(e.getSource()==minButton){
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            selectedOperator = '-';
        }
        else if(e.getSource()==mulButton){
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            selectedOperator = '*';
        }
        else if(e.getSource()==divButton){
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            selectedOperator = '/';
        }

        else if (e.getSource() == equalsButton) {
            String newValue = displayLabel.getText();
            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);
            float result = 0;
    
                switch (selectedOperator) {
                    case '+':
                        result = oldValueF + newValueF;
                        break;
                    case '-':
                        result = oldValueF - newValueF;
                        break;
                    case '*':
                        result = oldValueF * newValueF;
                        break;
                    case '/':
                        result = oldValueF / newValueF;
                        break;
                }
                displayLabel.setText(result + "");
                isOperatorClicked = false;
                selectedOperator = ' '; // Reset the selected operator for the next calculation
            }
            
            else{
                System.out.println("No operator clicked");
            }
        }     
    }
    
