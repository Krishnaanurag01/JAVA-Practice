

class JAVAsingltonPATTERN {

    private JAVAsingltonPATTERN(){
    }
    public String str;
    private static JAVAsingltonPATTERN INSTANCE = new JAVAsingltonPATTERN();

    public static JAVAsingltonPATTERN getSingleInstance(){
        return INSTANCE;

    } 


}

