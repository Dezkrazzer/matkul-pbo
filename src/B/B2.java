/*
Gilang Ridho Wicaksana 	L0125044
Lazuardi Akbar Imani	L0125105
Alfian Naufal Rabbani	L0125125
*/
package B;

import A.A1;
import A.A2;

public class B2 {
    public static void main(String[] args) throws Exception {
        A1 objA1 = new A1();
        
        System.out.println("=== [ Akses dari class B2 (Beda Package, Bukan Subclass ] ===");
        System.out.println(objA1.publicVar);      // Valid, satu-satunya yang bisa diakses
        
        // System.out.println(objA1.protectedVar);   // ERROR: Beda package dan bukan subclass
        // System.out.println(objA1.defaultVar);     // ERROR: Beda package
        // System.out.println(objA1.privateVar);     // ERROR: Hanya untuk class A1
        System.out.println();

        // Menjalankan simulasi dari class-class lainnya
        
        objA1.cekAksesPrivate(); 
        System.out.println();
        
        A2 objA2 = new A2();
        objA2.cekAkses();
        System.out.println();
        
        B1 objB1 = new B1();
        objB1.cekAkses();
    }
}
