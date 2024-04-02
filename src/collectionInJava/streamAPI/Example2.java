package collectionInJava.streamAPI;

import java.util.*;
import java.util.stream.Stream;

class Transaction {

    public static final String GROCERY = "grocery";
    public static final String ELECTRONICS = "electronics";
    public static final String MEDICAL = "medical";
    public static final String SPORTS = "sports";

    private int id;
    private String type;
    private double value;

    public Transaction(int id, String type, double value) {
        this.id = id;
        this.type = type;
        this.value = value;

    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Example2{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", value=" + value +
                '}';
    }

    int compare(double d1, double d) {
        if(d1 == d)
            return 0;
        if(d1 < d)
            return 1;
        return -1;
    }
}
public class  Example2{

    public static void main(String[] args) {
        Transaction[] transaction =new Transaction[10];
        transaction[0] = new Transaction(12,Transaction.GROCERY,1000.00);
        transaction[1]=new Transaction(18,Transaction.ELECTRONICS,8800);
        transaction[2]=new Transaction(47,Transaction.GROCERY,733);
        transaction[3]=new Transaction(11,Transaction.SPORTS,9900);
        transaction[4]=new Transaction(15,Transaction.GROCERY,338);
        transaction[5]=new Transaction(18,Transaction.ELECTRONICS,67000);
        transaction[6]=new Transaction(18,Transaction.SPORTS,900);
        transaction[7]=new Transaction(18,Transaction.ELECTRONICS,67700);
        transaction[8]=new Transaction(18,Transaction.MEDICAL,7000);
        transaction[9]=new Transaction(18,Transaction.ELECTRONICS,67000);
        List<Transaction> grocery_transaction=new LinkedList<>();
        for(Transaction x:transaction){
            if (x.getType()==Transaction.GROCERY){
                grocery_transaction.add(x);
            }
        }
        Collections.sort(grocery_transaction, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                if(o1.getValue() == o2.getValue())
                    return 0;
                if(o1.getValue() > o2.getValue())
                    return 1;
                return -1;
            }
        });


        System.out.println(grocery_transaction);

        List<Integer>transactionId = new ArrayList<>();
        for (Transaction x: grocery_transaction)
        {
            transactionId.add(x.getId());
        }

        System.out.println(transactionId);


        // After  Java 8
        System.out.println("Streams....");
        Stream<Transaction> s = Arrays.stream(transaction);
        Stream<Transaction> groceryTransactions =  s.filter(data->data.getType() == Transaction.GROCERY);
        groceryTransactions.sorted((o1, o2) -> o1.compare(o1.getValue(),o2.getValue())).forEach(data-> System.out.println(data.getId()));

    }
}


