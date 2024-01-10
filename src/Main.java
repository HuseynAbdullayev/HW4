
public class Main {
    public static void main(String[] args) {
        Human father1 = new Human("name1", "surname1", 1977, 100, new String[][] {{"Monday"}, {"go to the work1"}});
        Human mother2 = new Human("name2", "surname2", 1977, 100, new String[][] {{"Tuesday"}, {"go to the work2"}});
        Human father3 = new Human("name3", "surname3", 1977, 100, new String[][] {{"Friday"}, {"go to the work3"}});
        Human mother4 = new Human("name4", "surname4", 1977, 100, new String[][] {{"Saturday"}, {"go to the work4"}});
        Human child1 = new Human("child1", "child1", 2000, 90, new String[][] {{"Monday"}, {"go to the school1"}});
        Human child2 = new Human("child2", "child2", 2001, 110, new String[][] {{"Tuesday"}, {"go to the school1"}});
        Pet dog1 = new Pet("Dog","dog1");
        Pet dog2 = new Pet("Dog","dog2");
        Family family1 = new Family(father1,mother2,dog1);
        Family family2 = new Family(father3,mother4,dog2);

        family1.addChild(child1);
        family1.addChild(child2);
        family2.addChild(child2);
        System.out.println("count of first family -" + family1.countFamily());
        System.out.println("count of second family -" + family2.countFamily());
        family1.ToString();
        family2.ToString();

        System.out.print("Deleting child is - ");
        System.out.println(family1.deleteChild(child1));
        System.out.print("Deleting child is - ");
        System.out.println(family2.deleteChild(child2));
        System.out.println("count of first family -" + family1.countFamily());
        System.out.println("count of second family -" + family2.countFamily());
        family1.ToString();
        family2.ToString();


    }
}