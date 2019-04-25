/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputer;

/**
 *
 * @author Pepita Neysa
 */
public class Main {

    public static void main(String[] args) {
        Intel i1 = new Intel(2);
        AMD amd1 = new AMD(3);
        komputer kmpt1 = new komputer(i1);
        
        kmpt1.cetakInfo();
        kmpt1.mencabut(i1);
        kmpt1.memasang(amd1);
        kmpt1.cetakInfo();
    }
    
}
