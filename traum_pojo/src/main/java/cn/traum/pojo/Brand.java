package cn.traum.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="tb_brand")//the parameter name cannot be typed if the table name is brand here.
public class Brand implements Serializable {

    @Id
    private Integer id; //Using datatype int will result id value is 0.
    private String name;
    private String image;
    private String letter;// the 1st letter
    private String seq;//order by

    public Brand(Integer id, String name, String image, String letter, String seq) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.letter = letter;
        this.seq = seq;
    }

    public Brand() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", letter='" + letter + '\'' +
                ", seq='" + seq + '\'' +
                '}';
    }
}
