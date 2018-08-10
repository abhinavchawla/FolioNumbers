package folio;

import java.util.ArrayList;

public class Sample {
	String[] fullRange = new String[(int) Math.pow(2, 31)];
	void runAlgo(ArrayList<FolioRow> ff) {
		
		for(FolioRow fr: ff) {
			for(int i=fr.range.start;i<=fr.range.end;i++) {
				fullRange[i] = fr.statuscode+fr.transfercode;
			}
		}
	}

}
