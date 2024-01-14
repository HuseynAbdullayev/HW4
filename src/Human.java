import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Objects;

@Getter
@Setter
public class Human{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[][] schedule;

    static{
        System.out.println("Human Class is Loaded.");
    }
    {
        System.out.println("New object was created.");
    }


    public Human(String name, String surname, int year, int iq, String[][] schedule){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public void greet(){
        System.out.println("Hello my friend.");
    }

    public void describe(){
        System.out.println("My name is " + name);
    }

    public void feed(){
        System.out.println("I must feed my pet");
    }

    @Override
    public String toString(){
        System.out.println("About the " + name);
        System.out.println("Name: " + name + "\n"
                + "Surname: " + surname + "\n"
                + "Year: " + year + "\n"
                + "Iq: " + iq + "\n"
                + "Schedule" + Arrays.deepToString(schedule)
                );
        return null;
    }


    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Human human)) {
            return false;
        }
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(year, human.year) &&
                Objects.equals(iq, human.iq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }

}
