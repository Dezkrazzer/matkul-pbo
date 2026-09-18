/*
Gilang Ridho Wicaksana 	L0125044
Lazuardi Akbar Imani	L0125105
Alfian Naufal Rabbani	L0125125
*/
package B;

import A.A1;

public class B1 extends A1 {
    public void cekAkses() {
        System.out.println("=== [ Akses dari Class B1 (Package yang beda, sebagai subclass) ] ===");

        System.out.println(publicVar);      // Valid
        System.out.println(protectedVar);   // Valid, karena B1 adalah keturunan dari A1
        
        // System.out.println(defaultVar);  // ERROR: Tidak bisa diakses dari package yang berbeda
        // System.out.println(privateVar);  // ERROR: Tidak bisa diakses dari luar class A1
    }
}
