package Flipper;
import java.util.Scanner;

import ViewFactory.*;

public class Main {
    

    public static void main(String[] args) {
        
        boolean run = true;
        AbstractViewFactoryI factory;
        Scanner sc = new Scanner(System.in);
        System.out.println("Flipper Variante A(default) oder B");
        String inputView = sc.nextLine();
        
            switch(inputView){
                case "b":
                factory = new ViewFactoryB();
                break;
                case "B":
                factory = new ViewFactoryB();
                break;
                default:
                factory = new ViewFactoryA();
                break;
            }
           
        Flipper flipper = Flipper.Instance(factory);

        while(run){
            
            String input = flipper.performAction();
            if(input == "e"){
                run = false;
            }
            }
        }
        
    }
    
    

