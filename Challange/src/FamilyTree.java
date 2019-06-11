public class FamilyTree {


    static public boolean haveSameMother(Child kid1, Child kid2) {
        if ((kid1.getMother()) == (kid2.getMother())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean haveSameFather(Child kid1, Child kid2) {
        if ((kid1.getFather()) == (kid2.getFather())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean halfBrothers(Child kid1, Child kid2) {
        if ((kid1.getMother()) == (kid2.getMother()) || (kid1.getFather()) == (kid2.getFather())) {
            return true;
        } else {
            return false;
        }
    }

}

