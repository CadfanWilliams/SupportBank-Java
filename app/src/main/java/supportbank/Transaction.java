package supportbank;

public class Transaction {
   // Date,From,To,Narrative,Amount
   public String date;
   public String fromName;
   public String toName;
   public String narrative;
   public String amount;

   // constructor
   public Transaction(String[] rawTransaction) {
      date = rawTransaction[0];
      fromName = rawTransaction[1];
      toName = rawTransaction[2];
      narrative = rawTransaction[3];
      amount = rawTransaction[4];
   }

   public String getValues()
   {
      return fromName + " sent " + toName + " £" + amount + " for: " + narrative + " on the " + date;
   }
}
