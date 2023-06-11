import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SnapshotArray {
    int id = 0;
    List<int[]>[] sarray;
    
    public SnapshotArray(int length) {
        sarray = new List[length];
        for (int i = 0; i < length; i++) {
            sarray[i] = new ArrayList<>();
            sarray[i].add(new int[]{0, 0});
        }
    }
    
    public void set(int index, int val) {
        int[] last = sarray[index].get(sarray[index].size()-1);
        if (last[0] == id) last[1] = val;
        else sarray[index].add(new int[]{id, val});
    }
    
    public int snap() {
        return id++;
    }
    
    public int get(int index, int snap_id) {
        int pos = Collections.binarySearch(sarray[index], new int[]{snap_id, 0}, (a, b) -> a[0] - b[0]);
        if (pos < 0) pos = -pos - 2; // (insert_pos - 1)
        return sarray[index].get(pos)[1]; 
    }
}
