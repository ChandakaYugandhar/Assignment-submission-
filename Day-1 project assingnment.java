import java.util.Scanner;
class Cab {
    int fare;

    Cab() {
        fare = 50;
    }
    
    Cab(int amt) {
        fare = amt;
    }
    
    void showFare() {
        System.out.print("Fare Amount: " + fare);
    }
}

class RideCab {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int d; // distance travelled by user
        int pickup_d;

        System.out.print("Enter the distance of cab from the user(in km): ");
        pickup_d = sc.nextInt();

        System.out.print("Enter the travel distance(in km): ");
        d = sc.nextInt();

        if(pickup_d <= 5)
        {
            Cab id = new Cab();

            id.fare += 10 * d;
            id.showFare();
        
        }
        else {
            Cab id = new Cab(50 + (pickup_d - 5) * 10);

            id.fare += 10 * d;
            id.showFare();
        }

    }
}
