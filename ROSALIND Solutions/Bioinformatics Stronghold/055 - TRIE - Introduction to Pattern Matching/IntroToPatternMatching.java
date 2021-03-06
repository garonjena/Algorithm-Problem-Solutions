import java.util.*;
public class IntroToPatternMatching {
  public static void main( String[] args ) {
    String[] a = {"AGCGTAGGGGTGATGCTGCTTGCTGGAGGCAGGGGAAGGTGGCTTCATATATACCCCCCAATGAGTAGCGTTAAGTCAATCCGAATT",
"AGTAGTCGCAAGCCGATGGGACGTTACCGAGGGACTACGTCTAAGCCGTATTAATTCTGCGCTCTGGAACGATCGCGCATGTCGTGCCAGG",
"GCACTCAATTGAGGAGTCACCATGCCGACTTACCCCTTGCTGTGGCCGACACCCTAACTCGCAAGCTACTTGAAGGCGACGCTGCCCAATTGTTAAATG",
"GATGACACACCTAGACGAGAGGATGAAGGCGCCATTGAAGAGATTGCAAATACTCCCGAGTCGACTTCGGACTTTCTCCTTGCTCATT",
"CTTTCCCAAAGGAGGCCTGACACTTGTACAAGCCCTATCATTCATATATTCATTGCATACCTTGACGGGACATTTTTGGTGTCTGCGCCCACGTTCC",
"TTTAGGTGCCGGACCAAAGAGTAGAATCCGGGGACTAAAAATTGGAATGGCGCAGTTGACACGTCATCAACAGCTTTGCCGTAAGCTCCA",
"GACATTAACCCGATGTGCGGAGCCTATATTGTGGTGTCTAAGTGACTTACAAGTTGGGGGTCAATACGGAGAGGTTAACGTGCGACATTGCCTT",
"ACGTAATAAATCTATATTAGAGTGTGCTCGCAGAATGTCAGGGCGATTCGGCGCCGGCGAGCTACCTTCAAATCTACAAAGTAAGAAGAT",
"AGCCGCAGCGAAACAGTCTGTCAACTCAAGATTATAAGACCGTGTACTGGAGAGCCGGGACCTTGTGGCTGCGGTAACTTGTCGCCTCAACGATAGGT",
"GGTCATACCAGAGTGCTACTATAACAGTAGCTCGCCCGCCCAACGACAATGCCGTGGTGTTGTACCATAGGTCTCGGCGTGTAGG",
"CACCGTGCTGATATTCGAAAGGTCCCCCGAATCTCGGCGATCTAACGATCGCGTCGTTGCTAGTGAGTCGAATAGTTTGTGGGTACGTGAGAA",
"TACTGTACAGGACAACTCTAACGCAAAAAAGCAATATACAGTCCACAGAGAACTGTATCGAATGATAAGATACATCGCATCTA",
"ACCTCAGCAGGGATCAATGCAGATGGTTGGCAAAGGGGATCAAGATATTAGCCGATACCCCGGGAGGATCATAATCTACAACCCCCGCCGTCGT",
"CAGAAATCGGCCACGCAGAGCGCTGTTCTAAGACGAATGCATTAGTGGGCATACTGCGATGACGAATTCGCGAACCCAAATTGTACCGCGGCCT",
"GAGTACATAACCCGCTTGTGAATTTTGGCCGAGACTCGGGCATAGTACTCATTTCTGTCGACGGAAGGAGGAGGCGTGTGCCACGATT",
"CGCTTAAACCATTCCCCATCGGGGGGTCCCGTAGAACTGTGGTGCAAACGAGCATGCAGGTCCCCGAAGATACATGAGTGC",
"TCACGACAATTAGTGGTTCTACCATTTATCCCAGTGGACGGATCCATGTCCCCCCACTTTGTTTTCTGTGTGGAAGCGCTCT",
"CCGAGTGATGAGCTGTGGAATGGTGGAGGAGCCACGAAAGTCGTTAGTTCGTACTCTCTCCCGGATATCAGGGGAATCGCATGTTGTC",
"GGTGATACCGGCAGCTGAAAACCGATCTGTCCCTGCGGGCGTCACCGCATATACTAGATAATAAAAGAGAAGTCCAGTTTGGGGTCCTTA",
"ATGCCACAGGCATCACGTTGCGTTTCCTAGACTGAAGGTGCAACCGTAGAAACAACCAGCTACTCTCGCATCTGTACGCCAGGGTCGTCACG",
"TGTGCCTCCCATGAGGGCCCTGAAAATGAACACCTCGTTCACCATCTCTGGGAGGTCAACAAACCGTTCATTATAGTCCTGAGG",
"AAGTCGTGTACCTACACTGCCACGATGAGCTCGGAGTTTGATGAACTTGGGGTGTGATAAATGAATACTCTAAACCAAGCCATCACT",
"CATGTGACCAACGGCACAGCGTTGGAGCCGTCTTGGCTGATCCGAGCACAATCGATTGGGAGGGGGTTTTGAACGTCCGACCCCTAGCATCGGTA",
"GTTTTCGGAGTTTGAGAAAGAAGTGGTATTGAGGCGTTATGCGAGTCCAAACCATAGGTGCTCCCTGTCGTAGAGCGTCCGA",
"ATTGCCCACAGTCCCTCGGTCGGCTGGTAAGTATAACTCGCAACAGACCCTCAACGGATTGCTCACCAAACTACAAAGCTCAC",
"TCGCGGCCTCGTTGTGTATGGATGGCCGGAGCGATTTCAATCCACCGCGGAGGAGAGCGCTCTCGAGTATGGTCGGGGCCGGAATT",
"AAAAGGAAAATCAGCTATCTAGCATAATCAGGGAGAGCATTTGTCAGAAACACACGGTAGCTCTCATAACAATTTGGCTCTAACTCTCTCACATTAG",
"TAGTCCCGGAAGGAGGGTATCGAGCAGAAGATCCTCGGCACCCATTTCTTATACACCCAGTGGTGGCAGGCTAGTCTGCACCATCGACTCAATCTGGT",
"GGTACGTCATAACCAGAGGATGGTACTCGCGGCGGCGCTCTGTGGGTGTTCTGGCCTGCACCTATGCGCCTATCCGAGCCGCCGTACTCAG",
"AAAAGTCTGCTCCAGCAGAGATACGATTGCGGTCTTAGCTGTCCCGATGGTCAAGCGTCAGGCACCATGTATAGTCCTAAGCTGTCCCTT",
"AAGTATTAAACTCTAGGAGTCACCTTCATTGCCACCCTCACTACTGGCAAGATTGCATTCCGGTTTTTTAGTTGTACCTACTGTTTGCTACTGTA",
"GCCTCGCCTGTGTAAGACGTCCGAAGGATGGTCCACTTTTAAGCCGTGGCTGTCCGGACGACCGAGGTCAGTGGTGAAGC",
"TGTATAAGCGTGGGCGCAGTTCAAGGTGGTAGGCATCTTCAGATTGCCACCCCCACTGATTCTTTATAGGTGGCTTAATTACTCGATACGCCTTATC",
"CGGCATGGAATGGTGCCATAAGGCTAATGGTAAAAGCTAGTTATATGAAAAGCAGGGAGATAACGCTATCCCAAGTCGATAAGGATAGTGGGGGGT",
"ATTGTCTGTTCTCTTCAGACTGATCTGACACGACGGTGATCATAATCTCTGCATATTACAACGGGAATAACTTGCGAACCGTCTTATGTCGG",
"ATTCTTCAAGCAGATGCACAATATAAAAACAAATGGAATGAATTGGAATGGATCTGCACTCCGGTGAGACTATGTCTTTAAATAATGGATTCGGATGT",
"GACACGGATAGCTACGCCGCGGCTTTAAAATGCTTCTGCAGTAACACTTCGGCGTCGAGAATTTCATGTATTATTTCAATG",
"ACTGCTTGGGATCTTCGTTCCCCGTCGAATTGATCATATGTTAAGCCTGCCGCGACGAGCCCACGTATAGAACCTAGACAACGTACGTC",
"TTCATCCCAGGAATCTGAGTACCAAACCCGCCGTTCGAATTTTAAGTAACGGTAAAGGGGCCCGGATATCTGAGACTTTTCGCGATGTACGGG",
"TCGCATCGTTCTAACATCGTGGCTCGACATGCTCATCAACCTCCTGCAGCGTCCTTGGGAACCGATCAATCAGTATGTCGT",
"CCTCGGTATATTAGTGGGGAACCTGCGTGATATTGTAGAGGAGACACTGGATTGCTGCTAACAACTGTTAACCTCTCCAACGCAAC",
"TGCGCTCGTGCTGGAAGACCACCCTAAGTGGGCTAATTATTGTAGCCGAAAACTGGAAGTGTGCGTCATGGTAGACAGCATGTGATCACTATGAA",
"GTATAGCGCCCGTACATGCATCTCCCCTGAGTAAATGTGCCCACTACATAACTTCGGGGGTTATTGGGTGTAGGTTTGATACCGGCACAGCCAGCCGGGA",
"TGGCGGCGAAGTAACAGGCTCTATATAGAGTCGATACTGAAGGGCCTCTCATCGAATCCCCCACCGGCTTGTGTACATTAAAC",
"TTAGAAGCGCGTACCACTGGACTGCGTCGTGTACGTTGGCTTTATGTCGAAGCCCCCCAGGATAGAGCAAGGTCACCTCATGATTGA",
"CAAGTAGAGCTCGCAGGATCCAATTATGGTGGCATCATCGCGCTTATTCTTGGGTCGGACTCGAGCGAGCCAGGGAAATCAGCTGGCAGACTCCCA",
"TCAAACGCCTCCGGAGCTTCGCGACAGCCAGCCCTTAATGACGATGAAATAAGAATGCAGCAGAATTGCGTTAGCCCCCTATTAACCTATGGGT",
"ACGGTATGCTTTCTAGACCCCTAAACGCTTTCAATGGCAACGGAGTACGATACCTACGAGCCATTTTTCGTTGAGAACTTCCGCTAAC",
"GATATACTAATGCTGGCTTCCAGCTGAGCCCTGGTCGCTGAACTAGACGGTCTCCTCATAACTCGCGGAAGCGCTTCTCAAAG",
"TGTAGCCCAGGGCACCTCACCTTCTTCGCACTCTTCAGAGTCGGGAACTTGTCATTCAAGTTACCGAGAGACCGCAATAACTTGGCACCCTGACAG",
"TCGGGGTTCGGCTACGCCCCCCGCACGCTCCAAGTCGGCCGATGAAGCATGGAACGTGTCAGGACTTGCTGGCCCTGTGTCGAAGAAAA",
"TCTCCCAAAATGCGAGGGTAGATACATCCTCATGGACTACATGGAAACGGTCACTCGTCGCGCGGGACGGAAAGACGGATACTCTAAAACTATGT",
"GAATGCAGCACCAAGGAAAAAGCGCTCGGAGTGCTGGGGCCCTATTCTTACAACATGGATGCCGATACGATCGCTAATCGTCCATTAGGGCTG",
"AACAGAACCTTAGTTGGGTGTGGCAGTAGACTCAAGCACAGGTTTCGTTCGAGTGTTATCGGAGGCTTCCGTTAGGCGGTGCA",
"ATCTGCGAATTGACAGTTGGCTCCCGACTATGCGCTCCTAATGCAAGATCGCTTCCTCAAAAGTGGATGACCCTTGTGAGGTAATCGCGTGGCTGGAGCC",
"TGACCCGTGAGCGGCTCAATATTAATCACGCATTTCCCGGTTTCTATGAAATCCATCCGCACTTAAAATTCGGAATGGCT",
"CGAATTCAGTACAGTACGTGATTCGACCGGACGAAATAGATCCGTCATGGGTCCGGGGTGACTCTTTTCATGGGCGAGGGAC",
"TGGGTCCTCTTATGCGATGCCAAAAGGACATGTCACTAGAATAGAAGACTGAGTGTGTTCCCAGAGGTAATGTACGTAAGGATT",
"AAAGCCACTCCGGTCCATTAGGCGAGGCTAGGGAGAACTAACCGAAAACGACTGATGCCGCCGACAGTGAACTATCCCAGATGATTCAATCATGGCC",
"TCTGGCCGAGCAGTATACACGTCAGGACTCGTGCCGTAACCCTTTAATGAAGCCCTAGTTGAGCCCTGTGCAAAAGTTACGCGTTCCACCG",
"GCGAATGATCGAGCCTAAGGTTGATCAGAGTCATGGCCCAGTGCAGAGGCGAATCTGCTTTCCGTTCTACAGCCAATGGTCTATACGATATGCAAAC",
"TTTTTCGCGCGTCTCCGTAAAATTAACTCTCTTACTGGGCGCATAATAGTGCTGGTATTGCTGGCTCCATAATAAAACGGCCTGGTCCACCGCCTGAC",
"CTTCGGTATCGCGTTTTCCATTACCTCCGTTGATACTAACGGGTAGTGAACCTTTCGCAGTCCGGCGCCCTCCGAGCTAACATGGGGG",
"CAGCATTTCTCGGACTACAAGGGCCTCCGGTGGAACGAAACTAGTATGAGCTTATGAAAATCCATAATGAAGCACCGAAACTCGTAAACCAG",
"AACTTGCTTTGTCATAAGGCCGACAGTCATACCCTTAAACGCATGGCGCTTTCAAGACCATATTCAAACAATAAACCGGCCATTGGCGCTAAA",
"ATACACGTTCGGGCTGCAGGGTGGCGGGACTATATGAAAGCCCTGTAGTGGTTGGACGGCTTACGGGTACTAGTTGGGGATAGAGTTCATATAGATGA",
"ATTGAGCCGACCCTGCATGTAAGAGAGGATCGTGTTGCCTGAGCGCAAAGCCCGGCGGGAGCGCAACCTTAATGAGAGCGTTTT",
"GTACCATGAGGCGTTTCTTGGCGGTGGTGGGACGCCCCGCAGGTTTGTCTGACACTACCAAGAGTCTCGTTACTTACCCATCCTTCT",
"GAGGTCATTGCTAAGATATTGTTACAGGGCGCAATCGACTGTTTTCACATAATCGACATACGTAAGCGCCTCCCCCTATAGCTTTCTCCAGGTCAACGA",
"CGACTCTATGACGACTATCTACCGGTCCCTAATGCGTTCTTGGTTCGTGTACAAGACAGTCCAAGGTTCCGTTGTCGTTGACTAAGTCGCTCTGC",
"GATCCGTAGCAGCTAAAAAGACACGTAGGAGAGAACTGACCGCAGTAGTTTTCCTTACCCAGGAGAATATACCCTAGGCCAATCCGGTAAACATATACC",
"GCAACCGCGTCCGATTGGTTTCTAACTTCGCAACTGTGCCCGAATTCCCCCTCGGGCTTGACGGTTACCGGACTAGCTCGTTCGGGCGCATCTAGATC",
"AAATAACCCCCCGTCATCCGTGGACGACTGTCGACTATCCATAGCATCCTCATGCGTGTGGTCGCGGAGGAAGGTAGTGGGAAGGAAC",
"ATTCCTACAATTAATGAGCTCAATAATATTGATTGGGAGGTATATCCCTCTTAGACGGTCCGAGTTACCGGAAGTTACCAATCACTTAATCAC",
"CGCAGAAATGACCTCAACCTCTCTAACAGTCGAAACGCGTGAGCGTAGAAGACCCAAGGCCCCGGGCGTCTTTGTATCTGTTACCCGCAAAGGCGAAGCG",
"AAGGGCGACGCCGTTTGTGACAGTTATTAAAGGATTGGGTGCTGGCGTTACGTGAGTTAATATAGGCCCATCAAAATTAC",
"ATGAACCTAGAAAGCGGTATGGACAACCGTTTCGCCTAGCGACGGCTGCAGCTGACGCAAGTCCTTCTCGGGCCAAAGCGCCACAAGA",
"ACCTACAATGGGTAGGCGCACGTGGATCAGGTGACAAGGCCCGGATTCTGCAGTCTACCGACTAAGGGGATCACACGGCTCGTAGCGT",
"CTGTGGTACGAGTAATTGTTACCTTTATGCTGATCGACTAGAAGAAAGAGCCATCCAAAATATAGAGCGTGACTGCATCCAGA",
"GGACATTATGATAAGGATGTCAATGGTGTGACTGTTCCGAACACAGCAAATCTCCAGTACACCTTTAACTTGTTATTATTC",
"AGCACGTATGCAATCCTGAGCTGCGTGCGTCGATTGATGTGCGATTCACAGGTGACTATCCGGTTCGCCTCGCGTATAAATTAAC"};
    String[] out = introPatternMatching(a);
    for(int i = 0; i < out.length; ++i) {
      System.out.println(out[i]);
    }
  }
  
