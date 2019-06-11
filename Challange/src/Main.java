public class Main {

    public static void main(String[] args) {

        Child kid1 = new Child("Maria", "José");
        Child kid2 = new Child("Maria", "Mario");

        System.out.println(FamilyTree.haveSameMother(kid1, kid2));
        System.out.println(FamilyTree.haveSameFather(kid1, kid2));
        System.out.println(FamilyTree.halfBrothers(kid1, kid2));

    }
}

