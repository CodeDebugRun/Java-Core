package Day29_PassByValueImmutable;

public class Immutable {
    public static void main(String[] args) {


        String amd = "kalli";
        System.out.println(amd.hashCode());
        amd = "jalli";
        System.out.println(amd.hashCode());
        amd = "halli";
        System.out.println(amd.hashCode());
        amd = "kalli";
        System.out.println(amd.hashCode());

        StringBuilder sb = new StringBuilder("balli");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.hashCode());

        StringBuffer cb = new StringBuffer();
        cb.append("kalli");
        System.out.println(cb);
        System.out.println(cb.hashCode());
        cb.insert(1,"abi");
        System.out.println(cb);
        System.out.println(cb.hashCode());
    }
}
