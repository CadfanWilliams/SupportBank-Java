package supportbank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Reader {
    public String file;
    public String line;
    public HashMap<String, Float> accounts = new HashMap<String, Float>();

    public Reader(String File) {
        file = File;
        // Date,From,To,Narrative,Amount
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                Transaction currentTrransaction = new Transaction(line.split(","));
                accountModifier(currentTrransaction);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void printAccounts() {
        System.out.println(accounts);
    }

    public void accountModifier(Transaction transaction)
    {
        float newAmount;
        if(!accounts.containsKey(transaction.fromName))
        {
            accounts.put(transaction.fromName, Float.parseFloat(transaction.amount));
            //This works with the FROM payments but doesnt calculate the TO payments
        }
        else
        {
            newAmount = accounts.get(transaction.fromName) + Float.parseFloat(transaction.amount);
            accounts.put(transaction.fromName, newAmount);
        }
        
        
    }
}
