package comparator;

import java.util.Collections;
import java.util.Comparator;

public class NameComparator implements Comparator<Member> {

    @Override
    public int compare(Member m1, Member m2){
        return m1.getSwimmingTime().compareTo(m2.getSwimmingTime);
    }

    public void sortSwimmersByOneAttribute() {
        int userChoise = input.nextInt();
        switch(userChoise) {
            case 1 -> Collections.sort(memberList, new NameComparator());
            case 2 -> Collections.sort(memberList, new AgeComparator());
            case 3 -> Collections.sort(memberList, new BrystsvømningComparator());
            case 4 -> Collections.sort(memberList, new ButterflyComparator());
            case 5 -> Collections.sort(memberList, new CrawlComparator());
            case 6 -> Collections.sort(memberList, new SwimmingTimeComparator());
            case 7 -> Collections.sort(memberList, new RygcrawlComparator());
        }
    }

    public void sortSwimmersByTwoAttributes(int userChoice1, int userChoice2) {
        Comparator comparator1 = null;
        Comparator comparator2 = null;

        switch(userChoice1) {
            case 1 -> comparator1 = new NameComparator();
            case 2 -> comparator1 = new AgeComparator();
            case 3 -> comparator1 = new BrystsvømningComparator();
            case 4 -> comparator1 = new ButterflyComparator();
            case 5 -> comparator1 = new CrawlComparator();
            case 6 -> comparator1 = new SwimmingTimeComparator();
            case 7 -> comparator1 = new RygcrawlComparator();
        }
        switch(userChoice2) {
            case 1 -> comparator2 = new NameComparator();
            case 2 -> comparator2 = new AgeComparator();
            case 3 -> comparator2 = new BrystsvømningComparator();
            case 4 -> comparator2 = new ButterflyComparator();
            case 5 -> comparator2 = new CrawlComparator();
            case 6 -> comparator2 = new SwimmingTimeComparator();
            case 7 -> comparator2 = new RygcrawlComparator();
        }

        Collections.sort(memberList, comparator1.thenComparing(comparator2));
    }
}


