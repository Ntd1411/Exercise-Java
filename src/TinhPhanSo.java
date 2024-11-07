

import java.util.Scanner;

class Phanso {
    int tu;
    int mau;
    void nhap(){
        Scanner c;
        c = new Scanner(System.in);
        int tu = c.nextInt();
        int mau = c.nextInt();
        if(mau == 0) {
            System.out.println("Loi khong nhap duoc phan so!");
            return;
        }
        this.tu = tu;
        this.mau = mau;
    };
    void xuat(){
        System.out.println(this.tu + "/" + this.mau);
    };
    Phanso cong(Phanso a){
        Phanso kq = new Phanso();
        kq.tu = a.tu*this.mau + a.mau*this.tu;
        kq.mau = a.mau*this.mau;
        return kq;
    }
    Phanso tru(Phanso a){
        Phanso kq = new Phanso();
        kq.tu = a.tu*this.mau - a.mau*this.tu;
        kq.mau = a.mau*this.mau;
        return kq;
    }
}

public class TinhPhanSo {
    public static void main(String[] args){
        Phanso a = new Phanso();
        Phanso b = new Phanso();
        a.nhap();
        b.nhap();
        Phanso kqcong = a.cong(b);
        Phanso kqtru = a.tru(b);
        a.xuat();
        b.xuat();
        kqcong.xuat();
        kqtru.xuat();
    }
}
