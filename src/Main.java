class Person {
    private String nama;
    private int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        if (umur > 0 && umur < 150) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid");
        }
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
public class Main {
    public static void main(String[] args) throws Exception{
        Person p1 = new Person();
        p1.setNama("Andi");
        p1.setUmur(200);
        System.out.println("Nama: " + p1.getNama() + ", Umur: " + p1.getUmur());
    }
}
