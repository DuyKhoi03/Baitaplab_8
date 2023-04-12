/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;
public class Double {
    public float x;
    
    public Double(){
     }
     
    public Double(float x){
        this.x = x;
    }
    
    @Override
    public String toString(){
        return "    " + x;
    }
}