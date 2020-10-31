public class SmallestItem implements Comparable<SmallestItem> {
    private Integer Smallest;


    public SmallestItem(Integer n) {
        this.Smallest = n;
    }

    public Integer getSmallest() {
        return Smallest;
    }

    @Override
    public int compareTo(SmallestItem o) {
        if (this.Smallest < o.getSmallest())
            return -1;
        if (this.Smallest > o.getSmallest())
            return 1;
        return 0;
    }
}
