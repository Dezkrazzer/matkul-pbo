/*
Gilang Ridho Wicaksana 	L0125044
Lazuardi Akbar Imani	L0125105
Alfian Naufal Rabbani	L0125125
*/
package A;

public class A1 {
    public String publicVar = "Public: Ini bisa diakses dari mana saja walaupun beda package";
    protected String protectedVar = "Protected: Ini bisa diakses dari package yang sama dan subclass";
    String defaultVar = "Default: Ini bisa diakses dari package yang sama";
    private String privateVar = "Private: Ini hanya bisa diakses dari class ini saja (A1)";

    // Method untuk mengakses variabel private dari dalam class A1
    public void cekAksesPrivate() {
        System.out.println("=== [ Akses Dalam Class A1 (Class yang sama) ] ===");
        System.out.println(privateVar);
    }
}
