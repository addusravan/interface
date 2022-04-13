
interface student{
    int height=40;
    void sleep();
}

class c implements student{
    public void sleep(){

        System.out.print("man with height "+height+"sleeps whole day");
    }



    public static void main(String[] args) {

        c a = new c();
        a.sleep();


    }

}