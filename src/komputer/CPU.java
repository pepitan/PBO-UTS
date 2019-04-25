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
class CPU {
    protected String nama;
    protected int kec;
    
    public CPU (String nama, int kec){
        this.nama = nama;
        this.kec = kec;
    }
    public String getCPUData(){
        return(this.nama+" "+this.kec);
    }
}
