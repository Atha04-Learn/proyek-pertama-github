public class DataTypeArray {
    public static void main(String[] args) {
    //Tipe data+[]+nama variable
        String[] arrayString;
        arrayString=new String[3];
        arrayString[0]="Eko";
        arrayString[1]="Pak";
        arrayString[2]="Masuk";
        System.out.println(arrayString[0]);
        //Merubah data Array
        arrayString[2]="    Busi";
        System.out.println(arrayString[2]);
    }
}
