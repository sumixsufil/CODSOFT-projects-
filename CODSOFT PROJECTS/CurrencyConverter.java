import java.net.*;      // based on url
import java.io.*;
import java.util.Scanner;    // apni scanner class kai liye taaki user input de sakte system ko 
import org.json.JSONObject; // iske liye phele jar file add karni padegi lib folder banakar jis folder mai yeh code.java file hai 
public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: User se API key lena
            System.out.print("Enter your ExchangeRate API key: ");      // My Api Key Is  (04ecaf4bcbb004d1ba4dc104)
                 String apiKey = sc.nextLine();

            
                  System.out.print("Convert From (currency code, e.g. USD): ");   // user sai Input lena 
            String from = sc.nextLine().toUpperCase();

            
                 System.out.print("Convert To (currency code, e.g. INR): "); // user sai wo currency lena wo jisme convert karna chahta hai 
                 
            String to = sc.nextLine().toUpperCase();

           
            System.out.print("Enter amount in " + from + ": ");  // : User se amount lena
                  double amount = sc.nextDouble();


            String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + from + "/" + to;   //Api Call Karna

        
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();   //URL open karna
            con.setRequestMethod("GET");

        
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream())); // Response read karna
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            br.close();

              JSONObject json = new JSONObject(sb.toString());  // JSON se conversion_rate nikalna 
            double rate = json.getDouble("conversion_rate");

            
               double result = amount * rate;

           
               System.out.println("\n--- Conversion Result ---"); // print The result 
            System.out.println(amount + " " + from + " = " + result + " " + to);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());     

            sc.close();
    }
}
}