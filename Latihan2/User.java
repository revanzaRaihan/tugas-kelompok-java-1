package Latihan2;
// menyimpan data input user
public class User {
    public static int jbu;
    public static int jbp;
    public static int jbpeng;
    // konstruktor
    public User(int BPU, int PUS, int PENGUS){
        jbu =  BPU;
        jbp =  PUS;
        jbpeng =  PENGUS;
    } 
    // getter untuk variabel
    public static int getJBO(){
        return jbu;
    }
    public static int getJPEN(){
        return jbp;
    }
    public static int getMU(){
        return jbpeng;
    } 
}
