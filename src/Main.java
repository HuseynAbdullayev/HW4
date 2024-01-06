public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Rock", 5, 75, new String[]{"Eat", "Drink", "Sleep"});
        Human father = new Human("Vito", "Karleone", 1955);
        Human mother = new Human("Jane", "Karleone", 1957);
        Human child = new Human(
                "Michael",
                "Karleone",
                1977,
                90,
                dog,
                mother,
                father,
                new String[][]
                 {{"Monday", "Tuesday", "Wednesday", "Thursday"},
                 {"Go for a walk", "Go to the school", "Go the course", "Go to the sport"}
                });
        child.ToString();
        child.FeedPet();
    }
}