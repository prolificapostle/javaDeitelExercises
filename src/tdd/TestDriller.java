package tdd;

public class TestDriller {
    public int costTotal(int numCopies) {
        if (numCopies >= 1 && numCopies <= 4) {
            int cost = 2000;
            return numCopies * cost;
        }
        if (numCopies >= 5 && numCopies <= 9) {
            int cost = 1800;
            return numCopies * cost;
        }
        if (numCopies >= 10 && numCopies <= 29) {
            int cost =1600;
            return numCopies * cost;
        }
        if (numCopies >= 30 && numCopies <= 49) {
            int cost= 1500;
            return numCopies * cost;
        }
        if (numCopies >= 50 && numCopies <= 99) {
            int cost = 1300;
            return numCopies * cost;
        }
        if (numCopies >= 100 && numCopies <= 199) {
            int cost = 1200;
            return numCopies * cost;
        }
        if (numCopies >= 200 && numCopies <= 499) {
            int cost = 1100;
            return numCopies * cost;
        }
        if (numCopies >= 500) {
            int cost = 1000;
            return numCopies * cost;
        }
        return 0;

    }
}
