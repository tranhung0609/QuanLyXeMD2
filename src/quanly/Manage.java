package quanly;

public interface Manage<A> {
    void add(A a);

    void edit(String name, A a);

    int delete(String name);

    void arrange();

    int find(String name);

    void print();

}
