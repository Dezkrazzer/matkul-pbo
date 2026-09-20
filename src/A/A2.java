/*
Gilang Ridho Wicaksana 	L0125044
Lazuardi Akbar Imani	L0125105
Alfian Naufal Rabbani	L0125125
*/
package A;

public class A2 {
    // Method untuk mengakses variabel dari class A1
    public void cekAkses() {
        A1 objA1 = new A1();

        System.out.println("=== [ Akses Dari Class A2 (Class yang berbeda, bukan subclass) ] ===");
        System.out.println(objA1.publicVar);      // Valid
        System.out.println(objA1.protectedVar);   // Valid
        System.out.println(objA1.defaultVar);     // Valid

        // System.out.println(objA1.privateVar);     // Error: Tidak bisa diakses dari class yang berbeda
    }
}
