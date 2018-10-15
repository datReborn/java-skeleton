package helpers;

public class Allocations {

    private int[] allowedAllocations;
    private int totalValue;

    public Allocations() {
    }

    public int[] getAllowedAllocations() {
        return allowedAllocations;
    }

    public void setAllowedAllocations(int[] allowedAllocations) {
        this.allowedAllocations = allowedAllocations;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }
}
