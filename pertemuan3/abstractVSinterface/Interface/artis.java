package pertemuan3.abstractVSinterface.Interface;

class artis implements komikus, penyanyi{
    /*
    * karena artis itu bisa multi talenta
     * dan menyanyi bisa banyak lagu
     * atau menggambar bisa berbagai judul komik 
    */
    //void yang diimplementasikan dari komikus.java
    public void menggambar(){
        System.out.println("Artis sedang menggambar komik");
    }

    //void yang diimplementasikan dari penyanyi.java
    public void menyanyi(String lagu){
        System.out.println("Artis menyanyikan lagu "+lagu);
    }
}
