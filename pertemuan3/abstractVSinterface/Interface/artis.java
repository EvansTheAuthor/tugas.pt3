package pertemuan3.abstractVSinterface.Interface;

class artis implements komikus, penyanyi{
    //void yang diimplementasikan dari komikus.java
    public void menggambar(){
        System.out.println("Artis sedang menggambar komik");
    }

    //void yang diimplementasikan dari penyanyi.java
    public void menyanyi(String lagu){
        System.out.println("Artis menyanyikan lagu "+lagu);
    }
}