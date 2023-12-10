package generation.PolymorphismandInheritance;

import java.util.List;

public class SalesManager extends Employee {
    private List<SalesRep> team;

    public int calculateCommission() {
        int totalSales = 0;
        for (SalesRep rep : team) {
            totalSales += rep.salesMade;
        }
        return (int) (0.03 * totalSales);
    }

	public void setTeam(List<SalesRep> salesTeam) {
		// TODO Auto-generated method stub
		
	}
}
