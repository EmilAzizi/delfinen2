package comparator;

import java.util.Comparator;

public class BrystsvømningComparator implements Comparator<Member> {

    @Override
    public int compare(Member m1, Member m2){
        return m1.getSwimmingTime().compareTo(m2.getSwimmingTime);
    }
}
