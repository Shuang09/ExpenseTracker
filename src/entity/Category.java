/* shuhangyan created on 2021-01-08 inside the package - entity */
package entity;

public class Category {
    public int id;
    public String name;
    public int RecordNumber;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRecordNumber(int recordNumber) {
        RecordNumber = recordNumber;
    }

    public int getRecordNumber() {
        return RecordNumber;
    }
}