  public static String[] introPatternMatching( String[] a ) {
    DnaTrie trie = new DnaTrie();
    for(int i = 0; i < a.length; ++i) {
      trie.add(a[i]);
    }
    return trie.outputTrie();
  }
}

class DnaTrie {
  public DnaNode root;
  public ArrayList<DnaNode> nodes; // all DnaNodes
  public int numWords;
  
  public DnaTrie() {
    root = new DnaNode('\0',null);
    nodes = new ArrayList<>();
    nodes.add(root);
  }
  
  public boolean add( String word ) {
    DnaNode curr = root;
    for(int i = 0; i < word.length(); ++i) {
      char let = word.charAt(i);
      int c = -1;
      switch(let) {
        case 'A': c = 0; break;
        case 'C': c = 1; break;
        case 'G': c = 2; break;
        case 'T': c = 3; break;
        default: return false;
      }
      if(curr.children[c] == null) {
        curr.children[c] = new DnaNode(let,curr);
        nodes.add(curr.children[c]);
      }
      curr = curr.children[c];
    }
    return true;
  }
  
  public String[] outputTrie() {
    String[] out = new String[nodes.size()-1];
    for(int i = 0; i < out.length; ++i) {
      DnaNode curr = nodes.get(i+1); // ignore root
      out[i] = "" + curr.parent.num + " " + curr.num + " " + curr.letter;
    }
    Arrays.sort(out);
    return out;
  }
}

class DnaNode {
  public static int numNodes = 0;
  public char letter;
  public int num;
  public DnaNode parent;
  public DnaNode[] children = new DnaNode[4]; // A,C,G,T
  
  public DnaNode( char l, DnaNode p ) {
    letter = l;
    parent = p;
    num = ++numNodes;
  }
}