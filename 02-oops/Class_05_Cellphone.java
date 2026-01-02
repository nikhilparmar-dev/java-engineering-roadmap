class CellPhone {
    public static void Ring () {
        System.out.println("Ringing....");
    }

    public static void Vibrate () {
        System.out.println("Virbrating....");
    }
}

public class Class_05_Cellphone {
    public static void main (String[] args) {
        CellPhone Samsung = new CellPhone();
        CellPhone iPhone = new CellPhone();

        Samsung.Ring();
        iPhone.Vibrate();
        
    }
}