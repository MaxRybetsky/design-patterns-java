package patterns.structural.decorators.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
