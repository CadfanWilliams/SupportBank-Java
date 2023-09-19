package app.src.main.java.supportbank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Reader {
    public String file;
    public String line;
    public ArrayList<Person> accounts = new ArrayList<>();
    // public HashMap<String, Float> accounts = new HashMap<String, Float>();

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
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("Account: " + accounts.get(i).name + " Owes " + accounts.get(i).amountOwed);
        }
    }

    public void accountModifier(Transaction transaction)
    {
        
        for(int i = 0; i < accounts.size(); i ++)
        {   
            if(accounts.get(i).name.equals(transaction.fromName))
            {
                accounts.get(i).setAmountOwed(Float.parseFloat(transaction.amount));
                break;
            }
        }
        
        
        Person currentPerson = new Person(transaction.fromName, transaction.amount);
        accounts.add(currentPerson);
        
    }
}
