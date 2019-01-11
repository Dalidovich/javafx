package sample.Control;
import java.io.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class Controller {
    @FXML
    private TextField display;
    public void aEqually(){
        String oneNamber="";
        String twoNamber;
        String itog;
        double doubleOneNamber;
        double doubleTwoNamber;
        double doubleItog;
        String displayText= display.getText();
        if (displayText.indexOf("+")!=-1) {
        oneNamber=displayText.substring(0,displayText.indexOf("+"));
        twoNamber=displayText.substring(displayText.indexOf("+")+1,displayText.length());
        doubleOneNamber=Double.parseDouble(oneNamber);
        doubleTwoNamber=Double.parseDouble(twoNamber);
        doubleItog=doubleOneNamber+doubleTwoNamber;
        itog=Double.toString(doubleItog);
        display.setText(itog);
        }
        else if ((displayText.indexOf("-")!=-1)){
            oneNamber=displayText.substring(0,displayText.indexOf("-"));
            twoNamber=displayText.substring(displayText.indexOf("-")+1,displayText.length());
            doubleOneNamber=Double.parseDouble(oneNamber);
            doubleTwoNamber=Double.parseDouble(twoNamber);
            doubleItog=doubleOneNamber-doubleTwoNamber;
            itog=Double.toString(doubleItog);
            display.setText(itog);
        }
        else if (displayText.indexOf("*")!=-1){
            oneNamber=displayText.substring(0,displayText.indexOf("*"));
            twoNamber=displayText.substring(displayText.indexOf("*")+1,displayText.length());
            doubleOneNamber=Double.parseDouble(oneNamber);
            doubleTwoNamber=Double.parseDouble(twoNamber);
            doubleItog=doubleOneNamber*doubleTwoNamber;
            itog=Double.toString(doubleItog);
            display.setText(itog);
        }
        else if (displayText.indexOf("/")!=-1){
            oneNamber=displayText.substring(0,displayText.indexOf("/"));
            twoNamber=displayText.substring(displayText.indexOf("/")+1,displayText.length());
            doubleOneNamber=Double.parseDouble(oneNamber);
            doubleTwoNamber=Double.parseDouble(twoNamber);
            doubleItog=doubleOneNamber/doubleTwoNamber;
            itog=Double.toString(doubleItog);
            display.setText(itog);
        }
    }
    public void aCE(){
        display.setText("");
    }
    public void aTchK(){
        display.setText(display.getText()+".");
    }
    public void aPlus(){
        display.setText(display.getText()+"+");
    }
    public void aMinus(){
        display.setText(display.getText()+"-");
    }
    public void aShare(){
        display.setText(display.getText()+"/");
    }
    public void aMultiply(){
        display.setText(display.getText()+"*");
    }
    public void a1(){
        display.setText(display.getText()+1);
    }
    public void a2(){
        display.setText(display.getText()+2);
    }
    public void a3(){
        display.setText(display.getText()+3);
    }
    public void a4(){
        display.setText(display.getText()+4);
    }
    public void a5(){
        display.setText(display.getText()+5);
    }
    public void a6(){
        display.setText(display.getText()+6);
    }
    public void a7(){
        display.setText(display.getText()+7);
    }
    public void a8(){
        display.setText(display.getText()+8);
    }
    public void a9(){
        display.setText(display.getText()+9);
    }
    public void a0(){
        display.setText(display.getText()+0);
    }

}
