package ss16_io_text_file.read_csv_file;

public class CountryName {
    private int id;
    private String code;
    private String name;

    public CountryName() {
    }

    public CountryName(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public CountryName(String str) {
        String[] data = str.split(",");
        this.id = Integer.parseInt(data[0]);
        this.code = data[1];
        this.name = data[2];

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CountryName{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getInfo() {
        return this.id + "," + this.code + "," + this.name;
    }
}
