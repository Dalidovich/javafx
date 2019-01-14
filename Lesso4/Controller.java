package sample.controller;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import java.awt.*;
public class Controller {
    @FXML
    private Label display;
    @FXML
    private Button r1c1;
    @FXML
    private Button r2c1;
    @FXML
    private Button r3c1;
    @FXML
    private Button r1c2;
    @FXML
    private Button r2c2;
    @FXML
    private Button r3c2;
    @FXML
    private Button r1c3;
    @FXML
    private Button r2c3;
    @FXML
    private Button r3c3;
    boolean score;



    public void combination_Opr(){
        String combination_O="OOO";
        String provPolX1=r1c1.getText()+r1c2.getText()+r1c3.getText();
        String provPolX2=r2c1.getText()+r2c2.getText()+r2c3.getText();
        String provPolX3=r3c1.getText()+r3c2.getText()+r3c3.getText();
        String provPolX4=r1c1.getText()+r2c1.getText()+r3c1.getText();
        String provPolX5=r1c2.getText()+r2c2.getText()+r3c2.getText();
        String provPolX6=r1c3.getText()+r2c3.getText()+r3c3.getText();
        String provPolX7=r1c1.getText()+r2c2.getText()+r3c3.getText();
        String provPolX8=r3c1.getText()+r2c2.getText()+r1c3.getText();
        if (combination_O   .equalsIgnoreCase(provPolX1)==true){
            returnGame();
            r2c2.setText("WIN");
            oWin();
        }
        else if (combination_O.equalsIgnoreCase(provPolX2)==true){
            returnGame();
            r2c2.setText("WIN");
            oWin();
        }
        else if (combination_O.equalsIgnoreCase(provPolX3)==true){
            returnGame();
            r2c2.setText("WIN");
            oWin();
        }
        else if (combination_O.equalsIgnoreCase(provPolX4)==true){
            returnGame();
            r2c2.setText("WIN");
            oWin();
        }
        else if (combination_O.equalsIgnoreCase(provPolX5)==true){
            returnGame();
            r2c2.setText("WIN");
            oWin();
        }
        else if (combination_O.equalsIgnoreCase(provPolX6)==true){
            returnGame();
            r2c2.setText("WIN");
            oWin();
        }
        else if (combination_O.equalsIgnoreCase(provPolX7)==true){
            returnGame();
            r2c2.setText("WIN");
            oWin();
        }
        else if (combination_O.equalsIgnoreCase(provPolX8)==true){
            returnGame();
            r2c2.setText("WIN");
            oWin();
        }
    }
    public void oWin(){
        r1c1.setText("O");
        r2c1.setText("O");
        r3c1.setText("O");
        r1c2.setText("O");
        r3c2.setText("O");
        r1c3.setText("O");
        r2c3.setText("O");
        r3c3.setText("O");
    }
    public void combination_Xpr(){
        String combination_X="XXX";
        String provPolX1=r1c1.getText()+r1c2.getText()+r1c3.getText();
        String provPolX2=r2c1.getText()+r2c2.getText()+r2c3.getText();
        String provPolX3=r3c1.getText()+r3c2.getText()+r3c3.getText();
        String provPolX4=r1c1.getText()+r2c1.getText()+r3c1.getText();
        String provPolX5=r1c2.getText()+r2c2.getText()+r3c2.getText();
        String provPolX6=r1c3.getText()+r2c3.getText()+r3c3.getText();
        String provPolX7=r1c1.getText()+r2c2.getText()+r3c3.getText();
        String provPolX8=r3c1.getText()+r2c2.getText()+r1c3.getText();
        if (combination_X.equalsIgnoreCase(provPolX1)==true){
            returnGame();
            r2c2.setText("WIN");
            xWin();
        }
        else if (combination_X.equalsIgnoreCase(provPolX2)==true){
            returnGame();
            r2c2.setText("WIN");
            xWin();
        }
        else if (combination_X.equalsIgnoreCase(provPolX3)==true){
            returnGame();
            r2c2.setText("WIN");
            xWin();
        }
        else if (combination_X.equalsIgnoreCase(provPolX4)==true){
            returnGame();
            r2c2.setText("WIN");
            xWin();
        }
        else if (combination_X.equalsIgnoreCase(provPolX5)==true){
            returnGame();
            r2c2.setText("WIN");
            xWin();
        }
        else if (combination_X.equalsIgnoreCase(provPolX6)==true){
            returnGame();
            r2c2.setText("WIN");
            xWin();
        }
        else if (combination_X.equalsIgnoreCase(provPolX7)==true){
            returnGame();
            r2c2.setText("WIN");
            xWin();
        }
        else if (combination_X.equalsIgnoreCase(provPolX8)==true){
            returnGame();
            r2c2.setText("WIN");
            xWin();
        }
        }
        public void xWin(){
            r1c1.setText("X");
            r2c1.setText("X");
            r3c1.setText("X");
            r1c2.setText("X");
            r3c2.setText("X");
            r1c3.setText("X");
            r2c3.setText("X");
            r3c3.setText("X");
        }
        public void returnGame(){
            r1c1.setText(" ");
            r2c1.setText(" ");
            r3c1.setText(" ");
            r1c2.setText(" ");
            r2c2.setText(" ");
            r3c2.setText(" ");
            r1c3.setText(" ");
            r2c3.setText(" ");
            r3c3.setText(" ");
            score=false;
        }
    public void clickR1c1() {
        System.out.println("r1c1");
        if ((r1c1.getText().isEmpty())&&(score==false)){
            r1c1.setText("X");
            combination_Xpr();
            score=true;
        }
        else if ((r1c1.getText().isEmpty())&&(score==true)){
            r1c1.setText("O");
            combination_Opr();
            score=false;
        }
    }
    public void clickR1c2(){
        System.out.println("r2c1");
        if ((r1c2.getText().isEmpty())&&(score==false)){
            r1c2.setText("X");
            combination_Xpr();
            score=true;
        }
        else if ((r1c2.getText().isEmpty())&&(score==true)){
            r1c2.setText("O");
            combination_Opr();
            score=false;
        }
    }
    public void clickR1c3(){
        System.out.println("r3c1");
        if ((r1c3.getText().isEmpty())&&(score==false)){
            r1c3.setText("X");
            combination_Xpr();
            score=true;
        }
        else if ((r1c3.getText().isEmpty())&&(score==true)){
            r1c3.setText("O");
            combination_Opr();
            score=false;
        }
    }
    public void clickR2c1(){
        System.out.println("r1c2");
        if ((r2c1.getText().isEmpty())&&(score==false)){
            r2c1.setText("X");
            combination_Xpr();
            score=true;
        }
        else if ((r2c1.getText().isEmpty())&&(score==true)){
            r2c1.setText("O");
            combination_Opr();
            score=false;
        }
    }
    public void clickR2c2(){
        System.out.println("r2c2");
        if ((r2c2.getText().isEmpty())&&(score==false)){
            r2c2.setText("X");
            combination_Xpr();
            score=true;
        }
        else if ((r2c2.getText().isEmpty())&&(score==true)){
            r2c2.setText("O");
            combination_Opr();
            score=false;
        }
    }
    public void clickR2c3(){
        System.out.println("r3c2");
        if ((r2c3.getText().isEmpty())&&(score==false)){
            r2c3.setText("X");
            combination_Xpr();
            score=true;
        }
        else if ((r2c3.getText().isEmpty())&&(score==true)){
            r2c3.setText("O");
            combination_Opr();
            score=false;
        }
    }
    public void clickR3c1(){
        System.out.println("r1c3");
        if ((r3c1.getText().isEmpty())&&(score==false)){
            r3c1.setText("X");
            combination_Xpr();
            score=true;
        }
        else if ((r3c1.getText().isEmpty())&&(score==true)){
            r3c1.setText("O");
            combination_Opr();
            score=false;
        }
    }
    public void clickR3c2(){
        System.out.println("r2c3");
        if ((r3c2.getText().isEmpty())&&(score==false)){
            r3c2.setText("X");
            combination_Xpr();
            score=true;
        }
        else if ((r3c2.getText().isEmpty())&&(score==true)){
            r3c2.setText("O");
            combination_Opr();
            score=false;
        }
    }
    public void clickR3c3(){
        System.out.println("r3c3");
        if ((r3c3.getText().isEmpty())&&(score==false)){
            r3c3.setText("X");
            combination_Xpr();
            score=true;
        }
        else if ((r3c3.getText().isEmpty())&&(score==true)){
            r3c3.setText("O");
            combination_Opr();
            score=false;
        }
    }
}