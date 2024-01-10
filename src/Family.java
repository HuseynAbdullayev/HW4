import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    List<Human> childrenlist = new ArrayList<>();

    static{
        System.out.println("Family Class is Loaded.");
    }
    {
        System.out.println("New object was created.");
    }


    public Family(Human father, Human mother, Pet pet){
        this.father = father;
        this.mother = mother;
        this.pet = pet;
    }

    public void addChild(Human child){
        if(children != null) {
            List<Human> childrenlist = new ArrayList<>(Arrays.stream(children).toList());
            childrenlist.add(child);
            children = childrenlist.toArray(children);
        }
        else{
            childrenlist.add(child);
            children = childrenlist.toArray(new Human[0]);
        }
    }

    public boolean deleteChild(Human child){
        int countOfChildren = children.length;

        if(Arrays.stream(children).findAny().isPresent()){
            childrenlist.remove(child);
            children = childrenlist.toArray(new Human[0]);
        }
        return countOfChildren != childrenlist.size();
    }

    public int countFamily(){
        if(children != null){
            return  2 + childrenlist.size();
        }
        else{
            return 2;
        }
    }

    public void ToString(){
        System.out.println("About the family");
        System.out.println(
                "Father: " + father.getName() + " " + father.getSurname() + "\n"
                + "Mother: " + mother.getName() + " " + mother.getSurname() + "\n"
                );

        System.out.print("Children: ");
        if(!childrenlist.isEmpty()){
            for (Human child : childrenlist) {
                System.out.println(child.getName());
            }
        }
        else{
            System.out.println("No Child");
        }

        pet.ToString();
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Family family)) {
            return false;
        }
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, Arrays.hashCode(children), pet);
    }
}
