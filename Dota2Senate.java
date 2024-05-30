public class Dota2Senate {
        public String predictPartyVictory(String senate) {
            int candidates = senate.length();
            Deque<Integer> dire = new ArrayDeque<>();
            Deque<Integer> radiant = new ArrayDeque<>();
    
            for(int i=0;i<candidates;i++){
                char party = senate.charAt(i);
                if(party == 'R'){
                    radiant.add(i);
                }else{
                    dire.add(i);
                }
            }
    
            while(!radiant.isEmpty() && !dire.isEmpty()){
                int direP = dire.pollFirst();
                int radiantP = radiant.pollFirst();
    
                if(direP < radiantP){
                    dire.add(direP + candidates);
                } else{
                    radiant.add(radiantP + candidates);
                }
            }
            return radiant.isEmpty() ? "Dire" : "Radiant";
        }
}
