public class Convert {

    public double convertLength(double length, String unit){

        if(unit.equalsIgnoreCase("inches")){
            return(length / 2.4);
        } else {
            return (length * 2.4);
        }
    }

    public double convertVolume(double amount, String unit){
        if (unit.equalsIgnoreCase("ml")){
            return (amount / 29.57);
        } else{
            return (amount * 29.47);
        }
    }

    public String addString(String first, String second){
        return second+first;
    }




}
