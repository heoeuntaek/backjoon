package java_class;

public class ObjectList {
    int radius;
    public ObjectList(int r){
        radius = r;
    }
    public static void main(String[] args) {

        ObjectList[]practices_list;
        practices_list = new ObjectList[5];
        for (int i =0; i<practices_list.length; i++){
            practices_list[i] = new ObjectList(5);
        }

        System.out.println("practices_list[0] = " + practices_list[0].radius);

        for (int i = 0; i < practices_list.length; i++) {
            System.out.println(practices_list[i].radius);
        }
        System.out.println(practices_list[0].getClass());

        System.out.println("-----------------");
        for (ObjectList i : practices_list) {
            System.out.println(i.radius);

        }


    }
}