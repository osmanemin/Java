public class Main implements IDeneme{
    public static void main(String[] args) {
        
        System.out.println(IDeneme.a);
        IDeneme.dene();
        
        //yazdir();
        
    }

    @Override
    public void yazdir() {
           //a = 5;
           //b = 3;
           System.out.println(a + b);
    }
}
