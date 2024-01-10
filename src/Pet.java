import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Objects;

@Getter
@Setter
public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    static{
        System.out.println("Pet Class is Loaded.");
    }
    {
        System.out.println("New object was created.");
    }

    public Pet(String species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(){
        //Empty constructor
    }

    public void Eat(){
        System.out.println("I am eating");
    }

    public void Respond(){
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void Foul(){
        System.out.println("I need to cover it up.");
    }

    public void ToString(){
        System.out.println("About the " + species);
        System.out.println("Nickname: " + nickname + "\n"
                + "Age: " + age + "\n"
                + "TrickLevel: " + trickLevel + "\n"
                +"Habits: " + Arrays.toString(habits)
        );
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Pet pet)) {
            return false;
        }
        return Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname) &&
                Objects.equals(age, pet.age) &&
                Objects.equals(trickLevel, pet.trickLevel) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel, Arrays.hashCode(habits));
    }
}
