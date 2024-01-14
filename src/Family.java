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
            childrenlist = new ArrayList<>(Arrays.stream(children).toList());
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

    @Override
    public String toString(){
        StringBuilder aboutFamily;
        aboutFamily = new StringBuilder("About the family" + "\n"
                + "Father: " + father.getName() + " " + father.getSurname() + "\n"
                + "Mother: " + mother.getName() + " " + mother.getSurname() + "\n"
                + "Children: ");

        // System.out.print("Children: ");
        if(!childrenlist.isEmpty()){
            for (Human child : childrenlist) {
                aboutFamily.append(child.getName()).append(" ");
            }
        }
        else{
            aboutFamily.append("No Child");
        }
        aboutFamily.append("\n");

        aboutFamily.append(pet.toString());
        return aboutFamily.toString();
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
