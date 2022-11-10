package Mod5;

public abstract class Passenger {

    public abstract String getType();

    public abstract int getTicketPrice();
}

class RegularPassenger extends Passenger{
public  String getType(){
    return "Regular";
        }

public  int getTicketPrice(){
return 199;
        }

        }

        class VIPPassenger extends Passenger{
            public  String getType(){
                return "VIP";
            }

            public  int getTicketPrice(){
                return 399;
            }

        }
