import java.util.ArrayList;
import java.util.Set;

/* CompliantNode refers to a node that follows the rules (not malicious)*/
public class CompliantNode implements Node {
    public double pGraph; 
    public double pMalicious; 
    public double pTxDistribution; 
    public double num_Rounds;
    public boolean[] _followees;
    public Set<Transaction> _pendingTransactions;

    public CompliantNode(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
        // IMPLEMENT THIS
        pGraph = p_graph;
        pMalicious = p_malicious;
        pTxDistribution = p_txDistribution;
        num_Rounds = numRounds; 
    }

    public void setFollowees(boolean[] followees) {
        // IMPLEMENT THIS
        _followees = followees;
    }

    public void setPendingTransaction(Set<Transaction> pendingTransactions) { 
        // IMPLEMENT THIS
        _pendingTransactions = pendingTransactions;
    }

    public Set<Transaction> getProposals() {
        // IMPLEMENT THIS
        return _pendingTransactions;
    }

    public void receiveCandidates(ArrayList<Integer[]> candidates) { 
        // IMPLEMENT THIS
        for(Integer[] i : candidates){
            for(int k = 0; k < i.length; k++){
                Transaction T = new Transaction(i[k]);
                _pendingTransactions.add(T);
            }
        }
    }
}
