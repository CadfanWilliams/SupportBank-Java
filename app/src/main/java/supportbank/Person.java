package app.src.main.java.supportbank;

public class Person
{
    String name;
    float amountOwed;

    public Person(String Name, String amount)
    {
        name = Name;
        amountOwed = Float.parseFloat(amount);
    }

    public void setAmountOwed(float amountToBeAdded)
    {
        amountOwed =+ amountToBeAdded;
    }

    public String Name()
    {
        return name;
    }
}