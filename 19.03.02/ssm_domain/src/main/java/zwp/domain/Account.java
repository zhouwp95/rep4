package zwp.domain;

import java.io.Serializable;

/**
 * @Author: GodZz
 * @Date: 2019/3/3 1:00
 * @Version 1.0
 */
public class Account implements Serializable{

    private static final long serialVersionUID = 7355810572012650248L;

    private Integer id;
    private String name;
    private Double money;

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
