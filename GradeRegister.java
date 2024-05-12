package grades;

import java.util.ArrayList;
import java.util.Collections;

public class GradeRegister {

    ArrayList<Integer> grades;
    ArrayList<String> buckets;

    public GradeRegister() {
        this.grades  = new ArrayList<Integer>();
        this.buckets = new ArrayList<String>(Collections.nCopies(5, ""));
    }

    public void add(int number) {
        if (number < 0 || number >100) {
            System.out.println("Impossible number");
            return;
        }
        this.grades.add(number);
        if (number >= 0 && number <20) {
            this.buckets.set(0, this.buckets.get(0) + "*");
        }
        if (number >= 20 && number < 40) {
            this.buckets.set(1, this.buckets.get(1) + "*");
        }
        if (number >= 40 && number < 60) {
            this.buckets.set(2, this.buckets.get(2) + "*");
        }
        if (number >= 60 && number < 80) {
            this.buckets.set(3, this.buckets.get(3) + "*");
        }
        if (number >= 80 && number < 100) {
            this.buckets.set(4, this.buckets.get(4) + "*");
        }
    }

    public void print() {
        System.out.println(this.grades);
        System.out.println(this.buckets);
    }


}
