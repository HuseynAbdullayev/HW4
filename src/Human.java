import lombok.Getter;
import lombok.Setter;
import java.util.Random;

@Getter
@Setter
public class Human{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet,  Human mother, Human father,String[][] schedule){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(){
        //Empty constructor
    }

    public void GreetPet(){
        System.out.println("Hello, " + pet.getNickname());
    }

    public void DescribePet(){
        String slyStatus;

        if(pet.getTrickLevel() > 50) {
            slyStatus = "very sly";
        }
        else{
            slyStatus = "almost not sly";
        }

        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + slyStatus);
    }

    public void ToString(){
        System.out.println("About the " + name);
        System.out.println("Name: " + name + "\n"
                + "Surname: " + surname + "\n"
                + "Year: " + year + "\n"
                + "Iq: " + iq + "\n"
                + "Mother: " + mother.name + " " + mother.surname + "\n"
                + "Father: " + father.name + " " + father.surname + "\n"
        );
        pet.ToString();
    }

    public boolean  FeedPet(){
        Random rand = new Random();
        int generetadNumber = rand.nextInt(100);

        if(generetadNumber > pet.getTrickLevel()){
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
            return false;
        }
        else{
            System.out.println("Hm... I will feed Jack's " + pet.getNickname() + ".");
            return true;
        }
    }
}
