public class Child {

    public String mother;
    public String father;

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public Child(String mother, String father) {
        this.mother = mother;
        this.father = father;
    }
}
