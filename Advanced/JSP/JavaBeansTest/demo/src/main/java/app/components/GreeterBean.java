package app.components;

public class GreeterBean {

    private String person;

    private String period;

    private int greetings;
    

    public final String getPerson() {
        return person;
    }

    public final void setPerson(String person) {
        this.person = person;
    }

    public final String getPeriod() {
        return period;
    }

    public final void setPeriod(String period) {
        this.period = period;
    }

    public synchronized String getGreetingMessage() {
        if(person == null)
            return "Welcome Visitor";
        ++greetings;
        return String.format("Good %s %s", period, person);
    }

    public int getGreetCount() {
        return greetings;
    }

}