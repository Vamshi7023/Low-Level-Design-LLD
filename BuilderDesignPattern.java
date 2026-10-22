class Transactions {
    String tid;
    String cid;
    int amt;
    String cur;
    String note;
    String TS;

    Transactions(TransactionsBuilder builder) {
        this.tid = builder.tid;
        this.cid = builder.cid;
        this.amt = builder.amt;
        this.cur = builder.cur;
        this.note = builder.note;
        this.TS = builder.TS;
    }

    static class TransactionsBuilder {
        String tid;
        String cid;
        int amt;
        String cur;
        String note;
        String TS;

        public TransactionsBuilder(String tid) {
            this.tid = tid;
        }

        TransactionsBuilder setcid(String cid) {
            this.cid = cid;
            return this;
        }

        TransactionsBuilder setamt(int amt) {
            this.amt = amt;
            return this;
        }

        TransactionsBuilder setcur(String cur) {
            this.cur = cur;
            return this;
        }

        TransactionsBuilder setnote(String note) {
            this.note = note;
            return this;
        }

        TransactionsBuilder setTS(String TS) {
            this.TS = TS;
            return this;
        }

        Transactions buid() {
            return new Transactions(this);
        }
    }
}

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Transactions tr = new Transactions.TransactionsBuilder("dskfhsd").setTS("UPI").setamt(123).setcid("sdfasdf")
                .buid();
        System.out.println(tr.TS+tr.amt);
    }
}
