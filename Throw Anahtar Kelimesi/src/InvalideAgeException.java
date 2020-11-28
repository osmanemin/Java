public class InvalideAgeException extends Exception{

    public InvalideAgeException(String mesaj) {
        super(mesaj);
    }

    
    
    @Override
    public void printStackTrace() { 
        System.out.println("Bu bir InvalideAge hatasıdır...");
    }
    
}   
